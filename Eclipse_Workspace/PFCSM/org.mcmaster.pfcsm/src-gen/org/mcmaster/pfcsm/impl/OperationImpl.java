/**
 */
package org.mcmaster.pfcsm.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mcmaster.pfcsm.Operation;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Produces;
import org.mcmaster.pfcsm.Uses;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationImpl#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends ElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Uses> uses;
	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<Produces> produces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uses> getUses() {
		if (uses == null) {
			uses = new EObjectWithInverseResolvingEList<Uses>(Uses.class, this, PfcsmPackage.OPERATION__USES,
					PfcsmPackage.USES__OPERATION);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Produces> getProduces() {
		if (produces == null) {
			produces = new EObjectWithInverseResolvingEList<Produces>(Produces.class, this,
					PfcsmPackage.OPERATION__PRODUCES, PfcsmPackage.PRODUCES__OPERATION);
		}
		return produces;
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
		case PfcsmPackage.OPERATION__USES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUses()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.OPERATION__PRODUCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProduces()).basicAdd(otherEnd, msgs);
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
		case PfcsmPackage.OPERATION__USES:
			return ((InternalEList<?>) getUses()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.OPERATION__PRODUCES:
			return ((InternalEList<?>) getProduces()).basicRemove(otherEnd, msgs);
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
		case PfcsmPackage.OPERATION__USES:
			return getUses();
		case PfcsmPackage.OPERATION__PRODUCES:
			return getProduces();
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
		case PfcsmPackage.OPERATION__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends Uses>) newValue);
			return;
		case PfcsmPackage.OPERATION__PRODUCES:
			getProduces().clear();
			getProduces().addAll((Collection<? extends Produces>) newValue);
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
		case PfcsmPackage.OPERATION__USES:
			getUses().clear();
			return;
		case PfcsmPackage.OPERATION__PRODUCES:
			getProduces().clear();
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
		case PfcsmPackage.OPERATION__USES:
			return uses != null && !uses.isEmpty();
		case PfcsmPackage.OPERATION__PRODUCES:
			return produces != null && !produces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
