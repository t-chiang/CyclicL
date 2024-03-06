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
import org.mcmaster.pfcsm.DesignEntity;
import org.mcmaster.pfcsm.Hardware;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Reference;
import org.mcmaster.pfcsm.Software;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Diagram Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.Class_Diagram_RootImpl#getDesignentity <em>Designentity</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.Class_Diagram_RootImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.Class_Diagram_RootImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.Class_Diagram_RootImpl#getSoftware <em>Software</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Class_Diagram_RootImpl extends MinimalEObjectImpl.Container implements Class_Diagram_Root {
	/**
	 * The cached value of the '{@link #getDesignentity() <em>Designentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignentity()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignEntity> designentity;

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
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected EList<Hardware> hardware;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected EList<Software> software;

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
	public EList<DesignEntity> getDesignentity() {
		if (designentity == null) {
			designentity = new EObjectContainmentEList<DesignEntity>(DesignEntity.class, this,
					PfcsmPackage.CLASS_DIAGRAM_ROOT__DESIGNENTITY);
		}
		return designentity;
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
	public EList<Hardware> getHardware() {
		if (hardware == null) {
			hardware = new EObjectContainmentEList<Hardware>(Hardware.class, this,
					PfcsmPackage.CLASS_DIAGRAM_ROOT__HARDWARE);
		}
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Software> getSoftware() {
		if (software == null) {
			software = new EObjectContainmentEList<Software>(Software.class, this,
					PfcsmPackage.CLASS_DIAGRAM_ROOT__SOFTWARE);
		}
		return software;
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESIGNENTITY:
			return ((InternalEList<?>) getDesignentity()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			return ((InternalEList<?>) getReference()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__HARDWARE:
			return ((InternalEList<?>) getHardware()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__SOFTWARE:
			return ((InternalEList<?>) getSoftware()).basicRemove(otherEnd, msgs);
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESIGNENTITY:
			return getDesignentity();
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			return getReference();
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__HARDWARE:
			return getHardware();
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__SOFTWARE:
			return getSoftware();
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESIGNENTITY:
			getDesignentity().clear();
			getDesignentity().addAll((Collection<? extends DesignEntity>) newValue);
			return;
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Reference>) newValue);
			return;
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__HARDWARE:
			getHardware().clear();
			getHardware().addAll((Collection<? extends Hardware>) newValue);
			return;
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__SOFTWARE:
			getSoftware().clear();
			getSoftware().addAll((Collection<? extends Software>) newValue);
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESIGNENTITY:
			getDesignentity().clear();
			return;
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			getReference().clear();
			return;
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__HARDWARE:
			getHardware().clear();
			return;
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__SOFTWARE:
			getSoftware().clear();
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
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESIGNENTITY:
			return designentity != null && !designentity.isEmpty();
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
			return reference != null && !reference.isEmpty();
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__HARDWARE:
			return hardware != null && !hardware.isEmpty();
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__SOFTWARE:
			return software != null && !software.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Class_Diagram_RootImpl
