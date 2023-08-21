/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.Entity;
import org.mcmaster.requirements_modelling.rmdl.ModelRoot;
import org.mcmaster.requirements_modelling.rmdl.Reference;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.TestCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ModelRootImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ModelRootImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ModelRootImpl#getTestcase <em>Testcase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelRootImpl extends MinimalEObjectImpl.Container implements ModelRoot {
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
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

	/**
	 * The cached value of the '{@link #getTestcase() <em>Testcase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestcase()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testcase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.MODEL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, RmdlPackage.MODEL_ROOT__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Reference>(Reference.class, this,
					RmdlPackage.MODEL_ROOT__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestcase() {
		if (testcase == null) {
			testcase = new EObjectContainmentEList<TestCase>(TestCase.class, this, RmdlPackage.MODEL_ROOT__TESTCASE);
		}
		return testcase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.MODEL_ROOT__ENTITY:
			return ((InternalEList<?>) getEntity()).basicRemove(otherEnd, msgs);
		case RmdlPackage.MODEL_ROOT__REFERENCE:
			return ((InternalEList<?>) getReference()).basicRemove(otherEnd, msgs);
		case RmdlPackage.MODEL_ROOT__TESTCASE:
			return ((InternalEList<?>) getTestcase()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.MODEL_ROOT__ENTITY:
			return getEntity();
		case RmdlPackage.MODEL_ROOT__REFERENCE:
			return getReference();
		case RmdlPackage.MODEL_ROOT__TESTCASE:
			return getTestcase();
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
		case RmdlPackage.MODEL_ROOT__ENTITY:
			getEntity().clear();
			getEntity().addAll((Collection<? extends Entity>) newValue);
			return;
		case RmdlPackage.MODEL_ROOT__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Reference>) newValue);
			return;
		case RmdlPackage.MODEL_ROOT__TESTCASE:
			getTestcase().clear();
			getTestcase().addAll((Collection<? extends TestCase>) newValue);
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
		case RmdlPackage.MODEL_ROOT__ENTITY:
			getEntity().clear();
			return;
		case RmdlPackage.MODEL_ROOT__REFERENCE:
			getReference().clear();
			return;
		case RmdlPackage.MODEL_ROOT__TESTCASE:
			getTestcase().clear();
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
		case RmdlPackage.MODEL_ROOT__ENTITY:
			return entity != null && !entity.isEmpty();
		case RmdlPackage.MODEL_ROOT__REFERENCE:
			return reference != null && !reference.isEmpty();
		case RmdlPackage.MODEL_ROOT__TESTCASE:
			return testcase != null && !testcase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelRootImpl
