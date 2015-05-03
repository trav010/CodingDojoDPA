/**
 */
package de.dpa.codingdojo.domain.impl;

import de.dpa.codingdojo.domain.Anschrift;
import de.dpa.codingdojo.domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anschrift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dpa.codingdojo.domain.impl.AnschriftImpl#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.dpa.codingdojo.domain.impl.AnschriftImpl#getHausnummer <em>Hausnummer</em>}</li>
 *   <li>{@link de.dpa.codingdojo.domain.impl.AnschriftImpl#getPlz <em>Plz</em>}</li>
 *   <li>{@link de.dpa.codingdojo.domain.impl.AnschriftImpl#getOrt <em>Ort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnschriftImpl extends EObjectImpl implements Anschrift {
	/**
	 * The default value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrasse()
	 * @generated
	 * @ordered
	 */
	protected static final String STRASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrasse()
	 * @generated
	 * @ordered
	 */
	protected String strasse = STRASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHausnummer() <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String HAUSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHausnummer() <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummer()
	 * @generated
	 * @ordered
	 */
	protected String hausnummer = HAUSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlz() <em>Plz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlz()
	 * @generated
	 * @ordered
	 */
	protected static final String PLZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlz() <em>Plz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlz()
	 * @generated
	 * @ordered
	 */
	protected String plz = PLZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrt() <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt()
	 * @generated
	 * @ordered
	 */
	protected static final String ORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrt() <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt()
	 * @generated
	 * @ordered
	 */
	protected String ort = ORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnschriftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ANSCHRIFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrasse() {
		return strasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrasse(String newStrasse) {
		String oldStrasse = strasse;
		strasse = newStrasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANSCHRIFT__STRASSE, oldStrasse, strasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHausnummer() {
		return hausnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHausnummer(String newHausnummer) {
		String oldHausnummer = hausnummer;
		hausnummer = newHausnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANSCHRIFT__HAUSNUMMER, oldHausnummer, hausnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlz() {
		return plz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlz(String newPlz) {
		String oldPlz = plz;
		plz = newPlz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANSCHRIFT__PLZ, oldPlz, plz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrt() {
		return ort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrt(String newOrt) {
		String oldOrt = ort;
		ort = newOrt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANSCHRIFT__ORT, oldOrt, ort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.ANSCHRIFT__STRASSE:
				return getStrasse();
			case DomainPackage.ANSCHRIFT__HAUSNUMMER:
				return getHausnummer();
			case DomainPackage.ANSCHRIFT__PLZ:
				return getPlz();
			case DomainPackage.ANSCHRIFT__ORT:
				return getOrt();
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
			case DomainPackage.ANSCHRIFT__STRASSE:
				setStrasse((String)newValue);
				return;
			case DomainPackage.ANSCHRIFT__HAUSNUMMER:
				setHausnummer((String)newValue);
				return;
			case DomainPackage.ANSCHRIFT__PLZ:
				setPlz((String)newValue);
				return;
			case DomainPackage.ANSCHRIFT__ORT:
				setOrt((String)newValue);
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
			case DomainPackage.ANSCHRIFT__STRASSE:
				setStrasse(STRASSE_EDEFAULT);
				return;
			case DomainPackage.ANSCHRIFT__HAUSNUMMER:
				setHausnummer(HAUSNUMMER_EDEFAULT);
				return;
			case DomainPackage.ANSCHRIFT__PLZ:
				setPlz(PLZ_EDEFAULT);
				return;
			case DomainPackage.ANSCHRIFT__ORT:
				setOrt(ORT_EDEFAULT);
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
			case DomainPackage.ANSCHRIFT__STRASSE:
				return STRASSE_EDEFAULT == null ? strasse != null : !STRASSE_EDEFAULT.equals(strasse);
			case DomainPackage.ANSCHRIFT__HAUSNUMMER:
				return HAUSNUMMER_EDEFAULT == null ? hausnummer != null : !HAUSNUMMER_EDEFAULT.equals(hausnummer);
			case DomainPackage.ANSCHRIFT__PLZ:
				return PLZ_EDEFAULT == null ? plz != null : !PLZ_EDEFAULT.equals(plz);
			case DomainPackage.ANSCHRIFT__ORT:
				return ORT_EDEFAULT == null ? ort != null : !ORT_EDEFAULT.equals(ort);
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
		result.append(" (strasse: ");
		result.append(strasse);
		result.append(", hausnummer: ");
		result.append(hausnummer);
		result.append(", plz: ");
		result.append(plz);
		result.append(", ort: ");
		result.append(ort);
		result.append(')');
		return result.toString();
	}

} //AnschriftImpl
