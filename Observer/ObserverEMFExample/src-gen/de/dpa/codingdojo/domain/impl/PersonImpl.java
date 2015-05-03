/**
 */
package de.dpa.codingdojo.domain.impl;

import de.dpa.codingdojo.domain.Anschrift;
import de.dpa.codingdojo.domain.DomainPackage;
import de.dpa.codingdojo.domain.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dpa.codingdojo.domain.impl.PersonImpl#getVorname <em>Vorname</em>}</li>
 *   <li>{@link de.dpa.codingdojo.domain.impl.PersonImpl#getNachname <em>Nachname</em>}</li>
 *   <li>{@link de.dpa.codingdojo.domain.impl.PersonImpl#getAnschrift <em>Anschrift</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorname()
	 * @generated
	 * @ordered
	 */
	protected static final String VORNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorname()
	 * @generated
	 * @ordered
	 */
	protected String vorname = VORNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachname()
	 * @generated
	 * @ordered
	 */
	protected static final String NACHNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachname()
	 * @generated
	 * @ordered
	 */
	protected String nachname = NACHNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected Anschrift anschrift;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVorname(String newVorname) {
		String oldVorname = vorname;
		vorname = newVorname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PERSON__VORNAME, oldVorname, vorname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNachname(String newNachname) {
		String oldNachname = nachname;
		nachname = newNachname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PERSON__NACHNAME, oldNachname, nachname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anschrift getAnschrift() {
		if (anschrift != null && anschrift.eIsProxy()) {
			InternalEObject oldAnschrift = (InternalEObject)anschrift;
			anschrift = (Anschrift)eResolveProxy(oldAnschrift);
			if (anschrift != oldAnschrift) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.PERSON__ANSCHRIFT, oldAnschrift, anschrift));
			}
		}
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anschrift basicGetAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnschrift(Anschrift newAnschrift) {
		Anschrift oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PERSON__ANSCHRIFT, oldAnschrift, anschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.PERSON__VORNAME:
				return getVorname();
			case DomainPackage.PERSON__NACHNAME:
				return getNachname();
			case DomainPackage.PERSON__ANSCHRIFT:
				if (resolve) return getAnschrift();
				return basicGetAnschrift();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.PERSON__VORNAME:
				setVorname((String)newValue);
				return;
			case DomainPackage.PERSON__NACHNAME:
				setNachname((String)newValue);
				return;
			case DomainPackage.PERSON__ANSCHRIFT:
				setAnschrift((Anschrift)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DomainPackage.PERSON__VORNAME:
				setVorname(VORNAME_EDEFAULT);
				return;
			case DomainPackage.PERSON__NACHNAME:
				setNachname(NACHNAME_EDEFAULT);
				return;
			case DomainPackage.PERSON__ANSCHRIFT:
				setAnschrift((Anschrift)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DomainPackage.PERSON__VORNAME:
				return VORNAME_EDEFAULT == null ? vorname != null : !VORNAME_EDEFAULT.equals(vorname);
			case DomainPackage.PERSON__NACHNAME:
				return NACHNAME_EDEFAULT == null ? nachname != null : !NACHNAME_EDEFAULT.equals(nachname);
			case DomainPackage.PERSON__ANSCHRIFT:
				return anschrift != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (vorname: ");
		result.append(vorname);
		result.append(", Nachname: ");
		result.append(nachname);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
