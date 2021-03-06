/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>assignment expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.assignment_expression#getUnary_expression <em>Unary expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.assignment_expression#getAssignment_operator <em>Assignment operator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.assignment_expression#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getassignment_expression()
 * @model
 * @generated
 */
public interface assignment_expression extends initializer
{
  /**
   * Returns the value of the '<em><b>Unary expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary expression</em>' containment reference.
   * @see #setUnary_expression(unary_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getassignment_expression_Unary_expression()
   * @model containment="true"
   * @generated
   */
  unary_expression getUnary_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.assignment_expression#getUnary_expression <em>Unary expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary expression</em>' containment reference.
   * @see #getUnary_expression()
   * @generated
   */
  void setUnary_expression(unary_expression value);

  /**
   * Returns the value of the '<em><b>Assignment operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment operator</em>' attribute.
   * @see #setAssignment_operator(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getassignment_expression_Assignment_operator()
   * @model
   * @generated
   */
  String getAssignment_operator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.assignment_expression#getAssignment_operator <em>Assignment operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment operator</em>' attribute.
   * @see #getAssignment_operator()
   * @generated
   */
  void setAssignment_operator(String value);

  /**
   * Returns the value of the '<em><b>Rec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.assignment_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rec</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getassignment_expression_Rec()
   * @model containment="true"
   * @generated
   */
  EList<assignment_expression> getRec();

} // assignment_expression
