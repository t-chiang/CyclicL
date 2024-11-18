/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mcmaster.requirements_modelling.rmdl.Feature_Model;
import org.mcmaster.requirements_modelling.rmdl.Product_Variant;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Product_VariantImpl#getFeature_model <em>Feature model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Product_VariantImpl extends Feature_ModelImpl implements Product_Variant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Product_VariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.PRODUCT_VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Model getFeature_model() {
		if (eContainerFeatureID() != RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL)
			return null;
		return (Feature_Model) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature_model(Feature_Model newFeature_model, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFeature_model, RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature_model(Feature_Model newFeature_model) {
		if (newFeature_model != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL && newFeature_model != null)) {
			if (EcoreUtil.isAncestor(this, newFeature_model))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFeature_model != null)
				msgs = ((InternalEObject) newFeature_model).eInverseAdd(this,
						RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT, Feature_Model.class, msgs);
			msgs = basicSetFeature_model(newFeature_model, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL,
					newFeature_model, newFeature_model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFeature_model((Feature_Model) otherEnd, msgs);
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
		case RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL:
			return basicSetFeature_model(null, msgs);
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
		case RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT,
					Feature_Model.class, msgs);
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
		case RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL:
			return getFeature_model();
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
		case RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL:
			setFeature_model((Feature_Model) newValue);
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
		case RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL:
			setFeature_model((Feature_Model) null);
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
		case RmdlPackage.PRODUCT_VARIANT__FEATURE_MODEL:
			return getFeature_model() != null;
		}
		return super.eIsSet(featureID);
	}

} //Product_VariantImpl
