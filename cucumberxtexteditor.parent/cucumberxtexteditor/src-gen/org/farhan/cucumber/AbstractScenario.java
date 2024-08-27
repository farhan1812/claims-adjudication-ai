/**
 * generated by Xtext 2.36.0
 */
package org.farhan.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.AbstractScenario#getName <em>Name</em>}</li>
 *   <li>{@link org.farhan.cucumber.AbstractScenario#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.farhan.cucumber.AbstractScenario#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see org.farhan.cucumber.CucumberPackage#getAbstractScenario()
 * @model
 * @generated
 */
public interface AbstractScenario extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.farhan.cucumber.CucumberPackage#getAbstractScenario_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.farhan.cucumber.AbstractScenario#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getAbstractScenario_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Step}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getAbstractScenario_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

} // AbstractScenario
