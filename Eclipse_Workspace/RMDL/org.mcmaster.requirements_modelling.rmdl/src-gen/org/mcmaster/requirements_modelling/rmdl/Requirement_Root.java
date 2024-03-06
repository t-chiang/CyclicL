/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getPackage <em>Package</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getReview <em>Review</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getDesignelement <em>Designelement</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Root()
 * @model
 * @generated
 */
public interface Requirement_Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Testcase</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.TestCase}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testcase</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Root_Testcase()
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_root
	 * @model opposite="requirement_root" containment="true"
	 * @generated
	 */
	EList<TestCase> getTestcase();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Package}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Package#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Root_Package()
	 * @see org.mcmaster.requirements_modelling.rmdl.Package#getRequirement_root
	 * @model opposite="requirement_root" containment="true"
	 * @generated
	 */
	EList<org.mcmaster.requirements_modelling.rmdl.Package> getPackage();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Requirements}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Root_Requirements()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getRequirement_root
	 * @model opposite="requirement_root" containment="true"
	 * @generated
	 */
	EList<Requirements> getRequirements();

	/**
	 * Returns the value of the '<em><b>Review</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Review}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Root_Review()
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_root
	 * @model opposite="requirement_root" containment="true"
	 * @generated
	 */
	EList<Review> getReview();

	/**
	 * Returns the value of the '<em><b>Designelement</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.DesignElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designelement</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Root_Designelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<DesignElement> getDesignelement();

} // Requirement_Root
