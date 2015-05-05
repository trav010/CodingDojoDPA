/**
 * 
 */
package de.dpa.codingdojo.persistence;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import de.dpa.codingdojo.domain.Anschrift;
import de.dpa.codingdojo.domain.Person;

/**
 * @author Dietrich Travkin
 */
@RunWith(MockitoJUnitRunner.class)
public class DBPersistenceFactoryTest {
	
	DBPersistenceFactory factory;
	
	@Before
	public void setUpTests() {
		this.factory = spy(new DBPersistenceFactory());
	}

	@Test
	public void factoryPersistsAfterEachChange() {
		// given
		Person person = factory.createPerson();
		Anschrift anschrift = factory.createAnschrift();
		
		// when
		person.setVorname("Max");
		person.setNachname("Mustermann");
		
		// then
		verify(factory, times(2)).saveElement(person);

		
		// when
		anschrift.setStrasse("Am Anger");
		anschrift.setHausnummer("33 a");
		anschrift.setPlz("33333");
		anschrift.setOrt("G�tersloh");
		
		// then
		verify(factory, times(4)).saveElement(anschrift);
		
		
		// when
		person.setAnschrift(anschrift);
		
		// then
		verify(factory, times(3)).saveElement(person);
	}
}
