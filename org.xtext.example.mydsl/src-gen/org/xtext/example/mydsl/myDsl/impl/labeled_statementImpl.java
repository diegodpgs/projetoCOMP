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
import org.xtext.example.mydsl.myDsl.labeled_statement;
import org.xtext.example.mydsl.myDsl.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>labeled statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.labeled_statementImpl#getConstant_expression <em>Constant expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.labeled_statementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.labeled_statementImpl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class labeled_statementImpl extends statementImpl implements labeled_statement
{
  /**
   * The cached value of the '{@link #getConstant_expression() <em>Constant expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant_expression()
   * @generated
   * @ordered
   */
  protected constant_expression constant_expression;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected statement statement;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected statement b;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected labeled_statementImpl()
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
    return MyDslPackage.Literals.LABELED_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_expression getConstant_expression()
  {
    return constant_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant_expression(constant_expression newConstant_expression, NotificationChain msgs)
  {
    constant_expression oldConstant_expression = constant_expression;
    constant_expression = newConstant_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__CONSTANT_EXPRESSION, oldConstant_expression, newConstant_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant_expression(constant_expression newConstant_expression)
  {
    if (newConstant_expression != constant_expression)
    {
      NotificationChain msgs = null;
      if (constant_expression != null)
        msgs = ((InternalEObject)constant_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LABELED_STATEMENT__CONSTANT_EXPRESSION, null, msgs);
      if (newConstant_expression != null)
        msgs = ((InternalEObject)newConstant_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LABELED_STATEMENT__CONSTANT_EXPRESSION, null, msgs);
      msgs = basicSetConstant_expression(newConstant_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__CONSTANT_EXPRESSION, newConstant_expression, newConstant_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(statement newStatement, NotificationChain msgs)
  {
    statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LABELED_STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LABELED_STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(statement newB, NotificationChain msgs)
  {
    statement oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(statement newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LABELED_STATEMENT__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LABELED_STATEMENT__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LABELED_STATEMENT__B, newB, newB));
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
      case MyDslPackage.LABELED_STATEMENT__CONSTANT_EXPRESSION:
        return basicSetConstant_expression(null, msgs);
      case MyDslPackage.LABELED_STATEMENT__STATEMENT:
        return basicSetStatement(null, msgs);
      case MyDslPackage.LABELED_STATEMENT__B:
        return basicSetB(null, msgs);
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
      case MyDslPackage.LABELED_STATEMENT__CONSTANT_EXPRESSION:
        return getConstant_expression();
      case MyDslPackage.LABELED_STATEMENT__STATEMENT:
        return getStatement();
      case MyDslPackage.LABELED_STATEMENT__B:
        return getB();
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
      case MyDslPackage.LABELED_STATEMENT__CONSTANT_EXPRESSION:
        setConstant_expression((constant_expression)newValue);
        return;
      case MyDslPackage.LABELED_STATEMENT__STATEMENT:
        setStatement((statement)newValue);
        return;
      case MyDslPackage.LABELED_STATEMENT__B:
        setB((statement)newValue);
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
      case MyDslPackage.LABELED_STATEMENT__CONSTANT_EXPRESSION:
        setConstant_expression((constant_expression)null);
        return;
      case MyDslPackage.LABELED_STATEMENT__STATEMENT:
        setStatement((statement)null);
        return;
      case MyDslPackage.LABELED_STATEMENT__B:
        setB((statement)null);
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
      case MyDslPackage.LABELED_STATEMENT__CONSTANT_EXPRESSION:
        return constant_expression != null;
      case MyDslPackage.LABELED_STATEMENT__STATEMENT:
        return statement != null;
      case MyDslPackage.LABELED_STATEMENT__B:
        return b != null;
    }
    return super.eIsSet(featureID);
  }

} //labeled_statementImpl