/**
 */
package org.mcmaster.requirements_modelling.rmdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Package#getPackageID <em>Package ID</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Package#getRequirement_root <em>Requirement root</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Requirement_Root {
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

	/**
	 * Returns the value of the '<em><b>Requirement root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement root</em>' container reference.
	 * @see #setRequirement_root(Requirement_Root)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getPackage_Requirement_root()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getPackage
	 * @model opposite="package" required="true" transient="false"
	 * @generated
	 */
	Requirement_Root getRequirement_root();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Package#getRequirement_root <em>Requirement root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement root</em>' container reference.
	 * @see #getRequirement_root()
	 * @generated
	 */
	void setRequirement_root(Requirement_Root value);

} // Package
