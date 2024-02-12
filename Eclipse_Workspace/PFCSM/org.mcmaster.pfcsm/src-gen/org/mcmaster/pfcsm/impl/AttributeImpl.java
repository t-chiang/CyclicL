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
import org.mcmaster.pfcsm.Attribute;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Produces;
import org.mcmaster.pfcsm.Uses;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.AttributeImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.AttributeImpl#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends ElementImpl implements Attribute {
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
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uses> getUses() {
		if (uses == null) {
			uses = new EObjectWithInverseResolvingEList<Uses>(Uses.class, this, PfcsmPackage.ATTRIBUTE__USES,
					PfcsmPackage.USES__ATTRIBUTE);
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
					PfcsmPackage.ATTRIBUTE__PRODUCES, PfcsmPackage.PRODUCES__ATTRIBUTE);
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
		case PfcsmPackage.ATTRIBUTE__USES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUses()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.ATTRIBUTE__PRODUCES:
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
		case PfcsmPackage.ATTRIBUTE__USES:
			return ((InternalEList<?>) getUses()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.ATTRIBUTE__PRODUCES:
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
		case PfcsmPackage.ATTRIBUTE__USES:
			return getUses();
		case PfcsmPackage.ATTRIBUTE__PRODUCES:
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
		case PfcsmPackage.ATTRIBUTE__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends Uses>) newValue);
			return;
		case PfcsmPackage.ATTRIBUTE__PRODUCES:
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
		case PfcsmPackage.ATTRIBUTE__USES:
			getUses().clear();
			return;
		case PfcsmPackage.ATTRIBUTE__PRODUCES:
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
		case PfcsmPackage.ATTRIBUTE__USES:
			return uses != null && !uses.isEmpty();
		case PfcsmPackage.ATTRIBUTE__PRODUCES:
			return produces != null && !produces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeImpl
