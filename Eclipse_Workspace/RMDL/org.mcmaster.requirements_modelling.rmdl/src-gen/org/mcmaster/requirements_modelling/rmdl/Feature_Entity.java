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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getComposes <em>Composes</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getOptionOf <em>Option Of</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getAlternativeOf <em>Alternative Of</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getProductOf <em>Product Of</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Entity()
 * @model abstract="true"
 * @generated
 */
public interface Feature_Entity extends Requirement_Canvas {
	/**
	 * Returns the value of the '<em><b>Composes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composes</em>' reference.
	 * @see #setComposes(Feature_Entity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Entity_Composes()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getMandatory
	 * @model opposite="mandatory"
	 * @generated
	 */
	Feature_Entity getComposes();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getComposes <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composes</em>' reference.
	 * @see #getComposes()
	 * @generated
	 */
	void setComposes(Feature_Entity value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getComposes <em>Composes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Entity_Mandatory()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getComposes
	 * @model opposite="composes"
	 * @generated
	 */
	EList<Feature_Entity> getMandatory();

	/**
	 * Returns the value of the '<em><b>Option Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Of</em>' reference.
	 * @see #setOptionOf(Feature_Entity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Entity_OptionOf()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getOptional
	 * @model opposite="optional"
	 * @generated
	 */
	Feature_Entity getOptionOf();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getOptionOf <em>Option Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Of</em>' reference.
	 * @see #getOptionOf()
	 * @generated
	 */
	void setOptionOf(Feature_Entity value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getOptionOf <em>Option Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Entity_Optional()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getOptionOf
	 * @model opposite="optionOf"
	 * @generated
	 */
	EList<Feature_Entity> getOptional();

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getAlternativeOf <em>Alternative Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Entity_Alternative()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getAlternativeOf
	 * @model opposite="alternativeOf"
	 * @generated
	 */
	EList<Feature_Entity> getAlternative();

	/**
	 * Returns the value of the '<em><b>Alternative Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Of</em>' reference.
	 * @see #setAlternativeOf(Feature_Entity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Entity_AlternativeOf()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getAlternative
	 * @model opposite="alternative"
	 * @generated
	 */
	Feature_Entity getAlternativeOf();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getAlternativeOf <em>Alternative Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Of</em>' reference.
	 * @see #getAlternativeOf()
	 * @generated
	 */
	void setAlternativeOf(Feature_Entity value);

	/**
	 * Returns the value of the '<em><b>Product Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Of</em>' reference.
	 * @see #setProductOf(Feature_Entity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Entity_ProductOf()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getVariants
	 * @model opposite="variants"
	 * @generated
	 */
	Feature_Entity getProductOf();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getProductOf <em>Product Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Of</em>' reference.
	 * @see #getProductOf()
	 * @generated
	 */
	void setProductOf(Feature_Entity value);

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getProductOf <em>Product Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Entity_Variants()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Entity#getProductOf
	 * @model opposite="productOf"
	 * @generated
	 */
	EList<Feature_Entity> getVariants();

} // Feature_Entity
