/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getTestCase <em>Test Case</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getReview <em>Review</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getDesignElement <em>Design Element</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRequirementcontainer <em>Requirementcontainer</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRmdl_project <em>Rmdl project</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Canvas()
 * @model
 * @generated
 */
public interface Requirement_Canvas extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Case</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.TestCase}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Case</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Canvas_TestCase()
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_canvas
	 * @model opposite="requirement_canvas" containment="true"
	 * @generated
	 */
	EList<TestCase> getTestCase();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.RequirementType}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Canvas_Requirements()
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirement_canvas
	 * @model opposite="requirement_canvas" containment="true"
	 * @generated
	 */
	EList<RequirementType> getRequirements();

	/**
	 * Returns the value of the '<em><b>Review</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Review}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Canvas_Review()
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_canvas
	 * @model opposite="requirement_canvas" containment="true"
	 * @generated
	 */
	EList<Review> getReview();

	/**
	 * Returns the value of the '<em><b>Design Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.DesignElement}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Element</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Canvas_DesignElement()
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_canvas
	 * @model opposite="requirement_canvas" containment="true"
	 * @generated
	 */
	EList<DesignElement> getDesignElement();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Canvas_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Requirementcontainer</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirementcontainer</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Canvas_Requirementcontainer()
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getRequirement_canvas
	 * @model opposite="requirement_canvas" containment="true"
	 * @generated
	 */
	EList<RequirementContainer> getRequirementcontainer();

	/**
	 * Returns the value of the '<em><b>Rmdl project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Project#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rmdl project</em>' container reference.
	 * @see #setRmdl_project(RMDL_Project)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Canvas_Rmdl_project()
	 * @see org.mcmaster.requirements_modelling.rmdl.RMDL_Project#getRequirement_canvas
	 * @model opposite="requirement_canvas" transient="false"
	 * @generated
	 */
	RMDL_Project getRmdl_project();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRmdl_project <em>Rmdl project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rmdl project</em>' container reference.
	 * @see #getRmdl_project()
	 * @generated
	 */
	void setRmdl_project(RMDL_Project value);

} // Requirement_Canvas
