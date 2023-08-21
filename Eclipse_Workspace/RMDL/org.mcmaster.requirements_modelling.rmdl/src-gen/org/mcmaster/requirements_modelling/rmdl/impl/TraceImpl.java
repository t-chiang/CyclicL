/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.Entity;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TraceImpl#getDesignelement <em>Designelement</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TraceImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends ReferenceImpl implements Trace {
	/**
	 * The cached value of the '{@link #getDesignelement() <em>Designelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignelement()
	 * @generated
	 * @ordered
	 */
	protected DesignElement designelement;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected Entity requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignElement getDesignelement() {
		if (designelement != null && designelement.eIsProxy()) {
			InternalEObject oldDesignelement = (InternalEObject) designelement;
			designelement = (DesignElement) eResolveProxy(oldDesignelement);
			if (designelement != oldDesignelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.TRACE__DESIGNELEMENT,
							oldDesignelement, designelement));
			}
		}
		return designelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignElement basicGetDesignelement() {
		return designelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignelement(DesignElement newDesignelement, NotificationChain msgs) {
		DesignElement oldDesignelement = designelement;
		designelement = newDesignelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.TRACE__DESIGNELEMENT, oldDesignelement, newDesignelement);
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
	public void setDesignelement(DesignElement newDesignelement) {
		if (newDesignelement != designelement) {
			NotificationChain msgs = null;
			if (designelement != null)
				msgs = ((InternalEObject) designelement).eInverseRemove(this, RmdlPackage.DESIGN_ELEMENT__SATISFIES,
						DesignElement.class, msgs);
			if (newDesignelement != null)
				msgs = ((InternalEObject) newDesignelement).eInverseAdd(this, RmdlPackage.DESIGN_ELEMENT__SATISFIES,
						DesignElement.class, msgs);
			msgs = basicSetDesignelement(newDesignelement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.TRACE__DESIGNELEMENT, newDesignelement,
					newDesignelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject) requirement;
			requirement = (Entity) eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.TRACE__REQUIREMENT,
							oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(Entity newRequirement, NotificationChain msgs) {
		Entity oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.TRACE__REQUIREMENT, oldRequirement, newRequirement);
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
	public void setRequirement(Entity newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject) requirement).eInverseRemove(this, RmdlPackage.ENTITY__SATISFIED_BY,
						Entity.class, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject) newRequirement).eInverseAdd(this, RmdlPackage.ENTITY__SATISFIED_BY,
						Entity.class, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.TRACE__REQUIREMENT, newRequirement,
					newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.TRACE__DESIGNELEMENT:
			if (designelement != null)
				msgs = ((InternalEObject) designelement).eInverseRemove(this, RmdlPackage.DESIGN_ELEMENT__SATISFIES,
						DesignElement.class, msgs);
			return basicSetDesignelement((DesignElement) otherEnd, msgs);
		case RmdlPackage.TRACE__REQUIREMENT:
			if (requirement != null)
				msgs = ((InternalEObject) requirement).eInverseRemove(this, RmdlPackage.ENTITY__SATISFIED_BY,
						Entity.class, msgs);
			return basicSetRequirement((Entity) otherEnd, msgs);
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
		case RmdlPackage.TRACE__DESIGNELEMENT:
			return basicSetDesignelement(null, msgs);
		case RmdlPackage.TRACE__REQUIREMENT:
			return basicSetRequirement(null, msgs);
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
		case RmdlPackage.TRACE__DESIGNELEMENT:
			if (resolve)
				return getDesignelement();
			return basicGetDesignelement();
		case RmdlPackage.TRACE__REQUIREMENT:
			if (resolve)
				return getRequirement();
			return basicGetRequirement();
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
		case RmdlPackage.TRACE__DESIGNELEMENT:
			setDesignelement((DesignElement) newValue);
			return;
		case RmdlPackage.TRACE__REQUIREMENT:
			setRequirement((Entity) newValue);
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
		case RmdlPackage.TRACE__DESIGNELEMENT:
			setDesignelement((DesignElement) null);
			return;
		case RmdlPackage.TRACE__REQUIREMENT:
			setRequirement((Entity) null);
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
		case RmdlPackage.TRACE__DESIGNELEMENT:
			return designelement != null;
		case RmdlPackage.TRACE__REQUIREMENT:
			return requirement != null;
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
