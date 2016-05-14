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
import org.xtext.example.mydsl.myDsl.block_item;
import org.xtext.example.mydsl.myDsl.constant_expression;
import org.xtext.example.mydsl.myDsl.declaration;
import org.xtext.example.mydsl.myDsl.declaration_specifiers;
import org.xtext.example.mydsl.myDsl.declarator;
import org.xtext.example.mydsl.myDsl.external_declaration;
import org.xtext.example.mydsl.myDsl.init_declarator_list;
import org.xtext.example.mydsl.myDsl.specifier_qualifier_list;
import org.xtext.example.mydsl.myDsl.static_assert_declaration;
import org.xtext.example.mydsl.myDsl.struct_declaration;
import org.xtext.example.mydsl.myDsl.struct_declarator;
import org.xtext.example.mydsl.myDsl.struct_declarator_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.constant_expressionImpl#getDeclaratorx <em>Declaratorx</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.constant_expressionImpl#getConstant_expression1 <em>Constant expression1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.constant_expressionImpl#getDeclaration_specifiers <em>Declaration specifiers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.constant_expressionImpl#getInit_declarator_list <em>Init declarator list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.constant_expressionImpl#getSpecifier_qualifier_listx <em>Specifier qualifier listx</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.constant_expressionImpl#getStruct_declarator_list <em>Struct declarator list</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constant_expressionImpl extends designatorImpl implements constant_expression
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
   * The cached value of the '{@link #getDeclaration_specifiers() <em>Declaration specifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration_specifiers()
   * @generated
   * @ordered
   */
  protected declaration_specifiers declaration_specifiers;

  /**
   * The cached value of the '{@link #getInit_declarator_list() <em>Init declarator list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit_declarator_list()
   * @generated
   * @ordered
   */
  protected init_declarator_list init_declarator_list;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constant_expressionImpl()
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
    return MyDslPackage.Literals.CONSTANT_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX, oldDeclaratorx, newDeclaratorx);
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
        msgs = ((InternalEObject)declaratorx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX, null, msgs);
      if (newDeclaratorx != null)
        msgs = ((InternalEObject)newDeclaratorx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX, null, msgs);
      msgs = basicSetDeclaratorx(newDeclaratorx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX, newDeclaratorx, newDeclaratorx));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1, oldConstant_expression1, newConstant_expression1);
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
        msgs = ((InternalEObject)constant_expression1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1, null, msgs);
      if (newConstant_expression1 != null)
        msgs = ((InternalEObject)newConstant_expression1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1, null, msgs);
      msgs = basicSetConstant_expression1(newConstant_expression1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1, newConstant_expression1, newConstant_expression1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_specifiers getDeclaration_specifiers()
  {
    return declaration_specifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration_specifiers(declaration_specifiers newDeclaration_specifiers, NotificationChain msgs)
  {
    declaration_specifiers oldDeclaration_specifiers = declaration_specifiers;
    declaration_specifiers = newDeclaration_specifiers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS, oldDeclaration_specifiers, newDeclaration_specifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration_specifiers(declaration_specifiers newDeclaration_specifiers)
  {
    if (newDeclaration_specifiers != declaration_specifiers)
    {
      NotificationChain msgs = null;
      if (declaration_specifiers != null)
        msgs = ((InternalEObject)declaration_specifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS, null, msgs);
      if (newDeclaration_specifiers != null)
        msgs = ((InternalEObject)newDeclaration_specifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS, null, msgs);
      msgs = basicSetDeclaration_specifiers(newDeclaration_specifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS, newDeclaration_specifiers, newDeclaration_specifiers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public init_declarator_list getInit_declarator_list()
  {
    return init_declarator_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit_declarator_list(init_declarator_list newInit_declarator_list, NotificationChain msgs)
  {
    init_declarator_list oldInit_declarator_list = init_declarator_list;
    init_declarator_list = newInit_declarator_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST, oldInit_declarator_list, newInit_declarator_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit_declarator_list(init_declarator_list newInit_declarator_list)
  {
    if (newInit_declarator_list != init_declarator_list)
    {
      NotificationChain msgs = null;
      if (init_declarator_list != null)
        msgs = ((InternalEObject)init_declarator_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST, null, msgs);
      if (newInit_declarator_list != null)
        msgs = ((InternalEObject)newInit_declarator_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST, null, msgs);
      msgs = basicSetInit_declarator_list(newInit_declarator_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST, newInit_declarator_list, newInit_declarator_list));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX, oldSpecifier_qualifier_listx, newSpecifier_qualifier_listx);
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
        msgs = ((InternalEObject)specifier_qualifier_listx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX, null, msgs);
      if (newSpecifier_qualifier_listx != null)
        msgs = ((InternalEObject)newSpecifier_qualifier_listx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX, null, msgs);
      msgs = basicSetSpecifier_qualifier_listx(newSpecifier_qualifier_listx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX, newSpecifier_qualifier_listx, newSpecifier_qualifier_listx));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST, oldStruct_declarator_list, newStruct_declarator_list);
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
        msgs = ((InternalEObject)struct_declarator_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST, null, msgs);
      if (newStruct_declarator_list != null)
        msgs = ((InternalEObject)newStruct_declarator_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST, null, msgs);
      msgs = basicSetStruct_declarator_list(newStruct_declarator_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST, newStruct_declarator_list, newStruct_declarator_list));
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
      case MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX:
        return basicSetDeclaratorx(null, msgs);
      case MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1:
        return basicSetConstant_expression1(null, msgs);
      case MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS:
        return basicSetDeclaration_specifiers(null, msgs);
      case MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST:
        return basicSetInit_declarator_list(null, msgs);
      case MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX:
        return basicSetSpecifier_qualifier_listx(null, msgs);
      case MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST:
        return basicSetStruct_declarator_list(null, msgs);
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
      case MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX:
        return getDeclaratorx();
      case MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1:
        return getConstant_expression1();
      case MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS:
        return getDeclaration_specifiers();
      case MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST:
        return getInit_declarator_list();
      case MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX:
        return getSpecifier_qualifier_listx();
      case MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST:
        return getStruct_declarator_list();
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
      case MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX:
        setDeclaratorx((declarator)newValue);
        return;
      case MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1:
        setConstant_expression1((constant_expression)newValue);
        return;
      case MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS:
        setDeclaration_specifiers((declaration_specifiers)newValue);
        return;
      case MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST:
        setInit_declarator_list((init_declarator_list)newValue);
        return;
      case MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX:
        setSpecifier_qualifier_listx((specifier_qualifier_list)newValue);
        return;
      case MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST:
        setStruct_declarator_list((struct_declarator_list)newValue);
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
      case MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX:
        setDeclaratorx((declarator)null);
        return;
      case MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1:
        setConstant_expression1((constant_expression)null);
        return;
      case MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS:
        setDeclaration_specifiers((declaration_specifiers)null);
        return;
      case MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST:
        setInit_declarator_list((init_declarator_list)null);
        return;
      case MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX:
        setSpecifier_qualifier_listx((specifier_qualifier_list)null);
        return;
      case MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST:
        setStruct_declarator_list((struct_declarator_list)null);
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
      case MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX:
        return declaratorx != null;
      case MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1:
        return constant_expression1 != null;
      case MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS:
        return declaration_specifiers != null;
      case MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST:
        return init_declarator_list != null;
      case MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX:
        return specifier_qualifier_listx != null;
      case MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST:
        return struct_declarator_list != null;
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
        case MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX: return MyDslPackage.STRUCT_DECLARATOR__DECLARATORX;
        case MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1: return MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION1;
        default: return -1;
      }
    }
    if (baseClass == external_declaration.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS: return MyDslPackage.EXTERNAL_DECLARATION__DECLARATION_SPECIFIERS;
        default: return -1;
      }
    }
    if (baseClass == block_item.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == declaration.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST: return MyDslPackage.DECLARATION__INIT_DECLARATOR_LIST;
        default: return -1;
      }
    }
    if (baseClass == struct_declaration.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX: return MyDslPackage.STRUCT_DECLARATION__SPECIFIER_QUALIFIER_LISTX;
        case MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST: return MyDslPackage.STRUCT_DECLARATION__STRUCT_DECLARATOR_LIST;
        default: return -1;
      }
    }
    if (baseClass == static_assert_declaration.class)
    {
      switch (derivedFeatureID)
      {
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
        case MyDslPackage.STRUCT_DECLARATOR__DECLARATORX: return MyDslPackage.CONSTANT_EXPRESSION__DECLARATORX;
        case MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION1: return MyDslPackage.CONSTANT_EXPRESSION__CONSTANT_EXPRESSION1;
        default: return -1;
      }
    }
    if (baseClass == external_declaration.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.EXTERNAL_DECLARATION__DECLARATION_SPECIFIERS: return MyDslPackage.CONSTANT_EXPRESSION__DECLARATION_SPECIFIERS;
        default: return -1;
      }
    }
    if (baseClass == block_item.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == declaration.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.DECLARATION__INIT_DECLARATOR_LIST: return MyDslPackage.CONSTANT_EXPRESSION__INIT_DECLARATOR_LIST;
        default: return -1;
      }
    }
    if (baseClass == struct_declaration.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.STRUCT_DECLARATION__SPECIFIER_QUALIFIER_LISTX: return MyDslPackage.CONSTANT_EXPRESSION__SPECIFIER_QUALIFIER_LISTX;
        case MyDslPackage.STRUCT_DECLARATION__STRUCT_DECLARATOR_LIST: return MyDslPackage.CONSTANT_EXPRESSION__STRUCT_DECLARATOR_LIST;
        default: return -1;
      }
    }
    if (baseClass == static_assert_declaration.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //constant_expressionImpl
