/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Software#getRunson <em>Runson</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getSoftware()
 * @model
 * @generated
 */
public interface Software extends DesignEntity {

	/**
	 * Returns the value of the '<em><b>Runson</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Aggregation}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Aggregation#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runson</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getSoftware_Runson()
	 * @see org.mcmaster.pfcsm.Aggregation#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Aggregation> getRunson();
} // Software
