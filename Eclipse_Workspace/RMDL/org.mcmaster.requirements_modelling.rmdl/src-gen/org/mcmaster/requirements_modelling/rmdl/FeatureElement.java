/**
 */
package org.mcmaster.requirements_modelling.rmdl;

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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getFeature_model <em>Feature model</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement()
 * @model
 * @generated
 */
public interface FeatureElement extends FeatureRoot {
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
	 * Returns the value of the '<em><b>Feature model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeatureelement <em>Featureelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature model</em>' container reference.
	 * @see #setFeature_model(Feature_Model)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureElement_Feature_model()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeatureelement
	 * @model opposite="featureelement" transient="false"
	 * @generated
	 */
	Feature_Model getFeature_model();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getFeature_model <em>Feature model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature model</em>' container reference.
	 * @see #getFeature_model()
	 * @generated
	 */
	void setFeature_model(Feature_Model value);

} // FeatureElement
