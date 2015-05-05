/**
 * 
 */
package de.dpa.codingdojo.domain;

import java.beans.PropertyChangeListener;

import de.dpa.codingdojo.observer.Observable;


/**
 * @author Dietrich Travkin
 */
public class Anschrift implements Observable {

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
		this.strasse = strasse;
	}
	
	public String getHausnummer() {
		return hausnummer;
	}
	
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	public String getPlz() {
		return plz;
	}
	
	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	public String getOrt() {
		return ort;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
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
