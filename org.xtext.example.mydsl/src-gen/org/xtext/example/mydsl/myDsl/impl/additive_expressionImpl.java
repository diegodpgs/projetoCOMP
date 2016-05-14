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
import org.xtext.example.mydsl.myDsl.additive_expression;
import org.xtext.example.mydsl.myDsl.additive_expressionR;
import org.xtext.example.mydsl.myDsl.multiplicative_expression;
import org.xtext.example.mydsl.myDsl.shift_expressionR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>additive expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.additive_expressionImpl#getShift_expressionR <em>Shift expression R</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.additive_expressionImpl#getMultiplicative_expression <em>Multiplicative expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.additive_expressionImpl#getAdditive_expressionR <em>Additive expression R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class additive_expressionImpl extends shift_expressionImpl implements additive_expression
{
  /**
   * The cached value of the '{@link #getShift_expressionR() <em>Shift expression R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShift_expressionR()
   * @generated
   * @ordered
   */
  protected shift_expressionR shift_expressionR;

  /**
   * The cached value of the '{@link #getMultiplicative_expression() <em>Multiplicative expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicative_expression()
   * @generated
   * @ordered
   */
  protected multiplicative_expression multiplicative_expression;

  /**
   * The cached value of the '{@link #getAdditive_expressionR() <em>Additive expression R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditive_expressionR()
   * @generated
   * @ordered
   */
  protected additive_expressionR additive_expressionR;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected additive_expressionImpl()
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
    return MyDslPackage.Literals.ADDITIVE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public shift_expressionR getShift_expressionR()
  {
    return shift_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShift_expressionR(shift_expressionR newShift_expressionR, NotificationChain msgs)
  {
    shift_expressionR oldShift_expressionR = shift_expressionR;
    shift_expressionR = newShift_expressionR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ADDITIVE_EXPRESSION__SHIFT_EXPRESSION_R, oldShift_expressionR, newShift_expressionR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShift_expressionR(shift_expressionR newShift_expressionR)
  {
    if (newShift_expressionR != shift_expressionR)
    {
      NotificationChain msgs = null;
      if (shift_expressionR != null)
        msgs = ((InternalEObject)shift_expressionR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ADDITIVE_EXPRESSION__SHIFT_EXPRESSION_R, null, msgs);
      if (newShift_expressionR != null)
        msgs = ((InternalEObject)newShift_expressionR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ADDITIVE_EXPRESSION__SHIFT_EXPRESSION_R, null, msgs);
      msgs = basicSetShift_expressionR(newShift_expressionR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ADDITIVE_EXPRESSION__SHIFT_EXPRESSION_R, newShift_expressionR, newShift_expressionR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public multiplicative_expression getMultiplicative_expression()
  {
    return multiplicative_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultiplicative_expression(multiplicative_expression newMultiplicative_expression, NotificationChain msgs)
  {
    multiplicative_expression oldMultiplicative_expression = multiplicative_expression;
    multiplicative_expression = newMultiplicative_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, oldMultiplicative_expression, newMultiplicative_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicative_expression(multiplicative_expression newMultiplicative_expression)
  {
    if (newMultiplicative_expression != multiplicative_expression)
    {
      NotificationChain msgs = null;
      if (multiplicative_expression != null)
        msgs = ((InternalEObject)multiplicative_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, null, msgs);
      if (newMultiplicative_expression != null)
        msgs = ((InternalEObject)newMultiplicative_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, null, msgs);
      msgs = basicSetMultiplicative_expression(newMultiplicative_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, newMultiplicative_expression, newMultiplicative_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public additive_expressionR getAdditive_expressionR()
  {
    return additive_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdditive_expressionR(additive_expressionR newAdditive_expressionR, NotificationChain msgs)
  {
    additive_expressionR oldAdditive_expressionR = additive_expressionR;
    additive_expressionR = newAdditive_expressionR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_R, oldAdditive_expressionR, newAdditive_expressionR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdditive_expressionR(additive_expressionR newAdditive_expressionR)
  {
    if (newAdditive_expressionR != additive_expressionR)
    {
      NotificationChain msgs = null;
      if (additive_expressionR != null)
        msgs = ((InternalEObject)additive_expressionR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_R, null, msgs);
      if (newAdditive_expressionR != null)
        msgs = ((InternalEObject)newAdditive_expressionR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_R, null, msgs);
      msgs = basicSetAdditive_expressionR(newAdditive_expressionR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_R, newAdditive_expressionR, newAdditive_expressionR));
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
      case MyDslPackage.ADDITIVE_EXPRESSION__SHIFT_EXPRESSION_R:
        return basicSetShift_expressionR(null, msgs);
      case MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
        return basicSetMultiplicative_expression(null, msgs);
      case MyDslPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_R:
        return basicSetAdditive_expressionR(null, msgs);
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
      case MyDslPackage.ADDITIVE_EXPRESSION__SHIFT_EXPRESSION_R:
        return getShift_expressionR();
      case MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
        return getMultiplicative_expression();
      case MyDslPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_R:
        return getAdditive_expressionR();
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
      case MyDslPackage.ADDITIVE_EXPRESSION__SHIFT_EXPRESSION_R:
        setShift_expressionR((shift_expressionR)newValue);
        return;
      case MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
        setMultiplicative_expression((multiplicative_expression)newValue);
        return;
      case MyDslPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_R:
        setAdditive_expressionR((additive_expressionR)newValue);
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
      case MyDslPackage.ADDITIVE_EXPRESSION__SHIFT_EXPRESSION_R:
        setShift_expressionR((shift_expressionR)null);
        return;
      case MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
        setMultiplicative_expression((multiplicative_expression)null);
        return;
      case MyDslPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_R:
        setAdditive_expressionR((additive_expressionR)null);
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
      case MyDslPackage.ADDITIVE_EXPRESSION__SHIFT_EXPRESSION_R:
        return shift_expressionR != null;
      case MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
        return multiplicative_expression != null;
      case MyDslPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_R:
        return additive_expressionR != null;
    }
    return super.eIsSet(featureID);
  }

} //additive_expressionImpl