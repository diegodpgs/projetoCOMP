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
import org.xtext.example.mydsl.myDsl.assignment_expression;
import org.xtext.example.mydsl.myDsl.expression;
import org.xtext.example.mydsl.myDsl.expressionR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getAssignment_expression <em>Assignment expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getExpressionR <em>Expression R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expressionImpl extends jump_statementImpl implements expression
{
  /**
   * The cached value of the '{@link #getAssignment_expression() <em>Assignment expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment_expression()
   * @generated
   * @ordered
   */
  protected assignment_expression assignment_expression;

  /**
   * The cached value of the '{@link #getExpressionR() <em>Expression R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionR()
   * @generated
   * @ordered
   */
  protected expressionR expressionR;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expressionImpl()
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
    return MyDslPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_expression getAssignment_expression()
  {
    return assignment_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment_expression(assignment_expression newAssignment_expression, NotificationChain msgs)
  {
    assignment_expression oldAssignment_expression = assignment_expression;
    assignment_expression = newAssignment_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__ASSIGNMENT_EXPRESSION, oldAssignment_expression, newAssignment_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment_expression(assignment_expression newAssignment_expression)
  {
    if (newAssignment_expression != assignment_expression)
    {
      NotificationChain msgs = null;
      if (assignment_expression != null)
        msgs = ((InternalEObject)assignment_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__ASSIGNMENT_EXPRESSION, null, msgs);
      if (newAssignment_expression != null)
        msgs = ((InternalEObject)newAssignment_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__ASSIGNMENT_EXPRESSION, null, msgs);
      msgs = basicSetAssignment_expression(newAssignment_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__ASSIGNMENT_EXPRESSION, newAssignment_expression, newAssignment_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expressionR getExpressionR()
  {
    return expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionR(expressionR newExpressionR, NotificationChain msgs)
  {
    expressionR oldExpressionR = expressionR;
    expressionR = newExpressionR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__EXPRESSION_R, oldExpressionR, newExpressionR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionR(expressionR newExpressionR)
  {
    if (newExpressionR != expressionR)
    {
      NotificationChain msgs = null;
      if (expressionR != null)
        msgs = ((InternalEObject)expressionR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__EXPRESSION_R, null, msgs);
      if (newExpressionR != null)
        msgs = ((InternalEObject)newExpressionR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__EXPRESSION_R, null, msgs);
      msgs = basicSetExpressionR(newExpressionR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__EXPRESSION_R, newExpressionR, newExpressionR));
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
      case MyDslPackage.EXPRESSION__ASSIGNMENT_EXPRESSION:
        return basicSetAssignment_expression(null, msgs);
      case MyDslPackage.EXPRESSION__EXPRESSION_R:
        return basicSetExpressionR(null, msgs);
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
      case MyDslPackage.EXPRESSION__ASSIGNMENT_EXPRESSION:
        return getAssignment_expression();
      case MyDslPackage.EXPRESSION__EXPRESSION_R:
        return getExpressionR();
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
      case MyDslPackage.EXPRESSION__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)newValue);
        return;
      case MyDslPackage.EXPRESSION__EXPRESSION_R:
        setExpressionR((expressionR)newValue);
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
      case MyDslPackage.EXPRESSION__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)null);
        return;
      case MyDslPackage.EXPRESSION__EXPRESSION_R:
        setExpressionR((expressionR)null);
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
      case MyDslPackage.EXPRESSION__ASSIGNMENT_EXPRESSION:
        return assignment_expression != null;
      case MyDslPackage.EXPRESSION__EXPRESSION_R:
        return expressionR != null;
    }
    return super.eIsSet(featureID);
  }

} //expressionImpl