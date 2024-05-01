/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getComposes <em>Composes</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptionof <em>Optionof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternativeof <em>Alternativeof</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity()
 * @model abstract="true"
 * @generated
 */
public interface FeatureEntity extends Requirement_Diagram {
	/**
	 * Returns the value of the '<em><b>Composes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composes</em>' reference.
	 * @see #setComposes(FeatureEntity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_Composes()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getMandatory
	 * @model opposite="mandatory"
	 * @generated
	 */
	FeatureEntity getComposes();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getComposes <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composes</em>' reference.
	 * @see #getComposes()
	 * @generated
	 */
	void setComposes(FeatureEntity value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getComposes <em>Composes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_Mandatory()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getComposes
	 * @model opposite="composes"
	 * @generated
	 */
	EList<FeatureEntity> getMandatory();

	/**
	 * Returns the value of the '<em><b>Optionof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optionof</em>' reference.
	 * @see #setOptionof(FeatureEntity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_Optionof()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptional
	 * @model opposite="optional"
	 * @generated
	 */
	FeatureEntity getOptionof();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptionof <em>Optionof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optionof</em>' reference.
	 * @see #getOptionof()
	 * @generated
	 */
	void setOptionof(FeatureEntity value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptionof <em>Optionof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_Optional()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptionof
	 * @model opposite="optionof"
	 * @generated
	 */
	EList<FeatureEntity> getOptional();

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternativeof <em>Alternativeof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_Alternative()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternativeof
	 * @model opposite="alternativeof"
	 * @generated
	 */
	EList<FeatureEntity> getAlternative();

	/**
	 * Returns the value of the '<em><b>Alternativeof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternativeof</em>' reference.
	 * @see #setAlternativeof(FeatureEntity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_Alternativeof()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternative
	 * @model opposite="alternative"
	 * @generated
	 */
	FeatureEntity getAlternativeof();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternativeof <em>Alternativeof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternativeof</em>' reference.
	 * @see #getAlternativeof()
	 * @generated
	 */
	void setAlternativeof(FeatureEntity value);

} // FeatureEntity
