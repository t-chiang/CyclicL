/**
 */
package org.mcmaster.requirements_modelling.rmdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Product_Variant#getFeature_model <em>Feature model</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProduct_Variant()
 * @model
 * @generated
 */
public interface Product_Variant extends Feature_Model {
	/**
	 * Returns the value of the '<em><b>Feature model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getProduct_variant <em>Product variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature model</em>' container reference.
	 * @see #setFeature_model(Feature_Model)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProduct_Variant_Feature_model()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Model#getProduct_variant
	 * @model opposite="product_variant" required="true" transient="false"
	 * @generated
	 */
	Feature_Model getFeature_model();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Product_Variant#getFeature_model <em>Feature model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature model</em>' container reference.
	 * @see #getFeature_model()
	 * @generated
	 */
	void setFeature_model(Feature_Model value);

} // Product_Variant
