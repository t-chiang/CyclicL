/**
 */
package org.mcmaster.requirements_modelling.rmdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Decomposition#getSource <em>Source</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Decomposition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDecomposition()
 * @model
 * @generated
 */
public interface Decomposition extends Reference {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Requirement)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDecomposition_Source()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement#getChild
	 * @model opposite="child" required="true"
	 * @generated
	 */
	Requirement getSource();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Decomposition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Requirement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Requirement)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDecomposition_Target()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement#getParent
	 * @model opposite="parent" required="true"
	 * @generated
	 */
	Requirement getTarget();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Decomposition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Requirement value);

} // Decomposition
