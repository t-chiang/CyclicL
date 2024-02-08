/**
 */
package org.mcmaster.pfcsm.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mcmaster.pfcsm.Association;
import org.mcmaster.pfcsm.Element;
import org.mcmaster.pfcsm.PfcsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ElementImpl#getUsedby <em>Usedby</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ElementImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ElementImpl#isIsPublic <em>Is Public</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedby() <em>Usedby</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedby()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> usedby;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> uses;

	/**
	 * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLIC_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublic = IS_PUBLIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getUsedby() {
		if (usedby == null) {
			usedby = new EObjectWithInverseResolvingEList<Association>(Association.class, this,
					PfcsmPackage.ELEMENT__USEDBY, PfcsmPackage.ASSOCIATION__ASC_SRC);
		}
		return usedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getUses() {
		if (uses == null) {
			uses = new EObjectWithInverseResolvingEList<Association>(Association.class, this,
					PfcsmPackage.ELEMENT__USES, PfcsmPackage.ASSOCIATION__ASC_TGT);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublic(boolean newIsPublic) {
		boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.ELEMENT__IS_PUBLIC, oldIsPublic,
					isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.ELEMENT__USEDBY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUsedby()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.ELEMENT__USES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.ELEMENT__USEDBY:
			return ((InternalEList<?>) getUsedby()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.ELEMENT__USES:
			return ((InternalEList<?>) getUses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PfcsmPackage.ELEMENT__NAME:
			return getName();
		case PfcsmPackage.ELEMENT__USEDBY:
			return getUsedby();
		case PfcsmPackage.ELEMENT__USES:
			return getUses();
		case PfcsmPackage.ELEMENT__IS_PUBLIC:
			return isIsPublic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PfcsmPackage.ELEMENT__NAME:
			setName((String) newValue);
			return;
		case PfcsmPackage.ELEMENT__USEDBY:
			getUsedby().clear();
			getUsedby().addAll((Collection<? extends Association>) newValue);
			return;
		case PfcsmPackage.ELEMENT__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends Association>) newValue);
			return;
		case PfcsmPackage.ELEMENT__IS_PUBLIC:
			setIsPublic((Boolean) newValue);
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
		case PfcsmPackage.ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PfcsmPackage.ELEMENT__USEDBY:
			getUsedby().clear();
			return;
		case PfcsmPackage.ELEMENT__USES:
			getUses().clear();
			return;
		case PfcsmPackage.ELEMENT__IS_PUBLIC:
			setIsPublic(IS_PUBLIC_EDEFAULT);
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
		case PfcsmPackage.ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PfcsmPackage.ELEMENT__USEDBY:
			return usedby != null && !usedby.isEmpty();
		case PfcsmPackage.ELEMENT__USES:
			return uses != null && !uses.isEmpty();
		case PfcsmPackage.ELEMENT__IS_PUBLIC:
			return isPublic != IS_PUBLIC_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isPublic: ");
		result.append(isPublic);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
