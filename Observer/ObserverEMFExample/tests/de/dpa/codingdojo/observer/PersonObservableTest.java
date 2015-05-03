package de.dpa.codingdojo.observer;
/**
 * 
 */


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.junit.Before;
import org.junit.Test;

import de.dpa.codingdojo.domain.DomainFactory;
import de.dpa.codingdojo.domain.DomainPackage;
import de.dpa.codingdojo.domain.Person;

/**
 * @author Dietrich Travkin
 */
public class PersonObservableTest {

	private Person objectUnderTest;
	private List<Notification> events;
	
	@Before
	public void beforeTests() {
		this.objectUnderTest = DomainFactory.eINSTANCE.createPerson();
		this.objectUnderTest.setVorname("Lisa");
		this.objectUnderTest.setNachname("Mustermann");
		events = new ArrayList<Notification>();
	}
	
	private class EventCollector implements Adapter {
		
		private Notifier target;
		
		@Override
		public Notifier getTarget() {
			return this.target;
		}

		@Override
		public void setTarget(Notifier target) {
			this.target = target;
		}
		
		@Override
		public boolean isAdapterForType(Object object) {
			return object instanceof Person;
		}

		@Override
		public void notifyChanged(Notification notification) {
			events.add(notification);
		}

	}
	
	@Test
	public void firingEvents() {
		assertEquals(0, events.size());
		
		// given a listener registered to a person
		this.objectUnderTest.eAdapters().add(new EventCollector());
		
		// when an attribute is changed
		this.objectUnderTest.setNachname("Meyer");
		
		// then an event is fired
		assertEquals(1, events.size());
		
		// when an attribute is changed
		this.objectUnderTest.setVorname("Max");
				
		// then another event is fired
		assertEquals(2, events.size());
	}
	
	@Test
	public void registerAndDeregister() {
		Adapter listener = new EventCollector();
		this.objectUnderTest.eAdapters().add(listener);
		
		this.objectUnderTest.setVorname("Otto");
		assertEquals(1, events.size());
		
		this.objectUnderTest.eAdapters().remove(listener);
		
		this.objectUnderTest.setVorname("Anna");
		assertEquals(1,  events.size());
	}
	
	@Test
	public void eventContainsOldAndNewValuesAndPropertynameAndSourceObject() {
		this.objectUnderTest.eAdapters().add(new EventCollector());
		
		String newName = "Meier";
		String oldName = this.objectUnderTest.getNachname();
		this.objectUnderTest.setNachname(newName);
		
		assertEquals(1, events.size());
		Notification event = events.get(0);
		assertEquals(newName, event.getNewValue());
		assertEquals(oldName, event.getOldValue());
		
		assertEquals(DomainPackage.Literals.PERSON__NACHNAME, event.getFeature());
		assertEquals(this.objectUnderTest, event.getNotifier());
	}
	
	@Test
	public void onlyFireEventsIfValuesChanged() {
		this.objectUnderTest.eAdapters().add(new EventCollector());
		
		String oldName = this.objectUnderTest.getVorname();
		this.objectUnderTest.setVorname(oldName);
		
		assertEquals(0, events.size());
		
		this.objectUnderTest.setVorname(oldName + "-Mayer");
		
		assertEquals(1, events.size());
	}

}
