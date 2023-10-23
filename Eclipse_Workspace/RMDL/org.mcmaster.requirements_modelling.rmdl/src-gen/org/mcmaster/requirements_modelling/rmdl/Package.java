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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Package#getModelroot <em>Modelroot</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ModelRoot {
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
	 * Returns the value of the '<em><b>Modelroot</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.ModelRoot#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelroot</em>' container reference.
	 * @see #setModelroot(ModelRoot)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getPackage_Modelroot()
	 * @see org.mcmaster.requirements_modelling.rmdl.ModelRoot#getPackage
	 * @model opposite="package" required="true" transient="false"
	 * @generated
	 */
	ModelRoot getModelroot();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Package#getModelroot <em>Modelroot</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelroot</em>' container reference.
	 * @see #getModelroot()
	 * @generated
	 */
	void setModelroot(ModelRoot value);

} // Package
