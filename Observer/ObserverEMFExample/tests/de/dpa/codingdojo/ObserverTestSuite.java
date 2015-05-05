/**
 * 
 */
package de.dpa.codingdojo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.dpa.codingdojo.observer.PersonObservableTest;
import de.dpa.codingdojo.persistence.DBPersistenceFactoryTest;

/**
 * @author Dietrich Travkin
 */
@RunWith(Suite.class)
@SuiteClasses({
	PersonObservableTest.class,
	DBPersistenceFactoryTest.class
})
public class ObserverTestSuite  { }
