/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Attribute#getUses <em>Uses</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Attribute#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Element {

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Uses}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Uses#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAttribute_Uses()
	 * @see org.mcmaster.pfcsm.Uses#getAttribute
	 * @model opposite="attribute"
	 * @generated
	 */
	EList<Uses> getUses();

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Produces}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Produces#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAttribute_Produces()
	 * @see org.mcmaster.pfcsm.Produces#getAttribute
	 * @model opposite="attribute"
	 * @generated
	 */
	EList<Produces> getProduces();

} // Attribute
