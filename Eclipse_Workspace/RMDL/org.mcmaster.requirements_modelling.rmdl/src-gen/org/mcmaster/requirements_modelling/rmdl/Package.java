/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Package#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Package#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Package#getPackageID <em>Package ID</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Entity {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getPackage_Requirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirement();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getPackage_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Package ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package ID</em>' attribute.
	 * @see #setPackageID(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getPackage_PackageID()
	 * @model required="true"
	 * @generated
	 */
	String getPackageID();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Package#getPackageID <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package ID</em>' attribute.
	 * @see #getPackageID()
	 * @generated
	 */
	void setPackageID(String value);

} // Package
