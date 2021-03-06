/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

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

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.exclusive_or_expression;
import org.xtext.example.mydsl.myDsl.inclusive_or_expressionR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>inclusive or expression R</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.inclusive_or_expressionRImpl#getExclusive_or_expression <em>Exclusive or expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.inclusive_or_expressionRImpl#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class inclusive_or_expressionRImpl extends MinimalEObjectImpl.Container implements inclusive_or_expressionR
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
   * The cached value of the '{@link #getRec() <em>Rec</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRec()
   * @generated
   * @ordered
   */
  protected EList<inclusive_or_expressionR> rec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected inclusive_or_expressionRImpl()
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
    return MyDslPackage.Literals.INCLUSIVE_OR_EXPRESSION_R;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__EXCLUSIVE_OR_EXPRESSION, oldExclusive_or_expression, newExclusive_or_expression);
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
        msgs = ((InternalEObject)exclusive_or_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__EXCLUSIVE_OR_EXPRESSION, null, msgs);
      if (newExclusive_or_expression != null)
        msgs = ((InternalEObject)newExclusive_or_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__EXCLUSIVE_OR_EXPRESSION, null, msgs);
      msgs = basicSetExclusive_or_expression(newExclusive_or_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__EXCLUSIVE_OR_EXPRESSION, newExclusive_or_expression, newExclusive_or_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<inclusive_or_expressionR> getRec()
  {
    if (rec == null)
    {
      rec = new EObjectContainmentEList<inclusive_or_expressionR>(inclusive_or_expressionR.class, this, MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__REC);
    }
    return rec;
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__EXCLUSIVE_OR_EXPRESSION:
        return basicSetExclusive_or_expression(null, msgs);
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__REC:
        return ((InternalEList<?>)getRec()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__EXCLUSIVE_OR_EXPRESSION:
        return getExclusive_or_expression();
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__REC:
        return getRec();
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__EXCLUSIVE_OR_EXPRESSION:
        setExclusive_or_expression((exclusive_or_expression)newValue);
        return;
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__REC:
        getRec().clear();
        getRec().addAll((Collection<? extends inclusive_or_expressionR>)newValue);
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__EXCLUSIVE_OR_EXPRESSION:
        setExclusive_or_expression((exclusive_or_expression)null);
        return;
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__REC:
        getRec().clear();
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__EXCLUSIVE_OR_EXPRESSION:
        return exclusive_or_expression != null;
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R__REC:
        return rec != null && !rec.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //inclusive_or_expressionRImpl
