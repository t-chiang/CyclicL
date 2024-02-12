/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Class_Diagram_Root#getDesclass <em>Desclass</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Class_Diagram_Root#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_Diagram_Root()
 * @model
 * @generated
 */
public interface Class_Diagram_Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Desclass</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.DesClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desclass</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_Diagram_Root_Desclass()
	 * @model containment="true"
	 * @generated
	 */
	EList<DesClass> getDesclass();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Reference}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Reference#getClass_diagram_root <em>Class diagram root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_Diagram_Root_Reference()
	 * @see org.mcmaster.pfcsm.Reference#getClass_diagram_root
	 * @model opposite="class_diagram_root" containment="true"
	 * @generated
	 */
	EList<Reference> getReference();

} // Class_Diagram_Root
