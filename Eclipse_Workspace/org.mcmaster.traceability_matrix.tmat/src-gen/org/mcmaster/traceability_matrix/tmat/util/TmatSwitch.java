/**
 */
package org.mcmaster.traceability_matrix.tmat.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.mcmaster.traceability_matrix.tmat.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage
 * @generated
 */
public class TmatSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TmatPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmatSwitch() {
		if (modelPackage == null) {
			modelPackage = TmatPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TmatPackage.TRACEABILITY_MATRIX: {
			Traceability_Matrix traceability_Matrix = (Traceability_Matrix) theEObject;
			T result = caseTraceability_Matrix(traceability_Matrix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.DESIGN: {
			Design design = (Design) theEObject;
			T result = caseDesign(design);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.IMPLEMENTATION: {
			Implementation implementation = (Implementation) theEObject;
			T result = caseImplementation(implementation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.TESTING: {
			Testing testing = (Testing) theEObject;
			T result = caseTesting(testing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.REVIEW: {
			Review review = (Review) theEObject;
			T result = caseReview(review);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.ID: {
			ID id = (ID) theEObject;
			T result = caseID(id);
			if (result == null)
				result = caseProjectRequirements(id);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.PROJECT_REQUIREMENTS: {
			ProjectRequirements projectRequirements = (ProjectRequirements) theEObject;
			T result = caseProjectRequirements(projectRequirements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.REQUIREMENT: {
			Requirement requirement = (Requirement) theEObject;
			T result = caseRequirement(requirement);
			if (result == null)
				result = caseProjectRequirements(requirement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.APPROVAL: {
			Approval approval = (Approval) theEObject;
			T result = caseApproval(approval);
			if (result == null)
				result = caseReview(approval);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.COMMENTS: {
			Comments comments = (Comments) theEObject;
			T result = caseComments(comments);
			if (result == null)
				result = caseReview(comments);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.SCOPE: {
			Scope scope = (Scope) theEObject;
			T result = caseScope(scope);
			if (result == null)
				result = caseProjectRequirements(scope);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseDesign(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.SATISFIABILITY_CHECK: {
			SatisfiabilityCheck satisfiabilityCheck = (SatisfiabilityCheck) theEObject;
			T result = caseSatisfiabilityCheck(satisfiabilityCheck);
			if (result == null)
				result = caseDesign(satisfiabilityCheck);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.SOURCE: {
			Source source = (Source) theEObject;
			T result = caseSource(source);
			if (result == null)
				result = caseReview(source);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.STATUS: {
			Status status = (Status) theEObject;
			T result = caseStatus(status);
			if (result == null)
				result = caseImplementation(status);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.UNIT_TEST: {
			UnitTest unitTest = (UnitTest) theEObject;
			T result = caseUnitTest(unitTest);
			if (result == null)
				result = caseTesting(unitTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.SYSTEM_TEST: {
			SystemTest systemTest = (SystemTest) theEObject;
			T result = caseSystemTest(systemTest);
			if (result == null)
				result = caseTesting(systemTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.PERFORMANCE_TEST: {
			PerformanceTest performanceTest = (PerformanceTest) theEObject;
			T result = casePerformanceTest(performanceTest);
			if (result == null)
				result = caseTesting(performanceTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TmatPackage.USER_ACCEPTANCE_TEST: {
			UserAcceptanceTest userAcceptanceTest = (UserAcceptanceTest) theEObject;
			T result = caseUserAcceptanceTest(userAcceptanceTest);
			if (result == null)
				result = caseTesting(userAcceptanceTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceability Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceability Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceability_Matrix(Traceability_Matrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesign(Design object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementation(Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTesting(Testing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReview(Review object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID(ID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectRequirements(ProjectRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApproval(Approval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComments(Comments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfiability Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfiability Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfiabilityCheck(SatisfiabilityCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatus(Status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitTest(UnitTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemTest(SystemTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceTest(PerformanceTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Acceptance Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Acceptance Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserAcceptanceTest(UserAcceptanceTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TmatSwitch
