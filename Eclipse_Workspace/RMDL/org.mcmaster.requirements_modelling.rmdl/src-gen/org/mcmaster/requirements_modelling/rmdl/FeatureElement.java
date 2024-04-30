/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getComposes <em>Composes</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternativeof <em>Alternativeof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptionof <em>Optionof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement()
 * @model
 * @generated
 */
public interface FeatureElement extends Requirement_Diagram {
	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement_IsOptional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureElement}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getComposes <em>Composes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement_Mandatory()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getComposes
	 * @model opposite="composes"
	 * @generated
	 */
	EList<FeatureElement> getMandatory();

	/**
	 * Returns the value of the '<em><b>Composes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composes</em>' reference.
	 * @see #setComposes(FeatureElement)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement_Composes()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getMandatory
	 * @model opposite="mandatory"
	 * @generated
	 */
	FeatureElement getComposes();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getComposes <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composes</em>' reference.
	 * @see #getComposes()
	 * @generated
	 */
	void setComposes(FeatureElement value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureElement}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternativeof <em>Alternativeof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement_Alternative()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternativeof
	 * @model opposite="alternativeof"
	 * @generated
	 */
	EList<FeatureElement> getAlternative();

	/**
	 * Returns the value of the '<em><b>Alternativeof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternativeof</em>' reference.
	 * @see #setAlternativeof(FeatureElement)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement_Alternativeof()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternative
	 * @model opposite="alternative"
	 * @generated
	 */
	FeatureElement getAlternativeof();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternativeof <em>Alternativeof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternativeof</em>' reference.
	 * @see #getAlternativeof()
	 * @generated
	 */
	void setAlternativeof(FeatureElement value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureElement}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptionof <em>Optionof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement_Optional()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptionof
	 * @model opposite="optionof"
	 * @generated
	 */
	EList<FeatureElement> getOptional();

	/**
	 * Returns the value of the '<em><b>Optionof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optionof</em>' reference.
	 * @see #setOptionof(FeatureElement)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement_Optionof()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptional
	 * @model opposite="optional"
	 * @generated
	 */
	FeatureElement getOptionof();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptionof <em>Optionof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optionof</em>' reference.
	 * @see #getOptionof()
	 * @generated
	 */
	void setOptionof(FeatureElement value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeatureelement <em>Featureelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' container reference.
	 * @see #setProduct(Feature_Model)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement_Product()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeatureelement
	 * @model opposite="featureelement" transient="false"
	 * @generated
	 */
	Feature_Model getProduct();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getProduct <em>Product</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' container reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Feature_Model value);

} // FeatureElement
