/**
 * generated by Xtext 2.35.0
 */
package org.farhan.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.Feature#getTags <em>Tags</em>}</li>
 *   <li>{@link org.farhan.cucumber.Feature#getName <em>Name</em>}</li>
 *   <li>{@link org.farhan.cucumber.Feature#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.farhan.cucumber.Feature#getAbstractScenarios <em>Abstract Scenarios</em>}</li>
 * </ul>
 *
 * @see org.farhan.cucumber.CucumberPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Tag}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getFeature_Tags()
   * @model containment="true"
   * @generated
   */
  EList<Tag> getTags();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.farhan.cucumber.CucumberPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.farhan.cucumber.Feature#getName <em>Name</em>}' attribute.
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
   * @see org.farhan.cucumber.CucumberPackage#getFeature_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Abstract Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.AbstractScenario}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Scenarios</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getFeature_AbstractScenarios()
   * @model containment="true"
   * @generated
   */
  EList<AbstractScenario> getAbstractScenarios();

} // Feature
