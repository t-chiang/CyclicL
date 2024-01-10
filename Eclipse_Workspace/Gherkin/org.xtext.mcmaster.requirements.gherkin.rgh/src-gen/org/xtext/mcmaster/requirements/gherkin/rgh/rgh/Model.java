/**
 * generated by Xtext 2.30.0
 */
package org.xtext.mcmaster.requirements.gherkin.rgh.rgh;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Model#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Steps}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement</em>' containment reference list.
   * @see org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghPackage#getModel_Requirement()
   * @model containment="true"
   * @generated
   */
  EList<Steps> getRequirement();

} // Model
