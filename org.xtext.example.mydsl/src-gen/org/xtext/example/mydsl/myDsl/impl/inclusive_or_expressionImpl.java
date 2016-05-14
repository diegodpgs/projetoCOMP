/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.exclusive_or_expression;
import org.xtext.example.mydsl.myDsl.inclusive_or_expression;
import org.xtext.example.mydsl.myDsl.inclusive_or_expressionR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>inclusive or expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.inclusive_or_expressionImpl#getExclusive_or_expression <em>Exclusive or expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.inclusive_or_expressionImpl#getInclusive_or_expressionR <em>Inclusive or expression R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class inclusive_or_expressionImpl extends MinimalEObjectImpl.Container implements inclusive_or_expression
{
  /**
   * The cached value of the '{@link #getExclusive_or_expression() <em>Exclusive or expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusive_or_expression()
   * @generated
   * @ordered
   */
  protected exclusive_or_expression exclusive_or_expression;

  /**
   * The cached value of the '{@link #getInclusive_or_expressionR() <em>Inclusive or expression R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclusive_or_expressionR()
   * @generated
   * @ordered
   */
  protected inclusive_or_expressionR inclusive_or_expressionR;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected inclusive_or_expressionImpl()
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
    return MyDslPackage.Literals.INCLUSIVE_OR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exclusive_or_expression getExclusive_or_expression()
  {
    return exclusive_or_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExclusive_or_expression(exclusive_or_expression newExclusive_or_expression, NotificationChain msgs)
  {
    exclusive_or_expression oldExclusive_or_expression = exclusive_or_expression;
    exclusive_or_expression = newExclusive_or_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION, oldExclusive_or_expression, newExclusive_or_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclusive_or_expression(exclusive_or_expression newExclusive_or_expression)
  {
    if (newExclusive_or_expression != exclusive_or_expression)
    {
      NotificationChain msgs = null;
      if (exclusive_or_expression != null)
        msgs = ((InternalEObject)exclusive_or_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION, null, msgs);
      if (newExclusive_or_expression != null)
        msgs = ((InternalEObject)newExclusive_or_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION, null, msgs);
      msgs = basicSetExclusive_or_expression(newExclusive_or_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION, newExclusive_or_expression, newExclusive_or_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public inclusive_or_expressionR getInclusive_or_expressionR()
  {
    return inclusive_or_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInclusive_or_expressionR(inclusive_or_expressionR newInclusive_or_expressionR, NotificationChain msgs)
  {
    inclusive_or_expressionR oldInclusive_or_expressionR = inclusive_or_expressionR;
    inclusive_or_expressionR = newInclusive_or_expressionR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_R, oldInclusive_or_expressionR, newInclusive_or_expressionR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInclusive_or_expressionR(inclusive_or_expressionR newInclusive_or_expressionR)
  {
    if (newInclusive_or_expressionR != inclusive_or_expressionR)
    {
      NotificationChain msgs = null;
      if (inclusive_or_expressionR != null)
        msgs = ((InternalEObject)inclusive_or_expressionR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_R, null, msgs);
      if (newInclusive_or_expressionR != null)
        msgs = ((InternalEObject)newInclusive_or_expressionR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_R, null, msgs);
      msgs = basicSetInclusive_or_expressionR(newInclusive_or_expressionR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_R, newInclusive_or_expressionR, newInclusive_or_expressionR));
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION:
        return basicSetExclusive_or_expression(null, msgs);
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_R:
        return basicSetInclusive_or_expressionR(null, msgs);
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION:
        return getExclusive_or_expression();
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_R:
        return getInclusive_or_expressionR();
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION:
        setExclusive_or_expression((exclusive_or_expression)newValue);
        return;
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_R:
        setInclusive_or_expressionR((inclusive_or_expressionR)newValue);
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION:
        setExclusive_or_expression((exclusive_or_expression)null);
        return;
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_R:
        setInclusive_or_expressionR((inclusive_or_expressionR)null);
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION:
        return exclusive_or_expression != null;
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_R:
        return inclusive_or_expressionR != null;
    }
    return super.eIsSet(featureID);
  }

} //inclusive_or_expressionImpl
