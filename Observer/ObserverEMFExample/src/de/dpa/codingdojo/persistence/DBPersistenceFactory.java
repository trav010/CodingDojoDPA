/**
 * 
 */
package de.dpa.codingdojo.persistence;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import de.dpa.codingdojo.domain.Anschrift;
import de.dpa.codingdojo.domain.DomainFactory;
import de.dpa.codingdojo.domain.Person;

/**
 * @author Dietrich Travkin
 */
public class DBPersistenceFactory {
	
	public Person createPerson() {
		Person person = DomainFactory.eINSTANCE.createPerson();
		person.eAdapters().add(new Listener());
		return person;
	}
	
	public Anschrift createAnschrift() {
		Anschrift anschrift = DomainFactory.eINSTANCE.createAnschrift();
		anschrift.eAdapters().add(new Listener());
		return anschrift;
	}
	
	protected void saveElement(Person person) {
		System.out.println("Person (\"" + person.toString() + "\") gespeichert.");
	}
	
	protected void saveElement(Anschrift anschrift) {
		System.out.println("Anschrift (\"" + anschrift.toString() + "\") gespeichert.");
	}
	
	private class Listener implements Adapter {
		
		private Notifier subject;
		
		/**
		 * {@inheritDoc}
		 * @see org.eclipse.emf.common.notify.Adapter#getTarget()
		 */
		@Override
		public Notifier getTarget() {
			return subject;
		}

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
		 */
		@Override
		public boolean isAdapterForType(Object object) {
			return object instanceof EObject;
		}

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
		 */
		@Override
		public void notifyChanged(Notification change) {
			if (this.subject instanceof Person) {
				saveElement((Person) this.subject);
			} else if (this.subject instanceof Anschrift) {
				saveElement((Anschrift) this.subject);
			}
		}

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common.notify.Notifier)
		 */
		@Override
		public void setTarget(Notifier target) {
			this.subject = target;
		}
	}

}
