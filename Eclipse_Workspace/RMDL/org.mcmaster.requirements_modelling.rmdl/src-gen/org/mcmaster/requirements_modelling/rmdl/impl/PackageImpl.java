/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Root;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl#getPackageID <em>Package ID</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl#getRequirement_root <em>Requirement root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends Requirement_RootImpl implements org.mcmaster.requirements_modelling.rmdl.Package {
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
	public Requirement_Root getRequirement_root() {
		if (eContainerFeatureID() != RmdlPackage.PACKAGE__REQUIREMENT_ROOT)
			return null;
		return (Requirement_Root) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement_root(Requirement_Root newRequirement_root, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRequirement_root, RmdlPackage.PACKAGE__REQUIREMENT_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement_root(Requirement_Root newRequirement_root) {
		if (newRequirement_root != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.PACKAGE__REQUIREMENT_ROOT && newRequirement_root != null)) {
			if (EcoreUtil.isAncestor(this, newRequirement_root))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirement_root != null)
				msgs = ((InternalEObject) newRequirement_root).eInverseAdd(this, RmdlPackage.REQUIREMENT_ROOT__PACKAGE,
						Requirement_Root.class, msgs);
			msgs = basicSetRequirement_root(newRequirement_root, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.PACKAGE__REQUIREMENT_ROOT,
					newRequirement_root, newRequirement_root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.PACKAGE__REQUIREMENT_ROOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirement_root((Requirement_Root) otherEnd, msgs);
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
		case RmdlPackage.PACKAGE__REQUIREMENT_ROOT:
			return basicSetRequirement_root(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RmdlPackage.PACKAGE__REQUIREMENT_ROOT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_ROOT__PACKAGE,
					Requirement_Root.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RmdlPackage.PACKAGE__NAME:
			return getName();
		case RmdlPackage.PACKAGE__PACKAGE_ID:
			return getPackageID();
		case RmdlPackage.PACKAGE__REQUIREMENT_ROOT:
			return getRequirement_root();
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
		case RmdlPackage.PACKAGE__NAME:
			setName((String) newValue);
			return;
		case RmdlPackage.PACKAGE__PACKAGE_ID:
			setPackageID((String) newValue);
			return;
		case RmdlPackage.PACKAGE__REQUIREMENT_ROOT:
			setRequirement_root((Requirement_Root) newValue);
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
		case RmdlPackage.PACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RmdlPackage.PACKAGE__PACKAGE_ID:
			setPackageID(PACKAGE_ID_EDEFAULT);
			return;
		case RmdlPackage.PACKAGE__REQUIREMENT_ROOT:
			setRequirement_root((Requirement_Root) null);
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
		case RmdlPackage.PACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RmdlPackage.PACKAGE__PACKAGE_ID:
			return PACKAGE_ID_EDEFAULT == null ? packageID != null : !PACKAGE_ID_EDEFAULT.equals(packageID);
		case RmdlPackage.PACKAGE__REQUIREMENT_ROOT:
			return getRequirement_root() != null;
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
