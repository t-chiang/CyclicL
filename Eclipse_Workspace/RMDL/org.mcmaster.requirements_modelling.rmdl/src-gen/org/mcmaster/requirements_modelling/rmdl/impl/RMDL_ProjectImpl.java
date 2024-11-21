/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.Feature_Model;
import org.mcmaster.requirements_modelling.rmdl.RMDL_Project;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RMDL Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RMDL_ProjectImpl#getFeature_model <em>Feature model</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RMDL_ProjectImpl#getRequirement_canvas <em>Requirement canvas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RMDL_ProjectImpl extends MinimalEObjectImpl.Container implements RMDL_Project {
	/**
	 * The cached value of the '{@link #getFeature_model() <em>Feature model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature_model()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature_Model> feature_model;

	/**
	 * The cached value of the '{@link #getRequirement_canvas() <em>Requirement canvas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement_canvas()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement_Canvas> requirement_canvas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RMDL_ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.RMDL_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature_Model> getFeature_model() {
		if (feature_model == null) {
			feature_model = new EObjectContainmentWithInverseEList<Feature_Model>(Feature_Model.class, this,
					RmdlPackage.RMDL_PROJECT__FEATURE_MODEL, RmdlPackage.FEATURE_MODEL__RMDL_PROJECT);
		}
		return feature_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement_Canvas> getRequirement_canvas() {
		if (requirement_canvas == null) {
			requirement_canvas = new EObjectContainmentWithInverseEList<Requirement_Canvas>(Requirement_Canvas.class,
					this, RmdlPackage.RMDL_PROJECT__REQUIREMENT_CANVAS, RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT);
		}
		return requirement_canvas;
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
		case RmdlPackage.RMDL_PROJECT__FEATURE_MODEL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFeature_model()).basicAdd(otherEnd, msgs);
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_CANVAS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequirement_canvas()).basicAdd(otherEnd,
					msgs);
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
		case RmdlPackage.RMDL_PROJECT__FEATURE_MODEL:
			return ((InternalEList<?>) getFeature_model()).basicRemove(otherEnd, msgs);
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_CANVAS:
			return ((InternalEList<?>) getRequirement_canvas()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.RMDL_PROJECT__FEATURE_MODEL:
			return getFeature_model();
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_CANVAS:
			return getRequirement_canvas();
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
		case RmdlPackage.RMDL_PROJECT__FEATURE_MODEL:
			getFeature_model().clear();
			getFeature_model().addAll((Collection<? extends Feature_Model>) newValue);
			return;
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_CANVAS:
			getRequirement_canvas().clear();
			getRequirement_canvas().addAll((Collection<? extends Requirement_Canvas>) newValue);
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
		case RmdlPackage.RMDL_PROJECT__FEATURE_MODEL:
			getFeature_model().clear();
			return;
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_CANVAS:
			getRequirement_canvas().clear();
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
		case RmdlPackage.RMDL_PROJECT__FEATURE_MODEL:
			return feature_model != null && !feature_model.isEmpty();
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_CANVAS:
			return requirement_canvas != null && !requirement_canvas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RMDL_ProjectImpl
