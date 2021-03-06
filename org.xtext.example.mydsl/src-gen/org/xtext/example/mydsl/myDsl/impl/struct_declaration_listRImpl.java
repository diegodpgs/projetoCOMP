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
import org.xtext.example.mydsl.myDsl.struct_declaration;
import org.xtext.example.mydsl.myDsl.struct_declaration_listR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>struct declaration list R</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.struct_declaration_listRImpl#getStruct_declaration <em>Struct declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.struct_declaration_listRImpl#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class struct_declaration_listRImpl extends MinimalEObjectImpl.Container implements struct_declaration_listR
{
  /**
   * The cached value of the '{@link #getStruct_declaration() <em>Struct declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct_declaration()
   * @generated
   * @ordered
   */
  protected struct_declaration struct_declaration;

  /**
   * The cached value of the '{@link #getRec() <em>Rec</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRec()
   * @generated
   * @ordered
   */
  protected EList<struct_declaration_listR> rec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected struct_declaration_listRImpl()
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
    return MyDslPackage.Literals.STRUCT_DECLARATION_LIST_R;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declaration getStruct_declaration()
  {
    return struct_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStruct_declaration(struct_declaration newStruct_declaration, NotificationChain msgs)
  {
    struct_declaration oldStruct_declaration = struct_declaration;
    struct_declaration = newStruct_declaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STRUCT_DECLARATION_LIST_R__STRUCT_DECLARATION, oldStruct_declaration, newStruct_declaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct_declaration(struct_declaration newStruct_declaration)
  {
    if (newStruct_declaration != struct_declaration)
    {
      NotificationChain msgs = null;
      if (struct_declaration != null)
        msgs = ((InternalEObject)struct_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STRUCT_DECLARATION_LIST_R__STRUCT_DECLARATION, null, msgs);
      if (newStruct_declaration != null)
        msgs = ((InternalEObject)newStruct_declaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STRUCT_DECLARATION_LIST_R__STRUCT_DECLARATION, null, msgs);
      msgs = basicSetStruct_declaration(newStruct_declaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STRUCT_DECLARATION_LIST_R__STRUCT_DECLARATION, newStruct_declaration, newStruct_declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<struct_declaration_listR> getRec()
  {
    if (rec == null)
    {
      rec = new EObjectContainmentEList<struct_declaration_listR>(struct_declaration_listR.class, this, MyDslPackage.STRUCT_DECLARATION_LIST_R__REC);
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
      case MyDslPackage.STRUCT_DECLARATION_LIST_R__STRUCT_DECLARATION:
        return basicSetStruct_declaration(null, msgs);
      case MyDslPackage.STRUCT_DECLARATION_LIST_R__REC:
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
      case MyDslPackage.STRUCT_DECLARATION_LIST_R__STRUCT_DECLARATION:
        return getStruct_declaration();
      case MyDslPackage.STRUCT_DECLARATION_LIST_R__REC:
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
      case MyDslPackage.STRUCT_DECLARATION_LIST_R__STRUCT_DECLARATION:
        setStruct_declaration((struct_declaration)newValue);
        return;
      case MyDslPackage.STRUCT_DECLARATION_LIST_R__REC:
        getRec().clear();
        getRec().addAll((Collection<? extends struct_declaration_listR>)newValue);
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
      case MyDslPackage.STRUCT_DECLARATION_LIST_R__STRUCT_DECLARATION:
        setStruct_declaration((struct_declaration)null);
        return;
      case MyDslPackage.STRUCT_DECLARATION_LIST_R__REC:
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
      case MyDslPackage.STRUCT_DECLARATION_LIST_R__STRUCT_DECLARATION:
        return struct_declaration != null;
      case MyDslPackage.STRUCT_DECLARATION_LIST_R__REC:
        return rec != null && !rec.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //struct_declaration_listRImpl
