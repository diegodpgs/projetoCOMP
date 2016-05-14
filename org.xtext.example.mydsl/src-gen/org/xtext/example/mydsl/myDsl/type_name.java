/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_name#getSpecifier_qualifier_list <em>Specifier qualifier list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_name#getAd <em>Ad</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_name()
 * @model
 * @generated
 */
public interface type_name extends atomic_type_specifier
{
  /**
   * Returns the value of the '<em><b>Specifier qualifier list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifier qualifier list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifier qualifier list</em>' containment reference.
   * @see #setSpecifier_qualifier_list(specifier_qualifier_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_name_Specifier_qualifier_list()
   * @model containment="true"
   * @generated
   */
  specifier_qualifier_list getSpecifier_qualifier_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_name#getSpecifier_qualifier_list <em>Specifier qualifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specifier qualifier list</em>' containment reference.
   * @see #getSpecifier_qualifier_list()
   * @generated
   */
  void setSpecifier_qualifier_list(specifier_qualifier_list value);

  /**
   * Returns the value of the '<em><b>Ad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ad</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ad</em>' containment reference.
   * @see #setAd(abstract_declarator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_name_Ad()
   * @model containment="true"
   * @generated
   */
  abstract_declarator getAd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_name#getAd <em>Ad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ad</em>' containment reference.
   * @see #getAd()
   * @generated
   */
  void setAd(abstract_declarator value);

} // type_name
