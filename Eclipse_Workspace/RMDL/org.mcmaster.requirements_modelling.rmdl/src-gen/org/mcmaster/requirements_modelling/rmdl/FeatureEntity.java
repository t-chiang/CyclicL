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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptionOf <em>Option Of</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternativeOf <em>Alternative Of</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getProductOf <em>Product Of</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity()
 * @model abstract="true"
 * @generated
 */
public interface FeatureEntity extends Requirement_Canvas {
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
	 * Returns the value of the '<em><b>Option Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Of</em>' reference.
	 * @see #setOptionOf(FeatureEntity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_OptionOf()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptional
	 * @model opposite="optional"
	 * @generated
	 */
	FeatureEntity getOptionOf();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptionOf <em>Option Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Of</em>' reference.
	 * @see #getOptionOf()
	 * @generated
	 */
	void setOptionOf(FeatureEntity value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptionOf <em>Option Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_Optional()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptionOf
	 * @model opposite="optionOf"
	 * @generated
	 */
	EList<FeatureEntity> getOptional();

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternativeOf <em>Alternative Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_Alternative()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternativeOf
	 * @model opposite="alternativeOf"
	 * @generated
	 */
	EList<FeatureEntity> getAlternative();

	/**
	 * Returns the value of the '<em><b>Alternative Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Of</em>' reference.
	 * @see #setAlternativeOf(FeatureEntity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_AlternativeOf()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternative
	 * @model opposite="alternative"
	 * @generated
	 */
	FeatureEntity getAlternativeOf();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternativeOf <em>Alternative Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Of</em>' reference.
	 * @see #getAlternativeOf()
	 * @generated
	 */
	void setAlternativeOf(FeatureEntity value);

	/**
	 * Returns the value of the '<em><b>Product Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Of</em>' reference.
	 * @see #setProductOf(FeatureEntity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_ProductOf()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getVariants
	 * @model opposite="variants"
	 * @generated
	 */
	FeatureEntity getProductOf();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getProductOf <em>Product Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Of</em>' reference.
	 * @see #getProductOf()
	 * @generated
	 */
	void setProductOf(FeatureEntity value);

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getProductOf <em>Product Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeatureEntity_Variants()
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getProductOf
	 * @model opposite="productOf"
	 * @generated
	 */
	EList<FeatureEntity> getVariants();

} // FeatureEntity
