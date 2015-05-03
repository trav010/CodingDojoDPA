/**
 * 
 */
package de.dpa.codingdojo.domain;

import de.dpa.codingdojo.observer.AbstractObservable;


/**
 * @author Dietrich Travkin
 */
public class Person extends AbstractObservable {

	private String vorname, nachname;
	private Anschrift anschrift;
	
	public static final String PROPERTY_VORNAME = "Vorname";
	public static final String PROPERTY_NACHNAME = "Nachname";
	public static final String PROPERTY_ANSCHRIFT = "Anschrift";
	
	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		String previousValue = this.vorname;
		this.vorname = vorname;
		this.getPropertyChangeSupport().firePropertyChange(PROPERTY_VORNAME, previousValue, this.vorname);
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		String previousValue = this.nachname;
		this.nachname = nachname;
		this.getPropertyChangeSupport().firePropertyChange(PROPERTY_NACHNAME, previousValue, this.nachname);
	}
	
	public Anschrift getAnschrift() {
		return anschrift;
	}

	public void setAnschrift(Anschrift anschrift) {
		Anschrift previousValue = this.anschrift;
		this.anschrift = anschrift;
		this.getPropertyChangeSupport().firePropertyChange(PROPERTY_ANSCHRIFT, previousValue, this.anschrift);
	}

}
