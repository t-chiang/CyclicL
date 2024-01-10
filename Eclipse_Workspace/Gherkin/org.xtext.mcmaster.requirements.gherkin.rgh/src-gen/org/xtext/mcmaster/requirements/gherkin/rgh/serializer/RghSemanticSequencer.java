/*
 * generated by Xtext 2.30.0
 */
package org.xtext.mcmaster.requirements.gherkin.rgh.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Description;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Event;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Given;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Model;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Postcondition;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Precondition;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghPackage;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Then;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.When;
import org.xtext.mcmaster.requirements.gherkin.rgh.services.RghGrammarAccess;

@SuppressWarnings("all")
public class RghSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RghGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RghPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RghPackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case RghPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case RghPackage.GIVEN:
				sequence_Given(context, (Given) semanticObject); 
				return; 
			case RghPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RghPackage.POSTCONDITION:
				sequence_Postcondition(context, (Postcondition) semanticObject); 
				return; 
			case RghPackage.PRECONDITION:
				sequence_Precondition(context, (Precondition) semanticObject); 
				return; 
			case RghPackage.THEN:
				sequence_Then(context, (Then) semanticObject); 
				return; 
			case RghPackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Description returns Description
	 *
	 * Constraint:
	 *     value=STRING
	 * </pre>
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RghPackage.Literals.DESCRIPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RghPackage.Literals.DESCRIPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (name=ID description=Description)
	 * </pre>
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RghPackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RghPackage.Literals.EVENT__NAME));
			if (transientValues.isValueTransient(semanticObject, RghPackage.Literals.EVENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RghPackage.Literals.EVENT__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEventAccess().getDescriptionDescriptionParserRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Steps returns Given
	 *     Given returns Given
	 *
	 * Constraint:
	 *     preconditions+=Precondition+
	 * </pre>
	 */
	protected void sequence_Given(ISerializationContext context, Given semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     requirement+=Steps+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Postcondition returns Postcondition
	 *
	 * Constraint:
	 *     (name=ID description=Description)
	 * </pre>
	 */
	protected void sequence_Postcondition(ISerializationContext context, Postcondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RghPackage.Literals.POSTCONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RghPackage.Literals.POSTCONDITION__NAME));
			if (transientValues.isValueTransient(semanticObject, RghPackage.Literals.POSTCONDITION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RghPackage.Literals.POSTCONDITION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPostconditionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPostconditionAccess().getDescriptionDescriptionParserRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Precondition returns Precondition
	 *
	 * Constraint:
	 *     (name=ID description=Description)
	 * </pre>
	 */
	protected void sequence_Precondition(ISerializationContext context, Precondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RghPackage.Literals.PRECONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RghPackage.Literals.PRECONDITION__NAME));
			if (transientValues.isValueTransient(semanticObject, RghPackage.Literals.PRECONDITION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RghPackage.Literals.PRECONDITION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreconditionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPreconditionAccess().getDescriptionDescriptionParserRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Steps returns Then
	 *     Then returns Then
	 *
	 * Constraint:
	 *     postconditions+=Postcondition+
	 * </pre>
	 */
	protected void sequence_Then(ISerializationContext context, Then semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Steps returns When
	 *     When returns When
	 *
	 * Constraint:
	 *     events+=Event+
	 * </pre>
	 */
	protected void sequence_When(ISerializationContext context, When semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
