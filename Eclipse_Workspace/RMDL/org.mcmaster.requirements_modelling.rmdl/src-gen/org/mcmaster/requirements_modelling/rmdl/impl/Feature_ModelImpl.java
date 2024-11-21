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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.FeatureEntity;
import org.mcmaster.requirements_modelling.rmdl.Feature_Model;
import org.mcmaster.requirements_modelling.rmdl.Product_Variant;
import org.mcmaster.requirements_modelling.rmdl.RMDL_Project;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl#getFeatureEntity <em>Feature Entity</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl#getRmdl_project <em>Rmdl project</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl#getProduct_variant <em>Product variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Feature_ModelImpl extends MinimalEObjectImpl.Container implements Feature_Model {
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
	 * The cached value of the '{@link #getFeatureEntity() <em>Feature Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureEntity> featureEntity;

	/**
	 * The cached value of the '{@link #getProduct_variant() <em>Product variant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct_variant()
	 * @generated
	 * @ordered
	 */
	protected EList<Product_Variant> product_variant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Feature_ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.FEATURE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureEntity> getFeatureEntity() {
		if (featureEntity == null) {
			featureEntity = new EObjectContainmentEList<FeatureEntity>(FeatureEntity.class, this,
					RmdlPackage.FEATURE_MODEL__FEATURE_ENTITY);
		}
		return featureEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMDL_Project getRmdl_project() {
		if (eContainerFeatureID() != RmdlPackage.FEATURE_MODEL__RMDL_PROJECT)
			return null;
		return (RMDL_Project) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRmdl_project(RMDL_Project newRmdl_project, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRmdl_project, RmdlPackage.FEATURE_MODEL__RMDL_PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRmdl_project(RMDL_Project newRmdl_project) {
		if (newRmdl_project != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.FEATURE_MODEL__RMDL_PROJECT && newRmdl_project != null)) {
			if (EcoreUtil.isAncestor(this, newRmdl_project))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRmdl_project != null)
				msgs = ((InternalEObject) newRmdl_project).eInverseAdd(this, RmdlPackage.RMDL_PROJECT__FEATURE_MODEL,
						RMDL_Project.class, msgs);
			msgs = basicSetRmdl_project(newRmdl_project, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_MODEL__RMDL_PROJECT,
					newRmdl_project, newRmdl_project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product_Variant> getProduct_variant() {
		if (product_variant == null) {
			product_variant = new EObjectContainmentWithInverseEList<Product_Variant>(Product_Variant.class, this,
					RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT, RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL);
		}
		return product_variant;
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
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRmdl_project((RMDL_Project) otherEnd, msgs);
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProduct_variant()).basicAdd(otherEnd, msgs);
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
		case RmdlPackage.FEATURE_MODEL__FEATURE_ENTITY:
			return ((InternalEList<?>) getFeatureEntity()).basicRemove(otherEnd, msgs);
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			return basicSetRmdl_project(null, msgs);
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			return ((InternalEList<?>) getProduct_variant()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.RMDL_PROJECT__FEATURE_MODEL,
					RMDL_Project.class, msgs);
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
		case RmdlPackage.FEATURE_MODEL__NAME:
			return getName();
		case RmdlPackage.FEATURE_MODEL__FEATURE_ENTITY:
			return getFeatureEntity();
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			return getRmdl_project();
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			return getProduct_variant();
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
		case RmdlPackage.FEATURE_MODEL__NAME:
			setName((String) newValue);
			return;
		case RmdlPackage.FEATURE_MODEL__FEATURE_ENTITY:
			getFeatureEntity().clear();
			getFeatureEntity().addAll((Collection<? extends FeatureEntity>) newValue);
			return;
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			setRmdl_project((RMDL_Project) newValue);
			return;
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			getProduct_variant().clear();
			getProduct_variant().addAll((Collection<? extends Product_Variant>) newValue);
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
		case RmdlPackage.FEATURE_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RmdlPackage.FEATURE_MODEL__FEATURE_ENTITY:
			getFeatureEntity().clear();
			return;
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			setRmdl_project((RMDL_Project) null);
			return;
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			getProduct_variant().clear();
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
		case RmdlPackage.FEATURE_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RmdlPackage.FEATURE_MODEL__FEATURE_ENTITY:
			return featureEntity != null && !featureEntity.isEmpty();
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			return getRmdl_project() != null;
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			return product_variant != null && !product_variant.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //Feature_ModelImpl
