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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.RMDL_Project;
import org.mcmaster.requirements_modelling.rmdl.RequirementContainer;
import org.mcmaster.requirements_modelling.rmdl.RequirementType;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas;
import org.mcmaster.requirements_modelling.rmdl.Review;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.TestCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl#getTestCase <em>Test Case</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl#getDesignElement <em>Design Element</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl#getRequirementcontainer <em>Requirementcontainer</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl#getRmdl_project <em>Rmdl project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Requirement_CanvasImpl extends MinimalEObjectImpl.Container implements Requirement_Canvas {
	/**
	 * The cached value of the '{@link #getTestCase() <em>Test Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCase()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testCase;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementType> requirements;

	/**
	 * The cached value of the '{@link #getReview() <em>Review</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected EList<Review> review;

	/**
	 * The cached value of the '{@link #getDesignElement() <em>Design Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignElement> designElement;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirementcontainer() <em>Requirementcontainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementcontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementContainer> requirementcontainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Requirement_CanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.REQUIREMENT_CANVAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestCase() {
		if (testCase == null) {
			testCase = new EObjectContainmentWithInverseEList<TestCase>(TestCase.class, this,
					RmdlPackage.REQUIREMENT_CANVAS__TEST_CASE, RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS);
		}
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementType> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentWithInverseEList<RequirementType>(RequirementType.class, this,
					RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTS, RmdlPackage.REQUIREMENT_TYPE__REQUIREMENT_CANVAS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Review> getReview() {
		if (review == null) {
			review = new EObjectContainmentWithInverseEList<Review>(Review.class, this,
					RmdlPackage.REQUIREMENT_CANVAS__REVIEW, RmdlPackage.REVIEW__REQUIREMENT_CANVAS);
		}
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignElement> getDesignElement() {
		if (designElement == null) {
			designElement = new EObjectContainmentWithInverseEList<DesignElement>(DesignElement.class, this,
					RmdlPackage.REQUIREMENT_CANVAS__DESIGN_ELEMENT, RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS);
		}
		return designElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_CANVAS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementContainer> getRequirementcontainer() {
		if (requirementcontainer == null) {
			requirementcontainer = new EObjectContainmentWithInverseEList<RequirementContainer>(
					RequirementContainer.class, this, RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTCONTAINER,
					RmdlPackage.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS);
		}
		return requirementcontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMDL_Project getRmdl_project() {
		if (eContainerFeatureID() != RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT)
			return null;
		return (RMDL_Project) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRmdl_project(RMDL_Project newRmdl_project, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRmdl_project, RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRmdl_project(RMDL_Project newRmdl_project) {
		if (newRmdl_project != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT && newRmdl_project != null)) {
			if (EcoreUtil.isAncestor(this, newRmdl_project))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRmdl_project != null)
				msgs = ((InternalEObject) newRmdl_project).eInverseAdd(this,
						RmdlPackage.RMDL_PROJECT__REQUIREMENT_CANVAS, RMDL_Project.class, msgs);
			msgs = basicSetRmdl_project(newRmdl_project, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT,
					newRmdl_project, newRmdl_project));
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
		case RmdlPackage.REQUIREMENT_CANVAS__TEST_CASE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTestCase()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequirements()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_CANVAS__REVIEW:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReview()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_CANVAS__DESIGN_ELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDesignElement()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTCONTAINER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequirementcontainer()).basicAdd(otherEnd,
					msgs);
		case RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRmdl_project((RMDL_Project) otherEnd, msgs);
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
		case RmdlPackage.REQUIREMENT_CANVAS__TEST_CASE:
			return ((InternalEList<?>) getTestCase()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTS:
			return ((InternalEList<?>) getRequirements()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_CANVAS__REVIEW:
			return ((InternalEList<?>) getReview()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_CANVAS__DESIGN_ELEMENT:
			return ((InternalEList<?>) getDesignElement()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTCONTAINER:
			return ((InternalEList<?>) getRequirementcontainer()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT:
			return basicSetRmdl_project(null, msgs);
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
		case RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.RMDL_PROJECT__REQUIREMENT_CANVAS,
					RMDL_Project.class, msgs);
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
		case RmdlPackage.REQUIREMENT_CANVAS__TEST_CASE:
			return getTestCase();
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTS:
			return getRequirements();
		case RmdlPackage.REQUIREMENT_CANVAS__REVIEW:
			return getReview();
		case RmdlPackage.REQUIREMENT_CANVAS__DESIGN_ELEMENT:
			return getDesignElement();
		case RmdlPackage.REQUIREMENT_CANVAS__NAME:
			return getName();
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTCONTAINER:
			return getRequirementcontainer();
		case RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT:
			return getRmdl_project();
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
		case RmdlPackage.REQUIREMENT_CANVAS__TEST_CASE:
			getTestCase().clear();
			getTestCase().addAll((Collection<? extends TestCase>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTS:
			getRequirements().clear();
			getRequirements().addAll((Collection<? extends RequirementType>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__REVIEW:
			getReview().clear();
			getReview().addAll((Collection<? extends Review>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__DESIGN_ELEMENT:
			getDesignElement().clear();
			getDesignElement().addAll((Collection<? extends DesignElement>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__NAME:
			setName((String) newValue);
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTCONTAINER:
			getRequirementcontainer().clear();
			getRequirementcontainer().addAll((Collection<? extends RequirementContainer>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT:
			setRmdl_project((RMDL_Project) newValue);
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
		case RmdlPackage.REQUIREMENT_CANVAS__TEST_CASE:
			getTestCase().clear();
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTS:
			getRequirements().clear();
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__REVIEW:
			getReview().clear();
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__DESIGN_ELEMENT:
			getDesignElement().clear();
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTCONTAINER:
			getRequirementcontainer().clear();
			return;
		case RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT:
			setRmdl_project((RMDL_Project) null);
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
		case RmdlPackage.REQUIREMENT_CANVAS__TEST_CASE:
			return testCase != null && !testCase.isEmpty();
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTS:
			return requirements != null && !requirements.isEmpty();
		case RmdlPackage.REQUIREMENT_CANVAS__REVIEW:
			return review != null && !review.isEmpty();
		case RmdlPackage.REQUIREMENT_CANVAS__DESIGN_ELEMENT:
			return designElement != null && !designElement.isEmpty();
		case RmdlPackage.REQUIREMENT_CANVAS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RmdlPackage.REQUIREMENT_CANVAS__REQUIREMENTCONTAINER:
			return requirementcontainer != null && !requirementcontainer.isEmpty();
		case RmdlPackage.REQUIREMENT_CANVAS__RMDL_PROJECT:
			return getRmdl_project() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Requirement_CanvasImpl
