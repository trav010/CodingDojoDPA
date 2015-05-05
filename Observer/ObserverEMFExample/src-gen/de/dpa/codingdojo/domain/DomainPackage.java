/**
 */
package de.dpa.codingdojo.domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dpa.codingdojo.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dpa.de/codingdojo/observer/domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.dpa.codingdojo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = de.dpa.codingdojo.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dpa.codingdojo.domain.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dpa.codingdojo.domain.impl.PersonImpl
	 * @see de.dpa.codingdojo.domain.impl.DomainPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__VORNAME = 0;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NACHNAME = 1;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ANSCHRIFT = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.dpa.codingdojo.domain.impl.AnschriftImpl <em>Anschrift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dpa.codingdojo.domain.impl.AnschriftImpl
	 * @see de.dpa.codingdojo.domain.impl.DomainPackageImpl#getAnschrift()
	 * @generated
	 */
	int ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT__STRASSE = 0;

	/**
	 * The feature id for the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT__HAUSNUMMER = 1;

	/**
	 * The feature id for the '<em><b>Plz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT__PLZ = 2;

	/**
	 * The feature id for the '<em><b>Ort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT__ORT = 3;

	/**
	 * The number of structural features of the '<em>Anschrift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link de.dpa.codingdojo.domain.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see de.dpa.codingdojo.domain.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.dpa.codingdojo.domain.Person#getVorname <em>Vorname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vorname</em>'.
	 * @see de.dpa.codingdojo.domain.Person#getVorname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Vorname();

	/**
	 * Returns the meta object for the attribute '{@link de.dpa.codingdojo.domain.Person#getNachname <em>Nachname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachname</em>'.
	 * @see de.dpa.codingdojo.domain.Person#getNachname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Nachname();

	/**
	 * Returns the meta object for the reference '{@link de.dpa.codingdojo.domain.Person#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anschrift</em>'.
	 * @see de.dpa.codingdojo.domain.Person#getAnschrift()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Anschrift();

	/**
	 * Returns the meta object for class '{@link de.dpa.codingdojo.domain.Anschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anschrift</em>'.
	 * @see de.dpa.codingdojo.domain.Anschrift
	 * @generated
	 */
	EClass getAnschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.dpa.codingdojo.domain.Anschrift#getStrasse <em>Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strasse</em>'.
	 * @see de.dpa.codingdojo.domain.Anschrift#getStrasse()
	 * @see #getAnschrift()
	 * @generated
	 */
	EAttribute getAnschrift_Strasse();

	/**
	 * Returns the meta object for the attribute '{@link de.dpa.codingdojo.domain.Anschrift#getHausnummer <em>Hausnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummer</em>'.
	 * @see de.dpa.codingdojo.domain.Anschrift#getHausnummer()
	 * @see #getAnschrift()
	 * @generated
	 */
	EAttribute getAnschrift_Hausnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.dpa.codingdojo.domain.Anschrift#getPlz <em>Plz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plz</em>'.
	 * @see de.dpa.codingdojo.domain.Anschrift#getPlz()
	 * @see #getAnschrift()
	 * @generated
	 */
	EAttribute getAnschrift_Plz();

	/**
	 * Returns the meta object for the attribute '{@link de.dpa.codingdojo.domain.Anschrift#getOrt <em>Ort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ort</em>'.
	 * @see de.dpa.codingdojo.domain.Anschrift#getOrt()
	 * @see #getAnschrift()
	 * @generated
	 */
	EAttribute getAnschrift_Ort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dpa.codingdojo.domain.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dpa.codingdojo.domain.impl.PersonImpl
		 * @see de.dpa.codingdojo.domain.impl.DomainPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Vorname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__VORNAME = eINSTANCE.getPerson_Vorname();

		/**
		 * The meta object literal for the '<em><b>Nachname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NACHNAME = eINSTANCE.getPerson_Nachname();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ANSCHRIFT = eINSTANCE.getPerson_Anschrift();

		/**
		 * The meta object literal for the '{@link de.dpa.codingdojo.domain.impl.AnschriftImpl <em>Anschrift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dpa.codingdojo.domain.impl.AnschriftImpl
		 * @see de.dpa.codingdojo.domain.impl.DomainPackageImpl#getAnschrift()
		 * @generated
		 */
		EClass ANSCHRIFT = eINSTANCE.getAnschrift();

		/**
		 * The meta object literal for the '<em><b>Strasse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHRIFT__STRASSE = eINSTANCE.getAnschrift_Strasse();

		/**
		 * The meta object literal for the '<em><b>Hausnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHRIFT__HAUSNUMMER = eINSTANCE.getAnschrift_Hausnummer();

		/**
		 * The meta object literal for the '<em><b>Plz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHRIFT__PLZ = eINSTANCE.getAnschrift_Plz();

		/**
		 * The meta object literal for the '<em><b>Ort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHRIFT__ORT = eINSTANCE.getAnschrift_Ort();

	}

} //DomainPackage
