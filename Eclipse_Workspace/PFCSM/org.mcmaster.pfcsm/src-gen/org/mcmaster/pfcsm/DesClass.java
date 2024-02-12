/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Des Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#getElement <em>Element</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#getChildren <em>Children</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#getOwnerof <em>Ownerof</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#getOwnedby <em>Ownedby</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#getUses <em>Uses</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#getUsedby <em>Usedby</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#getXorfrom <em>Xorfrom</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesClass#getXorto <em>Xorto</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass()
 * @model
 * @generated
 */
public interface DesClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.DesClass#getName <em>Name</em>}' attribute.
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
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_IsOptional()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.DesClass#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_IsAbstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.DesClass#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Inheritance}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Inheritance#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_Children()
	 * @see org.mcmaster.pfcsm.Inheritance#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Inheritance> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Inheritance#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Inheritance)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_Parent()
	 * @see org.mcmaster.pfcsm.Inheritance#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	Inheritance getParent();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.DesClass#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Inheritance value);

	/**
	 * Returns the value of the '<em><b>Ownerof</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Composition}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Composition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownerof</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_Ownerof()
	 * @see org.mcmaster.pfcsm.Composition#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Composition> getOwnerof();

	/**
	 * Returns the value of the '<em><b>Ownedby</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Composition#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedby</em>' reference.
	 * @see #setOwnedby(Composition)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_Ownedby()
	 * @see org.mcmaster.pfcsm.Composition#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	Composition getOwnedby();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.DesClass#getOwnedby <em>Ownedby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ownedby</em>' reference.
	 * @see #getOwnedby()
	 * @generated
	 */
	void setOwnedby(Composition value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Association}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Association#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_Uses()
	 * @see org.mcmaster.pfcsm.Association#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Association> getUses();

	/**
	 * Returns the value of the '<em><b>Usedby</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Association}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Association#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usedby</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_Usedby()
	 * @see org.mcmaster.pfcsm.Association#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Association> getUsedby();

	/**
	 * Returns the value of the '<em><b>Xorfrom</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.XOR}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.XOR#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xorfrom</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_Xorfrom()
	 * @see org.mcmaster.pfcsm.XOR#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<XOR> getXorfrom();

	/**
	 * Returns the value of the '<em><b>Xorto</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.XOR}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.XOR#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xorto</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesClass_Xorto()
	 * @see org.mcmaster.pfcsm.XOR#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<XOR> getXorto();

} // DesClass
