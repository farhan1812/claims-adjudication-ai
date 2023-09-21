/**
 * generated by Xtext 2.32.0
 */
package org.farhan.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Outline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.ScenarioOutline#getTitle <em>Title</em>}</li>
 *   <li>{@link org.farhan.cucumber.ScenarioOutline#getDescription <em>Description</em>}</li>
 *   <li>{@link org.farhan.cucumber.ScenarioOutline#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.farhan.cucumber.ScenarioOutline#getExamples <em>Examples</em>}</li>
 * </ul>
 *
 * @see org.farhan.cucumber.CucumberPackage#getScenarioOutline()
 * @model
 * @generated
 */
public interface ScenarioOutline extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.farhan.cucumber.CucumberPackage#getScenarioOutline_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.farhan.cucumber.ScenarioOutline#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see org.farhan.cucumber.CucumberPackage#getScenarioOutline_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link org.farhan.cucumber.ScenarioOutline#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Step}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getScenarioOutline_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

  /**
   * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Example}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Examples</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getScenarioOutline_Examples()
   * @model containment="true"
   * @generated
   */
  EList<Example> getExamples();

} // ScenarioOutline
