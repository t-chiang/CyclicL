/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Element#getAssociationTo <em>Association To</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Element#getAssociationFrom <em>Association From</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Element#isIsPublic <em>Is Public</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Association To</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Association}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Association#getAscSrc <em>Asc Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association To</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getElement_AssociationTo()
	 * @see org.mcmaster.pfcsm.Association#getAscSrc
	 * @model opposite="ascSrc"
	 * @generated
	 */
	EList<Association> getAssociationTo();

	/**
	 * Returns the value of the '<em><b>Association From</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Association}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Association#getAscTgt <em>Asc Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association From</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getElement_AssociationFrom()
	 * @see org.mcmaster.pfcsm.Association#getAscTgt
	 * @model opposite="ascTgt"
	 * @generated
	 */
	EList<Association> getAssociationFrom();

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getElement_IsPublic()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Element#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

} // Element
