/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mcmaster.requirements_modelling.rmdl.Decomposition;
import org.mcmaster.requirements_modelling.rmdl.Requirement;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DecompositionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DecompositionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecompositionImpl extends ReferenceImpl implements Decomposition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Requirement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Requirement target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.DECOMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Requirement) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.DECOMPOSITION__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Requirement newSource, NotificationChain msgs) {
		Requirement oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.DECOMPOSITION__SOURCE, oldSource, newSource);
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
	public void setSource(Requirement newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, RmdlPackage.REQUIREMENT__CHILD,
						Requirement.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, RmdlPackage.REQUIREMENT__CHILD,
						Requirement.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.DECOMPOSITION__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Requirement) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.DECOMPOSITION__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Requirement newTarget, NotificationChain msgs) {
		Requirement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.DECOMPOSITION__TARGET, oldTarget, newTarget);
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
	public void setTarget(Requirement newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, RmdlPackage.REQUIREMENT__PARENT,
						Requirement.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, RmdlPackage.REQUIREMENT__PARENT,
						Requirement.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.DECOMPOSITION__TARGET, newTarget,
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
		case RmdlPackage.DECOMPOSITION__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, RmdlPackage.REQUIREMENT__CHILD,
						Requirement.class, msgs);
			return basicSetSource((Requirement) otherEnd, msgs);
		case RmdlPackage.DECOMPOSITION__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, RmdlPackage.REQUIREMENT__PARENT,
						Requirement.class, msgs);
			return basicSetTarget((Requirement) otherEnd, msgs);
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
		case RmdlPackage.DECOMPOSITION__SOURCE:
			return basicSetSource(null, msgs);
		case RmdlPackage.DECOMPOSITION__TARGET:
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
		case RmdlPackage.DECOMPOSITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case RmdlPackage.DECOMPOSITION__TARGET:
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
		case RmdlPackage.DECOMPOSITION__SOURCE:
			setSource((Requirement) newValue);
			return;
		case RmdlPackage.DECOMPOSITION__TARGET:
			setTarget((Requirement) newValue);
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
		case RmdlPackage.DECOMPOSITION__SOURCE:
			setSource((Requirement) null);
			return;
		case RmdlPackage.DECOMPOSITION__TARGET:
			setTarget((Requirement) null);
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
		case RmdlPackage.DECOMPOSITION__SOURCE:
			return source != null;
		case RmdlPackage.DECOMPOSITION__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //DecompositionImpl
