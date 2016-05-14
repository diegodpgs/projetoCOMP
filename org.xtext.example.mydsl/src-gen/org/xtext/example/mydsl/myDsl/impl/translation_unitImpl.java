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
import org.xtext.example.mydsl.myDsl.external_declaration;
import org.xtext.example.mydsl.myDsl.translation_unit;
import org.xtext.example.mydsl.myDsl.translation_unitR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>translation unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.translation_unitImpl#getExternal_declaration <em>External declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.translation_unitImpl#getTranslation_unitR <em>Translation unit R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class translation_unitImpl extends MinimalEObjectImpl.Container implements translation_unit
{
  /**
   * The cached value of the '{@link #getExternal_declaration() <em>External declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternal_declaration()
   * @generated
   * @ordered
   */
  protected external_declaration external_declaration;

  /**
   * The cached value of the '{@link #getTranslation_unitR() <em>Translation unit R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTranslation_unitR()
   * @generated
   * @ordered
   */
  protected translation_unitR translation_unitR;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected translation_unitImpl()
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
    return MyDslPackage.Literals.TRANSLATION_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public external_declaration getExternal_declaration()
  {
    return external_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExternal_declaration(external_declaration newExternal_declaration, NotificationChain msgs)
  {
    external_declaration oldExternal_declaration = external_declaration;
    external_declaration = newExternal_declaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TRANSLATION_UNIT__EXTERNAL_DECLARATION, oldExternal_declaration, newExternal_declaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternal_declaration(external_declaration newExternal_declaration)
  {
    if (newExternal_declaration != external_declaration)
    {
      NotificationChain msgs = null;
      if (external_declaration != null)
        msgs = ((InternalEObject)external_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TRANSLATION_UNIT__EXTERNAL_DECLARATION, null, msgs);
      if (newExternal_declaration != null)
        msgs = ((InternalEObject)newExternal_declaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TRANSLATION_UNIT__EXTERNAL_DECLARATION, null, msgs);
      msgs = basicSetExternal_declaration(newExternal_declaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TRANSLATION_UNIT__EXTERNAL_DECLARATION, newExternal_declaration, newExternal_declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public translation_unitR getTranslation_unitR()
  {
    return translation_unitR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTranslation_unitR(translation_unitR newTranslation_unitR, NotificationChain msgs)
  {
    translation_unitR oldTranslation_unitR = translation_unitR;
    translation_unitR = newTranslation_unitR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TRANSLATION_UNIT__TRANSLATION_UNIT_R, oldTranslation_unitR, newTranslation_unitR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTranslation_unitR(translation_unitR newTranslation_unitR)
  {
    if (newTranslation_unitR != translation_unitR)
    {
      NotificationChain msgs = null;
      if (translation_unitR != null)
        msgs = ((InternalEObject)translation_unitR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TRANSLATION_UNIT__TRANSLATION_UNIT_R, null, msgs);
      if (newTranslation_unitR != null)
        msgs = ((InternalEObject)newTranslation_unitR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TRANSLATION_UNIT__TRANSLATION_UNIT_R, null, msgs);
      msgs = basicSetTranslation_unitR(newTranslation_unitR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TRANSLATION_UNIT__TRANSLATION_UNIT_R, newTranslation_unitR, newTranslation_unitR));
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
      case MyDslPackage.TRANSLATION_UNIT__EXTERNAL_DECLARATION:
        return basicSetExternal_declaration(null, msgs);
      case MyDslPackage.TRANSLATION_UNIT__TRANSLATION_UNIT_R:
        return basicSetTranslation_unitR(null, msgs);
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
      case MyDslPackage.TRANSLATION_UNIT__EXTERNAL_DECLARATION:
        return getExternal_declaration();
      case MyDslPackage.TRANSLATION_UNIT__TRANSLATION_UNIT_R:
        return getTranslation_unitR();
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
      case MyDslPackage.TRANSLATION_UNIT__EXTERNAL_DECLARATION:
        setExternal_declaration((external_declaration)newValue);
        return;
      case MyDslPackage.TRANSLATION_UNIT__TRANSLATION_UNIT_R:
        setTranslation_unitR((translation_unitR)newValue);
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
      case MyDslPackage.TRANSLATION_UNIT__EXTERNAL_DECLARATION:
        setExternal_declaration((external_declaration)null);
        return;
      case MyDslPackage.TRANSLATION_UNIT__TRANSLATION_UNIT_R:
        setTranslation_unitR((translation_unitR)null);
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
      case MyDslPackage.TRANSLATION_UNIT__EXTERNAL_DECLARATION:
        return external_declaration != null;
      case MyDslPackage.TRANSLATION_UNIT__TRANSLATION_UNIT_R:
        return translation_unitR != null;
    }
    return super.eIsSet(featureID);
  }

} //translation_unitImpl
