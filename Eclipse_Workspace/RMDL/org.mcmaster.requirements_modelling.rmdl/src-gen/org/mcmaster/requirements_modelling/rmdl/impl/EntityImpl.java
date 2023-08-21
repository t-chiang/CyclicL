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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.Entity;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.Trace;
import org.mcmaster.requirements_modelling.rmdl.Verification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.EntityImpl#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.EntityImpl#getVerificationTgt <em>Verification Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The cached value of the '{@link #getSatisfiedBy() <em>Satisfied By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedBy()
	 * @generated
	 * @ordered
	 */
	protected Trace satisfiedBy;

	/**
	 * The cached value of the '{@link #getVerificationTgt() <em>Verification Tgt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationTgt()
	 * @generated
	 * @ordered
	 */
	protected EList<Verification> verificationTgt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace getSatisfiedBy() {
		if (satisfiedBy != null && satisfiedBy.eIsProxy()) {
			InternalEObject oldSatisfiedBy = (InternalEObject) satisfiedBy;
			satisfiedBy = (Trace) eResolveProxy(oldSatisfiedBy);
			if (satisfiedBy != oldSatisfiedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.ENTITY__SATISFIED_BY,
							oldSatisfiedBy, satisfiedBy));
			}
		}
		return satisfiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace basicGetSatisfiedBy() {
		return satisfiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatisfiedBy(Trace newSatisfiedBy, NotificationChain msgs) {
		Trace oldSatisfiedBy = satisfiedBy;
		satisfiedBy = newSatisfiedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.ENTITY__SATISFIED_BY, oldSatisfiedBy, newSatisfiedBy);
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
	public void setSatisfiedBy(Trace newSatisfiedBy) {
		if (newSatisfiedBy != satisfiedBy) {
			NotificationChain msgs = null;
			if (satisfiedBy != null)
				msgs = ((InternalEObject) satisfiedBy).eInverseRemove(this, RmdlPackage.TRACE__REQUIREMENT, Trace.class,
						msgs);
			if (newSatisfiedBy != null)
				msgs = ((InternalEObject) newSatisfiedBy).eInverseAdd(this, RmdlPackage.TRACE__REQUIREMENT, Trace.class,
						msgs);
			msgs = basicSetSatisfiedBy(newSatisfiedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.ENTITY__SATISFIED_BY, newSatisfiedBy,
					newSatisfiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Verification> getVerificationTgt() {
		if (verificationTgt == null) {
			verificationTgt = new EObjectWithInverseResolvingEList<Verification>(Verification.class, this,
					RmdlPackage.ENTITY__VERIFICATION_TGT, RmdlPackage.VERIFICATION__ENTITY);
		}
		return verificationTgt;
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
		case RmdlPackage.ENTITY__SATISFIED_BY:
			if (satisfiedBy != null)
				msgs = ((InternalEObject) satisfiedBy).eInverseRemove(this, RmdlPackage.TRACE__REQUIREMENT, Trace.class,
						msgs);
			return basicSetSatisfiedBy((Trace) otherEnd, msgs);
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVerificationTgt()).basicAdd(otherEnd, msgs);
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
		case RmdlPackage.ENTITY__SATISFIED_BY:
			return basicSetSatisfiedBy(null, msgs);
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			return ((InternalEList<?>) getVerificationTgt()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.ENTITY__SATISFIED_BY:
			if (resolve)
				return getSatisfiedBy();
			return basicGetSatisfiedBy();
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			return getVerificationTgt();
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
		case RmdlPackage.ENTITY__SATISFIED_BY:
			setSatisfiedBy((Trace) newValue);
			return;
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			getVerificationTgt().clear();
			getVerificationTgt().addAll((Collection<? extends Verification>) newValue);
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
		case RmdlPackage.ENTITY__SATISFIED_BY:
			setSatisfiedBy((Trace) null);
			return;
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			getVerificationTgt().clear();
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
		case RmdlPackage.ENTITY__SATISFIED_BY:
			return satisfiedBy != null;
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			return verificationTgt != null && !verificationTgt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
