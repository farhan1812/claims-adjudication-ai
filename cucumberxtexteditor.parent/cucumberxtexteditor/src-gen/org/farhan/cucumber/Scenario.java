/**
 * generated by Xtext 2.35.0
 */
package org.farhan.cucumber;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.Scenario#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see org.farhan.cucumber.CucumberPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends AbstractScenario
{
  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Tag}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getScenario_Tags()
   * @model containment="true"
   * @generated
   */
  EList<Tag> getTags();

} // Scenario
