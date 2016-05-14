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
import org.xtext.example.mydsl.myDsl.constant_expression;
import org.xtext.example.mydsl.myDsl.declarator;
import org.xtext.example.mydsl.myDsl.direct_declarator;
import org.xtext.example.mydsl.myDsl.pointer;
import org.xtext.example.mydsl.myDsl.struct_declarator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaratorImpl#getDeclaratorx <em>Declaratorx</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaratorImpl#getConstant_expression1 <em>Constant expression1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaratorImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaratorImpl#getDd <em>Dd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class declaratorImpl extends init_declaratorImpl implements declarator
{
  /**
   * The cached value of the '{@link #getDeclaratorx() <em>Declaratorx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaratorx()
   * @generated
   * @ordered
   */
  protected declarator declaratorx;

  /**
   * The cached value of the '{@link #getConstant_expression1() <em>Constant expression1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant_expression1()
   * @generated
   * @ordered
   */
  protected constant_expression constant_expression1;

  /**
   * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointer()
   * @generated
   * @ordered
   */
  protected pointer pointer;

  /**
   * The cached value of the '{@link #getDd() <em>Dd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDd()
   * @generated
   * @ordered
   */
  protected direct_declarator dd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected declaratorImpl()
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
    return MyDslPackage.Literals.DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declarator getDeclaratorx()
  {
    return declaratorx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaratorx(declarator newDeclaratorx, NotificationChain msgs)
  {
    declarator oldDeclaratorx = declaratorx;
    declaratorx = newDeclaratorx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATOR__DECLARATORX, oldDeclaratorx, newDeclaratorx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaratorx(declarator newDeclaratorx)
  {
    if (newDeclaratorx != declaratorx)
    {
      NotificationChain msgs = null;
      if (declaratorx != null)
        msgs = ((InternalEObject)declaratorx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATOR__DECLARATORX, null, msgs);
      if (newDeclaratorx != null)
        msgs = ((InternalEObject)newDeclaratorx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATOR__DECLARATORX, null, msgs);
      msgs = basicSetDeclaratorx(newDeclaratorx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATOR__DECLARATORX, newDeclaratorx, newDeclaratorx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_expression getConstant_expression1()
  {
    return constant_expression1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant_expression1(constant_expression newConstant_expression1, NotificationChain msgs)
  {
    constant_expression oldConstant_expression1 = constant_expression1;
    constant_expression1 = newConstant_expression1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1, oldConstant_expression1, newConstant_expression1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant_expression1(constant_expression newConstant_expression1)
  {
    if (newConstant_expression1 != constant_expression1)
    {
      NotificationChain msgs = null;
      if (constant_expression1 != null)
        msgs = ((InternalEObject)constant_expression1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1, null, msgs);
      if (newConstant_expression1 != null)
        msgs = ((InternalEObject)newConstant_expression1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1, null, msgs);
      msgs = basicSetConstant_expression1(newConstant_expression1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1, newConstant_expression1, newConstant_expression1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointer getPointer()
  {
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointer(pointer newPointer, NotificationChain msgs)
  {
    pointer oldPointer = pointer;
    pointer = newPointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATOR__POINTER, oldPointer, newPointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointer(pointer newPointer)
  {
    if (newPointer != pointer)
    {
      NotificationChain msgs = null;
      if (pointer != null)
        msgs = ((InternalEObject)pointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATOR__POINTER, null, msgs);
      if (newPointer != null)
        msgs = ((InternalEObject)newPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATOR__POINTER, null, msgs);
      msgs = basicSetPointer(newPointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATOR__POINTER, newPointer, newPointer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public direct_declarator getDd()
  {
    return dd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDd(direct_declarator newDd, NotificationChain msgs)
  {
    direct_declarator oldDd = dd;
    dd = newDd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATOR__DD, oldDd, newDd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDd(direct_declarator newDd)
  {
    if (newDd != dd)
    {
      NotificationChain msgs = null;
      if (dd != null)
        msgs = ((InternalEObject)dd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATOR__DD, null, msgs);
      if (newDd != null)
        msgs = ((InternalEObject)newDd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATOR__DD, null, msgs);
      msgs = basicSetDd(newDd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATOR__DD, newDd, newDd));
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
      case MyDslPackage.DECLARATOR__DECLARATORX:
        return basicSetDeclaratorx(null, msgs);
      case MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1:
        return basicSetConstant_expression1(null, msgs);
      case MyDslPackage.DECLARATOR__POINTER:
        return basicSetPointer(null, msgs);
      case MyDslPackage.DECLARATOR__DD:
        return basicSetDd(null, msgs);
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
      case MyDslPackage.DECLARATOR__DECLARATORX:
        return getDeclaratorx();
      case MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1:
        return getConstant_expression1();
      case MyDslPackage.DECLARATOR__POINTER:
        return getPointer();
      case MyDslPackage.DECLARATOR__DD:
        return getDd();
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
      case MyDslPackage.DECLARATOR__DECLARATORX:
        setDeclaratorx((declarator)newValue);
        return;
      case MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1:
        setConstant_expression1((constant_expression)newValue);
        return;
      case MyDslPackage.DECLARATOR__POINTER:
        setPointer((pointer)newValue);
        return;
      case MyDslPackage.DECLARATOR__DD:
        setDd((direct_declarator)newValue);
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
      case MyDslPackage.DECLARATOR__DECLARATORX:
        setDeclaratorx((declarator)null);
        return;
      case MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1:
        setConstant_expression1((constant_expression)null);
        return;
      case MyDslPackage.DECLARATOR__POINTER:
        setPointer((pointer)null);
        return;
      case MyDslPackage.DECLARATOR__DD:
        setDd((direct_declarator)null);
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
      case MyDslPackage.DECLARATOR__DECLARATORX:
        return declaratorx != null;
      case MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1:
        return constant_expression1 != null;
      case MyDslPackage.DECLARATOR__POINTER:
        return pointer != null;
      case MyDslPackage.DECLARATOR__DD:
        return dd != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == struct_declarator.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.DECLARATOR__DECLARATORX: return MyDslPackage.STRUCT_DECLARATOR__DECLARATORX;
        case MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1: return MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION1;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == struct_declarator.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.STRUCT_DECLARATOR__DECLARATORX: return MyDslPackage.DECLARATOR__DECLARATORX;
        case MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION1: return MyDslPackage.DECLARATOR__CONSTANT_EXPRESSION1;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //declaratorImpl