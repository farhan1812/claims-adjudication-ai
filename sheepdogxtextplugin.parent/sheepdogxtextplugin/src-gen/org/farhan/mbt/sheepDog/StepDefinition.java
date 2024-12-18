/**
 * generated by Xtext 2.36.0
 */
package org.farhan.mbt.sheepDog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.mbt.sheepDog.StepDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.farhan.mbt.sheepDog.StepDefinition#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.farhan.mbt.sheepDog.StepDefinition#getStepParameters <em>Step Parameters</em>}</li>
 * </ul>
 *
 * @see org.farhan.mbt.sheepDog.SheepDogPackage#getStepDefinition()
 * @model
 * @generated
 */
public interface StepDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.farhan.mbt.sheepDog.SheepDogPackage#getStepDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.farhan.mbt.sheepDog.StepDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' attribute list.
   * @see org.farhan.mbt.sheepDog.SheepDogPackage#getStepDefinition_Statements()
   * @model unique="false"
   * @generated
   */
  EList<String> getStatements();

  /**
   * Returns the value of the '<em><b>Step Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.mbt.sheepDog.StepParameters}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step Parameters</em>' containment reference list.
   * @see org.farhan.mbt.sheepDog.SheepDogPackage#getStepDefinition_StepParameters()
   * @model containment="true"
   * @generated
   */
  EList<StepParameters> getStepParameters();

} // StepDefinition
