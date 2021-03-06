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
import org.xtext.example.mydsl.myDsl.parameter_declaration;
import org.xtext.example.mydsl.myDsl.parameter_list;
import org.xtext.example.mydsl.myDsl.parameter_listR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.parameter_listImpl#getParameter_declaration <em>Parameter declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.parameter_listImpl#getParameter_listR <em>Parameter list R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class parameter_listImpl extends parameter_type_listImpl implements parameter_list
{
  /**
   * The cached value of the '{@link #getParameter_declaration() <em>Parameter declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_declaration()
   * @generated
   * @ordered
   */
  protected parameter_declaration parameter_declaration;

  /**
   * The cached value of the '{@link #getParameter_listR() <em>Parameter list R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_listR()
   * @generated
   * @ordered
   */
  protected parameter_listR parameter_listR;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected parameter_listImpl()
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
    return MyDslPackage.Literals.PARAMETER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_declaration getParameter_declaration()
  {
    return parameter_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter_declaration(parameter_declaration newParameter_declaration, NotificationChain msgs)
  {
    parameter_declaration oldParameter_declaration = parameter_declaration;
    parameter_declaration = newParameter_declaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_LIST__PARAMETER_DECLARATION, oldParameter_declaration, newParameter_declaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter_declaration(parameter_declaration newParameter_declaration)
  {
    if (newParameter_declaration != parameter_declaration)
    {
      NotificationChain msgs = null;
      if (parameter_declaration != null)
        msgs = ((InternalEObject)parameter_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_LIST__PARAMETER_DECLARATION, null, msgs);
      if (newParameter_declaration != null)
        msgs = ((InternalEObject)newParameter_declaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_LIST__PARAMETER_DECLARATION, null, msgs);
      msgs = basicSetParameter_declaration(newParameter_declaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_LIST__PARAMETER_DECLARATION, newParameter_declaration, newParameter_declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_listR getParameter_listR()
  {
    return parameter_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter_listR(parameter_listR newParameter_listR, NotificationChain msgs)
  {
    parameter_listR oldParameter_listR = parameter_listR;
    parameter_listR = newParameter_listR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_LIST__PARAMETER_LIST_R, oldParameter_listR, newParameter_listR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter_listR(parameter_listR newParameter_listR)
  {
    if (newParameter_listR != parameter_listR)
    {
      NotificationChain msgs = null;
      if (parameter_listR != null)
        msgs = ((InternalEObject)parameter_listR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_LIST__PARAMETER_LIST_R, null, msgs);
      if (newParameter_listR != null)
        msgs = ((InternalEObject)newParameter_listR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_LIST__PARAMETER_LIST_R, null, msgs);
      msgs = basicSetParameter_listR(newParameter_listR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_LIST__PARAMETER_LIST_R, newParameter_listR, newParameter_listR));
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
      case MyDslPackage.PARAMETER_LIST__PARAMETER_DECLARATION:
        return basicSetParameter_declaration(null, msgs);
      case MyDslPackage.PARAMETER_LIST__PARAMETER_LIST_R:
        return basicSetParameter_listR(null, msgs);
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
      case MyDslPackage.PARAMETER_LIST__PARAMETER_DECLARATION:
        return getParameter_declaration();
      case MyDslPackage.PARAMETER_LIST__PARAMETER_LIST_R:
        return getParameter_listR();
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
      case MyDslPackage.PARAMETER_LIST__PARAMETER_DECLARATION:
        setParameter_declaration((parameter_declaration)newValue);
        return;
      case MyDslPackage.PARAMETER_LIST__PARAMETER_LIST_R:
        setParameter_listR((parameter_listR)newValue);
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
      case MyDslPackage.PARAMETER_LIST__PARAMETER_DECLARATION:
        setParameter_declaration((parameter_declaration)null);
        return;
      case MyDslPackage.PARAMETER_LIST__PARAMETER_LIST_R:
        setParameter_listR((parameter_listR)null);
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
      case MyDslPackage.PARAMETER_LIST__PARAMETER_DECLARATION:
        return parameter_declaration != null;
      case MyDslPackage.PARAMETER_LIST__PARAMETER_LIST_R:
        return parameter_listR != null;
    }
    return super.eIsSet(featureID);
  }

} //parameter_listImpl
