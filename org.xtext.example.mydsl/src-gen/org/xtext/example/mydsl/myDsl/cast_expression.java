/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>cast expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.cast_expression#getType_name <em>Type name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.cast_expression#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcast_expression()
 * @model
 * @generated
 */
public interface cast_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Type name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type name</em>' containment reference.
   * @see #setType_name(type_name)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcast_expression_Type_name()
   * @model containment="true"
   * @generated
   */
  type_name getType_name();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.cast_expression#getType_name <em>Type name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type name</em>' containment reference.
   * @see #getType_name()
   * @generated
   */
  void setType_name(type_name value);

  /**
   * Returns the value of the '<em><b>Rec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.cast_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rec</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcast_expression_Rec()
   * @model containment="true"
   * @generated
   */
  EList<cast_expression> getRec();

} // cast_expression
