/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature#getRequirement_root <em>Requirement root</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature#getComposes <em>Composes</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature#getAlternativeto <em>Alternativeto</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Feature#getChoiceof <em>Choiceof</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirement root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement root</em>' container reference.
	 * @see #setRequirement_root(Requirement_Root)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Requirement_root()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getFeature
	 * @model opposite="feature" transient="false"
	 * @generated
	 */
	Requirement_Root getRequirement_root();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature#getRequirement_root <em>Requirement root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement root</em>' container reference.
	 * @see #getRequirement_root()
	 * @generated
	 */
	void setRequirement_root(Requirement_Root value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_IsOptional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Requirements}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Requirements()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getFeature
	 * @model opposite="feature"
	 * @generated
	 */
	EList<Requirements> getRequirements();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Feature}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature#getComposes <em>Composes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Mandatory()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature#getComposes
	 * @model opposite="composes"
	 * @generated
	 */
	EList<Feature> getMandatory();

	/**
	 * Returns the value of the '<em><b>Composes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composes</em>' reference.
	 * @see #setComposes(Feature)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Composes()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature#getMandatory
	 * @model opposite="mandatory"
	 * @generated
	 */
	Feature getComposes();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature#getComposes <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composes</em>' reference.
	 * @see #getComposes()
	 * @generated
	 */
	void setComposes(Feature value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Feature}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature#getAlternativeto <em>Alternativeto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Alternative()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature#getAlternativeto
	 * @model opposite="alternativeto"
	 * @generated
	 */
	EList<Feature> getAlternative();

	/**
	 * Returns the value of the '<em><b>Alternativeto</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternativeto</em>' reference.
	 * @see #setAlternativeto(Feature)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Alternativeto()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature#getAlternative
	 * @model opposite="alternative"
	 * @generated
	 */
	Feature getAlternativeto();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature#getAlternativeto <em>Alternativeto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternativeto</em>' reference.
	 * @see #getAlternativeto()
	 * @generated
	 */
	void setAlternativeto(Feature value);

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Feature}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature#getChoiceof <em>Choiceof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Choice()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature#getChoiceof
	 * @model opposite="choiceof"
	 * @generated
	 */
	EList<Feature> getChoice();

	/**
	 * Returns the value of the '<em><b>Choiceof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choiceof</em>' reference.
	 * @see #setChoiceof(Feature)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getFeature_Choiceof()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature#getChoice
	 * @model opposite="choice"
	 * @generated
	 */
	Feature getChoiceof();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Feature#getChoiceof <em>Choiceof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choiceof</em>' reference.
	 * @see #getChoiceof()
	 * @generated
	 */
	void setChoiceof(Feature value);

} // Feature
