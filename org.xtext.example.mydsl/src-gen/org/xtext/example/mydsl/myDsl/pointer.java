/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.pointer#getType_qualifier_list <em>Type qualifier list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.pointer#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getpointer()
 * @model
 * @generated
 */
public interface pointer extends abstract_declarator
{
  /**
   * Returns the value of the '<em><b>Type qualifier list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type qualifier list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type qualifier list</em>' containment reference.
   * @see #setType_qualifier_list(type_qualifier_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getpointer_Type_qualifier_list()
   * @model containment="true"
   * @generated
   */
  type_qualifier_list getType_qualifier_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.pointer#getType_qualifier_list <em>Type qualifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type qualifier list</em>' containment reference.
   * @see #getType_qualifier_list()
   * @generated
   */
  void setType_qualifier_list(type_qualifier_list value);

  /**
   * Returns the value of the '<em><b>Rec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.pointer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rec</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getpointer_Rec()
   * @model containment="true"
   * @generated
   */
  EList<pointer> getRec();

} // pointer
