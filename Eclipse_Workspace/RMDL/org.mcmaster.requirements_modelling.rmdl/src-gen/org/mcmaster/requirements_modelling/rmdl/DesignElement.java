/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getModelroot <em>Modelroot</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement()
 * @model
 * @generated
 */
public interface DesignElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Trace}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Trace#getDesignelement <em>Designelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfies</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_Satisfies()
	 * @see org.mcmaster.requirements_modelling.rmdl.Trace#getDesignelement
	 * @model opposite="designelement"
	 * @generated
	 */
	EList<Trace> getSatisfies();

	/**
	 * Returns the value of the '<em><b>Modelroot</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getDesignelement <em>Designelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelroot</em>' container reference.
	 * @see #setModelroot(Requirement_Root)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_Modelroot()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getDesignelement
	 * @model opposite="designelement" required="true" transient="false"
	 * @generated
	 */
	Requirement_Root getModelroot();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getModelroot <em>Modelroot</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelroot</em>' container reference.
	 * @see #getModelroot()
	 * @generated
	 */
	void setModelroot(Requirement_Root value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' attribute list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_Children()
	 * @model
	 * @generated
	 */
	EList<Class> getChildren();

} // DesignElement
