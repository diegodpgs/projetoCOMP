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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.specifier_qualifier_list;
import org.xtext.example.mydsl.myDsl.struct_declaration;
import org.xtext.example.mydsl.myDsl.struct_declarator_list;
import org.xtext.example.mydsl.myDsl.type_specifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>specifier qualifier list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.specifier_qualifier_listImpl#getSpecifier_qualifier_listx <em>Specifier qualifier listx</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.specifier_qualifier_listImpl#getStruct_declarator_list <em>Struct declarator list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.specifier_qualifier_listImpl#getType_specifier <em>Type specifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.specifier_qualifier_listImpl#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class specifier_qualifier_listImpl extends type_nameImpl implements specifier_qualifier_list
{
  /**
   * The cached value of the '{@link #getSpecifier_qualifier_listx() <em>Specifier qualifier listx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifier_qualifier_listx()
   * @generated
   * @ordered
   */
  protected specifier_qualifier_list specifier_qualifier_listx;

  /**
   * The cached value of the '{@link #getStruct_declarator_list() <em>Struct declarator list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct_declarator_list()
   * @generated
   * @ordered
   */
  protected struct_declarator_list struct_declarator_list;

  /**
   * The cached value of the '{@link #getType_specifier() <em>Type specifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_specifier()
   * @generated
   * @ordered
   */
  protected type_specifier type_specifier;

  /**
   * The cached value of the '{@link #getRec() <em>Rec</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRec()
   * @generated
   * @ordered
   */
  protected EList<specifier_qualifier_list> rec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected specifier_qualifier_listImpl()
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
    return MyDslPackage.Literals.SPECIFIER_QUALIFIER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public specifier_qualifier_list getSpecifier_qualifier_listx()
  {
    return specifier_qualifier_listx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpecifier_qualifier_listx(specifier_qualifier_list newSpecifier_qualifier_listx, NotificationChain msgs)
  {
    specifier_qualifier_list oldSpecifier_qualifier_listx = specifier_qualifier_listx;
    specifier_qualifier_listx = newSpecifier_qualifier_listx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX, oldSpecifier_qualifier_listx, newSpecifier_qualifier_listx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecifier_qualifier_listx(specifier_qualifier_list newSpecifier_qualifier_listx)
  {
    if (newSpecifier_qualifier_listx != specifier_qualifier_listx)
    {
      NotificationChain msgs = null;
      if (specifier_qualifier_listx != null)
        msgs = ((InternalEObject)specifier_qualifier_listx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX, null, msgs);
      if (newSpecifier_qualifier_listx != null)
        msgs = ((InternalEObject)newSpecifier_qualifier_listx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX, null, msgs);
      msgs = basicSetSpecifier_qualifier_listx(newSpecifier_qualifier_listx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX, newSpecifier_qualifier_listx, newSpecifier_qualifier_listx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declarator_list getStruct_declarator_list()
  {
    return struct_declarator_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStruct_declarator_list(struct_declarator_list newStruct_declarator_list, NotificationChain msgs)
  {
    struct_declarator_list oldStruct_declarator_list = struct_declarator_list;
    struct_declarator_list = newStruct_declarator_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST, oldStruct_declarator_list, newStruct_declarator_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct_declarator_list(struct_declarator_list newStruct_declarator_list)
  {
    if (newStruct_declarator_list != struct_declarator_list)
    {
      NotificationChain msgs = null;
      if (struct_declarator_list != null)
        msgs = ((InternalEObject)struct_declarator_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST, null, msgs);
      if (newStruct_declarator_list != null)
        msgs = ((InternalEObject)newStruct_declarator_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST, null, msgs);
      msgs = basicSetStruct_declarator_list(newStruct_declarator_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST, newStruct_declarator_list, newStruct_declarator_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_specifier getType_specifier()
  {
    return type_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_specifier(type_specifier newType_specifier, NotificationChain msgs)
  {
    type_specifier oldType_specifier = type_specifier;
    type_specifier = newType_specifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER, oldType_specifier, newType_specifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_specifier(type_specifier newType_specifier)
  {
    if (newType_specifier != type_specifier)
    {
      NotificationChain msgs = null;
      if (type_specifier != null)
        msgs = ((InternalEObject)type_specifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER, null, msgs);
      if (newType_specifier != null)
        msgs = ((InternalEObject)newType_specifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER, null, msgs);
      msgs = basicSetType_specifier(newType_specifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER, newType_specifier, newType_specifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<specifier_qualifier_list> getRec()
  {
    if (rec == null)
    {
      rec = new EObjectContainmentEList<specifier_qualifier_list>(specifier_qualifier_list.class, this, MyDslPackage.SPECIFIER_QUALIFIER_LIST__REC);
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
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX:
        return basicSetSpecifier_qualifier_listx(null, msgs);
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST:
        return basicSetStruct_declarator_list(null, msgs);
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER:
        return basicSetType_specifier(null, msgs);
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__REC:
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
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX:
        return getSpecifier_qualifier_listx();
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST:
        return getStruct_declarator_list();
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER:
        return getType_specifier();
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__REC:
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
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX:
        setSpecifier_qualifier_listx((specifier_qualifier_list)newValue);
        return;
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST:
        setStruct_declarator_list((struct_declarator_list)newValue);
        return;
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER:
        setType_specifier((type_specifier)newValue);
        return;
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__REC:
        getRec().clear();
        getRec().addAll((Collection<? extends specifier_qualifier_list>)newValue);
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
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX:
        setSpecifier_qualifier_listx((specifier_qualifier_list)null);
        return;
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST:
        setStruct_declarator_list((struct_declarator_list)null);
        return;
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER:
        setType_specifier((type_specifier)null);
        return;
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__REC:
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
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX:
        return specifier_qualifier_listx != null;
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST:
        return struct_declarator_list != null;
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER:
        return type_specifier != null;
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST__REC:
        return rec != null && !rec.isEmpty();
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
    if (baseClass == struct_declaration.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX: return MyDslPackage.STRUCT_DECLARATION__SPECIFIER_QUALIFIER_LISTX;
        case MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST: return MyDslPackage.STRUCT_DECLARATION__STRUCT_DECLARATOR_LIST;
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
    if (baseClass == struct_declaration.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.STRUCT_DECLARATION__SPECIFIER_QUALIFIER_LISTX: return MyDslPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LISTX;
        case MyDslPackage.STRUCT_DECLARATION__STRUCT_DECLARATOR_LIST: return MyDslPackage.SPECIFIER_QUALIFIER_LIST__STRUCT_DECLARATOR_LIST;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //specifier_qualifier_listImpl
