/**
 */
package org.mcmaster.pfcsm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.ReferenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected org.mcmaster.pfcsm.Class source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected org.mcmaster.pfcsm.Class target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.mcmaster.pfcsm.Class getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (org.mcmaster.pfcsm.Class) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.REFERENCE__SOURCE, oldSource,
							source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.mcmaster.pfcsm.Class basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(org.mcmaster.pfcsm.Class newSource, NotificationChain msgs) {
		org.mcmaster.pfcsm.Class oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.REFERENCE__SOURCE, oldSource, newSource);
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
	public void setSource(org.mcmaster.pfcsm.Class newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, PfcsmPackage.CLASS__REFERENCE_TO,
						org.mcmaster.pfcsm.Class.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, PfcsmPackage.CLASS__REFERENCE_TO,
						org.mcmaster.pfcsm.Class.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.REFERENCE__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.mcmaster.pfcsm.Class getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (org.mcmaster.pfcsm.Class) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.REFERENCE__TARGET, oldTarget,
							target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.mcmaster.pfcsm.Class basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(org.mcmaster.pfcsm.Class newTarget, NotificationChain msgs) {
		org.mcmaster.pfcsm.Class oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.REFERENCE__TARGET, oldTarget, newTarget);
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
	public void setTarget(org.mcmaster.pfcsm.Class newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, PfcsmPackage.CLASS__REFERENCE_FROM,
						org.mcmaster.pfcsm.Class.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, PfcsmPackage.CLASS__REFERENCE_FROM,
						org.mcmaster.pfcsm.Class.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.REFERENCE__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.REFERENCE__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, PfcsmPackage.CLASS__REFERENCE_TO,
						org.mcmaster.pfcsm.Class.class, msgs);
			return basicSetSource((org.mcmaster.pfcsm.Class) otherEnd, msgs);
		case PfcsmPackage.REFERENCE__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, PfcsmPackage.CLASS__REFERENCE_FROM,
						org.mcmaster.pfcsm.Class.class, msgs);
			return basicSetTarget((org.mcmaster.pfcsm.Class) otherEnd, msgs);
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
		case PfcsmPackage.REFERENCE__SOURCE:
			return basicSetSource(null, msgs);
		case PfcsmPackage.REFERENCE__TARGET:
			return basicSetTarget(null, msgs);
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
		case PfcsmPackage.REFERENCE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case PfcsmPackage.REFERENCE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PfcsmPackage.REFERENCE__SOURCE:
			setSource((org.mcmaster.pfcsm.Class) newValue);
			return;
		case PfcsmPackage.REFERENCE__TARGET:
			setTarget((org.mcmaster.pfcsm.Class) newValue);
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
		case PfcsmPackage.REFERENCE__SOURCE:
			setSource((org.mcmaster.pfcsm.Class) null);
			return;
		case PfcsmPackage.REFERENCE__TARGET:
			setTarget((org.mcmaster.pfcsm.Class) null);
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
		case PfcsmPackage.REFERENCE__SOURCE:
			return source != null;
		case PfcsmPackage.REFERENCE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
