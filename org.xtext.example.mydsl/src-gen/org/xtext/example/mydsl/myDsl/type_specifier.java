/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_specifier#getDs <em>Ds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_specifier()
 * @model
 * @generated
 */
public interface type_specifier extends declaration_specifiers
{
  /**
   * Returns the value of the '<em><b>Ds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ds</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ds</em>' containment reference.
   * @see #setDs(declaration_specifiers)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_specifier_Ds()
   * @model containment="true"
   * @generated
   */
  declaration_specifiers getDs();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_specifier#getDs <em>Ds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ds</em>' containment reference.
   * @see #getDs()
   * @generated
   */
  void setDs(declaration_specifiers value);

} // type_specifier
