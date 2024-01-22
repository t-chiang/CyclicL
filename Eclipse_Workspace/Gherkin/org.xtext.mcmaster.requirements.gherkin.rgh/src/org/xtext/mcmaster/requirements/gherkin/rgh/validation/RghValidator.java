/*
 * generated by Xtext 2.30.0
 */
package org.xtext.mcmaster.requirements.gherkin.rgh.validation;

import java.util.Objects;

import org.eclipse.xtext.validation.Check;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Context;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Event;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Postcondition;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Precondition;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghPackage;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.When;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Given;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Then;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class RghValidator extends AbstractRghValidator {
	
	public static final String INVALID_NAME = "invalidName";

	@Check
	public void checkContextNameStartsWithCapital(Context context) {
		if (!Character.isUpperCase(context.getName().charAt(0))) {
			warning("Name should start with a capital",
					RghPackage.Literals.CONTEXT__NAME,
					INVALID_NAME);
		}
	}
	@Check
	public void checkEventNameStartsWithCapital(Event event) {
		if (!Character.isUpperCase(event.getName().charAt(0))) {
			warning("Name should start with a capital",
					RghPackage.Literals.EVENT__NAME,
					INVALID_NAME);
		}
	}
	@Check
	public void checkPreconditionNameStartsWithCapital(Precondition precond) {
		if (!Character.isUpperCase(precond.getName().charAt(0))) {
			warning("Name should start with a capital",
					RghPackage.Literals.PRECONDITION__NAME,
					INVALID_NAME);
		}
	}
	@Check
	public void checkPostconditionNameStartsWithCapital(Postcondition postcond) {
		if (!Character.isUpperCase(postcond.getName().charAt(0))) {
			warning("Name should start with a capital",
					RghPackage.Literals.POSTCONDITION__NAME,
					INVALID_NAME);
		}
	}
	@Check
	public void checkEventNameIsUnique(Event event) {
	    When parent = (When) event.eContainer();
        for (Event other : parent.getEvents()) {
            if (Objects.equals(event.getName(), other.getName())) {
                error("Feature names have to be unique", RghPackage.Literals.EVENT__NAME);
                return;
            }
        }
	}
	public void checkPrecondNameIsUnique(Precondition precond) {
	    Given parent = (Given) precond.eContainer();
        for (Precondition other : parent.getPreconditions()) {
            if (Objects.equals(precond.getName(), other.getName())) {
                error("Feature names have to be unique", RghPackage.Literals.PRECONDITION__NAME);
                return;
            }
        }
	}
	public void checkPostcondNameIsUnique(Postcondition postcond) {
	    Then parent = (Then) postcond.eContainer();
        for (Postcondition other : parent.getPostconditions()) {
            if (Objects.equals(postcond.getName(), other.getName())) {
                error("Feature names have to be unique", RghPackage.Literals.POSTCONDITION__NAME);
                return;
            }
        }
	}
	
}
