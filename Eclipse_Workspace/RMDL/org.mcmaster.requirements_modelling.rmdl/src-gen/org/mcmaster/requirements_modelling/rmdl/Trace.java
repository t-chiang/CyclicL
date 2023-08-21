/**
 */
package org.mcmaster.requirements_modelling.rmdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Trace#getDesignelement <em>Designelement</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Trace#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends Reference {
	/**
	 * Returns the value of the '<em><b>Designelement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designelement</em>' reference.
	 * @see #setDesignelement(DesignElement)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTrace_Designelement()
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getSatisfies
	 * @model opposite="satisfies" required="true"
	 * @generated
	 */
	DesignElement getDesignelement();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Trace#getDesignelement <em>Designelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designelement</em>' reference.
	 * @see #getDesignelement()
	 * @generated
	 */
	void setDesignelement(DesignElement value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Entity#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(Entity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTrace_Requirement()
	 * @see org.mcmaster.requirements_modelling.rmdl.Entity#getSatisfiedBy
	 * @model opposite="satisfiedBy" required="true"
	 * @generated
	 */
	Entity getRequirement();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Trace#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Entity value);

} // Trace
