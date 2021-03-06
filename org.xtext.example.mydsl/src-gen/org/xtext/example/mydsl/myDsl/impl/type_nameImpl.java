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
import org.xtext.example.mydsl.myDsl.abstract_declarator;
import org.xtext.example.mydsl.myDsl.specifier_qualifier_list;
import org.xtext.example.mydsl.myDsl.type_name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.type_nameImpl#getSpecifier_qualifier_list <em>Specifier qualifier list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.type_nameImpl#getAd <em>Ad</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class type_nameImpl extends atomic_type_specifierImpl implements type_name
{
  /**
   * The cached value of the '{@link #getSpecifier_qualifier_list() <em>Specifier qualifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifier_qualifier_list()
   * @generated
   * @ordered
   */
  protected specifier_qualifier_list specifier_qualifier_list;

  /**
   * The cached value of the '{@link #getAd() <em>Ad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAd()
   * @generated
   * @ordered
   */
  protected abstract_declarator ad;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected type_nameImpl()
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
    return MyDslPackage.Literals.TYPE_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public specifier_qualifier_list getSpecifier_qualifier_list()
  {
    return specifier_qualifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpecifier_qualifier_list(specifier_qualifier_list newSpecifier_qualifier_list, NotificationChain msgs)
  {
    specifier_qualifier_list oldSpecifier_qualifier_list = specifier_qualifier_list;
    specifier_qualifier_list = newSpecifier_qualifier_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST, oldSpecifier_qualifier_list, newSpecifier_qualifier_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecifier_qualifier_list(specifier_qualifier_list newSpecifier_qualifier_list)
  {
    if (newSpecifier_qualifier_list != specifier_qualifier_list)
    {
      NotificationChain msgs = null;
      if (specifier_qualifier_list != null)
        msgs = ((InternalEObject)specifier_qualifier_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST, null, msgs);
      if (newSpecifier_qualifier_list != null)
        msgs = ((InternalEObject)newSpecifier_qualifier_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST, null, msgs);
      msgs = basicSetSpecifier_qualifier_list(newSpecifier_qualifier_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST, newSpecifier_qualifier_list, newSpecifier_qualifier_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public abstract_declarator getAd()
  {
    return ad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAd(abstract_declarator newAd, NotificationChain msgs)
  {
    abstract_declarator oldAd = ad;
    ad = newAd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_NAME__AD, oldAd, newAd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAd(abstract_declarator newAd)
  {
    if (newAd != ad)
    {
      NotificationChain msgs = null;
      if (ad != null)
        msgs = ((InternalEObject)ad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_NAME__AD, null, msgs);
      if (newAd != null)
        msgs = ((InternalEObject)newAd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_NAME__AD, null, msgs);
      msgs = basicSetAd(newAd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_NAME__AD, newAd, newAd));
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
      case MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST:
        return basicSetSpecifier_qualifier_list(null, msgs);
      case MyDslPackage.TYPE_NAME__AD:
        return basicSetAd(null, msgs);
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
      case MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST:
        return getSpecifier_qualifier_list();
      case MyDslPackage.TYPE_NAME__AD:
        return getAd();
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
      case MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST:
        setSpecifier_qualifier_list((specifier_qualifier_list)newValue);
        return;
      case MyDslPackage.TYPE_NAME__AD:
        setAd((abstract_declarator)newValue);
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
      case MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST:
        setSpecifier_qualifier_list((specifier_qualifier_list)null);
        return;
      case MyDslPackage.TYPE_NAME__AD:
        setAd((abstract_declarator)null);
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
      case MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST:
        return specifier_qualifier_list != null;
      case MyDslPackage.TYPE_NAME__AD:
        return ad != null;
    }
    return super.eIsSet(featureID);
  }

} //type_nameImpl
