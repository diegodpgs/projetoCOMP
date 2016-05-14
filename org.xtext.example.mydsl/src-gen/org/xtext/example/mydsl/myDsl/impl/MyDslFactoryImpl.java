/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.TRANSLATION_UNIT: return createtranslation_unit();
      case MyDslPackage.TRANSLATION_UNIT_R: return createtranslation_unitR();
      case MyDslPackage.EXTERNAL_DECLARATION: return createexternal_declaration();
      case MyDslPackage.FUNCTION_DEFINITION: return createfunction_definition();
      case MyDslPackage.DECLARATOR: return createdeclarator();
      case MyDslPackage.TYPE_QUALIFIER_LIST: return createtype_qualifier_list();
      case MyDslPackage.TYPE_QUALIFIER_LIST_R: return createtype_qualifier_listR();
      case MyDslPackage.DIRECT_DECLARATOR: return createdirect_declarator();
      case MyDslPackage.DIRECT_DECLARATOR_R: return createdirect_declaratorR();
      case MyDslPackage.PARAMETER_TYPE_LIST: return createparameter_type_list();
      case MyDslPackage.IDENTIFIER_LIST: return createidentifier_list();
      case MyDslPackage.IDENTIFIER_LIST_R: return createidentifier_listR();
      case MyDslPackage.PARAMETER_LIST: return createparameter_list();
      case MyDslPackage.PARAMETER_LIST_R: return createparameter_listR();
      case MyDslPackage.PARAMETER_DECLARATION: return createparameter_declaration();
      case MyDslPackage.ABSTRACT_DECLARATOR: return createabstract_declarator();
      case MyDslPackage.DECLARATION_LIST: return createdeclaration_list();
      case MyDslPackage.DECLARATION_LIST_R: return createdeclaration_listR();
      case MyDslPackage.COMPOUND_STATEMENT: return createcompound_statement();
      case MyDslPackage.BLOCK_ITEM_LIST: return createblock_item_list();
      case MyDslPackage.BLOCK_ITEM_LIST_R: return createblock_item_listR();
      case MyDslPackage.BLOCK_ITEM: return createblock_item();
      case MyDslPackage.STATEMENT: return createstatement();
      case MyDslPackage.JUMP_STATEMENT: return createjump_statement();
      case MyDslPackage.LABELED_STATEMENT: return createlabeled_statement();
      case MyDslPackage.ITERATION_STATEMENT: return createiteration_statement();
      case MyDslPackage.DECLARATION: return createdeclaration();
      case MyDslPackage.INIT_DECLARATOR_LIST: return createinit_declarator_list();
      case MyDslPackage.INIT_DECLARATOR: return createinit_declarator();
      case MyDslPackage.INIT_DECLARATOR_LIST_R: return createinit_declarator_listR();
      case MyDslPackage.DECLARATION_SPECIFIERS: return createdeclaration_specifiers();
      case MyDslPackage.SELECTION_STATEMENT: return createselection_statement();
      case MyDslPackage.EXPRESSION_STATEMENT: return createexpression_statement();
      case MyDslPackage.EXPRESSION: return createexpression();
      case MyDslPackage.EXPRESSION_R: return createexpressionR();
      case MyDslPackage.CONDITIONAL_EXPRESSION: return createconditional_expression();
      case MyDslPackage.LOGICAL_OR_EXPRESSION: return createlogical_or_expression();
      case MyDslPackage.LOGICAL_OR_EXPRESSION_R: return createlogical_or_expressionR();
      case MyDslPackage.LOGICAL_AND_EXPRESSION: return createlogical_and_expression();
      case MyDslPackage.LOGICAL_AND_EXPRESSION_R: return createlogical_and_expressionR();
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION: return createinclusive_or_expression();
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION_R: return createinclusive_or_expressionR();
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION: return createexclusive_or_expression();
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_R: return createexclusive_or_expressionR();
      case MyDslPackage.AND_EXPRESSION_R: return createand_expressionR();
      case MyDslPackage.AND_EXPRESSION: return createand_expression();
      case MyDslPackage.EQUALITY_EXPRESSION: return createequality_expression();
      case MyDslPackage.EQUALITY_EXPRESSION_R: return createequality_expressionR();
      case MyDslPackage.RELATIONAL_EXPRESSION: return createrelational_expression();
      case MyDslPackage.RELATIONAL_EXPRESSION_R: return createrelational_expressionR();
      case MyDslPackage.SHIFT_EXPRESSION: return createshift_expression();
      case MyDslPackage.SHIFT_EXPRESSION_R: return createshift_expressionR();
      case MyDslPackage.ADDITIVE_EXPRESSION: return createadditive_expression();
      case MyDslPackage.ADDITIVE_EXPRESSION_R: return createadditive_expressionR();
      case MyDslPackage.MULTIPLICATIVE_EXPRESSION_R: return createmultiplicative_expressionR();
      case MyDslPackage.MULTIPLICATIVE_EXPRESSION: return createmultiplicative_expression();
      case MyDslPackage.ASSIGNMENT_EXPRESSION: return createassignment_expression();
      case MyDslPackage.CAST_EXPRESSION: return createcast_expression();
      case MyDslPackage.UNARY_EXPRESSION: return createunary_expression();
      case MyDslPackage.POSTFIX_EXPRESSION: return createpostfix_expression();
      case MyDslPackage.INITIALIZER: return createinitializer();
      case MyDslPackage.INITIALIZER_LIST: return createinitializer_list();
      case MyDslPackage.INITIALIZER_LIST_R: return createinitializer_listR();
      case MyDslPackage.DESIGNATION: return createdesignation();
      case MyDslPackage.DESIGNATOR_LIST: return createdesignator_list();
      case MyDslPackage.DESIGNATOR_LIST_R: return createdesignator_listR();
      case MyDslPackage.DESIGNATOR: return createdesignator();
      case MyDslPackage.CONSTANT_EXPRESSION: return createconstant_expression();
      case MyDslPackage.TYPE_NAME: return createtype_name();
      case MyDslPackage.SPECIFIER_QUALIFIER_LIST: return createspecifier_qualifier_list();
      case MyDslPackage.STRUCT_DECLARATOR_LIST: return createstruct_declarator_list();
      case MyDslPackage.STRUCT_DECLARATION_LIST: return createstruct_declaration_list();
      case MyDslPackage.STRUCT_DECLARATION_LIST_R: return createstruct_declaration_listR();
      case MyDslPackage.STRUCT_DECLARATION: return createstruct_declaration();
      case MyDslPackage.STRUCT_DECLARATOR_LIST_R: return createstruct_declarator_listR();
      case MyDslPackage.STRUCT_DECLARATOR: return createstruct_declarator();
      case MyDslPackage.STATIC_ASSERT_DECLARATION: return createstatic_assert_declaration();
      case MyDslPackage.STRUCT_OR_UNION_SPECIFIER: return createstruct_or_union_specifier();
      case MyDslPackage.ATOMIC_TYPE_SPECIFIER: return createatomic_type_specifier();
      case MyDslPackage.POSTFIX_EXPRESSION_R: return createpostfix_expressionR();
      case MyDslPackage.ARGUMENT_EXPRESSION_LIST: return createargument_expression_list();
      case MyDslPackage.ARGUMENT_EXPRESSION_LIST_R: return createargument_expression_listR();
      case MyDslPackage.PRIMARY_EXPRESSION: return createprimary_expression();
      case MyDslPackage.POINTER: return createpointer();
      case MyDslPackage.IDENTIFIER: return createIDENTIFIER();
      case MyDslPackage.TYPE_SPECIFIER: return createtype_specifier();
      case MyDslPackage.STRING_C: return createStringC();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public translation_unit createtranslation_unit()
  {
    translation_unitImpl translation_unit = new translation_unitImpl();
    return translation_unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public translation_unitR createtranslation_unitR()
  {
    translation_unitRImpl translation_unitR = new translation_unitRImpl();
    return translation_unitR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public external_declaration createexternal_declaration()
  {
    external_declarationImpl external_declaration = new external_declarationImpl();
    return external_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_definition createfunction_definition()
  {
    function_definitionImpl function_definition = new function_definitionImpl();
    return function_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declarator createdeclarator()
  {
    declaratorImpl declarator = new declaratorImpl();
    return declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_qualifier_list createtype_qualifier_list()
  {
    type_qualifier_listImpl type_qualifier_list = new type_qualifier_listImpl();
    return type_qualifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_qualifier_listR createtype_qualifier_listR()
  {
    type_qualifier_listRImpl type_qualifier_listR = new type_qualifier_listRImpl();
    return type_qualifier_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public direct_declarator createdirect_declarator()
  {
    direct_declaratorImpl direct_declarator = new direct_declaratorImpl();
    return direct_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public direct_declaratorR createdirect_declaratorR()
  {
    direct_declaratorRImpl direct_declaratorR = new direct_declaratorRImpl();
    return direct_declaratorR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_type_list createparameter_type_list()
  {
    parameter_type_listImpl parameter_type_list = new parameter_type_listImpl();
    return parameter_type_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier_list createidentifier_list()
  {
    identifier_listImpl identifier_list = new identifier_listImpl();
    return identifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier_listR createidentifier_listR()
  {
    identifier_listRImpl identifier_listR = new identifier_listRImpl();
    return identifier_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_list createparameter_list()
  {
    parameter_listImpl parameter_list = new parameter_listImpl();
    return parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_listR createparameter_listR()
  {
    parameter_listRImpl parameter_listR = new parameter_listRImpl();
    return parameter_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_declaration createparameter_declaration()
  {
    parameter_declarationImpl parameter_declaration = new parameter_declarationImpl();
    return parameter_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public abstract_declarator createabstract_declarator()
  {
    abstract_declaratorImpl abstract_declarator = new abstract_declaratorImpl();
    return abstract_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_list createdeclaration_list()
  {
    declaration_listImpl declaration_list = new declaration_listImpl();
    return declaration_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_listR createdeclaration_listR()
  {
    declaration_listRImpl declaration_listR = new declaration_listRImpl();
    return declaration_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compound_statement createcompound_statement()
  {
    compound_statementImpl compound_statement = new compound_statementImpl();
    return compound_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block_item_list createblock_item_list()
  {
    block_item_listImpl block_item_list = new block_item_listImpl();
    return block_item_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block_item_listR createblock_item_listR()
  {
    block_item_listRImpl block_item_listR = new block_item_listRImpl();
    return block_item_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block_item createblock_item()
  {
    block_itemImpl block_item = new block_itemImpl();
    return block_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jump_statement createjump_statement()
  {
    jump_statementImpl jump_statement = new jump_statementImpl();
    return jump_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public labeled_statement createlabeled_statement()
  {
    labeled_statementImpl labeled_statement = new labeled_statementImpl();
    return labeled_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iteration_statement createiteration_statement()
  {
    iteration_statementImpl iteration_statement = new iteration_statementImpl();
    return iteration_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration createdeclaration()
  {
    declarationImpl declaration = new declarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public init_declarator_list createinit_declarator_list()
  {
    init_declarator_listImpl init_declarator_list = new init_declarator_listImpl();
    return init_declarator_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public init_declarator createinit_declarator()
  {
    init_declaratorImpl init_declarator = new init_declaratorImpl();
    return init_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public init_declarator_listR createinit_declarator_listR()
  {
    init_declarator_listRImpl init_declarator_listR = new init_declarator_listRImpl();
    return init_declarator_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_specifiers createdeclaration_specifiers()
  {
    declaration_specifiersImpl declaration_specifiers = new declaration_specifiersImpl();
    return declaration_specifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selection_statement createselection_statement()
  {
    selection_statementImpl selection_statement = new selection_statementImpl();
    return selection_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_statement createexpression_statement()
  {
    expression_statementImpl expression_statement = new expression_statementImpl();
    return expression_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expressionR createexpressionR()
  {
    expressionRImpl expressionR = new expressionRImpl();
    return expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditional_expression createconditional_expression()
  {
    conditional_expressionImpl conditional_expression = new conditional_expressionImpl();
    return conditional_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_or_expression createlogical_or_expression()
  {
    logical_or_expressionImpl logical_or_expression = new logical_or_expressionImpl();
    return logical_or_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_or_expressionR createlogical_or_expressionR()
  {
    logical_or_expressionRImpl logical_or_expressionR = new logical_or_expressionRImpl();
    return logical_or_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_and_expression createlogical_and_expression()
  {
    logical_and_expressionImpl logical_and_expression = new logical_and_expressionImpl();
    return logical_and_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_and_expressionR createlogical_and_expressionR()
  {
    logical_and_expressionRImpl logical_and_expressionR = new logical_and_expressionRImpl();
    return logical_and_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public inclusive_or_expression createinclusive_or_expression()
  {
    inclusive_or_expressionImpl inclusive_or_expression = new inclusive_or_expressionImpl();
    return inclusive_or_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public inclusive_or_expressionR createinclusive_or_expressionR()
  {
    inclusive_or_expressionRImpl inclusive_or_expressionR = new inclusive_or_expressionRImpl();
    return inclusive_or_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exclusive_or_expression createexclusive_or_expression()
  {
    exclusive_or_expressionImpl exclusive_or_expression = new exclusive_or_expressionImpl();
    return exclusive_or_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exclusive_or_expressionR createexclusive_or_expressionR()
  {
    exclusive_or_expressionRImpl exclusive_or_expressionR = new exclusive_or_expressionRImpl();
    return exclusive_or_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public and_expressionR createand_expressionR()
  {
    and_expressionRImpl and_expressionR = new and_expressionRImpl();
    return and_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public and_expression createand_expression()
  {
    and_expressionImpl and_expression = new and_expressionImpl();
    return and_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public equality_expression createequality_expression()
  {
    equality_expressionImpl equality_expression = new equality_expressionImpl();
    return equality_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public equality_expressionR createequality_expressionR()
  {
    equality_expressionRImpl equality_expressionR = new equality_expressionRImpl();
    return equality_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public relational_expression createrelational_expression()
  {
    relational_expressionImpl relational_expression = new relational_expressionImpl();
    return relational_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public relational_expressionR createrelational_expressionR()
  {
    relational_expressionRImpl relational_expressionR = new relational_expressionRImpl();
    return relational_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public shift_expression createshift_expression()
  {
    shift_expressionImpl shift_expression = new shift_expressionImpl();
    return shift_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public shift_expressionR createshift_expressionR()
  {
    shift_expressionRImpl shift_expressionR = new shift_expressionRImpl();
    return shift_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public additive_expression createadditive_expression()
  {
    additive_expressionImpl additive_expression = new additive_expressionImpl();
    return additive_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public additive_expressionR createadditive_expressionR()
  {
    additive_expressionRImpl additive_expressionR = new additive_expressionRImpl();
    return additive_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public multiplicative_expressionR createmultiplicative_expressionR()
  {
    multiplicative_expressionRImpl multiplicative_expressionR = new multiplicative_expressionRImpl();
    return multiplicative_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public multiplicative_expression createmultiplicative_expression()
  {
    multiplicative_expressionImpl multiplicative_expression = new multiplicative_expressionImpl();
    return multiplicative_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_expression createassignment_expression()
  {
    assignment_expressionImpl assignment_expression = new assignment_expressionImpl();
    return assignment_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public cast_expression createcast_expression()
  {
    cast_expressionImpl cast_expression = new cast_expressionImpl();
    return cast_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unary_expression createunary_expression()
  {
    unary_expressionImpl unary_expression = new unary_expressionImpl();
    return unary_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public postfix_expression createpostfix_expression()
  {
    postfix_expressionImpl postfix_expression = new postfix_expressionImpl();
    return postfix_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public initializer createinitializer()
  {
    initializerImpl initializer = new initializerImpl();
    return initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public initializer_list createinitializer_list()
  {
    initializer_listImpl initializer_list = new initializer_listImpl();
    return initializer_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public initializer_listR createinitializer_listR()
  {
    initializer_listRImpl initializer_listR = new initializer_listRImpl();
    return initializer_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public designation createdesignation()
  {
    designationImpl designation = new designationImpl();
    return designation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public designator_list createdesignator_list()
  {
    designator_listImpl designator_list = new designator_listImpl();
    return designator_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public designator_listR createdesignator_listR()
  {
    designator_listRImpl designator_listR = new designator_listRImpl();
    return designator_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public designator createdesignator()
  {
    designatorImpl designator = new designatorImpl();
    return designator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_expression createconstant_expression()
  {
    constant_expressionImpl constant_expression = new constant_expressionImpl();
    return constant_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_name createtype_name()
  {
    type_nameImpl type_name = new type_nameImpl();
    return type_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public specifier_qualifier_list createspecifier_qualifier_list()
  {
    specifier_qualifier_listImpl specifier_qualifier_list = new specifier_qualifier_listImpl();
    return specifier_qualifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declarator_list createstruct_declarator_list()
  {
    struct_declarator_listImpl struct_declarator_list = new struct_declarator_listImpl();
    return struct_declarator_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declaration_list createstruct_declaration_list()
  {
    struct_declaration_listImpl struct_declaration_list = new struct_declaration_listImpl();
    return struct_declaration_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declaration_listR createstruct_declaration_listR()
  {
    struct_declaration_listRImpl struct_declaration_listR = new struct_declaration_listRImpl();
    return struct_declaration_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declaration createstruct_declaration()
  {
    struct_declarationImpl struct_declaration = new struct_declarationImpl();
    return struct_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declarator_listR createstruct_declarator_listR()
  {
    struct_declarator_listRImpl struct_declarator_listR = new struct_declarator_listRImpl();
    return struct_declarator_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declarator createstruct_declarator()
  {
    struct_declaratorImpl struct_declarator = new struct_declaratorImpl();
    return struct_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static_assert_declaration createstatic_assert_declaration()
  {
    static_assert_declarationImpl static_assert_declaration = new static_assert_declarationImpl();
    return static_assert_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_or_union_specifier createstruct_or_union_specifier()
  {
    struct_or_union_specifierImpl struct_or_union_specifier = new struct_or_union_specifierImpl();
    return struct_or_union_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public atomic_type_specifier createatomic_type_specifier()
  {
    atomic_type_specifierImpl atomic_type_specifier = new atomic_type_specifierImpl();
    return atomic_type_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public postfix_expressionR createpostfix_expressionR()
  {
    postfix_expressionRImpl postfix_expressionR = new postfix_expressionRImpl();
    return postfix_expressionR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public argument_expression_list createargument_expression_list()
  {
    argument_expression_listImpl argument_expression_list = new argument_expression_listImpl();
    return argument_expression_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public argument_expression_listR createargument_expression_listR()
  {
    argument_expression_listRImpl argument_expression_listR = new argument_expression_listRImpl();
    return argument_expression_listR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primary_expression createprimary_expression()
  {
    primary_expressionImpl primary_expression = new primary_expressionImpl();
    return primary_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointer createpointer()
  {
    pointerImpl pointer = new pointerImpl();
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDENTIFIER createIDENTIFIER()
  {
    IDENTIFIERImpl identifier = new IDENTIFIERImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_specifier createtype_specifier()
  {
    type_specifierImpl type_specifier = new type_specifierImpl();
    return type_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringC createStringC()
  {
    StringCImpl stringC = new StringCImpl();
    return stringC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl