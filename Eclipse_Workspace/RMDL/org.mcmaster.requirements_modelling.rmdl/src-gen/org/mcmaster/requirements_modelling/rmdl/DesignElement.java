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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#isIsHardware <em>Is Hardware</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#isIsSoftware <em>Is Software</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getTracefrom <em>Tracefrom</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_root <em>Requirement root</em>}</li>
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
	 * Returns the value of the '<em><b>Is Hardware</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Hardware</em>' attribute.
	 * @see #setIsHardware(boolean)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_IsHardware()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsHardware();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#isIsHardware <em>Is Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Hardware</em>' attribute.
	 * @see #isIsHardware()
	 * @generated
	 */
	void setIsHardware(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Software</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Software</em>' attribute.
	 * @see #setIsSoftware(boolean)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_IsSoftware()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsSoftware();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#isIsSoftware <em>Is Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Software</em>' attribute.
	 * @see #isIsSoftware()
	 * @generated
	 */
	void setIsSoftware(boolean value);

	/**
	 * Returns the value of the '<em><b>Tracefrom</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Requirements}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getTraceto <em>Traceto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracefrom</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_Tracefrom()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getTraceto
	 * @model opposite="traceto" required="true"
	 * @generated
	 */
	EList<Requirements> getTracefrom();

	/**
	 * Returns the value of the '<em><b>Requirement root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getDesignelement <em>Designelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement root</em>' container reference.
	 * @see #setRequirement_root(Requirement_Root)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_Requirement_root()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getDesignelement
	 * @model opposite="designelement" transient="false"
	 * @generated
	 */
	Requirement_Root getRequirement_root();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_root <em>Requirement root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement root</em>' container reference.
	 * @see #getRequirement_root()
	 * @generated
	 */
	void setRequirement_root(Requirement_Root value);

} // DesignElement
