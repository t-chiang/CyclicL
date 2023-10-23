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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Entity#getModelroot <em>Modelroot</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Satisfied By</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Trace}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Trace#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied By</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getEntity_SatisfiedBy()
	 * @see org.mcmaster.requirements_modelling.rmdl.Trace#getRequirement
	 * @model opposite="requirement"
	 * @generated
	 */
	EList<Trace> getSatisfiedBy();

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

	/**
	 * Returns the value of the '<em><b>Modelroot</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.ModelRoot#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelroot</em>' container reference.
	 * @see #setModelroot(ModelRoot)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getEntity_Modelroot()
	 * @see org.mcmaster.requirements_modelling.rmdl.ModelRoot#getEntity
	 * @model opposite="entity" required="true" transient="false"
	 * @generated
	 */
	ModelRoot getModelroot();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Entity#getModelroot <em>Modelroot</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelroot</em>' container reference.
	 * @see #getModelroot()
	 * @generated
	 */
	void setModelroot(ModelRoot value);

} // Entity
