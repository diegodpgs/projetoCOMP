/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression R</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.expressionR#getAssignment_expression <em>Assignment expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.expressionR#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getexpressionR()
 * @model
 * @generated
 */
public interface expressionR extends EObject
{
  /**
   * Returns the value of the '<em><b>Assignment expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment expression</em>' containment reference.
   * @see #setAssignment_expression(assignment_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getexpressionR_Assignment_expression()
   * @model containment="true"
   * @generated
   */
  assignment_expression getAssignment_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.expressionR#getAssignment_expression <em>Assignment expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment expression</em>' containment reference.
   * @see #getAssignment_expression()
   * @generated
   */
  void setAssignment_expression(assignment_expression value);

  /**
   * Returns the value of the '<em><b>Rec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.expressionR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rec</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getexpressionR_Rec()
   * @model containment="true"
   * @generated
   */
  EList<expressionR> getRec();

} // expressionR