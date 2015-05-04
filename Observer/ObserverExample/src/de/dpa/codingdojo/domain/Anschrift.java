/**
 * 
 */
package de.dpa.codingdojo.domain;

import de.dpa.codingdojo.observer.AbstractObservable;


/**
 * @author Dietrich Travkin
 */
public class Anschrift extends AbstractObservable {

	private String strasse, hausnummer, plz, ort;
	
	public static final String PROPERTY_STRASSE = "Straﬂe";
	public static final String PROPERTY_HAUSNR = "Hausnummer";
	public static final String PROPERTY_PLZ = "PLZ";
	public static final String PROPERTY_ORT = "Ort";
	
	public Anschrift(String strasse, String hausnummer, String plz, String ort) {
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}
	
	public Anschrift() {
	}

	public String getStrasse() {
		return strasse;
	}
	
	public void setStrasse(String strasse) {
		String previousValue = this.strasse;
		this.strasse = strasse;
		this.getPropertyChangeSupport().firePropertyChange(PROPERTY_STRASSE, previousValue, this.strasse);
	}
	
	public String getHausnummer() {
		return hausnummer;
	}
	
	public void setHausnummer(String hausnummer) {
		String previousValue = this.hausnummer;
		this.hausnummer = hausnummer;
		this.getPropertyChangeSupport().firePropertyChange(PROPERTY_HAUSNR, previousValue, this.hausnummer);
	}
	
	public String getPlz() {
		return plz;
	}
	
	public void setPlz(String plz) {
		String previousValue = this.plz;
		this.plz = plz;
		this.getPropertyChangeSupport().firePropertyChange(PROPERTY_PLZ, previousValue, this.plz);
	}
	
	public String getOrt() {
		return ort;
	}
	
	public void setOrt(String ort) {
		String previousValue = this.ort;
		this.ort = ort;
		this.getPropertyChangeSupport().firePropertyChange(PROPERTY_ORT, previousValue, this.ort);
	}

}
