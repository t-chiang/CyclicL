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
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.Review;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.TestCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_DiagramImpl#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_DiagramImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_DiagramImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_DiagramImpl#getDesignelement <em>Designelement</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_DiagramImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Requirement_DiagramImpl extends MinimalEObjectImpl.Container implements Requirement_Diagram {
	/**
	 * The cached value of the '{@link #getTestcase() <em>Testcase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestcase()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testcase;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirements> requirements;

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
	 * The cached value of the '{@link #getDesignelement() <em>Designelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignelement()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignElement> designelement;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Requirement_DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.REQUIREMENT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestcase() {
		if (testcase == null) {
			testcase = new EObjectContainmentWithInverseEList<TestCase>(TestCase.class, this,
					RmdlPackage.REQUIREMENT_DIAGRAM__TESTCASE, RmdlPackage.TEST_CASE__REQUIREMENT_ROOT);
		}
		return testcase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirements> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentWithInverseEList<Requirements>(Requirements.class, this,
					RmdlPackage.REQUIREMENT_DIAGRAM__REQUIREMENTS, RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT);
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
					RmdlPackage.REQUIREMENT_DIAGRAM__REVIEW, RmdlPackage.REVIEW__REQUIREMENT_ROOT);
		}
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignElement> getDesignelement() {
		if (designelement == null) {
			designelement = new EObjectContainmentWithInverseEList<DesignElement>(DesignElement.class, this,
					RmdlPackage.REQUIREMENT_DIAGRAM__DESIGNELEMENT, RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_ROOT);
		}
		return designelement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT_DIAGRAM__NAME, oldName,
					name));
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
		case RmdlPackage.REQUIREMENT_DIAGRAM__TESTCASE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTestcase()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_DIAGRAM__REQUIREMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequirements()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_DIAGRAM__REVIEW:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReview()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_DIAGRAM__DESIGNELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDesignelement()).basicAdd(otherEnd, msgs);
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
		case RmdlPackage.REQUIREMENT_DIAGRAM__TESTCASE:
			return ((InternalEList<?>) getTestcase()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_DIAGRAM__REQUIREMENTS:
			return ((InternalEList<?>) getRequirements()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_DIAGRAM__REVIEW:
			return ((InternalEList<?>) getReview()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_DIAGRAM__DESIGNELEMENT:
			return ((InternalEList<?>) getDesignelement()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.REQUIREMENT_DIAGRAM__TESTCASE:
			return getTestcase();
		case RmdlPackage.REQUIREMENT_DIAGRAM__REQUIREMENTS:
			return getRequirements();
		case RmdlPackage.REQUIREMENT_DIAGRAM__REVIEW:
			return getReview();
		case RmdlPackage.REQUIREMENT_DIAGRAM__DESIGNELEMENT:
			return getDesignelement();
		case RmdlPackage.REQUIREMENT_DIAGRAM__NAME:
			return getName();
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
		case RmdlPackage.REQUIREMENT_DIAGRAM__TESTCASE:
			getTestcase().clear();
			getTestcase().addAll((Collection<? extends TestCase>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_DIAGRAM__REQUIREMENTS:
			getRequirements().clear();
			getRequirements().addAll((Collection<? extends Requirements>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_DIAGRAM__REVIEW:
			getReview().clear();
			getReview().addAll((Collection<? extends Review>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_DIAGRAM__DESIGNELEMENT:
			getDesignelement().clear();
			getDesignelement().addAll((Collection<? extends DesignElement>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_DIAGRAM__NAME:
			setName((String) newValue);
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
		case RmdlPackage.REQUIREMENT_DIAGRAM__TESTCASE:
			getTestcase().clear();
			return;
		case RmdlPackage.REQUIREMENT_DIAGRAM__REQUIREMENTS:
			getRequirements().clear();
			return;
		case RmdlPackage.REQUIREMENT_DIAGRAM__REVIEW:
			getReview().clear();
			return;
		case RmdlPackage.REQUIREMENT_DIAGRAM__DESIGNELEMENT:
			getDesignelement().clear();
			return;
		case RmdlPackage.REQUIREMENT_DIAGRAM__NAME:
			setName(NAME_EDEFAULT);
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
		case RmdlPackage.REQUIREMENT_DIAGRAM__TESTCASE:
			return testcase != null && !testcase.isEmpty();
		case RmdlPackage.REQUIREMENT_DIAGRAM__REQUIREMENTS:
			return requirements != null && !requirements.isEmpty();
		case RmdlPackage.REQUIREMENT_DIAGRAM__REVIEW:
			return review != null && !review.isEmpty();
		case RmdlPackage.REQUIREMENT_DIAGRAM__DESIGNELEMENT:
			return designelement != null && !designelement.isEmpty();
		case RmdlPackage.REQUIREMENT_DIAGRAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //Requirement_DiagramImpl
