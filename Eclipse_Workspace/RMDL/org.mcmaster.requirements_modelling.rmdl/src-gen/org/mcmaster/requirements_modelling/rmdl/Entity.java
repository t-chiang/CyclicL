/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Entity#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Entity#getVerificationTgt <em>Verification Tgt</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Satisfied By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Trace#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied By</em>' reference.
	 * @see #setSatisfiedBy(Trace)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getEntity_SatisfiedBy()
	 * @see org.mcmaster.requirements_modelling.rmdl.Trace#getRequirement
	 * @model opposite="requirement"
	 * @generated
	 */
	Trace getSatisfiedBy();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Entity#getSatisfiedBy <em>Satisfied By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfied By</em>' reference.
	 * @see #getSatisfiedBy()
	 * @generated
	 */
	void setSatisfiedBy(Trace value);

	/**
	 * Returns the value of the '<em><b>Verification Tgt</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Verification}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Verification#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Tgt</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getEntity_VerificationTgt()
	 * @see org.mcmaster.requirements_modelling.rmdl.Verification#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	EList<Verification> getVerificationTgt();

} // Entity
