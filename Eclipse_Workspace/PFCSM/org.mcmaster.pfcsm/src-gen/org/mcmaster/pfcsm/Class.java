/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Class#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Class#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Class#getReferenceTo <em>Reference To</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Class#getReferenceFrom <em>Reference From</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Class#getElement <em>Element</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Class#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_()
 * @model abstract="true"
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_IsOptional()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Class#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Reference To</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Reference}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Reference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference To</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_ReferenceTo()
	 * @see org.mcmaster.pfcsm.Reference#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Reference> getReferenceTo();

	/**
	 * Returns the value of the '<em><b>Reference From</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Reference}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Reference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference From</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_ReferenceFrom()
	 * @see org.mcmaster.pfcsm.Reference#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Reference> getReferenceFrom();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClass_Operation()
	 * @model
	 * @generated
	 */
	EList<String> getOperation();

} // Class
