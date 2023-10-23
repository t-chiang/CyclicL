/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.mcmaster.requirements_modelling.rmdl.ModelRoot;
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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl#getModelroot <em>Modelroot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends ModelRootImpl implements org.mcmaster.requirements_modelling.rmdl.Package {
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
	public ModelRoot getModelroot() {
		if (eContainerFeatureID() != RmdlPackage.PACKAGE__MODELROOT)
			return null;
		return (ModelRoot) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelroot(ModelRoot newModelroot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModelroot, RmdlPackage.PACKAGE__MODELROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelroot(ModelRoot newModelroot) {
		if (newModelroot != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.PACKAGE__MODELROOT && newModelroot != null)) {
			if (EcoreUtil.isAncestor(this, newModelroot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelroot != null)
				msgs = ((InternalEObject) newModelroot).eInverseAdd(this, RmdlPackage.MODEL_ROOT__PACKAGE,
						ModelRoot.class, msgs);
			msgs = basicSetModelroot(newModelroot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.PACKAGE__MODELROOT, newModelroot,
					newModelroot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.PACKAGE__MODELROOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModelroot((ModelRoot) otherEnd, msgs);
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
		case RmdlPackage.PACKAGE__MODELROOT:
			return basicSetModelroot(null, msgs);
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
		case RmdlPackage.PACKAGE__MODELROOT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.MODEL_ROOT__PACKAGE, ModelRoot.class, msgs);
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
		case RmdlPackage.PACKAGE__MODELROOT:
			return getModelroot();
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
		case RmdlPackage.PACKAGE__MODELROOT:
			setModelroot((ModelRoot) newValue);
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
		case RmdlPackage.PACKAGE__MODELROOT:
			setModelroot((ModelRoot) null);
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
		case RmdlPackage.PACKAGE__MODELROOT:
			return getModelroot() != null;
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
