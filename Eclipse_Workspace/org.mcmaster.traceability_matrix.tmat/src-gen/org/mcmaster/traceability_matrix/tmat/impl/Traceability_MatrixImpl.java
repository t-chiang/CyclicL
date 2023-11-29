/**
 */
package org.mcmaster.traceability_matrix.tmat.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.traceability_matrix.tmat.Design;
import org.mcmaster.traceability_matrix.tmat.Implementation;
import org.mcmaster.traceability_matrix.tmat.ProjectRequirements;
import org.mcmaster.traceability_matrix.tmat.Review;
import org.mcmaster.traceability_matrix.tmat.Testing;
import org.mcmaster.traceability_matrix.tmat.TmatPackage;
import org.mcmaster.traceability_matrix.tmat.Traceability_Matrix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traceability Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.impl.Traceability_MatrixImpl#getProjectrequirements <em>Projectrequirements</em>}</li>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.impl.Traceability_MatrixImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.impl.Traceability_MatrixImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.impl.Traceability_MatrixImpl#getTesting <em>Testing</em>}</li>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.impl.Traceability_MatrixImpl#getReview <em>Review</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Traceability_MatrixImpl extends MinimalEObjectImpl.Container implements Traceability_Matrix {
	/**
	 * The cached value of the '{@link #getProjectrequirements() <em>Projectrequirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectrequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectRequirements> projectrequirements;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected EList<Design> design;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<Implementation> implementation;

	/**
	 * The cached value of the '{@link #getTesting() <em>Testing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTesting()
	 * @generated
	 * @ordered
	 */
	protected EList<Testing> testing;

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
	protected Traceability_MatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TmatPackage.Literals.TRACEABILITY_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectRequirements> getProjectrequirements() {
		if (projectrequirements == null) {
			projectrequirements = new EObjectContainmentEList<ProjectRequirements>(ProjectRequirements.class, this,
					TmatPackage.TRACEABILITY_MATRIX__PROJECTREQUIREMENTS);
		}
		return projectrequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Design> getDesign() {
		if (design == null) {
			design = new EObjectContainmentEList<Design>(Design.class, this, TmatPackage.TRACEABILITY_MATRIX__DESIGN);
		}
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implementation> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectContainmentEList<Implementation>(Implementation.class, this,
					TmatPackage.TRACEABILITY_MATRIX__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Testing> getTesting() {
		if (testing == null) {
			testing = new EObjectContainmentEList<Testing>(Testing.class, this,
					TmatPackage.TRACEABILITY_MATRIX__TESTING);
		}
		return testing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Review> getReview() {
		if (review == null) {
			review = new EObjectContainmentEList<Review>(Review.class, this, TmatPackage.TRACEABILITY_MATRIX__REVIEW);
		}
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TmatPackage.TRACEABILITY_MATRIX__PROJECTREQUIREMENTS:
			return ((InternalEList<?>) getProjectrequirements()).basicRemove(otherEnd, msgs);
		case TmatPackage.TRACEABILITY_MATRIX__DESIGN:
			return ((InternalEList<?>) getDesign()).basicRemove(otherEnd, msgs);
		case TmatPackage.TRACEABILITY_MATRIX__IMPLEMENTATION:
			return ((InternalEList<?>) getImplementation()).basicRemove(otherEnd, msgs);
		case TmatPackage.TRACEABILITY_MATRIX__TESTING:
			return ((InternalEList<?>) getTesting()).basicRemove(otherEnd, msgs);
		case TmatPackage.TRACEABILITY_MATRIX__REVIEW:
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
		case TmatPackage.TRACEABILITY_MATRIX__PROJECTREQUIREMENTS:
			return getProjectrequirements();
		case TmatPackage.TRACEABILITY_MATRIX__DESIGN:
			return getDesign();
		case TmatPackage.TRACEABILITY_MATRIX__IMPLEMENTATION:
			return getImplementation();
		case TmatPackage.TRACEABILITY_MATRIX__TESTING:
			return getTesting();
		case TmatPackage.TRACEABILITY_MATRIX__REVIEW:
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
		case TmatPackage.TRACEABILITY_MATRIX__PROJECTREQUIREMENTS:
			getProjectrequirements().clear();
			getProjectrequirements().addAll((Collection<? extends ProjectRequirements>) newValue);
			return;
		case TmatPackage.TRACEABILITY_MATRIX__DESIGN:
			getDesign().clear();
			getDesign().addAll((Collection<? extends Design>) newValue);
			return;
		case TmatPackage.TRACEABILITY_MATRIX__IMPLEMENTATION:
			getImplementation().clear();
			getImplementation().addAll((Collection<? extends Implementation>) newValue);
			return;
		case TmatPackage.TRACEABILITY_MATRIX__TESTING:
			getTesting().clear();
			getTesting().addAll((Collection<? extends Testing>) newValue);
			return;
		case TmatPackage.TRACEABILITY_MATRIX__REVIEW:
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
		case TmatPackage.TRACEABILITY_MATRIX__PROJECTREQUIREMENTS:
			getProjectrequirements().clear();
			return;
		case TmatPackage.TRACEABILITY_MATRIX__DESIGN:
			getDesign().clear();
			return;
		case TmatPackage.TRACEABILITY_MATRIX__IMPLEMENTATION:
			getImplementation().clear();
			return;
		case TmatPackage.TRACEABILITY_MATRIX__TESTING:
			getTesting().clear();
			return;
		case TmatPackage.TRACEABILITY_MATRIX__REVIEW:
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
		case TmatPackage.TRACEABILITY_MATRIX__PROJECTREQUIREMENTS:
			return projectrequirements != null && !projectrequirements.isEmpty();
		case TmatPackage.TRACEABILITY_MATRIX__DESIGN:
			return design != null && !design.isEmpty();
		case TmatPackage.TRACEABILITY_MATRIX__IMPLEMENTATION:
			return implementation != null && !implementation.isEmpty();
		case TmatPackage.TRACEABILITY_MATRIX__TESTING:
			return testing != null && !testing.isEmpty();
		case TmatPackage.TRACEABILITY_MATRIX__REVIEW:
			return review != null && !review.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Traceability_MatrixImpl
