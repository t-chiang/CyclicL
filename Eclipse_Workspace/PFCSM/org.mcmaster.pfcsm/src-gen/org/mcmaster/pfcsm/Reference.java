/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Reference#getClass_diagram_root <em>Class diagram root</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Class diagram root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Class_Diagram_Root#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class diagram root</em>' container reference.
	 * @see #setClass_diagram_root(Class_Diagram_Root)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getReference_Class_diagram_root()
	 * @see org.mcmaster.pfcsm.Class_Diagram_Root#getReference
	 * @model opposite="reference" required="true" transient="false"
	 * @generated
	 */
	Class_Diagram_Root getClass_diagram_root();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Reference#getClass_diagram_root <em>Class diagram root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class diagram root</em>' container reference.
	 * @see #getClass_diagram_root()
	 * @generated
	 */
	void setClass_diagram_root(Class_Diagram_Root value);

} // Reference
