/**
 */
package org.mcmaster.requirements_modelling.rmdl;

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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ModelRoot#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ModelRoot#getReference <em>Reference</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ModelRoot#getTestcase <em>Testcase</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getModelRoot()
 * @model
 * @generated
 */
public interface ModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getModelRoot_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getModelRoot_Reference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Testcase</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.TestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testcase</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getModelRoot_Testcase()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCase> getTestcase();

} // ModelRoot
