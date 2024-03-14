/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getReview <em>Review</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getDesignelement <em>Designelement</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Diagram()
 * @model
 * @generated
 */
public interface Requirement_Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Testcase</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.TestCase}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testcase</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Diagram_Testcase()
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_root
	 * @model opposite="requirement_root" containment="true"
	 * @generated
	 */
	EList<TestCase> getTestcase();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Requirements}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Diagram_Requirements()
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
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Diagram_Review()
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_root
	 * @model opposite="requirement_root" containment="true"
	 * @generated
	 */
	EList<Review> getReview();

	/**
	 * Returns the value of the '<em><b>Designelement</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.DesignElement}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designelement</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Diagram_Designelement()
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_root
	 * @model opposite="requirement_root" containment="true"
	 * @generated
	 */
	EList<DesignElement> getDesignelement();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Diagram_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Requirement_Diagram
