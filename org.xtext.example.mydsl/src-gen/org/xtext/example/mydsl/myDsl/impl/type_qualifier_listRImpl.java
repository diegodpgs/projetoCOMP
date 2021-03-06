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
import org.xtext.example.mydsl.myDsl.type_qualifier_listR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type qualifier list R</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.type_qualifier_listRImpl#getType_qualifier <em>Type qualifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.type_qualifier_listRImpl#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class type_qualifier_listRImpl extends MinimalEObjectImpl.Container implements type_qualifier_listR
{
  /**
   * The default value of the '{@link #getType_qualifier() <em>Type qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_qualifier()
   * @generated
   * @ordered
   */
  protected static final String TYPE_QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType_qualifier() <em>Type qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_qualifier()
   * @generated
   * @ordered
   */
  protected String type_qualifier = TYPE_QUALIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getRec() <em>Rec</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRec()
   * @generated
   * @ordered
   */
  protected EList<type_qualifier_listR> rec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected type_qualifier_listRImpl()
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
    return MyDslPackage.Literals.TYPE_QUALIFIER_LIST_R;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType_qualifier()
  {
    return type_qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_qualifier(String newType_qualifier)
  {
    String oldType_qualifier = type_qualifier;
    type_qualifier = newType_qualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_QUALIFIER_LIST_R__TYPE_QUALIFIER, oldType_qualifier, type_qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<type_qualifier_listR> getRec()
  {
    if (rec == null)
    {
      rec = new EObjectContainmentEList<type_qualifier_listR>(type_qualifier_listR.class, this, MyDslPackage.TYPE_QUALIFIER_LIST_R__REC);
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
      case MyDslPackage.TYPE_QUALIFIER_LIST_R__REC:
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
      case MyDslPackage.TYPE_QUALIFIER_LIST_R__TYPE_QUALIFIER:
        return getType_qualifier();
      case MyDslPackage.TYPE_QUALIFIER_LIST_R__REC:
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
      case MyDslPackage.TYPE_QUALIFIER_LIST_R__TYPE_QUALIFIER:
        setType_qualifier((String)newValue);
        return;
      case MyDslPackage.TYPE_QUALIFIER_LIST_R__REC:
        getRec().clear();
        getRec().addAll((Collection<? extends type_qualifier_listR>)newValue);
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
      case MyDslPackage.TYPE_QUALIFIER_LIST_R__TYPE_QUALIFIER:
        setType_qualifier(TYPE_QUALIFIER_EDEFAULT);
        return;
      case MyDslPackage.TYPE_QUALIFIER_LIST_R__REC:
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
      case MyDslPackage.TYPE_QUALIFIER_LIST_R__TYPE_QUALIFIER:
        return TYPE_QUALIFIER_EDEFAULT == null ? type_qualifier != null : !TYPE_QUALIFIER_EDEFAULT.equals(type_qualifier);
      case MyDslPackage.TYPE_QUALIFIER_LIST_R__REC:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (Type_qualifier: ");
    result.append(type_qualifier);
    result.append(')');
    return result.toString();
  }

} //type_qualifier_listRImpl
