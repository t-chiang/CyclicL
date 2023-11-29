/**
 */
package org.mcmaster.traceability_matrix.tmat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceability Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getProjectrequirements <em>Projectrequirements</em>}</li>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getDesign <em>Design</em>}</li>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getTesting <em>Testing</em>}</li>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getReview <em>Review</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage#getTraceability_Matrix()
 * @model
 * @generated
 */
public interface Traceability_Matrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Projectrequirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.traceability_matrix.tmat.ProjectRequirements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projectrequirements</em>' containment reference list.
	 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage#getTraceability_Matrix_Projectrequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectRequirements> getProjectrequirements();

	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.traceability_matrix.tmat.Design}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference list.
	 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage#getTraceability_Matrix_Design()
	 * @model containment="true"
	 * @generated
	 */
	EList<Design> getDesign();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.traceability_matrix.tmat.Implementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference list.
	 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage#getTraceability_Matrix_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Implementation> getImplementation();

	/**
	 * Returns the value of the '<em><b>Testing</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.traceability_matrix.tmat.Testing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing</em>' containment reference list.
	 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage#getTraceability_Matrix_Testing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Testing> getTesting();

	/**
	 * Returns the value of the '<em><b>Review</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.traceability_matrix.tmat.Review}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review</em>' containment reference list.
	 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage#getTraceability_Matrix_Review()
	 * @model containment="true"
	 * @generated
	 */
	EList<Review> getReview();

} // Traceability_Matrix
