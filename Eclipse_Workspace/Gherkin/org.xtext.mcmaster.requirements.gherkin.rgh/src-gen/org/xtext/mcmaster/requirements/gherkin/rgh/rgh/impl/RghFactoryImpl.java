/**
 * generated by Xtext 2.30.0
 */
package org.xtext.mcmaster.requirements.gherkin.rgh.rgh.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Context;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Description;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Event;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Given;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Model;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Operation;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Postcondition;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Precondition;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghFactory;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghPackage;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Steps;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Then;
import org.xtext.mcmaster.requirements.gherkin.rgh.rgh.When;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RghFactoryImpl extends EFactoryImpl implements RghFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RghFactory init()
  {
    try
    {
      RghFactory theRghFactory = (RghFactory)EPackage.Registry.INSTANCE.getEFactory(RghPackage.eNS_URI);
      if (theRghFactory != null)
      {
        return theRghFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RghFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RghFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RghPackage.MODEL: return createModel();
      case RghPackage.STEPS: return createSteps();
      case RghPackage.CONTEXT: return createContext();
      case RghPackage.MODULE: return createModule();
      case RghPackage.OPERATION: return createOperation();
      case RghPackage.GIVEN: return createGiven();
      case RghPackage.WHEN: return createWhen();
      case RghPackage.THEN: return createThen();
      case RghPackage.PRECONDITION: return createPrecondition();
      case RghPackage.EVENT: return createEvent();
      case RghPackage.POSTCONDITION: return createPostcondition();
      case RghPackage.DESCRIPTION: return createDescription();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Steps createSteps()
  {
    StepsImpl steps = new StepsImpl();
    return steps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Given createGiven()
  {
    GivenImpl given = new GivenImpl();
    return given;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public When createWhen()
  {
    WhenImpl when = new WhenImpl();
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Then createThen()
  {
    ThenImpl then = new ThenImpl();
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Precondition createPrecondition()
  {
    PreconditionImpl precondition = new PreconditionImpl();
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Postcondition createPostcondition()
  {
    PostconditionImpl postcondition = new PostconditionImpl();
    return postcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RghPackage getRghPackage()
  {
    return (RghPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RghPackage getPackage()
  {
    return RghPackage.eINSTANCE;
  }

} //RghFactoryImpl
