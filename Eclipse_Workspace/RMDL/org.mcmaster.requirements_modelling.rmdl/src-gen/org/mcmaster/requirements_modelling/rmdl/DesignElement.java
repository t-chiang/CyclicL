/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

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
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement()
 * @model
 * @generated
 */
public interface DesignElement extends Entity {
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

} // DesignElement
