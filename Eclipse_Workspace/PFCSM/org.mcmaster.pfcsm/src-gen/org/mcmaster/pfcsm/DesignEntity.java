/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#getElement <em>Element</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#getUsedby <em>Usedby</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#getUses <em>Uses</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#getOwnerof <em>Ownerof</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#getOwnedby <em>Ownedby</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#getChildren <em>Children</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.DesignEntity#getAlternativeto <em>Alternativeto</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity()
 * @model
 * @generated
 */
public interface DesignEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.DesignEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_Element()
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
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_IsAbstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.DesignEntity#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Usedby</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Uses}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Uses#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usedby</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_Usedby()
	 * @see org.mcmaster.pfcsm.Uses#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Uses> getUsedby();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Uses}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Uses#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_Uses()
	 * @see org.mcmaster.pfcsm.Uses#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Uses> getUses();

	/**
	 * Returns the value of the '<em><b>Ownerof</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Composition}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Composition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownerof</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_Ownerof()
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
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_Ownedby()
	 * @see org.mcmaster.pfcsm.Composition#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	Composition getOwnedby();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.DesignEntity#getOwnedby <em>Ownedby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ownedby</em>' reference.
	 * @see #getOwnedby()
	 * @generated
	 */
	void setOwnedby(Composition value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesignEntity#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(DesignEntity)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_Parent()
	 * @see org.mcmaster.pfcsm.DesignEntity#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	DesignEntity getParent();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.DesignEntity#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DesignEntity value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.DesignEntity}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesignEntity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_Children()
	 * @see org.mcmaster.pfcsm.DesignEntity#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<DesignEntity> getChildren();

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Alternative}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Alternative#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_Alternative()
	 * @see org.mcmaster.pfcsm.Alternative#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Alternative> getAlternative();

	/**
	 * Returns the value of the '<em><b>Alternativeto</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Alternative}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Alternative#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternativeto</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getDesignEntity_Alternativeto()
	 * @see org.mcmaster.pfcsm.Alternative#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Alternative> getAlternativeto();

} // DesignEntity
