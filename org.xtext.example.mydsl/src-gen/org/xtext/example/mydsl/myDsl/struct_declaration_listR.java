/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct declaration list R</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.struct_declaration_listR#getStruct_declaration <em>Struct declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.struct_declaration_listR#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_declaration_listR()
 * @model
 * @generated
 */
public interface struct_declaration_listR extends EObject
{
  /**
   * Returns the value of the '<em><b>Struct declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct declaration</em>' containment reference.
   * @see #setStruct_declaration(struct_declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_declaration_listR_Struct_declaration()
   * @model containment="true"
   * @generated
   */
  struct_declaration getStruct_declaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.struct_declaration_listR#getStruct_declaration <em>Struct declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct declaration</em>' containment reference.
   * @see #getStruct_declaration()
   * @generated
   */
  void setStruct_declaration(struct_declaration value);

  /**
   * Returns the value of the '<em><b>Rec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.struct_declaration_listR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rec</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_declaration_listR_Rec()
   * @model containment="true"
   * @generated
   */
  EList<struct_declaration_listR> getRec();

} // struct_declaration_listR
