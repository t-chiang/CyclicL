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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getTraceFrom <em>Trace From</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_canvas <em>Requirement canvas</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getImplementationOf <em>Implementation Of</em>}</li>
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
	 * Returns the value of the '<em><b>Trace From</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Requirements}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getTraceTo <em>Trace To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace From</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_TraceFrom()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getTraceTo
	 * @model opposite="traceTo" required="true"
	 * @generated
	 */
	EList<Requirements> getTraceFrom();

	/**
	 * Returns the value of the '<em><b>Requirement canvas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getDesignElement <em>Design Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement canvas</em>' container reference.
	 * @see #setRequirement_canvas(Requirement_Canvas)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_Requirement_canvas()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getDesignElement
	 * @model opposite="designElement" transient="false"
	 * @generated
	 */
	Requirement_Canvas getRequirement_canvas();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_canvas <em>Requirement canvas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement canvas</em>' container reference.
	 * @see #getRequirement_canvas()
	 * @generated
	 */
	void setRequirement_canvas(Requirement_Canvas value);

	/**
	 * Returns the value of the '<em><b>Implementation Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Of</em>' reference.
	 * @see #setImplementationOf(Element)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getDesignElement_ImplementationOf()
	 * @model
	 * @generated
	 */
	Element getImplementationOf();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getImplementationOf <em>Implementation Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Of</em>' reference.
	 * @see #getImplementationOf()
	 * @generated
	 */
	void setImplementationOf(Element value);

} // DesignElement
