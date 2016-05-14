/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>block item list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.block_item_list#getBlock_item <em>Block item</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.block_item_list#getBlock_item_listR <em>Block item list R</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getblock_item_list()
 * @model
 * @generated
 */
public interface block_item_list extends compound_statement
{
  /**
   * Returns the value of the '<em><b>Block item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block item</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block item</em>' containment reference.
   * @see #setBlock_item(block_item)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getblock_item_list_Block_item()
   * @model containment="true"
   * @generated
   */
  block_item getBlock_item();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.block_item_list#getBlock_item <em>Block item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block item</em>' containment reference.
   * @see #getBlock_item()
   * @generated
   */
  void setBlock_item(block_item value);

  /**
   * Returns the value of the '<em><b>Block item list R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block item list R</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block item list R</em>' containment reference.
   * @see #setBlock_item_listR(block_item_listR)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getblock_item_list_Block_item_listR()
   * @model containment="true"
   * @generated
   */
  block_item_listR getBlock_item_listR();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.block_item_list#getBlock_item_listR <em>Block item list R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block item list R</em>' containment reference.
   * @see #getBlock_item_listR()
   * @generated
   */
  void setBlock_item_listR(block_item_listR value);

} // block_item_list