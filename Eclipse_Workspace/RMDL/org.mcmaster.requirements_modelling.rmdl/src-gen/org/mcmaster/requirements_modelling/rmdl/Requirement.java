/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getID <em>ID</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getVerifyMethod <em>Verify Method</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getChild <em>Child</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getVerificationTgt <em>Verification Tgt</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getRequirement_root <em>Requirement root</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_ID()
	 * @model required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Method</em>' attribute.
	 * @see #setVerifyMethod(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_VerifyMethod()
	 * @model required="true"
	 * @generated
	 */
	String getVerifyMethod();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getVerifyMethod <em>Verify Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Method</em>' attribute.
	 * @see #getVerifyMethod()
	 * @generated
	 */
	void setVerifyMethod(String value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Decomposition}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Decomposition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Child()
	 * @see org.mcmaster.requirements_modelling.rmdl.Decomposition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Decomposition> getChild();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Decomposition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Decomposition)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Parent()
	 * @see org.mcmaster.requirements_modelling.rmdl.Decomposition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Decomposition getParent();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Decomposition value);

	/**
	 * Returns the value of the '<em><b>Verification Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Verification#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Tgt</em>' reference.
	 * @see #setVerificationTgt(Verification)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_VerificationTgt()
	 * @see org.mcmaster.requirements_modelling.rmdl.Verification#getRequirement
	 * @model opposite="requirement"
	 * @generated
	 */
	Verification getVerificationTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getVerificationTgt <em>Verification Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Tgt</em>' reference.
	 * @see #getVerificationTgt()
	 * @generated
	 */
	void setVerificationTgt(Verification value);

	/**
	 * Returns the value of the '<em><b>Satisfied By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Trace#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied By</em>' reference.
	 * @see #setSatisfiedBy(Trace)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_SatisfiedBy()
	 * @see org.mcmaster.requirements_modelling.rmdl.Trace#getRequirement
	 * @model opposite="requirement"
	 * @generated
	 */
	Trace getSatisfiedBy();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getSatisfiedBy <em>Satisfied By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfied By</em>' reference.
	 * @see #getSatisfiedBy()
	 * @generated
	 */
	void setSatisfiedBy(Trace value);

	/**
	 * Returns the value of the '<em><b>Requirement root</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement root</em>' reference.
	 * @see #setRequirement_root(Requirement_Root)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirement_Requirement_root()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getRequirements
	 * @model opposite="requirements" required="true"
	 * @generated
	 */
	Requirement_Root getRequirement_root();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getRequirement_root <em>Requirement root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement root</em>' reference.
	 * @see #getRequirement_root()
	 * @generated
	 */
	void setRequirement_root(Requirement_Root value);

} // Requirement
