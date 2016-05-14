/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>initializer list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.initializer_list#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.initializer_list#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.initializer_list#getIl <em>Il</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.initializer_list#getIlr <em>Ilr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinitializer_list()
 * @model
 * @generated
 */
public interface initializer_list extends initializer
{
  /**
   * Returns the value of the '<em><b>Designation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Designation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Designation</em>' containment reference.
   * @see #setDesignation(designation)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinitializer_list_Designation()
   * @model containment="true"
   * @generated
   */
  designation getDesignation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.initializer_list#getDesignation <em>Designation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Designation</em>' containment reference.
   * @see #getDesignation()
   * @generated
   */
  void setDesignation(designation value);

  /**
   * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initializer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initializer</em>' containment reference.
   * @see #setInitializer(initializer)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinitializer_list_Initializer()
   * @model containment="true"
   * @generated
   */
  initializer getInitializer();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.initializer_list#getInitializer <em>Initializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initializer</em>' containment reference.
   * @see #getInitializer()
   * @generated
   */
  void setInitializer(initializer value);

  /**
   * Returns the value of the '<em><b>Il</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Il</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Il</em>' containment reference.
   * @see #setIl(initializer_listR)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinitializer_list_Il()
   * @model containment="true"
   * @generated
   */
  initializer_listR getIl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.initializer_list#getIl <em>Il</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Il</em>' containment reference.
   * @see #getIl()
   * @generated
   */
  void setIl(initializer_listR value);

  /**
   * Returns the value of the '<em><b>Ilr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ilr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ilr</em>' containment reference.
   * @see #setIlr(initializer_listR)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinitializer_list_Ilr()
   * @model containment="true"
   * @generated
   */
  initializer_listR getIlr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.initializer_list#getIlr <em>Ilr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ilr</em>' containment reference.
   * @see #getIlr()
   * @generated
   */
  void setIlr(initializer_listR value);

} // initializer_list