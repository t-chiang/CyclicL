/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getRmdl_project <em>Rmdl project</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getProduct_variant <em>Product variant</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeature_model_root <em>Feature model root</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeature_model_element <em>Feature model element</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Model()
 * @model
 * @generated
 */
public interface Feature_Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Model_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rmdl project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Project#getFeature_model <em>Feature model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rmdl project</em>' container reference.
	 * @see #setRmdl_project(RMDL_Project)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Model_Rmdl_project()
	 * @see org.mcmaster.requirements_modelling.rmdl.RMDL_Project#getFeature_model
	 * @model opposite="feature_model" transient="false"
	 * @generated
	 */
	RMDL_Project getRmdl_project();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getRmdl_project <em>Rmdl project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rmdl project</em>' container reference.
	 * @see #getRmdl_project()
	 * @generated
	 */
	void setRmdl_project(RMDL_Project value);

	/**
	 * Returns the value of the '<em><b>Product variant</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Product_Variant}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Product_Variant#getFeature_model <em>Feature model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product variant</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Model_Product_variant()
	 * @see org.mcmaster.requirements_modelling.rmdl.Product_Variant#getFeature_model
	 * @model opposite="feature_model" containment="true"
	 * @generated
	 */
	EList<Product_Variant> getProduct_variant();

	/**
	 * Returns the value of the '<em><b>Feature model root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature model root</em>' containment reference.
	 * @see #setFeature_model_root(Feature_Model_Root)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Model_Feature_model_root()
	 * @model containment="true"
	 * @generated
	 */
	Feature_Model_Root getFeature_model_root();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeature_model_root <em>Feature model root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature model root</em>' containment reference.
	 * @see #getFeature_model_root()
	 * @generated
	 */
	void setFeature_model_root(Feature_Model_Root value);

	/**
	 * Returns the value of the '<em><b>Feature model element</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Feature_Model_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature model element</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Model_Feature_model_element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature_Model_Element> getFeature_model_element();

} // Feature_Model
