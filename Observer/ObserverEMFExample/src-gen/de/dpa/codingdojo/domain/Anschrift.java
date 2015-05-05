/**
 */
package de.dpa.codingdojo.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anschrift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dpa.codingdojo.domain.Anschrift#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.dpa.codingdojo.domain.Anschrift#getHausnummer <em>Hausnummer</em>}</li>
 *   <li>{@link de.dpa.codingdojo.domain.Anschrift#getPlz <em>Plz</em>}</li>
 *   <li>{@link de.dpa.codingdojo.domain.Anschrift#getOrt <em>Ort</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dpa.codingdojo.domain.DomainPackage#getAnschrift()
 * @model
 * @generated
 */
public interface Anschrift extends EObject {
	/**
	 * Returns the value of the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strasse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strasse</em>' attribute.
	 * @see #setStrasse(String)
	 * @see de.dpa.codingdojo.domain.DomainPackage#getAnschrift_Strasse()
	 * @model
	 * @generated
	 */
	String getStrasse();

	/**
	 * Sets the value of the '{@link de.dpa.codingdojo.domain.Anschrift#getStrasse <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strasse</em>' attribute.
	 * @see #getStrasse()
	 * @generated
	 */
	void setStrasse(String value);

	/**
	 * Returns the value of the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hausnummer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hausnummer</em>' attribute.
	 * @see #setHausnummer(String)
	 * @see de.dpa.codingdojo.domain.DomainPackage#getAnschrift_Hausnummer()
	 * @model
	 * @generated
	 */
	String getHausnummer();

	/**
	 * Sets the value of the '{@link de.dpa.codingdojo.domain.Anschrift#getHausnummer <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hausnummer</em>' attribute.
	 * @see #getHausnummer()
	 * @generated
	 */
	void setHausnummer(String value);

	/**
	 * Returns the value of the '<em><b>Plz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plz</em>' attribute.
	 * @see #setPlz(String)
	 * @see de.dpa.codingdojo.domain.DomainPackage#getAnschrift_Plz()
	 * @model
	 * @generated
	 */
	String getPlz();

	/**
	 * Sets the value of the '{@link de.dpa.codingdojo.domain.Anschrift#getPlz <em>Plz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plz</em>' attribute.
	 * @see #getPlz()
	 * @generated
	 */
	void setPlz(String value);

	/**
	 * Returns the value of the '<em><b>Ort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ort</em>' attribute.
	 * @see #setOrt(String)
	 * @see de.dpa.codingdojo.domain.DomainPackage#getAnschrift_Ort()
	 * @model
	 * @generated
	 */
	String getOrt();

	/**
	 * Sets the value of the '{@link de.dpa.codingdojo.domain.Anschrift#getOrt <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ort</em>' attribute.
	 * @see #getOrt()
	 * @generated
	 */
	void setOrt(String value);

} // Anschrift
