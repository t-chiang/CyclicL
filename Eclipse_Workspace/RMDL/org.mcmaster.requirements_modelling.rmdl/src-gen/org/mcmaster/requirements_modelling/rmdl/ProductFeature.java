/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getComposes <em>Composes</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getAlternativeof <em>Alternativeof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getOptionof <em>Optionof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProductFeature()
 * @model
 * @generated
 */
public interface ProductFeature extends Requirement_Diagram {
	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProductFeature_IsOptional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.ProductFeature}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getComposes <em>Composes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProductFeature_Mandatory()
	 * @see org.mcmaster.requirements_modelling.rmdl.ProductFeature#getComposes
	 * @model opposite="composes"
	 * @generated
	 */
	EList<ProductFeature> getMandatory();

	/**
	 * Returns the value of the '<em><b>Composes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composes</em>' reference.
	 * @see #setComposes(ProductFeature)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProductFeature_Composes()
	 * @see org.mcmaster.requirements_modelling.rmdl.ProductFeature#getMandatory
	 * @model opposite="mandatory"
	 * @generated
	 */
	ProductFeature getComposes();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getComposes <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composes</em>' reference.
	 * @see #getComposes()
	 * @generated
	 */
	void setComposes(ProductFeature value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.ProductFeature}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getAlternativeof <em>Alternativeof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProductFeature_Alternative()
	 * @see org.mcmaster.requirements_modelling.rmdl.ProductFeature#getAlternativeof
	 * @model opposite="alternativeof"
	 * @generated
	 */
	EList<ProductFeature> getAlternative();

	/**
	 * Returns the value of the '<em><b>Alternativeof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternativeof</em>' reference.
	 * @see #setAlternativeof(ProductFeature)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProductFeature_Alternativeof()
	 * @see org.mcmaster.requirements_modelling.rmdl.ProductFeature#getAlternative
	 * @model opposite="alternative"
	 * @generated
	 */
	ProductFeature getAlternativeof();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getAlternativeof <em>Alternativeof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternativeof</em>' reference.
	 * @see #getAlternativeof()
	 * @generated
	 */
	void setAlternativeof(ProductFeature value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.ProductFeature}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getOptionof <em>Optionof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProductFeature_Optional()
	 * @see org.mcmaster.requirements_modelling.rmdl.ProductFeature#getOptionof
	 * @model opposite="optionof"
	 * @generated
	 */
	EList<ProductFeature> getOptional();

	/**
	 * Returns the value of the '<em><b>Optionof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optionof</em>' reference.
	 * @see #setOptionof(ProductFeature)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProductFeature_Optionof()
	 * @see org.mcmaster.requirements_modelling.rmdl.ProductFeature#getOptional
	 * @model opposite="optional"
	 * @generated
	 */
	ProductFeature getOptionof();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getOptionof <em>Optionof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optionof</em>' reference.
	 * @see #getOptionof()
	 * @generated
	 */
	void setOptionof(ProductFeature value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getProductfeature <em>Productfeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' container reference.
	 * @see #setProduct(Feature_Model)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProductFeature_Product()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Model#getProductfeature
	 * @model opposite="productfeature" transient="false"
	 * @generated
	 */
	Feature_Model getProduct();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getProduct <em>Product</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' container reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Feature_Model value);

} // ProductFeature
