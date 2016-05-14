/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type qualifier list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_qualifier_list#getType_qualifier <em>Type qualifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_qualifier_list#getType_qualifier_listR <em>Type qualifier list R</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier_list()
 * @model
 * @generated
 */
public interface type_qualifier_list extends pointer
{
  /**
   * Returns the value of the '<em><b>Type qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type qualifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type qualifier</em>' attribute.
   * @see #setType_qualifier(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier_list_Type_qualifier()
   * @model
   * @generated
   */
  String getType_qualifier();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_qualifier_list#getType_qualifier <em>Type qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type qualifier</em>' attribute.
   * @see #getType_qualifier()
   * @generated
   */
  void setType_qualifier(String value);

  /**
   * Returns the value of the '<em><b>Type qualifier list R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type qualifier list R</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type qualifier list R</em>' containment reference.
   * @see #setType_qualifier_listR(type_qualifier_listR)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier_list_Type_qualifier_listR()
   * @model containment="true"
   * @generated
   */
  type_qualifier_listR getType_qualifier_listR();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_qualifier_list#getType_qualifier_listR <em>Type qualifier list R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type qualifier list R</em>' containment reference.
   * @see #getType_qualifier_listR()
   * @generated
   */
  void setType_qualifier_listR(type_qualifier_listR value);

} // type_qualifier_list
