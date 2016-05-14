/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.struct_declaration#getSpecifier_qualifier_listx <em>Specifier qualifier listx</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.struct_declaration#getStruct_declarator_list <em>Struct declarator list</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_declaration()
 * @model
 * @generated
 */
public interface struct_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Specifier qualifier listx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifier qualifier listx</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifier qualifier listx</em>' containment reference.
   * @see #setSpecifier_qualifier_listx(specifier_qualifier_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_declaration_Specifier_qualifier_listx()
   * @model containment="true"
   * @generated
   */
  specifier_qualifier_list getSpecifier_qualifier_listx();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.struct_declaration#getSpecifier_qualifier_listx <em>Specifier qualifier listx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specifier qualifier listx</em>' containment reference.
   * @see #getSpecifier_qualifier_listx()
   * @generated
   */
  void setSpecifier_qualifier_listx(specifier_qualifier_list value);

  /**
   * Returns the value of the '<em><b>Struct declarator list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct declarator list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct declarator list</em>' containment reference.
   * @see #setStruct_declarator_list(struct_declarator_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_declaration_Struct_declarator_list()
   * @model containment="true"
   * @generated
   */
  struct_declarator_list getStruct_declarator_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.struct_declaration#getStruct_declarator_list <em>Struct declarator list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct declarator list</em>' containment reference.
   * @see #getStruct_declarator_list()
   * @generated
   */
  void setStruct_declarator_list(struct_declarator_list value);

} // struct_declaration