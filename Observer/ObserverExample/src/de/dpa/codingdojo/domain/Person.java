/**
 * 
 */
package de.dpa.codingdojo.domain;

import java.beans.PropertyChangeListener;

import de.dpa.codingdojo.observer.Observable;


/**
 * @author Dietrich Travkin
 */
public class Person implements Observable {

	private String vorname, nachname;
	private Anschrift anschrift;
	
	public static final String PROPERTY_VORNAME = "Vorname";
	public static final String PROPERTY_NACHNAME = "Nachname";
	public static final String PROPERTY_ANSCHRIFT = "Anschrift";
	
	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public Person() {
	}
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public Anschrift getAnschrift() {
		return anschrift;
	}

	public void setAnschrift(Anschrift anschrift) {
		this.anschrift = anschrift;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO implement this method
		
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener,
			String propertyname) {
		// TODO implement this method
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO implement this method
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener,
			String propertyname) {
		// TODO implement this method
		
	}

}
