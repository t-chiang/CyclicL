/**
 */
package org.mcmaster.pfcsm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Structure</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mcmaster.pfcsm.PfcsmPackage#getDataStructure()
 * @model
 * @generated
 */
public enum DataStructure implements Enumerator {
	/**
	 * The '<em><b>Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE(0, "Value", "Value"),

	/**
	 * The '<em><b>Array</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY(1, "Array", "Array");

	/**
	 * The '<em><b>Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE
	 * @model name="Value"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_VALUE = 0;

	/**
	 * The '<em><b>Array</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY
	 * @model name="Array"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Data Structure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataStructure[] VALUES_ARRAY = new DataStructure[] { VALUE, ARRAY, };

	/**
	 * A public read-only list of all the '<em><b>Data Structure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataStructure> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Structure</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataStructure get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataStructure result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Structure</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataStructure getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataStructure result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Structure</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataStructure get(int value) {
		switch (value) {
		case VALUE_VALUE:
			return VALUE;
		case ARRAY_VALUE:
			return ARRAY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataStructure(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //DataStructure
