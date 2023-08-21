/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.ModelRoot#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.ModelRoot#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getModelRoot()
 * @model
 * @generated
 */
public interface ModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getModelRoot_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.mcmaster.pfcsm.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getModelRoot_Reference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReference();

} // ModelRoot
