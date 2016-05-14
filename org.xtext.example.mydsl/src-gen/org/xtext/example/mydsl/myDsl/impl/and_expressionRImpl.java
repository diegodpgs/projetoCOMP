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
import org.xtext.example.mydsl.myDsl.and_expressionR;
import org.xtext.example.mydsl.myDsl.equality_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>and expression R</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.and_expressionRImpl#getEquality_expression <em>Equality expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.and_expressionRImpl#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class and_expressionRImpl extends MinimalEObjectImpl.Container implements and_expressionR
{
  /**
   * The cached value of the '{@link #getEquality_expression() <em>Equality expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquality_expression()
   * @generated
   * @ordered
   */
  protected equality_expression equality_expression;

  /**
   * The cached value of the '{@link #getRec() <em>Rec</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRec()
   * @generated
   * @ordered
   */
  protected EList<and_expressionR> rec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected and_expressionRImpl()
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
    return MyDslPackage.Literals.AND_EXPRESSION_R;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public equality_expression getEquality_expression()
  {
    return equality_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEquality_expression(equality_expression newEquality_expression, NotificationChain msgs)
  {
    equality_expression oldEquality_expression = equality_expression;
    equality_expression = newEquality_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.AND_EXPRESSION_R__EQUALITY_EXPRESSION, oldEquality_expression, newEquality_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEquality_expression(equality_expression newEquality_expression)
  {
    if (newEquality_expression != equality_expression)
    {
      NotificationChain msgs = null;
      if (equality_expression != null)
        msgs = ((InternalEObject)equality_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.AND_EXPRESSION_R__EQUALITY_EXPRESSION, null, msgs);
      if (newEquality_expression != null)
        msgs = ((InternalEObject)newEquality_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.AND_EXPRESSION_R__EQUALITY_EXPRESSION, null, msgs);
      msgs = basicSetEquality_expression(newEquality_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AND_EXPRESSION_R__EQUALITY_EXPRESSION, newEquality_expression, newEquality_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<and_expressionR> getRec()
  {
    if (rec == null)
    {
      rec = new EObjectContainmentEList<and_expressionR>(and_expressionR.class, this, MyDslPackage.AND_EXPRESSION_R__REC);
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
      case MyDslPackage.AND_EXPRESSION_R__EQUALITY_EXPRESSION:
        return basicSetEquality_expression(null, msgs);
      case MyDslPackage.AND_EXPRESSION_R__REC:
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
      case MyDslPackage.AND_EXPRESSION_R__EQUALITY_EXPRESSION:
        return getEquality_expression();
      case MyDslPackage.AND_EXPRESSION_R__REC:
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
      case MyDslPackage.AND_EXPRESSION_R__EQUALITY_EXPRESSION:
        setEquality_expression((equality_expression)newValue);
        return;
      case MyDslPackage.AND_EXPRESSION_R__REC:
        getRec().clear();
        getRec().addAll((Collection<? extends and_expressionR>)newValue);
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
      case MyDslPackage.AND_EXPRESSION_R__EQUALITY_EXPRESSION:
        setEquality_expression((equality_expression)null);
        return;
      case MyDslPackage.AND_EXPRESSION_R__REC:
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
      case MyDslPackage.AND_EXPRESSION_R__EQUALITY_EXPRESSION:
        return equality_expression != null;
      case MyDslPackage.AND_EXPRESSION_R__REC:
        return rec != null && !rec.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //and_expressionRImpl