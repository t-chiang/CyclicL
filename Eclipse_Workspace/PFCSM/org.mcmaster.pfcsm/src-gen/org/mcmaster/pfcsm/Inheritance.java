/**
 */
package org.mcmaster.pfcsm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Inheritance#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Inheritance#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends Reference {

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(DesClass)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getInheritance_Tgt()
	 * @see org.mcmaster.pfcsm.DesClass#getChildren
	 * @model opposite="children" required="true"
	 * @generated
	 */
	DesClass getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Inheritance#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(DesClass value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesClass#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(DesClass)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getInheritance_Src()
	 * @see org.mcmaster.pfcsm.DesClass#getParent
	 * @model opposite="parent" required="true"
	 * @generated
	 */
	DesClass getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Inheritance#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(DesClass value);
} // Inheritance
