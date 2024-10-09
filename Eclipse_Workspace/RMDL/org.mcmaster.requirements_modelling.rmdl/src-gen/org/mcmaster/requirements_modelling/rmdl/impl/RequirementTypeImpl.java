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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mcmaster.requirements_modelling.rmdl.FeatureEntity;
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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#getRequirementcontainer <em>Requirementcontainer</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#getReplacedby <em>Replacedby</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#isStartingReq <em>Starting Req</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#getRequirement_canvas <em>Requirement canvas</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl#getDependson <em>Dependson</em>}</li>
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
	 * The cached value of the '{@link #getReplacedby() <em>Replacedby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedby()
	 * @generated
	 * @ordered
	 */
	protected RequirementType replacedby;

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
	 * The cached value of the '{@link #getDependson() <em>Dependson</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependson()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureEntity> dependson;

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
	public RequirementContainer getRequirementcontainer() {
		if (eContainerFeatureID() != RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER)
			return null;
		return (RequirementContainer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirementcontainer(RequirementContainer newRequirementcontainer,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRequirementcontainer,
				RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementcontainer(RequirementContainer newRequirementcontainer) {
		if (newRequirementcontainer != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER
						&& newRequirementcontainer != null)) {
			if (EcoreUtil.isAncestor(this, newRequirementcontainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirementcontainer != null)
				msgs = ((InternalEObject) newRequirementcontainer).eInverseAdd(this,
						RmdlPackage.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS, RequirementContainer.class, msgs);
			msgs = basicSetRequirementcontainer(newRequirementcontainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER,
					newRequirementcontainer, newRequirementcontainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType getReplacedby() {
		if (replacedby != null && replacedby.eIsProxy()) {
			InternalEObject oldReplacedby = (InternalEObject) replacedby;
			replacedby = (RequirementType) eResolveProxy(oldReplacedby);
			if (replacedby != oldReplacedby) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.REQUIREMENT_TYPE__REPLACEDBY,
							oldReplacedby, replacedby));
			}
		}
		return replacedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType basicGetReplacedby() {
		return replacedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacedby(RequirementType newReplacedby) {
		RequirementType oldReplacedby = replacedby;
		replacedby = newReplacedby;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_TYPE__REPLACEDBY,
					oldReplacedby, replacedby));
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
	public EList<FeatureEntity> getDependson() {
		if (dependson == null) {
			dependson = new EObjectResolvingEList<FeatureEntity>(FeatureEntity.class, this,
					RmdlPackage.REQUIREMENT_TYPE__DEPENDSON);
		}
		return dependson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirementcontainer((RequirementContainer) otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirement_canvas((Requirement_Canvas) otherEnd, msgs);
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
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER:
			return basicSetRequirementcontainer(null, msgs);
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			return basicSetRequirement_canvas(null, msgs);
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
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS,
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
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER:
			return getRequirementcontainer();
		case RmdlPackage.REQUIREMENT_TYPE__REPLACEDBY:
			if (resolve)
				return getReplacedby();
			return basicGetReplacedby();
		case RmdlPackage.REQUIREMENT_TYPE__STARTING_REQ:
			return isStartingReq();
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			return getRequirement_canvas();
		case RmdlPackage.REQUIREMENT_TYPE__DEPENDSON:
			return getDependson();
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
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER:
			setRequirementcontainer((RequirementContainer) newValue);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REPLACEDBY:
			setReplacedby((RequirementType) newValue);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__STARTING_REQ:
			setStartingReq((Boolean) newValue);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			setRequirement_canvas((Requirement_Canvas) newValue);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__DEPENDSON:
			getDependson().clear();
			getDependson().addAll((Collection<? extends FeatureEntity>) newValue);
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
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER:
			setRequirementcontainer((RequirementContainer) null);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REPLACEDBY:
			setReplacedby((RequirementType) null);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__STARTING_REQ:
			setStartingReq(STARTING_REQ_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			setRequirement_canvas((Requirement_Canvas) null);
			return;
		case RmdlPackage.REQUIREMENT_TYPE__DEPENDSON:
			getDependson().clear();
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
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER:
			return getRequirementcontainer() != null;
		case RmdlPackage.REQUIREMENT_TYPE__REPLACEDBY:
			return replacedby != null;
		case RmdlPackage.REQUIREMENT_TYPE__STARTING_REQ:
			return startingReq != STARTING_REQ_EDEFAULT;
		case RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS:
			return getRequirement_canvas() != null;
		case RmdlPackage.REQUIREMENT_TYPE__DEPENDSON:
			return dependson != null && !dependson.isEmpty();
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
