/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.logical_and_expression;
import org.xtext.example.mydsl.myDsl.logical_or_expression;
import org.xtext.example.mydsl.myDsl.logical_or_expressionR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>logical or expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.logical_or_expressionImpl#getLogical_and_expression <em>Logical and expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.logical_or_expressionImpl#getLogical_or_expressionR <em>Logical or expression R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class logical_or_expressionImpl extends conditional_expressionImpl implements logical_or_expression
{
  /**
   * The cached value of the '{@link #getLogical_and_expression() <em>Logical and expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogical_and_expression()
   * @generated
   * @ordered
   */
  protected logical_and_expression logical_and_expression;

  /**
   * The cached value of the '{@link #getLogical_or_expressionR() <em>Logical or expression R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogical_or_expressionR()
   * @generated
   * @ordered
   */
  protected logical_or_expressionR logical_or_expressionR;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected logical_or_expressionImpl()
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
    return MyDslPackage.Literals.LOGICAL_OR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_and_expression getLogical_and_expression()
  {
    return logical_and_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogical_and_expression(logical_and_expression newLogical_and_expression, NotificationChain msgs)
  {
    logical_and_expression oldLogical_and_expression = logical_and_expression;
    logical_and_expression = newLogical_and_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND_EXPRESSION, oldLogical_and_expression, newLogical_and_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogical_and_expression(logical_and_expression newLogical_and_expression)
  {
    if (newLogical_and_expression != logical_and_expression)
    {
      NotificationChain msgs = null;
      if (logical_and_expression != null)
        msgs = ((InternalEObject)logical_and_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND_EXPRESSION, null, msgs);
      if (newLogical_and_expression != null)
        msgs = ((InternalEObject)newLogical_and_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND_EXPRESSION, null, msgs);
      msgs = basicSetLogical_and_expression(newLogical_and_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND_EXPRESSION, newLogical_and_expression, newLogical_and_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_or_expressionR getLogical_or_expressionR()
  {
    return logical_or_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogical_or_expressionR(logical_or_expressionR newLogical_or_expressionR, NotificationChain msgs)
  {
    logical_or_expressionR oldLogical_or_expressionR = logical_or_expressionR;
    logical_or_expressionR = newLogical_or_expressionR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_OR_EXPRESSION_R, oldLogical_or_expressionR, newLogical_or_expressionR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogical_or_expressionR(logical_or_expressionR newLogical_or_expressionR)
  {
    if (newLogical_or_expressionR != logical_or_expressionR)
    {
      NotificationChain msgs = null;
      if (logical_or_expressionR != null)
        msgs = ((InternalEObject)logical_or_expressionR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_OR_EXPRESSION_R, null, msgs);
      if (newLogical_or_expressionR != null)
        msgs = ((InternalEObject)newLogical_or_expressionR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_OR_EXPRESSION_R, null, msgs);
      msgs = basicSetLogical_or_expressionR(newLogical_or_expressionR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_OR_EXPRESSION_R, newLogical_or_expressionR, newLogical_or_expressionR));
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
      case MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND_EXPRESSION:
        return basicSetLogical_and_expression(null, msgs);
      case MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_OR_EXPRESSION_R:
        return basicSetLogical_or_expressionR(null, msgs);
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
      case MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND_EXPRESSION:
        return getLogical_and_expression();
      case MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_OR_EXPRESSION_R:
        return getLogical_or_expressionR();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND_EXPRESSION:
        setLogical_and_expression((logical_and_expression)newValue);
        return;
      case MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_OR_EXPRESSION_R:
        setLogical_or_expressionR((logical_or_expressionR)newValue);
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
      case MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND_EXPRESSION:
        setLogical_and_expression((logical_and_expression)null);
        return;
      case MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_OR_EXPRESSION_R:
        setLogical_or_expressionR((logical_or_expressionR)null);
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
      case MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND_EXPRESSION:
        return logical_and_expression != null;
      case MyDslPackage.LOGICAL_OR_EXPRESSION__LOGICAL_OR_EXPRESSION_R:
        return logical_or_expressionR != null;
    }
    return super.eIsSet(featureID);
  }

} //logical_or_expressionImpl