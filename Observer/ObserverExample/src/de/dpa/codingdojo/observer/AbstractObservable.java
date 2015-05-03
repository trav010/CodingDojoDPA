package de.dpa.codingdojo.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AbstractObservable implements Observable {

	private PropertyChangeSupport propertyChangeSupport;

	public AbstractObservable() {
		this.propertyChangeSupport = new PropertyChangeSupport(this);
	}

	protected PropertyChangeSupport getPropertyChangeSupport() {
		return propertyChangeSupport;
	}
	
	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.propertyChangeSupport.addPropertyChangeListener(listener);
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		this.propertyChangeSupport.removePropertyChangeListener(listener);
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener, String propertyname) {
		this.propertyChangeSupport.addPropertyChangeListener(propertyname, listener);
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener, String propertyname) {
		this.propertyChangeSupport.removePropertyChangeListener(propertyname, listener);
	}

}