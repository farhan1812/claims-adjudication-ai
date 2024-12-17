/**
 * generated by Xtext 2.36.0
 */
package org.farhan.mbt.sheepDog.impl;

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

import org.farhan.mbt.sheepDog.AbstractScenario;
import org.farhan.mbt.sheepDog.SheepDogPackage;
import org.farhan.mbt.sheepDog.Statement;
import org.farhan.mbt.sheepDog.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.mbt.sheepDog.impl.AbstractScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.farhan.mbt.sheepDog.impl.AbstractScenarioImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.farhan.mbt.sheepDog.impl.AbstractScenarioImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractScenarioImpl extends MinimalEObjectImpl.Container implements AbstractScenario
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
   * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSteps()
   * @generated
   * @ordered
   */
  protected EList<Step> steps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractScenarioImpl()
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
    return SheepDogPackage.Literals.ABSTRACT_SCENARIO;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SheepDogPackage.ABSTRACT_SCENARIO__NAME, oldName, name));
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
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, SheepDogPackage.ABSTRACT_SCENARIO__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Step> getSteps()
  {
    if (steps == null)
    {
      steps = new EObjectContainmentEList<Step>(Step.class, this, SheepDogPackage.ABSTRACT_SCENARIO__STEPS);
    }
    return steps;
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
      case SheepDogPackage.ABSTRACT_SCENARIO__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case SheepDogPackage.ABSTRACT_SCENARIO__STEPS:
        return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
      case SheepDogPackage.ABSTRACT_SCENARIO__NAME:
        return getName();
      case SheepDogPackage.ABSTRACT_SCENARIO__STATEMENTS:
        return getStatements();
      case SheepDogPackage.ABSTRACT_SCENARIO__STEPS:
        return getSteps();
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
      case SheepDogPackage.ABSTRACT_SCENARIO__NAME:
        setName((String)newValue);
        return;
      case SheepDogPackage.ABSTRACT_SCENARIO__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case SheepDogPackage.ABSTRACT_SCENARIO__STEPS:
        getSteps().clear();
        getSteps().addAll((Collection<? extends Step>)newValue);
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
      case SheepDogPackage.ABSTRACT_SCENARIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SheepDogPackage.ABSTRACT_SCENARIO__STATEMENTS:
        getStatements().clear();
        return;
      case SheepDogPackage.ABSTRACT_SCENARIO__STEPS:
        getSteps().clear();
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
      case SheepDogPackage.ABSTRACT_SCENARIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SheepDogPackage.ABSTRACT_SCENARIO__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case SheepDogPackage.ABSTRACT_SCENARIO__STEPS:
        return steps != null && !steps.isEmpty();
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

} //AbstractScenarioImpl
