/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.Reference;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Root;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.Review;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.TestCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_RootImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_RootImpl#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_RootImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_RootImpl#getDesignelement <em>Designelement</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_RootImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_RootImpl#getReview <em>Review</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Requirement_RootImpl extends MinimalEObjectImpl.Container implements Requirement_Root {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

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
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<org.mcmaster.requirements_modelling.rmdl.Package> package_;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Requirement_RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.REQUIREMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Reference>(Reference.class, this,
					RmdlPackage.REQUIREMENT_ROOT__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestcase() {
		if (testcase == null) {
			testcase = new EObjectContainmentWithInverseEList<TestCase>(TestCase.class, this,
					RmdlPackage.REQUIREMENT_ROOT__TESTCASE, RmdlPackage.TEST_CASE__REQUIREMENT_ROOT);
		}
		return testcase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.mcmaster.requirements_modelling.rmdl.Package> getPackage() {
		if (package_ == null) {
			package_ = new EObjectContainmentWithInverseEList<org.mcmaster.requirements_modelling.rmdl.Package>(
					org.mcmaster.requirements_modelling.rmdl.Package.class, this, RmdlPackage.REQUIREMENT_ROOT__PACKAGE,
					RmdlPackage.PACKAGE__REQUIREMENT_ROOT);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignElement> getDesignelement() {
		if (designelement == null) {
			designelement = new EObjectContainmentWithInverseEList<DesignElement>(DesignElement.class, this,
					RmdlPackage.REQUIREMENT_ROOT__DESIGNELEMENT, RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_ROOT);
		}
		return designelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirements> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentWithInverseEList<Requirements>(Requirements.class, this,
					RmdlPackage.REQUIREMENT_ROOT__REQUIREMENTS, RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT);
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
					RmdlPackage.REQUIREMENT_ROOT__REVIEW, RmdlPackage.REVIEW__REQUIREMENT_ROOT);
		}
		return review;
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
		case RmdlPackage.REQUIREMENT_ROOT__TESTCASE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTestcase()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_ROOT__PACKAGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackage()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_ROOT__DESIGNELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDesignelement()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_ROOT__REQUIREMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequirements()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_ROOT__REVIEW:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReview()).basicAdd(otherEnd, msgs);
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
		case RmdlPackage.REQUIREMENT_ROOT__REFERENCE:
			return ((InternalEList<?>) getReference()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_ROOT__TESTCASE:
			return ((InternalEList<?>) getTestcase()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_ROOT__PACKAGE:
			return ((InternalEList<?>) getPackage()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_ROOT__DESIGNELEMENT:
			return ((InternalEList<?>) getDesignelement()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_ROOT__REQUIREMENTS:
			return ((InternalEList<?>) getRequirements()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT_ROOT__REVIEW:
			return ((InternalEList<?>) getReview()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.REQUIREMENT_ROOT__REFERENCE:
			return getReference();
		case RmdlPackage.REQUIREMENT_ROOT__TESTCASE:
			return getTestcase();
		case RmdlPackage.REQUIREMENT_ROOT__PACKAGE:
			return getPackage();
		case RmdlPackage.REQUIREMENT_ROOT__DESIGNELEMENT:
			return getDesignelement();
		case RmdlPackage.REQUIREMENT_ROOT__REQUIREMENTS:
			return getRequirements();
		case RmdlPackage.REQUIREMENT_ROOT__REVIEW:
			return getReview();
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
		case RmdlPackage.REQUIREMENT_ROOT__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Reference>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_ROOT__TESTCASE:
			getTestcase().clear();
			getTestcase().addAll((Collection<? extends TestCase>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_ROOT__PACKAGE:
			getPackage().clear();
			getPackage().addAll((Collection<? extends org.mcmaster.requirements_modelling.rmdl.Package>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_ROOT__DESIGNELEMENT:
			getDesignelement().clear();
			getDesignelement().addAll((Collection<? extends DesignElement>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_ROOT__REQUIREMENTS:
			getRequirements().clear();
			getRequirements().addAll((Collection<? extends Requirements>) newValue);
			return;
		case RmdlPackage.REQUIREMENT_ROOT__REVIEW:
			getReview().clear();
			getReview().addAll((Collection<? extends Review>) newValue);
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
		case RmdlPackage.REQUIREMENT_ROOT__REFERENCE:
			getReference().clear();
			return;
		case RmdlPackage.REQUIREMENT_ROOT__TESTCASE:
			getTestcase().clear();
			return;
		case RmdlPackage.REQUIREMENT_ROOT__PACKAGE:
			getPackage().clear();
			return;
		case RmdlPackage.REQUIREMENT_ROOT__DESIGNELEMENT:
			getDesignelement().clear();
			return;
		case RmdlPackage.REQUIREMENT_ROOT__REQUIREMENTS:
			getRequirements().clear();
			return;
		case RmdlPackage.REQUIREMENT_ROOT__REVIEW:
			getReview().clear();
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
		case RmdlPackage.REQUIREMENT_ROOT__REFERENCE:
			return reference != null && !reference.isEmpty();
		case RmdlPackage.REQUIREMENT_ROOT__TESTCASE:
			return testcase != null && !testcase.isEmpty();
		case RmdlPackage.REQUIREMENT_ROOT__PACKAGE:
			return package_ != null && !package_.isEmpty();
		case RmdlPackage.REQUIREMENT_ROOT__DESIGNELEMENT:
			return designelement != null && !designelement.isEmpty();
		case RmdlPackage.REQUIREMENT_ROOT__REQUIREMENTS:
			return requirements != null && !requirements.isEmpty();
		case RmdlPackage.REQUIREMENT_ROOT__REVIEW:
			return review != null && !review.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Requirement_RootImpl
