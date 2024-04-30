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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeatureelement <em>Featureelement</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Model()
 * @model
 * @generated
 */
public interface Feature_Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Featureelement</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureElement}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featureelement</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Model_Featureelement()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getProduct
	 * @model opposite="product" containment="true"
	 * @generated
	 */
	EList<FeatureElement> getFeatureelement();

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

} // Feature_Model
