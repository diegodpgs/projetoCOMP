/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>multiplicative expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.multiplicative_expression#getCast_expression <em>Cast expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.multiplicative_expression#getMultiplicative_expressionR <em>Multiplicative expression R</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getmultiplicative_expression()
 * @model
 * @generated
 */
public interface multiplicative_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Cast expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cast expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cast expression</em>' containment reference.
   * @see #setCast_expression(cast_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getmultiplicative_expression_Cast_expression()
   * @model containment="true"
   * @generated
   */
  cast_expression getCast_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.multiplicative_expression#getCast_expression <em>Cast expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cast expression</em>' containment reference.
   * @see #getCast_expression()
   * @generated
   */
  void setCast_expression(cast_expression value);

  /**
   * Returns the value of the '<em><b>Multiplicative expression R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicative expression R</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicative expression R</em>' containment reference.
   * @see #setMultiplicative_expressionR(multiplicative_expressionR)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getmultiplicative_expression_Multiplicative_expressionR()
   * @model containment="true"
   * @generated
   */
  multiplicative_expressionR getMultiplicative_expressionR();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.multiplicative_expression#getMultiplicative_expressionR <em>Multiplicative expression R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicative expression R</em>' containment reference.
   * @see #getMultiplicative_expressionR()
   * @generated
   */
  void setMultiplicative_expressionR(multiplicative_expressionR value);

} // multiplicative_expression
