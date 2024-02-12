/**
 */
package org.mcmaster.pfcsm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.pfcsm.Class_Diagram_Root;
import org.mcmaster.pfcsm.DesClass;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Diagram Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.Class_Diagram_RootImpl#getDesclass <em>Desclass</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.Class_Diagram_RootImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Class_Diagram_RootImpl extends MinimalEObjectImpl.Container implements Class_Diagram_Root {
	/**
	 * The cached value of the '{@link #getDesclass() <em>Desclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesclass()
	 * @generated
	 * @ordered
	 */
	protected EList<DesClass> desclass;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class_Diagram_RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesClass> getDesclass() {
		if (desclass == null) {
			desclass = new EObjectContainmentEList<DesClass>(DesClass.class, this,
					PfcsmPackage.CLASS_DIAGRAM_ROOT__DESCLASS);
		}
		return desclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentWithInverseEList<Reference>(Reference.class, this,
					PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE, PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT);
		}
		return reference;
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReference()).basicAdd(otherEnd, msgs);
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESCLASS:
			return ((InternalEList<?>) getDesclass()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			return ((InternalEList<?>) getReference()).basicRemove(otherEnd, msgs);
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESCLASS:
			return getDesclass();
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			return getReference();
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESCLASS:
			getDesclass().clear();
			getDesclass().addAll((Collection<? extends DesClass>) newValue);
			return;
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Reference>) newValue);
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESCLASS:
			getDesclass().clear();
			return;
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			getReference().clear();
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESCLASS:
			return desclass != null && !desclass.isEmpty();
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			return reference != null && !reference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Class_Diagram_RootImpl
