/**
 */
package de.dpa.codingdojo.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dpa.codingdojo.domain.Person#getVorname <em>Vorname</em>}</li>
 *   <li>{@link de.dpa.codingdojo.domain.Person#getNachname <em>Nachname</em>}</li>
 *   <li>{@link de.dpa.codingdojo.domain.Person#getAnschrift <em>Anschrift</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dpa.codingdojo.domain.DomainPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorname</em>' attribute.
	 * @see #setVorname(String)
	 * @see de.dpa.codingdojo.domain.DomainPackage#getPerson_Vorname()
	 * @model
	 * @generated
	 */
	String getVorname();

	/**
	 * Sets the value of the '{@link de.dpa.codingdojo.domain.Person#getVorname <em>Vorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorname</em>' attribute.
	 * @see #getVorname()
	 * @generated
	 */
	void setVorname(String value);

	/**
	 * Returns the value of the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nachname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachname</em>' attribute.
	 * @see #setNachname(String)
	 * @see de.dpa.codingdojo.domain.DomainPackage#getPerson_Nachname()
	 * @model
	 * @generated
	 */
	String getNachname();

	/**
	 * Sets the value of the '{@link de.dpa.codingdojo.domain.Person#getNachname <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachname</em>' attribute.
	 * @see #getNachname()
	 * @generated
	 */
	void setNachname(String value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anschrift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anschrift</em>' reference.
	 * @see #setAnschrift(Anschrift)
	 * @see de.dpa.codingdojo.domain.DomainPackage#getPerson_Anschrift()
	 * @model
	 * @generated
	 */
	Anschrift getAnschrift();

	/**
	 * Sets the value of the '{@link de.dpa.codingdojo.domain.Person#getAnschrift <em>Anschrift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(Anschrift value);

} // Person
