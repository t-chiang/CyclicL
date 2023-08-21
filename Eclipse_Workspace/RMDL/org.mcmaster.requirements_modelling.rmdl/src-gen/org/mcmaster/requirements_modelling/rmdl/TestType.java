/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Test Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestType()
 * @model
 * @generated
 */
public enum TestType implements Enumerator {
	/**
	 * The '<em><b>Unit Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_TEST(0, "UnitTest", "UnitTest"),

	/**
	 * The '<em><b>Class Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_TEST(1, "ClassTest", "ClassTest"),

	/**
	 * The '<em><b>White Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE_BOX(2, "WhiteBox", "WhiteBox"),

	/**
	 * The '<em><b>Black Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK_BOX(3, "BlackBox", "BlackBox");

	/**
	 * The '<em><b>Unit Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_TEST
	 * @model name="UnitTest"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_TEST_VALUE = 0;

	/**
	 * The '<em><b>Class Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_TEST
	 * @model name="ClassTest"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_TEST_VALUE = 1;

	/**
	 * The '<em><b>White Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_BOX
	 * @model name="WhiteBox"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_BOX_VALUE = 2;

	/**
	 * The '<em><b>Black Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_BOX
	 * @model name="BlackBox"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_BOX_VALUE = 3;

	/**
	 * An array of all the '<em><b>Test Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TestType[] VALUES_ARRAY = new TestType[] { UNIT_TEST, CLASS_TEST, WHITE_BOX, BLACK_BOX, };

	/**
	 * A public read-only list of all the '<em><b>Test Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TestType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Test Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestType get(int value) {
		switch (value) {
		case UNIT_TEST_VALUE:
			return UNIT_TEST;
		case CLASS_TEST_VALUE:
			return CLASS_TEST;
		case WHITE_BOX_VALUE:
			return WHITE_BOX;
		case BLACK_BOX_VALUE:
			return BLACK_BOX;
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
	private TestType(int value, String name, String literal) {
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

} //TestType
