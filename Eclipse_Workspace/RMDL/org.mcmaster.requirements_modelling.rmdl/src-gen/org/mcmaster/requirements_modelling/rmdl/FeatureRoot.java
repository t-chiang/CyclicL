/**
 */
package org.mcmaster.requirements_modelling.rmdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getComposes <em>Composes</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getOptionof <em>Optionof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getAlternativeof <em>Alternativeof</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureRoot()
 * @model
 * @generated
 */
public interface FeatureRoot extends Requirement_Diagram {
	/**
	 * Returns the value of the '<em><b>Composes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composes</em>' reference.
	 * @see #setComposes(FeatureRoot)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureRoot_Composes()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getMandatory
	 * @model opposite="mandatory"
	 * @generated
	 */
	FeatureRoot getComposes();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getComposes <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composes</em>' reference.
	 * @see #getComposes()
	 * @generated
	 */
	void setComposes(FeatureRoot value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getComposes <em>Composes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' reference.
	 * @see #setMandatory(FeatureRoot)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureRoot_Mandatory()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getComposes
	 * @model opposite="composes"
	 * @generated
	 */
	FeatureRoot getMandatory();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getMandatory <em>Mandatory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' reference.
	 * @see #getMandatory()
	 * @generated
	 */
	void setMandatory(FeatureRoot value);

	/**
	 * Returns the value of the '<em><b>Optionof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optionof</em>' reference.
	 * @see #setOptionof(FeatureRoot)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureRoot_Optionof()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getOptional
	 * @model opposite="optional"
	 * @generated
	 */
	FeatureRoot getOptionof();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getOptionof <em>Optionof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optionof</em>' reference.
	 * @see #getOptionof()
	 * @generated
	 */
	void setOptionof(FeatureRoot value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getOptionof <em>Optionof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' reference.
	 * @see #setOptional(FeatureRoot)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureRoot_Optional()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getOptionof
	 * @model opposite="optionof"
	 * @generated
	 */
	FeatureRoot getOptional();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getOptional <em>Optional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' reference.
	 * @see #getOptional()
	 * @generated
	 */
	void setOptional(FeatureRoot value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getAlternativeof <em>Alternativeof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' reference.
	 * @see #setAlternative(FeatureRoot)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureRoot_Alternative()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getAlternativeof
	 * @model opposite="alternativeof"
	 * @generated
	 */
	FeatureRoot getAlternative();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getAlternative <em>Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' reference.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(FeatureRoot value);

	/**
	 * Returns the value of the '<em><b>Alternativeof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternativeof</em>' reference.
	 * @see #setAlternativeof(FeatureRoot)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureRoot_Alternativeof()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getAlternative
	 * @model opposite="alternative"
	 * @generated
	 */
	FeatureRoot getAlternativeof();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureRoot#getAlternativeof <em>Alternativeof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternativeof</em>' reference.
	 * @see #getAlternativeof()
	 * @generated
	 */
	void setAlternativeof(FeatureRoot value);

} // FeatureRoot
