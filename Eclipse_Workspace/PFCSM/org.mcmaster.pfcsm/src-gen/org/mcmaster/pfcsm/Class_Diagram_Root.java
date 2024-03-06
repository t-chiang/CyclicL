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
 *   <li>{@link org.mcmaster.pfcsm.Class_Diagram_Root#getDesignentity <em>Designentity</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Class_Diagram_Root#getReference <em>Reference</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Class_Diagram_Root#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Class_Diagram_Root#getSoftware <em>Software</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_Diagram_Root()
 * @model
 * @generated
 */
public interface Class_Diagram_Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Designentity</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.DesignEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designentity</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_Diagram_Root_Designentity()
	 * @model containment="true"
	 * @generated
	 */
	EList<DesignEntity> getDesignentity();

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

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Hardware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_Diagram_Root_Hardware()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hardware> getHardware();

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Software}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_Diagram_Root_Software()
	 * @model containment="true"
	 * @generated
	 */
	EList<Software> getSoftware();

} // Class_Diagram_Root
