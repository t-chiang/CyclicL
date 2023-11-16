/**
 */
package org.mcmaster.pfcsm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mcmaster.pfcsm.AbstractClass;
import org.mcmaster.pfcsm.Association;
import org.mcmaster.pfcsm.Attribute;
import org.mcmaster.pfcsm.Class_Diagram_Root;
import org.mcmaster.pfcsm.Composition;
import org.mcmaster.pfcsm.ConcreteClass;
import org.mcmaster.pfcsm.Element;
import org.mcmaster.pfcsm.Inheritance;
import org.mcmaster.pfcsm.Operation;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Produces;
import org.mcmaster.pfcsm.Reference;
import org.mcmaster.pfcsm.Uses;
import org.mcmaster.pfcsm.XOR;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mcmaster.pfcsm.PfcsmPackage
 * @generated
 */
public class PfcsmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PfcsmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PfcsmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PfcsmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PfcsmSwitch<Adapter> modelSwitch = new PfcsmSwitch<Adapter>() {
		@Override
		public Adapter caseClass(org.mcmaster.pfcsm.Class object) {
			return createClassAdapter();
		}

		@Override
		public Adapter caseClass_Diagram_Root(Class_Diagram_Root object) {
			return createClass_Diagram_RootAdapter();
		}

		@Override
		public Adapter caseAbstractClass(AbstractClass object) {
			return createAbstractClassAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter caseAssociation(Association object) {
			return createAssociationAdapter();
		}

		@Override
		public Adapter caseComposition(Composition object) {
			return createCompositionAdapter();
		}

		@Override
		public Adapter caseInheritance(Inheritance object) {
			return createInheritanceAdapter();
		}

		@Override
		public Adapter caseXOR(XOR object) {
			return createXORAdapter();
		}

		@Override
		public Adapter caseConcreteClass(ConcreteClass object) {
			return createConcreteClassAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseUses(Uses object) {
			return createUsesAdapter();
		}

		@Override
		public Adapter caseProduces(Produces object) {
			return createProducesAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Class_Diagram_Root <em>Class Diagram Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Class_Diagram_Root
	 * @generated
	 */
	public Adapter createClass_Diagram_RootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.AbstractClass <em>Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.AbstractClass
	 * @generated
	 */
	public Adapter createAbstractClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Inheritance
	 * @generated
	 */
	public Adapter createInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.XOR
	 * @generated
	 */
	public Adapter createXORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.ConcreteClass <em>Concrete Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.ConcreteClass
	 * @generated
	 */
	public Adapter createConcreteClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Uses
	 * @generated
	 */
	public Adapter createUsesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Produces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Produces
	 * @generated
	 */
	public Adapter createProducesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.pfcsm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.pfcsm.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PfcsmAdapterFactory
