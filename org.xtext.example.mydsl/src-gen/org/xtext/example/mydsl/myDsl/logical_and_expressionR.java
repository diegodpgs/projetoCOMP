/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>logical and expression R</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.logical_and_expressionR#getInclusive_or_expression <em>Inclusive or expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.logical_and_expressionR#getRec <em>Rec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getlogical_and_expressionR()
 * @model
 * @generated
 */
public interface logical_and_expressionR extends EObject
{
  /**
   * Returns the value of the '<em><b>Inclusive or expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inclusive or expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inclusive or expression</em>' containment reference.
   * @see #setInclusive_or_expression(inclusive_or_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getlogical_and_expressionR_Inclusive_or_expression()
   * @model containment="true"
   * @generated
   */
  inclusive_or_expression getInclusive_or_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.logical_and_expressionR#getInclusive_or_expression <em>Inclusive or expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inclusive or expression</em>' containment reference.
   * @see #getInclusive_or_expression()
   * @generated
   */
  void setInclusive_or_expression(inclusive_or_expression value);

  /**
   * Returns the value of the '<em><b>Rec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.logical_and_expressionR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rec</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getlogical_and_expressionR_Rec()
   * @model containment="true"
   * @generated
   */
  EList<logical_and_expressionR> getRec();

} // logical_and_expressionR