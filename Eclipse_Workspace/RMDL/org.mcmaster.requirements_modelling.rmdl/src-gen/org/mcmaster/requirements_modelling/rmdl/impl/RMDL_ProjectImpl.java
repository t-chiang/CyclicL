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
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.Feature_Model;
import org.mcmaster.requirements_modelling.rmdl.RMDL_Project;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram;
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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RMDL_ProjectImpl#getRequirement_diagram <em>Requirement diagram</em>}</li>
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
	 * The cached value of the '{@link #getRequirement_diagram() <em>Requirement diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement_diagram()
	 * @generated
	 * @ordered
	 */
	protected Requirement_Diagram requirement_diagram;

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
			feature_model = new EObjectContainmentEList<Feature_Model>(Feature_Model.class, this,
					RmdlPackage.RMDL_PROJECT__FEATURE_MODEL);
		}
		return feature_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Diagram getRequirement_diagram() {
		return requirement_diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement_diagram(Requirement_Diagram newRequirement_diagram,
			NotificationChain msgs) {
		Requirement_Diagram oldRequirement_diagram = requirement_diagram;
		requirement_diagram = newRequirement_diagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.RMDL_PROJECT__REQUIREMENT_DIAGRAM, oldRequirement_diagram, newRequirement_diagram);
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
	public void setRequirement_diagram(Requirement_Diagram newRequirement_diagram) {
		if (newRequirement_diagram != requirement_diagram) {
			NotificationChain msgs = null;
			if (requirement_diagram != null)
				msgs = ((InternalEObject) requirement_diagram).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RmdlPackage.RMDL_PROJECT__REQUIREMENT_DIAGRAM, null, msgs);
			if (newRequirement_diagram != null)
				msgs = ((InternalEObject) newRequirement_diagram).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RmdlPackage.RMDL_PROJECT__REQUIREMENT_DIAGRAM, null, msgs);
			msgs = basicSetRequirement_diagram(newRequirement_diagram, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.RMDL_PROJECT__REQUIREMENT_DIAGRAM,
					newRequirement_diagram, newRequirement_diagram));
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
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_DIAGRAM:
			return basicSetRequirement_diagram(null, msgs);
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
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_DIAGRAM:
			return getRequirement_diagram();
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
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_DIAGRAM:
			setRequirement_diagram((Requirement_Diagram) newValue);
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
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_DIAGRAM:
			setRequirement_diagram((Requirement_Diagram) null);
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
		case RmdlPackage.RMDL_PROJECT__REQUIREMENT_DIAGRAM:
			return requirement_diagram != null;
		}
		return super.eIsSet(featureID);
	}

} //RMDL_ProjectImpl
