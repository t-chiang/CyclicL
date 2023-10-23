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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.Entity;
import org.mcmaster.requirements_modelling.rmdl.ModelRoot;
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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.EntityImpl#getModelroot <em>Modelroot</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The cached value of the '{@link #getSatisfiedBy() <em>Satisfied By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> satisfiedBy;

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
	public EList<Trace> getSatisfiedBy() {
		if (satisfiedBy == null) {
			satisfiedBy = new EObjectWithInverseResolvingEList<Trace>(Trace.class, this,
					RmdlPackage.ENTITY__SATISFIED_BY, RmdlPackage.TRACE__REQUIREMENT);
		}
		return satisfiedBy;
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
	public ModelRoot getModelroot() {
		if (eContainerFeatureID() != RmdlPackage.ENTITY__MODELROOT)
			return null;
		return (ModelRoot) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelroot(ModelRoot newModelroot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModelroot, RmdlPackage.ENTITY__MODELROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelroot(ModelRoot newModelroot) {
		if (newModelroot != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.ENTITY__MODELROOT && newModelroot != null)) {
			if (EcoreUtil.isAncestor(this, newModelroot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelroot != null)
				msgs = ((InternalEObject) newModelroot).eInverseAdd(this, RmdlPackage.MODEL_ROOT__ENTITY,
						ModelRoot.class, msgs);
			msgs = basicSetModelroot(newModelroot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.ENTITY__MODELROOT, newModelroot,
					newModelroot));
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
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSatisfiedBy()).basicAdd(otherEnd, msgs);
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVerificationTgt()).basicAdd(otherEnd, msgs);
		case RmdlPackage.ENTITY__MODELROOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModelroot((ModelRoot) otherEnd, msgs);
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
			return ((InternalEList<?>) getSatisfiedBy()).basicRemove(otherEnd, msgs);
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			return ((InternalEList<?>) getVerificationTgt()).basicRemove(otherEnd, msgs);
		case RmdlPackage.ENTITY__MODELROOT:
			return basicSetModelroot(null, msgs);
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
		case RmdlPackage.ENTITY__MODELROOT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.MODEL_ROOT__ENTITY, ModelRoot.class, msgs);
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
		case RmdlPackage.ENTITY__SATISFIED_BY:
			return getSatisfiedBy();
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			return getVerificationTgt();
		case RmdlPackage.ENTITY__MODELROOT:
			return getModelroot();
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
			getSatisfiedBy().clear();
			getSatisfiedBy().addAll((Collection<? extends Trace>) newValue);
			return;
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			getVerificationTgt().clear();
			getVerificationTgt().addAll((Collection<? extends Verification>) newValue);
			return;
		case RmdlPackage.ENTITY__MODELROOT:
			setModelroot((ModelRoot) newValue);
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
			getSatisfiedBy().clear();
			return;
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			getVerificationTgt().clear();
			return;
		case RmdlPackage.ENTITY__MODELROOT:
			setModelroot((ModelRoot) null);
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
			return satisfiedBy != null && !satisfiedBy.isEmpty();
		case RmdlPackage.ENTITY__VERIFICATION_TGT:
			return verificationTgt != null && !verificationTgt.isEmpty();
		case RmdlPackage.ENTITY__MODELROOT:
			return getModelroot() != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
