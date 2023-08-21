/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.Entity;
import org.mcmaster.requirements_modelling.rmdl.Requirement;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl#getPackageID <em>Package ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends EntityImpl implements org.mcmaster.requirements_modelling.rmdl.Package {
	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirement;

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
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The default value of the '{@link #getPackageID() <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageID()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageID() <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageID()
	 * @generated
	 * @ordered
	 */
	protected String packageID = PACKAGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectContainmentEList<Requirement>(Requirement.class, this,
					RmdlPackage.PACKAGE__REQUIREMENT);
		}
		return requirement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, RmdlPackage.PACKAGE__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageID() {
		return packageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageID(String newPackageID) {
		String oldPackageID = packageID;
		packageID = newPackageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.PACKAGE__PACKAGE_ID, oldPackageID,
					packageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.PACKAGE__REQUIREMENT:
			return ((InternalEList<?>) getRequirement()).basicRemove(otherEnd, msgs);
		case RmdlPackage.PACKAGE__ENTITY:
			return ((InternalEList<?>) getEntity()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.PACKAGE__REQUIREMENT:
			return getRequirement();
		case RmdlPackage.PACKAGE__NAME:
			return getName();
		case RmdlPackage.PACKAGE__ENTITY:
			return getEntity();
		case RmdlPackage.PACKAGE__PACKAGE_ID:
			return getPackageID();
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
		case RmdlPackage.PACKAGE__REQUIREMENT:
			getRequirement().clear();
			getRequirement().addAll((Collection<? extends Requirement>) newValue);
			return;
		case RmdlPackage.PACKAGE__NAME:
			setName((String) newValue);
			return;
		case RmdlPackage.PACKAGE__ENTITY:
			getEntity().clear();
			getEntity().addAll((Collection<? extends Entity>) newValue);
			return;
		case RmdlPackage.PACKAGE__PACKAGE_ID:
			setPackageID((String) newValue);
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
		case RmdlPackage.PACKAGE__REQUIREMENT:
			getRequirement().clear();
			return;
		case RmdlPackage.PACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RmdlPackage.PACKAGE__ENTITY:
			getEntity().clear();
			return;
		case RmdlPackage.PACKAGE__PACKAGE_ID:
			setPackageID(PACKAGE_ID_EDEFAULT);
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
		case RmdlPackage.PACKAGE__REQUIREMENT:
			return requirement != null && !requirement.isEmpty();
		case RmdlPackage.PACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RmdlPackage.PACKAGE__ENTITY:
			return entity != null && !entity.isEmpty();
		case RmdlPackage.PACKAGE__PACKAGE_ID:
			return PACKAGE_ID_EDEFAULT == null ? packageID != null : !PACKAGE_ID_EDEFAULT.equals(packageID);
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
		result.append(", packageID: ");
		result.append(packageID);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
