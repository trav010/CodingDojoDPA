/**
 * 
 */
package de.dpa.codingdojo.persistence;

import de.dpa.codingdojo.domain.Anschrift;
import de.dpa.codingdojo.domain.Person;

/**
 * @author Dietrich Travkin
 */
public class DBPersistenceFactory {
	
	// TODO ensure that any change on the created objects leads to saving the modified object
	
	public Person createPerson() {
		return new Person();
	}
	
	public Anschrift createAnschrift() {
		return new Anschrift();
	}
	
	protected void safeElement(Person person) {
		System.out.println("Person (\"" + person.toString() + "\") gespeichert.");
	}
	
	protected void safeElement(Anschrift anschrift) {
		System.out.println("Anschrift (\"" + anschrift.toString() + "\") gespeichert.");
	}

}
