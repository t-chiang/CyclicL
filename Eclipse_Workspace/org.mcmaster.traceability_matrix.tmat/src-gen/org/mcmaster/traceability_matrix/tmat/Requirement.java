/**
 */
package org.mcmaster.traceability_matrix.tmat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.traceability_matrix.tmat.Requirement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends ProjectRequirements {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage#getRequirement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.traceability_matrix.tmat.Requirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // Requirement
