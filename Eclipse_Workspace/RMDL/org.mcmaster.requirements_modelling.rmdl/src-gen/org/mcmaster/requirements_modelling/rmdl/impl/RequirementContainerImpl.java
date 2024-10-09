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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.RequirementContainer;
import org.mcmaster.requirements_modelling.rmdl.RequirementType;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementContainerImpl#getOwnedrequirements <em>Ownedrequirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementContainerImpl#getRequirement_canvas <em>Requirement canvas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementContainerImpl extends RequirementsImpl implements RequirementContainer {
	/**
	 * The cached value of the '{@link #getOwnedrequirements() <em>Ownedrequirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedrequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementType> ownedrequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.REQUIREMENT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementType> getOwnedrequirements() {
		if (ownedrequirements == null) {
			ownedrequirements = new EObjectContainmentWithInverseEList<RequirementType>(RequirementType.class, this,
					RmdlPackage.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS,
					RmdlPackage.REQUIREMENT_TYPE__REQUIREMENTCONTAINER);
		}
		return ownedrequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Canvas getRequirement_canvas() {
		if (eContainerFeatureID() != RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS)
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
				RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement_canvas(Requirement_Canvas newRequirement_canvas) {
		if (newRequirement_canvas != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS
						&& newRequirement_canvas != null)) {
			if (EcoreUtil.isAncestor(this, newRequirement_canvas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirement_canvas != null)
				msgs = ((InternalEObject) newRequirement_canvas).eInverseAdd(this,
						RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTCONTAINER, Requirement_Canvas.class, msgs);
			msgs = basicSetRequirement_canvas(newRequirement_canvas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS,
					newRequirement_canvas, newRequirement_canvas));
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
		case RmdlPackage.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedrequirements()).basicAdd(otherEnd,
					msgs);
		case RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS:
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
		case RmdlPackage.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS:
			return ((InternalEList<?>) getOwnedrequirements()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS:
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
		case RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTCONTAINER,
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
		case RmdlPackage.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS:
			return getOwnedrequirements();
		case RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS:
			return getRequirement_canvas();
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
		case RmdlPackage.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS:
			getOwnedrequirements().clear();
			getOwnedrequirements().addAll((Collection<? extends RequirementType>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS:
			setRequirement_canvas((Requirement_Canvas) newValue);
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
		case RmdlPackage.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS:
			getOwnedrequirements().clear();
			return;
		case RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS:
			setRequirement_canvas((Requirement_Canvas) null);
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
		case RmdlPackage.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS:
			return ownedrequirements != null && !ownedrequirements.isEmpty();
		case RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS:
			return getRequirement_canvas() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementContainerImpl
