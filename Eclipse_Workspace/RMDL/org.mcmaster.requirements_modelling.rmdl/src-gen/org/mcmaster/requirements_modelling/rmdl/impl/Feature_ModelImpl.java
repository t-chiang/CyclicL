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
import org.mcmaster.requirements_modelling.rmdl.Feature_Model;
import org.mcmaster.requirements_modelling.rmdl.Feature_Model_Element;
import org.mcmaster.requirements_modelling.rmdl.Feature_Model_Root;
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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl#getRmdl_project <em>Rmdl project</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl#getProduct_variant <em>Product variant</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl#getFeature_model_root <em>Feature model root</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl#getFeature_model_element <em>Feature model element</em>}</li>
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
	 * The cached value of the '{@link #getProduct_variant() <em>Product variant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct_variant()
	 * @generated
	 * @ordered
	 */
	protected EList<Product_Variant> product_variant;

	/**
	 * The cached value of the '{@link #getFeature_model_root() <em>Feature model root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature_model_root()
	 * @generated
	 * @ordered
	 */
	protected Feature_Model_Root feature_model_root;

	/**
	 * The cached value of the '{@link #getFeature_model_element() <em>Feature model element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature_model_element()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature_Model_Element> feature_model_element;

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
	public Feature_Model_Root getFeature_model_root() {
		return feature_model_root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature_model_root(Feature_Model_Root newFeature_model_root,
			NotificationChain msgs) {
		Feature_Model_Root oldFeature_model_root = feature_model_root;
		feature_model_root = newFeature_model_root;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ROOT, oldFeature_model_root, newFeature_model_root);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature_model_root(Feature_Model_Root newFeature_model_root) {
		if (newFeature_model_root != feature_model_root) {
			NotificationChain msgs = null;
			if (feature_model_root != null)
				msgs = ((InternalEObject) feature_model_root).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ROOT, null, msgs);
			if (newFeature_model_root != null)
				msgs = ((InternalEObject) newFeature_model_root).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ROOT, null, msgs);
			msgs = basicSetFeature_model_root(newFeature_model_root, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ROOT,
					newFeature_model_root, newFeature_model_root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature_Model_Element> getFeature_model_element() {
		if (feature_model_element == null) {
			feature_model_element = new EObjectContainmentEList<Feature_Model_Element>(Feature_Model_Element.class,
					this, RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ELEMENT);
		}
		return feature_model_element;
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
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			return basicSetRmdl_project(null, msgs);
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			return ((InternalEList<?>) getProduct_variant()).basicRemove(otherEnd, msgs);
		case RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ROOT:
			return basicSetFeature_model_root(null, msgs);
		case RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ELEMENT:
			return ((InternalEList<?>) getFeature_model_element()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			return getRmdl_project();
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			return getProduct_variant();
		case RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ROOT:
			return getFeature_model_root();
		case RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ELEMENT:
			return getFeature_model_element();
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
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			setRmdl_project((RMDL_Project) newValue);
			return;
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			getProduct_variant().clear();
			getProduct_variant().addAll((Collection<? extends Product_Variant>) newValue);
			return;
		case RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ROOT:
			setFeature_model_root((Feature_Model_Root) newValue);
			return;
		case RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ELEMENT:
			getFeature_model_element().clear();
			getFeature_model_element().addAll((Collection<? extends Feature_Model_Element>) newValue);
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
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			setRmdl_project((RMDL_Project) null);
			return;
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			getProduct_variant().clear();
			return;
		case RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ROOT:
			setFeature_model_root((Feature_Model_Root) null);
			return;
		case RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ELEMENT:
			getFeature_model_element().clear();
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
		case RmdlPackage.FEATURE_MODEL__RMDL_PROJECT:
			return getRmdl_project() != null;
		case RmdlPackage.FEATURE_MODEL__PRODUCT_VARIANT:
			return product_variant != null && !product_variant.isEmpty();
		case RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ROOT:
			return feature_model_root != null;
		case RmdlPackage.FEATURE_MODEL__FEATURE_MODEL_ELEMENT:
			return feature_model_element != null && !feature_model_element.isEmpty();
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
