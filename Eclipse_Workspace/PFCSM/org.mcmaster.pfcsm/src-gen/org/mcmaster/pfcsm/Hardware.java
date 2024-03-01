/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Hardware#getRuns <em>Runs</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getHardware()
 * @model
 * @generated
 */
public interface Hardware extends DesignEntity {

	/**
	 * Returns the value of the '<em><b>Runs</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Aggregation}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Aggregation#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getHardware_Runs()
	 * @see org.mcmaster.pfcsm.Aggregation#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Aggregation> getRuns();
} // Hardware
