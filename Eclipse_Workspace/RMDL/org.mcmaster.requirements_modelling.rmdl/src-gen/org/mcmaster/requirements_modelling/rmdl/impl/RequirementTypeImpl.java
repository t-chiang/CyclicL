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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mcmaster.requirements_modelling.rmdl.RequirementContainer;
import org.mcmaster.requirements_modelling.rmdl.RequirementType;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#getRequirementContainer <em>Requirement Container</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#getReplacedBy <em>Replaced By</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#isStartingReq <em>Starting Req</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#getRequirement_canvas <em>Requirement canvas</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#getRequirementOrigin <em>Requirement Origin</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#getRequirementVariant <em>Requirement Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementTypeImpl extends RequirementsImpl implements RequirementType {
	/**
	 * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected String specification = SPECIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReplacedBy() <em>Replaced By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedBy()
	 * @generated
	 * @ordered
	 */
	protected RequirementType replacedBy;

	/**
	 * The default value of the '{@link #isStartingReq() <em>Starting Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartingReq()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTING_REQ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStartingReq() <em>Starting Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartingReq()
	 * @generated
	 * @ordered
	 */
	protected boolean startingReq = STARTING_REQ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirementOrigin() <em>Requirement Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementOrigin()
	 * @generated
	 * @ordered
	 */
	protected RequirementType requirementOrigin;

	/**
	 * The cached value of the '{@link #getRequirementVariant() <em>Requirement Variant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementVariant()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementType> requirementVariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.REQUIREMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(String newSpecification) {
		String oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_TYPE__SPECIFICATION,
					oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementContainer getRequirementContainer() {
		if (eContainerFeatureID() != RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER)
			return null;
		return (RequirementContainer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirementContainer(RequirementContainer newRequirementContainer,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRequirementContainer,
				RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementContainer(RequirementContainer newRequirementContainer) {
		if (newRequirementContainer != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER
						&& newRequirementContainer != null)) {
			if (EcoreUtil.isAncestor(this, newRequirementContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirementContainer != null)
				msgs = ((InternalEObject) newRequirementContainer).eInverseAdd(this,
						RmdlPackage.REQUIREMENT_CONTAINER__OWNED_REQUIREMENTS, RequirementContainer.class, msgs);
			msgs = basicSetRequirementContainer(newRequirementContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER,
					newRequirementContainer, newRequirementContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType getReplacedBy() {
		if (replacedBy != null && replacedBy.eIsProxy()) {
			InternalEObject oldReplacedBy = (InternalEObject) replacedBy;
			replacedBy = (RequirementType) eResolveProxy(oldReplacedBy);
			if (replacedBy != oldReplacedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.REQUIREMENT_TYPE__REPLACED_BY,
							oldReplacedBy, replacedBy));
			}
		}
		return replacedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType basicGetReplacedBy() {
		return replacedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacedBy(RequirementType newReplacedBy) {
		RequirementType oldReplacedBy = replacedBy;
		replacedBy = newReplacedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_TYPE__REPLACED_BY,
					oldReplacedBy, replacedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStartingReq() {
		return startingReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingReq(boolean newStartingReq) {
		boolean oldStartingReq = startingReq;
		startingReq = newStartingReq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_TYPE__STARTING_REQ,
					oldStartingReq, startingReq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Canvas getRequirement_canvas() {
		if (eContainerFeatureID() != RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS)
			return null;
		return (Requirement_Canvas) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement_canvas(Requirement_Canvas newRequirement_canvas,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRequirement_canvas,
				RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement_canvas(Requirement_Canvas newRequirement_canvas) {
		if (newRequirement_canvas != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS
						&& newRequirement_canvas != null)) {
			if (EcoreUtil.isAncestor(this, newRequirement_canvas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirement_canvas != null)
				msgs = ((InternalEObject) newRequirement_canvas).eInverseAdd(this,
						RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTS, Requirement_Canvas.class, msgs);
			msgs = basicSetRequirement_canvas(newRequirement_canvas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS,
					newRequirement_canvas, newRequirement_canvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType getRequirementOrigin() {
		if (requirementOrigin != null && requirementOrigin.eIsProxy()) {
			InternalEObject oldRequirementOrigin = (InternalEObject) requirementOrigin;
			requirementOrigin = (RequirementType) eResolveProxy(oldRequirementOrigin);
			if (requirementOrigin != oldRequirementOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_ORIGIN, oldRequirementOrigin, requirementOrigin));
			}
		}
		return requirementOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType basicGetRequirementOrigin() {
		return requirementOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirementOrigin(RequirementType newRequirementOrigin, NotificationChain msgs) {
		RequirementType oldRequirementOrigin = requirementOrigin;
		requirementOrigin = newRequirementOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_ORIGIN, oldRequirementOrigin, newRequirementOrigin);
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
	public void setRequirementOrigin(RequirementType newRequirementOrigin) {
		if (newRequirementOrigin != requirementOrigin) {
			NotificationChain msgs = null;
			if (requirementOrigin != null)
				msgs = ((InternalEObject) requirementOrigin).eInverseRemove(this,
						RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_VARIANT, RequirementType.class, msgs);
			if (newRequirementOrigin != null)
				msgs = ((InternalEObject) newRequirementOrigin).eInverseAdd(this,
						RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_VARIANT, RequirementType.class, msgs);
			msgs = basicSetRequirementOrigin(newRequirementOrigin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_ORIGIN,
					newRequirementOrigin, newRequirementOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementType> getRequirementVariant() {
		if (requirementVariant == null) {
			requirementVariant = new EObjectWithInverseResolvingEList<RequirementType>(RequirementType.class, this,
					RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_VARIANT,
					RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_ORIGIN);
		}
		return requirementVariant;
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
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirementContainer((RequirementContainer) otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirement_canvas((Requirement_Canvas) otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_ORIGIN:
			if (requirementOrigin != null)
				msgs = ((InternalEObject) requirementOrigin).eInverseRemove(this,
						RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_VARIANT, RequirementType.class, msgs);
			return basicSetRequirementOrigin((RequirementType) otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_VARIANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequirementVariant()).basicAdd(otherEnd,
					msgs);
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
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER:
			return basicSetRequirementContainer(null, msgs);
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			return basicSetRequirement_canvas(null, msgs);
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_ORIGIN:
			return basicSetRequirementOrigin(null, msgs);
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_VARIANT:
			return ((InternalEList<?>) getRequirementVariant()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_CONTAINER__OWNED_REQUIREMENTS,
					RequirementContainer.class, msgs);
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTS,
					Requirement_Canvas.class, msgs);
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
		case RmdlPackage.REQUIREMENT_TYPE__SPECIFICATION:
			return getSpecification();
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER:
			return getRequirementContainer();
		case RmdlPackage.REQUIREMENT_TYPE__REPLACED_BY:
			if (resolve)
				return getReplacedBy();
			return basicGetReplacedBy();
		case RmdlPackage.REQUIREMENT_TYPE__STARTING_REQ:
			return isStartingReq();
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			return getRequirement_canvas();
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_ORIGIN:
			if (resolve)
				return getRequirementOrigin();
			return basicGetRequirementOrigin();
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_VARIANT:
			return getRequirementVariant();
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
		case RmdlPackage.REQUIREMENT_TYPE__SPECIFICATION:
			setSpecification((String) newValue);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER:
			setRequirementContainer((RequirementContainer) newValue);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REPLACED_BY:
			setReplacedBy((RequirementType) newValue);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__STARTING_REQ:
			setStartingReq((Boolean) newValue);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			setRequirement_canvas((Requirement_Canvas) newValue);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_ORIGIN:
			setRequirementOrigin((RequirementType) newValue);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_VARIANT:
			getRequirementVariant().clear();
			getRequirementVariant().addAll((Collection<? extends RequirementType>) newValue);
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
		case RmdlPackage.REQUIREMENT_TYPE__SPECIFICATION:
			setSpecification(SPECIFICATION_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER:
			setRequirementContainer((RequirementContainer) null);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REPLACED_BY:
			setReplacedBy((RequirementType) null);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__STARTING_REQ:
			setStartingReq(STARTING_REQ_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			setRequirement_canvas((Requirement_Canvas) null);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_ORIGIN:
			setRequirementOrigin((RequirementType) null);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_VARIANT:
			getRequirementVariant().clear();
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
		case RmdlPackage.REQUIREMENT_TYPE__SPECIFICATION:
			return SPECIFICATION_EDEFAULT == null ? specification != null
					: !SPECIFICATION_EDEFAULT.equals(specification);
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CONTAINER:
			return getRequirementContainer() != null;
		case RmdlPackage.REQUIREMENT_TYPE__REPLACED_BY:
			return replacedBy != null;
		case RmdlPackage.REQUIREMENT_TYPE__STARTING_REQ:
			return startingReq != STARTING_REQ_EDEFAULT;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			return getRequirement_canvas() != null;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_ORIGIN:
			return requirementOrigin != null;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_VARIANT:
			return requirementVariant != null && !requirementVariant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (specification: ");
		result.append(specification);
		result.append(", startingReq: ");
		result.append(startingReq);
		result.append(')');
		return result.toString();
	}

} //RequirementTypeImpl
