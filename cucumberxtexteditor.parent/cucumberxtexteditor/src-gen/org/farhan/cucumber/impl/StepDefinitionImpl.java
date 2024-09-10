/**
 * generated by Xtext 2.35.0
 */
package org.farhan.cucumber.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.farhan.cucumber.CucumberPackage;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.StepDefinition;
import org.farhan.cucumber.StepParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.impl.StepDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.farhan.cucumber.impl.StepDefinitionImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.farhan.cucumber.impl.StepDefinitionImpl#getStepParameters <em>Step Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepDefinitionImpl extends MinimalEObjectImpl.Container implements StepDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getStepParameters() <em>Step Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStepParameters()
   * @generated
   * @ordered
   */
  protected EList<StepParameters> stepParameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StepDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CucumberPackage.Literals.STEP_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CucumberPackage.STEP_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, CucumberPackage.STEP_DEFINITION__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StepParameters> getStepParameters()
  {
    if (stepParameters == null)
    {
      stepParameters = new EObjectContainmentEList<StepParameters>(StepParameters.class, this, CucumberPackage.STEP_DEFINITION__STEP_PARAMETERS);
    }
    return stepParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CucumberPackage.STEP_DEFINITION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case CucumberPackage.STEP_DEFINITION__STEP_PARAMETERS:
        return ((InternalEList<?>)getStepParameters()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CucumberPackage.STEP_DEFINITION__NAME:
        return getName();
      case CucumberPackage.STEP_DEFINITION__STATEMENTS:
        return getStatements();
      case CucumberPackage.STEP_DEFINITION__STEP_PARAMETERS:
        return getStepParameters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CucumberPackage.STEP_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case CucumberPackage.STEP_DEFINITION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case CucumberPackage.STEP_DEFINITION__STEP_PARAMETERS:
        getStepParameters().clear();
        getStepParameters().addAll((Collection<? extends StepParameters>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CucumberPackage.STEP_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CucumberPackage.STEP_DEFINITION__STATEMENTS:
        getStatements().clear();
        return;
      case CucumberPackage.STEP_DEFINITION__STEP_PARAMETERS:
        getStepParameters().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CucumberPackage.STEP_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CucumberPackage.STEP_DEFINITION__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case CucumberPackage.STEP_DEFINITION__STEP_PARAMETERS:
        return stepParameters != null && !stepParameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StepDefinitionImpl
