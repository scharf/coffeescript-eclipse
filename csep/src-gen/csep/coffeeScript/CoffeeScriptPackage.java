/**
 */
package csep.coffeeScript;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see csep.coffeeScript.CoffeeScriptFactory
 * @model kind="package"
 * @generated
 */
public interface CoffeeScriptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "coffeeScript";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.coffeescript.org/eclipse";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "coffeeScript";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CoffeeScriptPackage eINSTANCE = csep.coffeeScript.impl.CoffeeScriptPackageImpl.init();

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.RootImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.BodyImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getBody()
   * @generated
   */
  int BODY = 1;

  /**
   * The feature id for the '<em><b>Lines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__LINES = ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.LineImpl <em>Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.LineImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getLine()
   * @generated
   */
  int LINE = 2;

  /**
   * The number of structural features of the '<em>Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.StmtImpl <em>Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.StmtImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getStmt()
   * @generated
   */
  int STMT = 3;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__STATEMENT = LINE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = LINE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.CommentImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 4;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__STATEMENT = STMT__STATEMENT;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__COMMENT = STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.RequireStmtImpl <em>Require Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.RequireStmtImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getRequireStmt()
   * @generated
   */
  int REQUIRE_STMT = 5;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_STMT__STATEMENT = STMT__STATEMENT;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_STMT__IMPORTED_NAMESPACE = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_STMT__URI = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Require Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ReturnStmtImpl <em>Return Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ReturnStmtImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getReturnStmt()
   * @generated
   */
  int RETURN_STMT = 6;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STMT__STATEMENT = STMT__STATEMENT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STMT__EXPRESSION = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STMT__CONDITION = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Return Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ThrowStmtImpl <em>Throw Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ThrowStmtImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getThrowStmt()
   * @generated
   */
  int THROW_STMT = 7;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_STMT__STATEMENT = STMT__STATEMENT;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_STMT__EXP = STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Throw Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.SuperClassImpl <em>Super Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.SuperClassImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getSuperClass()
   * @generated
   */
  int SUPER_CLASS = 8;

  /**
   * The number of structural features of the '<em>Super Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_CLASS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ClassDeclarationImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getClassDeclaration()
   * @generated
   */
  int CLASS_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__STATEMENT = STMT__STATEMENT;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__INDEXES = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__SOURCE = STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__LEFT = STMT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__OPERATOR = STMT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__RIGHT = STMT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__BODY = STMT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Extend</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__EXTEND = STMT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__NAME = STMT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Class Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION_FEATURE_COUNT = STMT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ExpressionImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__INDEXES = LINE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SOURCE = LINE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = LINE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERATOR = LINE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = LINE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = LINE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.AssignedClassDeclarationImpl <em>Assigned Class Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.AssignedClassDeclarationImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getAssignedClassDeclaration()
   * @generated
   */
  int ASSIGNED_CLASS_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNED_CLASS_DECLARATION__INDEXES = EXPRESSION__INDEXES;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNED_CLASS_DECLARATION__SOURCE = EXPRESSION__SOURCE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNED_CLASS_DECLARATION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNED_CLASS_DECLARATION__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNED_CLASS_DECLARATION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Assigned Class Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNED_CLASS_DECLARATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ForValueImpl <em>For Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ForValueImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getForValue()
   * @generated
   */
  int FOR_VALUE = 12;

  /**
   * The number of structural features of the '<em>For Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ForSourceImpl <em>For Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ForSourceImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getForSource()
   * @generated
   */
  int FOR_SOURCE = 13;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_SOURCE__SOURCE = 0;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_SOURCE__WHEN = 1;

  /**
   * The feature id for the '<em><b>By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_SOURCE__BY = 2;

  /**
   * The number of structural features of the '<em>For Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_SOURCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.PrimaryExpressionImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 23;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.RangeImpl <em>Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.RangeImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getRange()
   * @generated
   */
  int RANGE = 14;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__START = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__END = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ApplicationImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 15;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__INDEXES = EXPRESSION__INDEXES;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__SOURCE = EXPRESSION__SOURCE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__FEATURES = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.FeatureCallImpl <em>Feature Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.FeatureCallImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getFeatureCall()
   * @generated
   */
  int FEATURE_CALL = 16;

  /**
   * The number of structural features of the '<em>Feature Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.FunctionCallImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 17;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__ARGS = FEATURE_CALL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = FEATURE_CALL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.PropertyAccessImpl <em>Property Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.PropertyAccessImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getPropertyAccess()
   * @generated
   */
  int PROPERTY_ACCESS = 18;

  /**
   * The number of structural features of the '<em>Property Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ACCESS_FEATURE_COUNT = FEATURE_CALL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ThisPropertyImpl <em>This Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ThisPropertyImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getThisProperty()
   * @generated
   */
  int THIS_PROPERTY = 19;

  /**
   * The feature id for the '<em><b>Splat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_PROPERTY__SPLAT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_PROPERTY__DEFAULT_VALUE = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>This Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_PROPERTY_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.NamedPropertyAccessImpl <em>Named Property Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.NamedPropertyAccessImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getNamedPropertyAccess()
   * @generated
   */
  int NAMED_PROPERTY_ACCESS = 20;

  /**
   * The feature id for the '<em><b>Accessor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_PROPERTY_ACCESS__ACCESSOR = PROPERTY_ACCESS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_PROPERTY_ACCESS__NAME = PROPERTY_ACCESS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Named Property Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_PROPERTY_ACCESS_FEATURE_COUNT = PROPERTY_ACCESS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.IndexedPropertyAccessImpl <em>Indexed Property Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.IndexedPropertyAccessImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getIndexedPropertyAccess()
   * @generated
   */
  int INDEXED_PROPERTY_ACCESS = 21;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_PROPERTY_ACCESS__INDEX = PROPERTY_ACCESS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Indexed Property Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_PROPERTY_ACCESS_FEATURE_COUNT = PROPERTY_ACCESS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.IndexImpl <em>Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.IndexImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getIndex()
   * @generated
   */
  int INDEX = 22;

  /**
   * The feature id for the '<em><b>Dots</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX__DOTS = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX__END = 1;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX__START = 2;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX__EXP = 3;

  /**
   * The number of structural features of the '<em>Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.BlockImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 24;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = ROOT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.CaseImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getCase()
   * @generated
   */
  int CASE = 25;

  /**
   * The feature id for the '<em><b>Whens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__WHENS = 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__THEN = 1;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.IfExpImpl <em>If Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.IfExpImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getIfExp()
   * @generated
   */
  int IF_EXP = 26;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXP__BLOCKS = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXP__DEFAULT_BLOCK = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXP_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.CondBlockImpl <em>Cond Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.CondBlockImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getCondBlock()
   * @generated
   */
  int COND_BLOCK = 27;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_BLOCK__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_BLOCK__CONDITION = 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_BLOCK__ACTION = 2;

  /**
   * The number of structural features of the '<em>Cond Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_BLOCK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.IdRefImpl <em>Id Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.IdRefImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getIdRef()
   * @generated
   */
  int ID_REF = 28;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF__INDEXES = SUPER_CLASS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF__SOURCE = SUPER_CLASS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF__LEFT = SUPER_CLASS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF__OPERATOR = SUPER_CLASS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF__RIGHT = SUPER_CLASS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Val</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF__VAL = SUPER_CLASS_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Accessor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF__ACCESSOR = SUPER_CLASS_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Prop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF__PROP = SUPER_CLASS_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF__INDEX = SUPER_CLASS_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Id Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.IdImpl <em>Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.IdImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getId()
   * @generated
   */
  int ID = 29;

  /**
   * The feature id for the '<em><b>Splat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__SPLAT = FOR_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__DEFAULT_VALUE = FOR_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__INDEXES = FOR_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__SOURCE = FOR_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__LEFT = FOR_VALUE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__OPERATOR = FOR_VALUE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__RIGHT = FOR_VALUE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__NAME = FOR_VALUE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Props</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__PROPS = FOR_VALUE_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_FEATURE_COUNT = FOR_VALUE_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.PropertyImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 30;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__INDEXES = SUPER_CLASS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__SOURCE = SUPER_CLASS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__LEFT = SUPER_CLASS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__OPERATOR = SUPER_CLASS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__RIGHT = SUPER_CLASS_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.VariableImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 31;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__INDEXES = EXPRESSION__INDEXES;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__SOURCE = EXPRESSION__SOURCE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.AssignableImpl <em>Assignable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.AssignableImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getAssignable()
   * @generated
   */
  int ASSIGNABLE = 35;

  /**
   * The number of structural features of the '<em>Assignable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNABLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.AssignableArrayImpl <em>Assignable Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.AssignableArrayImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getAssignableArray()
   * @generated
   */
  int ASSIGNABLE_ARRAY = 32;

  /**
   * The number of structural features of the '<em>Assignable Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNABLE_ARRAY_FEATURE_COUNT = ASSIGNABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.AssignableArgListImpl <em>Assignable Arg List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.AssignableArgListImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getAssignableArgList()
   * @generated
   */
  int ASSIGNABLE_ARG_LIST = 33;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNABLE_ARG_LIST__ARGS = ASSIGNABLE_ARRAY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assignable Arg List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNABLE_ARG_LIST_FEATURE_COUNT = ASSIGNABLE_ARRAY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.AssignableArgImpl <em>Assignable Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.AssignableArgImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getAssignableArg()
   * @generated
   */
  int ASSIGNABLE_ARG = 34;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNABLE_ARG__ARG = 0;

  /**
   * The feature id for the '<em><b>Splat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNABLE_ARG__SPLAT = 1;

  /**
   * The number of structural features of the '<em>Assignable Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNABLE_ARG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ArgImpl <em>Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ArgImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getArg()
   * @generated
   */
  int ARG = 36;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__EXP = 0;

  /**
   * The feature id for the '<em><b>Splat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__SPLAT = 1;

  /**
   * The number of structural features of the '<em>Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ArgLineImpl <em>Arg Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ArgLineImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getArgLine()
   * @generated
   */
  int ARG_LINE = 37;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LINE__HEAD = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LINE__TAIL = 1;

  /**
   * The number of structural features of the '<em>Arg Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LINE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ExplicitArgListImpl <em>Explicit Arg List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ExplicitArgListImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getExplicitArgList()
   * @generated
   */
  int EXPLICIT_ARG_LIST = 38;

  /**
   * The feature id for the '<em><b>Lines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_ARG_LIST__LINES = 0;

  /**
   * The number of structural features of the '<em>Explicit Arg List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_ARG_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ArrayImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 40;

  /**
   * The feature id for the '<em><b>Splat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__SPLAT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__DEFAULT_VALUE = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ArgListImpl <em>Arg List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ArgListImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getArgList()
   * @generated
   */
  int ARG_LIST = 39;

  /**
   * The feature id for the '<em><b>Splat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST__SPLAT = ARRAY__SPLAT;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST__DEFAULT_VALUE = ARRAY__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Dummy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST__DUMMY = ARRAY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Arg List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST_FEATURE_COUNT = ARRAY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.DictionaryImpl <em>Dictionary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.DictionaryImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getDictionary()
   * @generated
   */
  int DICTIONARY = 41;

  /**
   * The feature id for the '<em><b>Splat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY__SPLAT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY__DEFAULT_VALUE = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dictionary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.DictItemsImpl <em>Dict Items</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.DictItemsImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getDictItems()
   * @generated
   */
  int DICT_ITEMS = 42;

  /**
   * The feature id for the '<em><b>Splat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ITEMS__SPLAT = DICTIONARY__SPLAT;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ITEMS__DEFAULT_VALUE = DICTIONARY__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Dummy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ITEMS__DUMMY = DICTIONARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dict Items</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ITEMS_FEATURE_COUNT = DICTIONARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ExplicitDictItemsImpl <em>Explicit Dict Items</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ExplicitDictItemsImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getExplicitDictItems()
   * @generated
   */
  int EXPLICIT_DICT_ITEMS = 43;

  /**
   * The feature id for the '<em><b>Lines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_DICT_ITEMS__LINES = 0;

  /**
   * The number of structural features of the '<em>Explicit Dict Items</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_DICT_ITEMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.DictLineImpl <em>Dict Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.DictLineImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getDictLine()
   * @generated
   */
  int DICT_LINE = 44;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_LINE__HEAD = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_LINE__TAIL = 1;

  /**
   * The number of structural features of the '<em>Dict Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_LINE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.DictItemImpl <em>Dict Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.DictItemImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getDictItem()
   * @generated
   */
  int DICT_ITEM = 45;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ITEM__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ITEM__VALUE = 1;

  /**
   * The number of structural features of the '<em>Dict Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.DictKeyImpl <em>Dict Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.DictKeyImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getDictKey()
   * @generated
   */
  int DICT_KEY = 46;

  /**
   * The number of structural features of the '<em>Dict Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_KEY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.LambdaImpl <em>Lambda</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.LambdaImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getLambda()
   * @generated
   */
  int LAMBDA = 47;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAMBDA__PARAMS = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAMBDA__BODY = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Lambda</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAMBDA_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ParamImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getParam()
   * @generated
   */
  int PARAM = 48;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.LiteralImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 54;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.NumberLiteralImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 49;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.StringLiteralImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 50;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.BoolLiteralImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getBoolLiteral()
   * @generated
   */
  int BOOL_LITERAL = 51;

  /**
   * The number of structural features of the '<em>Bool Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.JSLiteralImpl <em>JS Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.JSLiteralImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getJSLiteral()
   * @generated
   */
  int JS_LITERAL = 52;

  /**
   * The number of structural features of the '<em>JS Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JS_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.RegexLiteralImpl <em>Regex Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.RegexLiteralImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getRegexLiteral()
   * @generated
   */
  int REGEX_LITERAL = 53;

  /**
   * The number of structural features of the '<em>Regex Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEX_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ParentheticalImpl <em>Parenthetical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ParentheticalImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getParenthetical()
   * @generated
   */
  int PARENTHETICAL = 55;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHETICAL__CONTENT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parenthetical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHETICAL_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.IfImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getIf()
   * @generated
   */
  int IF = 56;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__INDEXES = EXPRESSION__INDEXES;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__SOURCE = EXPRESSION__SOURCE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Dummy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__DUMMY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__CONDITION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ForImpl <em>For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ForImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getFor()
   * @generated
   */
  int FOR = 57;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__INDEXES = EXPRESSION__INDEXES;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__SOURCE = EXPRESSION__SOURCE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Dummy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__DUMMY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__BODY = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__LOOP = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.WhileImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 58;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__INDEXES = EXPRESSION__INDEXES;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__SOURCE = EXPRESSION__SOURCE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Dummy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__DUMMY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__BODY = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__WHEN = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__LOOP = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.UntilImpl <em>Until</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.UntilImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getUntil()
   * @generated
   */
  int UNTIL = 59;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__INDEXES = EXPRESSION__INDEXES;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__SOURCE = EXPRESSION__SOURCE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Dummy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__DUMMY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__BODY = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__WHEN = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__LOOP = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Until</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.BinaryExpImpl <em>Binary Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.BinaryExpImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getBinaryExp()
   * @generated
   */
  int BINARY_EXP = 60;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP__INDEXES = EXPRESSION__INDEXES;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP__SOURCE = EXPRESSION__SOURCE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Binary Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.SuperCallImpl <em>Super Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.SuperCallImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getSuperCall()
   * @generated
   */
  int SUPER_CALL = 61;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_CALL__INDEXES = APPLICATION__INDEXES;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_CALL__SOURCE = APPLICATION__SOURCE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_CALL__LEFT = APPLICATION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_CALL__OPERATOR = APPLICATION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_CALL__RIGHT = APPLICATION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_CALL__VALUE = APPLICATION__VALUE;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_CALL__FEATURES = APPLICATION__FEATURES;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_CALL__ARGS = APPLICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Super Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_CALL_FEATURE_COUNT = APPLICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.ThisAloneImpl <em>This Alone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.ThisAloneImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getThisAlone()
   * @generated
   */
  int THIS_ALONE = 62;

  /**
   * The number of structural features of the '<em>This Alone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_ALONE_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.LoopImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 63;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__BODY = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.TryCatchImpl <em>Try Catch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.TryCatchImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getTryCatch()
   * @generated
   */
  int TRY_CATCH = 64;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_CATCH__BODY = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_CATCH__EXCEPTION = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Catch Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_CATCH__CATCH_BLOCK = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Finally Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_CATCH__FINALLY_BLOCK = PRIMARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Try Catch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_CATCH_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link csep.coffeeScript.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.coffeeScript.impl.SwitchImpl
   * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 65;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__EXP = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__CASES = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__ELSE_BLOCK = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see csep.coffeeScript.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see csep.coffeeScript.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.Body#getLines <em>Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lines</em>'.
   * @see csep.coffeeScript.Body#getLines()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Lines();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line</em>'.
   * @see csep.coffeeScript.Line
   * @generated
   */
  EClass getLine();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt</em>'.
   * @see csep.coffeeScript.Stmt
   * @generated
   */
  EClass getStmt();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.Stmt#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statement</em>'.
   * @see csep.coffeeScript.Stmt#getStatement()
   * @see #getStmt()
   * @generated
   */
  EAttribute getStmt_Statement();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see csep.coffeeScript.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.Comment#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see csep.coffeeScript.Comment#getComment()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Comment();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.RequireStmt <em>Require Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Require Stmt</em>'.
   * @see csep.coffeeScript.RequireStmt
   * @generated
   */
  EClass getRequireStmt();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.RequireStmt#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imported Namespace</em>'.
   * @see csep.coffeeScript.RequireStmt#getImportedNamespace()
   * @see #getRequireStmt()
   * @generated
   */
  EReference getRequireStmt_ImportedNamespace();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.RequireStmt#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see csep.coffeeScript.RequireStmt#getUri()
   * @see #getRequireStmt()
   * @generated
   */
  EAttribute getRequireStmt_Uri();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ReturnStmt <em>Return Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Stmt</em>'.
   * @see csep.coffeeScript.ReturnStmt
   * @generated
   */
  EClass getReturnStmt();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ReturnStmt#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see csep.coffeeScript.ReturnStmt#getExpression()
   * @see #getReturnStmt()
   * @generated
   */
  EReference getReturnStmt_Expression();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ReturnStmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see csep.coffeeScript.ReturnStmt#getCondition()
   * @see #getReturnStmt()
   * @generated
   */
  EReference getReturnStmt_Condition();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ThrowStmt <em>Throw Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Throw Stmt</em>'.
   * @see csep.coffeeScript.ThrowStmt
   * @generated
   */
  EClass getThrowStmt();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ThrowStmt#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see csep.coffeeScript.ThrowStmt#getExp()
   * @see #getThrowStmt()
   * @generated
   */
  EReference getThrowStmt_Exp();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.SuperClass <em>Super Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Class</em>'.
   * @see csep.coffeeScript.SuperClass
   * @generated
   */
  EClass getSuperClass();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Declaration</em>'.
   * @see csep.coffeeScript.ClassDeclaration
   * @generated
   */
  EClass getClassDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ClassDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see csep.coffeeScript.ClassDeclaration#getBody()
   * @see #getClassDeclaration()
   * @generated
   */
  EReference getClassDeclaration_Body();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ClassDeclaration#getExtend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extend</em>'.
   * @see csep.coffeeScript.ClassDeclaration#getExtend()
   * @see #getClassDeclaration()
   * @generated
   */
  EReference getClassDeclaration_Extend();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ClassDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see csep.coffeeScript.ClassDeclaration#getName()
   * @see #getClassDeclaration()
   * @generated
   */
  EReference getClassDeclaration_Name();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.AssignedClassDeclaration <em>Assigned Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assigned Class Declaration</em>'.
   * @see csep.coffeeScript.AssignedClassDeclaration
   * @generated
   */
  EClass getAssignedClassDeclaration();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see csep.coffeeScript.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.Expression#getIndexes <em>Indexes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indexes</em>'.
   * @see csep.coffeeScript.Expression#getIndexes()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Indexes();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Expression#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see csep.coffeeScript.Expression#getSource()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Source();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see csep.coffeeScript.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.Expression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see csep.coffeeScript.Expression#getOperator()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see csep.coffeeScript.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ForValue <em>For Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Value</em>'.
   * @see csep.coffeeScript.ForValue
   * @generated
   */
  EClass getForValue();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ForSource <em>For Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Source</em>'.
   * @see csep.coffeeScript.ForSource
   * @generated
   */
  EClass getForSource();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ForSource#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see csep.coffeeScript.ForSource#getSource()
   * @see #getForSource()
   * @generated
   */
  EReference getForSource_Source();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ForSource#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When</em>'.
   * @see csep.coffeeScript.ForSource#getWhen()
   * @see #getForSource()
   * @generated
   */
  EReference getForSource_When();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ForSource#getBy <em>By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>By</em>'.
   * @see csep.coffeeScript.ForSource#getBy()
   * @see #getForSource()
   * @generated
   */
  EReference getForSource_By();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range</em>'.
   * @see csep.coffeeScript.Range
   * @generated
   */
  EClass getRange();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Range#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see csep.coffeeScript.Range#getStart()
   * @see #getRange()
   * @generated
   */
  EReference getRange_Start();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Range#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see csep.coffeeScript.Range#getEnd()
   * @see #getRange()
   * @generated
   */
  EReference getRange_End();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see csep.coffeeScript.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Application#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see csep.coffeeScript.Application#getValue()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Value();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.Application#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see csep.coffeeScript.Application#getFeatures()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Features();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.FeatureCall <em>Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Call</em>'.
   * @see csep.coffeeScript.FeatureCall
   * @generated
   */
  EClass getFeatureCall();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see csep.coffeeScript.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.FunctionCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see csep.coffeeScript.FunctionCall#getArgs()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Args();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.PropertyAccess <em>Property Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Access</em>'.
   * @see csep.coffeeScript.PropertyAccess
   * @generated
   */
  EClass getPropertyAccess();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ThisProperty <em>This Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Property</em>'.
   * @see csep.coffeeScript.ThisProperty
   * @generated
   */
  EClass getThisProperty();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.ThisProperty#isSplat <em>Splat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Splat</em>'.
   * @see csep.coffeeScript.ThisProperty#isSplat()
   * @see #getThisProperty()
   * @generated
   */
  EAttribute getThisProperty_Splat();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ThisProperty#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see csep.coffeeScript.ThisProperty#getDefaultValue()
   * @see #getThisProperty()
   * @generated
   */
  EReference getThisProperty_DefaultValue();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.NamedPropertyAccess <em>Named Property Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Property Access</em>'.
   * @see csep.coffeeScript.NamedPropertyAccess
   * @generated
   */
  EClass getNamedPropertyAccess();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.NamedPropertyAccess#getAccessor <em>Accessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accessor</em>'.
   * @see csep.coffeeScript.NamedPropertyAccess#getAccessor()
   * @see #getNamedPropertyAccess()
   * @generated
   */
  EAttribute getNamedPropertyAccess_Accessor();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.NamedPropertyAccess#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see csep.coffeeScript.NamedPropertyAccess#getName()
   * @see #getNamedPropertyAccess()
   * @generated
   */
  EReference getNamedPropertyAccess_Name();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.IndexedPropertyAccess <em>Indexed Property Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexed Property Access</em>'.
   * @see csep.coffeeScript.IndexedPropertyAccess
   * @generated
   */
  EClass getIndexedPropertyAccess();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.IndexedPropertyAccess#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see csep.coffeeScript.IndexedPropertyAccess#getIndex()
   * @see #getIndexedPropertyAccess()
   * @generated
   */
  EReference getIndexedPropertyAccess_Index();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Index <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Index</em>'.
   * @see csep.coffeeScript.Index
   * @generated
   */
  EClass getIndex();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.Index#getDots <em>Dots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dots</em>'.
   * @see csep.coffeeScript.Index#getDots()
   * @see #getIndex()
   * @generated
   */
  EAttribute getIndex_Dots();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Index#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see csep.coffeeScript.Index#getEnd()
   * @see #getIndex()
   * @generated
   */
  EReference getIndex_End();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Index#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see csep.coffeeScript.Index#getStart()
   * @see #getIndex()
   * @generated
   */
  EReference getIndex_Start();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Index#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see csep.coffeeScript.Index#getExp()
   * @see #getIndex()
   * @generated
   */
  EReference getIndex_Exp();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see csep.coffeeScript.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see csep.coffeeScript.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see csep.coffeeScript.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.Case#getWhens <em>Whens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Whens</em>'.
   * @see csep.coffeeScript.Case#getWhens()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Whens();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Case#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see csep.coffeeScript.Case#getThen()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Then();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.IfExp <em>If Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Exp</em>'.
   * @see csep.coffeeScript.IfExp
   * @generated
   */
  EClass getIfExp();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.IfExp#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see csep.coffeeScript.IfExp#getBlocks()
   * @see #getIfExp()
   * @generated
   */
  EReference getIfExp_Blocks();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.IfExp#getDefaultBlock <em>Default Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Block</em>'.
   * @see csep.coffeeScript.IfExp#getDefaultBlock()
   * @see #getIfExp()
   * @generated
   */
  EReference getIfExp_DefaultBlock();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.CondBlock <em>Cond Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cond Block</em>'.
   * @see csep.coffeeScript.CondBlock
   * @generated
   */
  EClass getCondBlock();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.CondBlock#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see csep.coffeeScript.CondBlock#getOperator()
   * @see #getCondBlock()
   * @generated
   */
  EAttribute getCondBlock_Operator();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.CondBlock#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see csep.coffeeScript.CondBlock#getCondition()
   * @see #getCondBlock()
   * @generated
   */
  EReference getCondBlock_Condition();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.CondBlock#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see csep.coffeeScript.CondBlock#getAction()
   * @see #getCondBlock()
   * @generated
   */
  EReference getCondBlock_Action();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.IdRef <em>Id Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Ref</em>'.
   * @see csep.coffeeScript.IdRef
   * @generated
   */
  EClass getIdRef();

  /**
   * Returns the meta object for the reference '{@link csep.coffeeScript.IdRef#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Val</em>'.
   * @see csep.coffeeScript.IdRef#getVal()
   * @see #getIdRef()
   * @generated
   */
  EReference getIdRef_Val();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.IdRef#getAccessor <em>Accessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accessor</em>'.
   * @see csep.coffeeScript.IdRef#getAccessor()
   * @see #getIdRef()
   * @generated
   */
  EAttribute getIdRef_Accessor();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.IdRef#getProp <em>Prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prop</em>'.
   * @see csep.coffeeScript.IdRef#getProp()
   * @see #getIdRef()
   * @generated
   */
  EReference getIdRef_Prop();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.IdRef#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see csep.coffeeScript.IdRef#getIndex()
   * @see #getIdRef()
   * @generated
   */
  EReference getIdRef_Index();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Id <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id</em>'.
   * @see csep.coffeeScript.Id
   * @generated
   */
  EClass getId();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.Id#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see csep.coffeeScript.Id#getName()
   * @see #getId()
   * @generated
   */
  EAttribute getId_Name();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.Id#getProps <em>Props</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Props</em>'.
   * @see csep.coffeeScript.Id#getProps()
   * @see #getId()
   * @generated
   */
  EReference getId_Props();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see csep.coffeeScript.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see csep.coffeeScript.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.AssignableArray <em>Assignable Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignable Array</em>'.
   * @see csep.coffeeScript.AssignableArray
   * @generated
   */
  EClass getAssignableArray();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.AssignableArgList <em>Assignable Arg List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignable Arg List</em>'.
   * @see csep.coffeeScript.AssignableArgList
   * @generated
   */
  EClass getAssignableArgList();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.AssignableArgList#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see csep.coffeeScript.AssignableArgList#getArgs()
   * @see #getAssignableArgList()
   * @generated
   */
  EReference getAssignableArgList_Args();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.AssignableArg <em>Assignable Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignable Arg</em>'.
   * @see csep.coffeeScript.AssignableArg
   * @generated
   */
  EClass getAssignableArg();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.AssignableArg#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see csep.coffeeScript.AssignableArg#getArg()
   * @see #getAssignableArg()
   * @generated
   */
  EReference getAssignableArg_Arg();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.AssignableArg#isSplat <em>Splat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Splat</em>'.
   * @see csep.coffeeScript.AssignableArg#isSplat()
   * @see #getAssignableArg()
   * @generated
   */
  EAttribute getAssignableArg_Splat();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Assignable <em>Assignable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignable</em>'.
   * @see csep.coffeeScript.Assignable
   * @generated
   */
  EClass getAssignable();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Arg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arg</em>'.
   * @see csep.coffeeScript.Arg
   * @generated
   */
  EClass getArg();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Arg#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see csep.coffeeScript.Arg#getExp()
   * @see #getArg()
   * @generated
   */
  EReference getArg_Exp();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.Arg#isSplat <em>Splat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Splat</em>'.
   * @see csep.coffeeScript.Arg#isSplat()
   * @see #getArg()
   * @generated
   */
  EAttribute getArg_Splat();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ArgLine <em>Arg Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arg Line</em>'.
   * @see csep.coffeeScript.ArgLine
   * @generated
   */
  EClass getArgLine();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ArgLine#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see csep.coffeeScript.ArgLine#getHead()
   * @see #getArgLine()
   * @generated
   */
  EReference getArgLine_Head();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.ArgLine#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tail</em>'.
   * @see csep.coffeeScript.ArgLine#getTail()
   * @see #getArgLine()
   * @generated
   */
  EReference getArgLine_Tail();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ExplicitArgList <em>Explicit Arg List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explicit Arg List</em>'.
   * @see csep.coffeeScript.ExplicitArgList
   * @generated
   */
  EClass getExplicitArgList();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.ExplicitArgList#getLines <em>Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lines</em>'.
   * @see csep.coffeeScript.ExplicitArgList#getLines()
   * @see #getExplicitArgList()
   * @generated
   */
  EReference getExplicitArgList_Lines();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ArgList <em>Arg List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arg List</em>'.
   * @see csep.coffeeScript.ArgList
   * @generated
   */
  EClass getArgList();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.ArgList#getDummy <em>Dummy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dummy</em>'.
   * @see csep.coffeeScript.ArgList#getDummy()
   * @see #getArgList()
   * @generated
   */
  EReference getArgList_Dummy();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see csep.coffeeScript.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.Array#isSplat <em>Splat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Splat</em>'.
   * @see csep.coffeeScript.Array#isSplat()
   * @see #getArray()
   * @generated
   */
  EAttribute getArray_Splat();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Array#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see csep.coffeeScript.Array#getDefaultValue()
   * @see #getArray()
   * @generated
   */
  EReference getArray_DefaultValue();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Dictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dictionary</em>'.
   * @see csep.coffeeScript.Dictionary
   * @generated
   */
  EClass getDictionary();

  /**
   * Returns the meta object for the attribute '{@link csep.coffeeScript.Dictionary#isSplat <em>Splat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Splat</em>'.
   * @see csep.coffeeScript.Dictionary#isSplat()
   * @see #getDictionary()
   * @generated
   */
  EAttribute getDictionary_Splat();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Dictionary#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see csep.coffeeScript.Dictionary#getDefaultValue()
   * @see #getDictionary()
   * @generated
   */
  EReference getDictionary_DefaultValue();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.DictItems <em>Dict Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dict Items</em>'.
   * @see csep.coffeeScript.DictItems
   * @generated
   */
  EClass getDictItems();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.DictItems#getDummy <em>Dummy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dummy</em>'.
   * @see csep.coffeeScript.DictItems#getDummy()
   * @see #getDictItems()
   * @generated
   */
  EReference getDictItems_Dummy();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ExplicitDictItems <em>Explicit Dict Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explicit Dict Items</em>'.
   * @see csep.coffeeScript.ExplicitDictItems
   * @generated
   */
  EClass getExplicitDictItems();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.ExplicitDictItems#getLines <em>Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lines</em>'.
   * @see csep.coffeeScript.ExplicitDictItems#getLines()
   * @see #getExplicitDictItems()
   * @generated
   */
  EReference getExplicitDictItems_Lines();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.DictLine <em>Dict Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dict Line</em>'.
   * @see csep.coffeeScript.DictLine
   * @generated
   */
  EClass getDictLine();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.DictLine#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see csep.coffeeScript.DictLine#getHead()
   * @see #getDictLine()
   * @generated
   */
  EReference getDictLine_Head();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.DictLine#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tail</em>'.
   * @see csep.coffeeScript.DictLine#getTail()
   * @see #getDictLine()
   * @generated
   */
  EReference getDictLine_Tail();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.DictItem <em>Dict Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dict Item</em>'.
   * @see csep.coffeeScript.DictItem
   * @generated
   */
  EClass getDictItem();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.DictItem#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see csep.coffeeScript.DictItem#getKey()
   * @see #getDictItem()
   * @generated
   */
  EReference getDictItem_Key();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.DictItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see csep.coffeeScript.DictItem#getValue()
   * @see #getDictItem()
   * @generated
   */
  EReference getDictItem_Value();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.DictKey <em>Dict Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dict Key</em>'.
   * @see csep.coffeeScript.DictKey
   * @generated
   */
  EClass getDictKey();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Lambda <em>Lambda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lambda</em>'.
   * @see csep.coffeeScript.Lambda
   * @generated
   */
  EClass getLambda();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.Lambda#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see csep.coffeeScript.Lambda#getParams()
   * @see #getLambda()
   * @generated
   */
  EReference getLambda_Params();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Lambda#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see csep.coffeeScript.Lambda#getBody()
   * @see #getLambda()
   * @generated
   */
  EReference getLambda_Body();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see csep.coffeeScript.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see csep.coffeeScript.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see csep.coffeeScript.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.BoolLiteral <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Literal</em>'.
   * @see csep.coffeeScript.BoolLiteral
   * @generated
   */
  EClass getBoolLiteral();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.JSLiteral <em>JS Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JS Literal</em>'.
   * @see csep.coffeeScript.JSLiteral
   * @generated
   */
  EClass getJSLiteral();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.RegexLiteral <em>Regex Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regex Literal</em>'.
   * @see csep.coffeeScript.RegexLiteral
   * @generated
   */
  EClass getRegexLiteral();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see csep.coffeeScript.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Parenthetical <em>Parenthetical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthetical</em>'.
   * @see csep.coffeeScript.Parenthetical
   * @generated
   */
  EClass getParenthetical();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Parenthetical#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see csep.coffeeScript.Parenthetical#getContent()
   * @see #getParenthetical()
   * @generated
   */
  EReference getParenthetical_Content();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see csep.coffeeScript.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.If#getDummy <em>Dummy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dummy</em>'.
   * @see csep.coffeeScript.If#getDummy()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Dummy();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.If#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see csep.coffeeScript.If#getCondition()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Condition();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For</em>'.
   * @see csep.coffeeScript.For
   * @generated
   */
  EClass getFor();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.For#getDummy <em>Dummy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dummy</em>'.
   * @see csep.coffeeScript.For#getDummy()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Dummy();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.For#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see csep.coffeeScript.For#getBody()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Body();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.For#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loop</em>'.
   * @see csep.coffeeScript.For#getLoop()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Loop();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see csep.coffeeScript.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.While#getDummy <em>Dummy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dummy</em>'.
   * @see csep.coffeeScript.While#getDummy()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Dummy();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.While#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see csep.coffeeScript.While#getBody()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Body();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.While#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When</em>'.
   * @see csep.coffeeScript.While#getWhen()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_When();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.While#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loop</em>'.
   * @see csep.coffeeScript.While#getLoop()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Loop();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Until <em>Until</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Until</em>'.
   * @see csep.coffeeScript.Until
   * @generated
   */
  EClass getUntil();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Until#getDummy <em>Dummy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dummy</em>'.
   * @see csep.coffeeScript.Until#getDummy()
   * @see #getUntil()
   * @generated
   */
  EReference getUntil_Dummy();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Until#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see csep.coffeeScript.Until#getBody()
   * @see #getUntil()
   * @generated
   */
  EReference getUntil_Body();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Until#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When</em>'.
   * @see csep.coffeeScript.Until#getWhen()
   * @see #getUntil()
   * @generated
   */
  EReference getUntil_When();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Until#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loop</em>'.
   * @see csep.coffeeScript.Until#getLoop()
   * @see #getUntil()
   * @generated
   */
  EReference getUntil_Loop();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.BinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Exp</em>'.
   * @see csep.coffeeScript.BinaryExp
   * @generated
   */
  EClass getBinaryExp();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.SuperCall <em>Super Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Call</em>'.
   * @see csep.coffeeScript.SuperCall
   * @generated
   */
  EClass getSuperCall();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.SuperCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see csep.coffeeScript.SuperCall#getArgs()
   * @see #getSuperCall()
   * @generated
   */
  EReference getSuperCall_Args();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.ThisAlone <em>This Alone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Alone</em>'.
   * @see csep.coffeeScript.ThisAlone
   * @generated
   */
  EClass getThisAlone();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see csep.coffeeScript.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Loop#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see csep.coffeeScript.Loop#getBody()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Body();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.TryCatch <em>Try Catch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Try Catch</em>'.
   * @see csep.coffeeScript.TryCatch
   * @generated
   */
  EClass getTryCatch();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.TryCatch#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see csep.coffeeScript.TryCatch#getBody()
   * @see #getTryCatch()
   * @generated
   */
  EReference getTryCatch_Body();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.TryCatch#getException <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see csep.coffeeScript.TryCatch#getException()
   * @see #getTryCatch()
   * @generated
   */
  EReference getTryCatch_Exception();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.TryCatch#getCatchBlock <em>Catch Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Catch Block</em>'.
   * @see csep.coffeeScript.TryCatch#getCatchBlock()
   * @see #getTryCatch()
   * @generated
   */
  EReference getTryCatch_CatchBlock();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.TryCatch#getFinallyBlock <em>Finally Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally Block</em>'.
   * @see csep.coffeeScript.TryCatch#getFinallyBlock()
   * @see #getTryCatch()
   * @generated
   */
  EReference getTryCatch_FinallyBlock();

  /**
   * Returns the meta object for class '{@link csep.coffeeScript.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see csep.coffeeScript.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Switch#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see csep.coffeeScript.Switch#getExp()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Exp();

  /**
   * Returns the meta object for the containment reference list '{@link csep.coffeeScript.Switch#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see csep.coffeeScript.Switch#getCases()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Cases();

  /**
   * Returns the meta object for the containment reference '{@link csep.coffeeScript.Switch#getElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Block</em>'.
   * @see csep.coffeeScript.Switch#getElseBlock()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_ElseBlock();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CoffeeScriptFactory getCoffeeScriptFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.RootImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.BodyImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__LINES = eINSTANCE.getBody_Lines();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.LineImpl <em>Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.LineImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getLine()
     * @generated
     */
    EClass LINE = eINSTANCE.getLine();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.StmtImpl <em>Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.StmtImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getStmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getStmt();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STMT__STATEMENT = eINSTANCE.getStmt_Statement();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.CommentImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.RequireStmtImpl <em>Require Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.RequireStmtImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getRequireStmt()
     * @generated
     */
    EClass REQUIRE_STMT = eINSTANCE.getRequireStmt();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRE_STMT__IMPORTED_NAMESPACE = eINSTANCE.getRequireStmt_ImportedNamespace();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRE_STMT__URI = eINSTANCE.getRequireStmt_Uri();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ReturnStmtImpl <em>Return Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ReturnStmtImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getReturnStmt()
     * @generated
     */
    EClass RETURN_STMT = eINSTANCE.getReturnStmt();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STMT__EXPRESSION = eINSTANCE.getReturnStmt_Expression();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STMT__CONDITION = eINSTANCE.getReturnStmt_Condition();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ThrowStmtImpl <em>Throw Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ThrowStmtImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getThrowStmt()
     * @generated
     */
    EClass THROW_STMT = eINSTANCE.getThrowStmt();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THROW_STMT__EXP = eINSTANCE.getThrowStmt_Exp();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.SuperClassImpl <em>Super Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.SuperClassImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getSuperClass()
     * @generated
     */
    EClass SUPER_CLASS = eINSTANCE.getSuperClass();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ClassDeclarationImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getClassDeclaration()
     * @generated
     */
    EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__BODY = eINSTANCE.getClassDeclaration_Body();

    /**
     * The meta object literal for the '<em><b>Extend</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__EXTEND = eINSTANCE.getClassDeclaration_Extend();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__NAME = eINSTANCE.getClassDeclaration_Name();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.AssignedClassDeclarationImpl <em>Assigned Class Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.AssignedClassDeclarationImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getAssignedClassDeclaration()
     * @generated
     */
    EClass ASSIGNED_CLASS_DECLARATION = eINSTANCE.getAssignedClassDeclaration();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ExpressionImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__INDEXES = eINSTANCE.getExpression_Indexes();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__SOURCE = eINSTANCE.getExpression_Source();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OPERATOR = eINSTANCE.getExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ForValueImpl <em>For Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ForValueImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getForValue()
     * @generated
     */
    EClass FOR_VALUE = eINSTANCE.getForValue();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ForSourceImpl <em>For Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ForSourceImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getForSource()
     * @generated
     */
    EClass FOR_SOURCE = eINSTANCE.getForSource();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_SOURCE__SOURCE = eINSTANCE.getForSource_Source();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_SOURCE__WHEN = eINSTANCE.getForSource_When();

    /**
     * The meta object literal for the '<em><b>By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_SOURCE__BY = eINSTANCE.getForSource_By();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.RangeImpl <em>Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.RangeImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getRange()
     * @generated
     */
    EClass RANGE = eINSTANCE.getRange();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__START = eINSTANCE.getRange_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__END = eINSTANCE.getRange_End();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ApplicationImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__VALUE = eINSTANCE.getApplication_Value();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__FEATURES = eINSTANCE.getApplication_Features();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.FeatureCallImpl <em>Feature Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.FeatureCallImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getFeatureCall()
     * @generated
     */
    EClass FEATURE_CALL = eINSTANCE.getFeatureCall();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.FunctionCallImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__ARGS = eINSTANCE.getFunctionCall_Args();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.PropertyAccessImpl <em>Property Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.PropertyAccessImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getPropertyAccess()
     * @generated
     */
    EClass PROPERTY_ACCESS = eINSTANCE.getPropertyAccess();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ThisPropertyImpl <em>This Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ThisPropertyImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getThisProperty()
     * @generated
     */
    EClass THIS_PROPERTY = eINSTANCE.getThisProperty();

    /**
     * The meta object literal for the '<em><b>Splat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THIS_PROPERTY__SPLAT = eINSTANCE.getThisProperty_Splat();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THIS_PROPERTY__DEFAULT_VALUE = eINSTANCE.getThisProperty_DefaultValue();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.NamedPropertyAccessImpl <em>Named Property Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.NamedPropertyAccessImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getNamedPropertyAccess()
     * @generated
     */
    EClass NAMED_PROPERTY_ACCESS = eINSTANCE.getNamedPropertyAccess();

    /**
     * The meta object literal for the '<em><b>Accessor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_PROPERTY_ACCESS__ACCESSOR = eINSTANCE.getNamedPropertyAccess_Accessor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_PROPERTY_ACCESS__NAME = eINSTANCE.getNamedPropertyAccess_Name();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.IndexedPropertyAccessImpl <em>Indexed Property Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.IndexedPropertyAccessImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getIndexedPropertyAccess()
     * @generated
     */
    EClass INDEXED_PROPERTY_ACCESS = eINSTANCE.getIndexedPropertyAccess();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEXED_PROPERTY_ACCESS__INDEX = eINSTANCE.getIndexedPropertyAccess_Index();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.IndexImpl <em>Index</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.IndexImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getIndex()
     * @generated
     */
    EClass INDEX = eINSTANCE.getIndex();

    /**
     * The meta object literal for the '<em><b>Dots</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEX__DOTS = eINSTANCE.getIndex_Dots();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEX__END = eINSTANCE.getIndex_End();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEX__START = eINSTANCE.getIndex_Start();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEX__EXP = eINSTANCE.getIndex_Exp();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.PrimaryExpressionImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.BlockImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.CaseImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Whens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__WHENS = eINSTANCE.getCase_Whens();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__THEN = eINSTANCE.getCase_Then();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.IfExpImpl <em>If Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.IfExpImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getIfExp()
     * @generated
     */
    EClass IF_EXP = eINSTANCE.getIfExp();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXP__BLOCKS = eINSTANCE.getIfExp_Blocks();

    /**
     * The meta object literal for the '<em><b>Default Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXP__DEFAULT_BLOCK = eINSTANCE.getIfExp_DefaultBlock();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.CondBlockImpl <em>Cond Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.CondBlockImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getCondBlock()
     * @generated
     */
    EClass COND_BLOCK = eINSTANCE.getCondBlock();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COND_BLOCK__OPERATOR = eINSTANCE.getCondBlock_Operator();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COND_BLOCK__CONDITION = eINSTANCE.getCondBlock_Condition();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COND_BLOCK__ACTION = eINSTANCE.getCondBlock_Action();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.IdRefImpl <em>Id Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.IdRefImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getIdRef()
     * @generated
     */
    EClass ID_REF = eINSTANCE.getIdRef();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_REF__VAL = eINSTANCE.getIdRef_Val();

    /**
     * The meta object literal for the '<em><b>Accessor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_REF__ACCESSOR = eINSTANCE.getIdRef_Accessor();

    /**
     * The meta object literal for the '<em><b>Prop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_REF__PROP = eINSTANCE.getIdRef_Prop();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_REF__INDEX = eINSTANCE.getIdRef_Index();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.IdImpl <em>Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.IdImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getId()
     * @generated
     */
    EClass ID = eINSTANCE.getId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID__NAME = eINSTANCE.getId_Name();

    /**
     * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID__PROPS = eINSTANCE.getId_Props();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.PropertyImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.VariableImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.AssignableArrayImpl <em>Assignable Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.AssignableArrayImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getAssignableArray()
     * @generated
     */
    EClass ASSIGNABLE_ARRAY = eINSTANCE.getAssignableArray();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.AssignableArgListImpl <em>Assignable Arg List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.AssignableArgListImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getAssignableArgList()
     * @generated
     */
    EClass ASSIGNABLE_ARG_LIST = eINSTANCE.getAssignableArgList();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNABLE_ARG_LIST__ARGS = eINSTANCE.getAssignableArgList_Args();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.AssignableArgImpl <em>Assignable Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.AssignableArgImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getAssignableArg()
     * @generated
     */
    EClass ASSIGNABLE_ARG = eINSTANCE.getAssignableArg();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNABLE_ARG__ARG = eINSTANCE.getAssignableArg_Arg();

    /**
     * The meta object literal for the '<em><b>Splat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNABLE_ARG__SPLAT = eINSTANCE.getAssignableArg_Splat();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.AssignableImpl <em>Assignable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.AssignableImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getAssignable()
     * @generated
     */
    EClass ASSIGNABLE = eINSTANCE.getAssignable();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ArgImpl <em>Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ArgImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getArg()
     * @generated
     */
    EClass ARG = eINSTANCE.getArg();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG__EXP = eINSTANCE.getArg_Exp();

    /**
     * The meta object literal for the '<em><b>Splat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARG__SPLAT = eINSTANCE.getArg_Splat();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ArgLineImpl <em>Arg Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ArgLineImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getArgLine()
     * @generated
     */
    EClass ARG_LINE = eINSTANCE.getArgLine();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_LINE__HEAD = eINSTANCE.getArgLine_Head();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_LINE__TAIL = eINSTANCE.getArgLine_Tail();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ExplicitArgListImpl <em>Explicit Arg List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ExplicitArgListImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getExplicitArgList()
     * @generated
     */
    EClass EXPLICIT_ARG_LIST = eINSTANCE.getExplicitArgList();

    /**
     * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_ARG_LIST__LINES = eINSTANCE.getExplicitArgList_Lines();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ArgListImpl <em>Arg List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ArgListImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getArgList()
     * @generated
     */
    EClass ARG_LIST = eINSTANCE.getArgList();

    /**
     * The meta object literal for the '<em><b>Dummy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_LIST__DUMMY = eINSTANCE.getArgList_Dummy();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ArrayImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '<em><b>Splat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY__SPLAT = eINSTANCE.getArray_Splat();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY__DEFAULT_VALUE = eINSTANCE.getArray_DefaultValue();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.DictionaryImpl <em>Dictionary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.DictionaryImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getDictionary()
     * @generated
     */
    EClass DICTIONARY = eINSTANCE.getDictionary();

    /**
     * The meta object literal for the '<em><b>Splat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DICTIONARY__SPLAT = eINSTANCE.getDictionary_Splat();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICTIONARY__DEFAULT_VALUE = eINSTANCE.getDictionary_DefaultValue();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.DictItemsImpl <em>Dict Items</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.DictItemsImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getDictItems()
     * @generated
     */
    EClass DICT_ITEMS = eINSTANCE.getDictItems();

    /**
     * The meta object literal for the '<em><b>Dummy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICT_ITEMS__DUMMY = eINSTANCE.getDictItems_Dummy();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ExplicitDictItemsImpl <em>Explicit Dict Items</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ExplicitDictItemsImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getExplicitDictItems()
     * @generated
     */
    EClass EXPLICIT_DICT_ITEMS = eINSTANCE.getExplicitDictItems();

    /**
     * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_DICT_ITEMS__LINES = eINSTANCE.getExplicitDictItems_Lines();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.DictLineImpl <em>Dict Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.DictLineImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getDictLine()
     * @generated
     */
    EClass DICT_LINE = eINSTANCE.getDictLine();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICT_LINE__HEAD = eINSTANCE.getDictLine_Head();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICT_LINE__TAIL = eINSTANCE.getDictLine_Tail();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.DictItemImpl <em>Dict Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.DictItemImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getDictItem()
     * @generated
     */
    EClass DICT_ITEM = eINSTANCE.getDictItem();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICT_ITEM__KEY = eINSTANCE.getDictItem_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICT_ITEM__VALUE = eINSTANCE.getDictItem_Value();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.DictKeyImpl <em>Dict Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.DictKeyImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getDictKey()
     * @generated
     */
    EClass DICT_KEY = eINSTANCE.getDictKey();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.LambdaImpl <em>Lambda</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.LambdaImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getLambda()
     * @generated
     */
    EClass LAMBDA = eINSTANCE.getLambda();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAMBDA__PARAMS = eINSTANCE.getLambda_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAMBDA__BODY = eINSTANCE.getLambda_Body();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ParamImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.NumberLiteralImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.StringLiteralImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.BoolLiteralImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getBoolLiteral()
     * @generated
     */
    EClass BOOL_LITERAL = eINSTANCE.getBoolLiteral();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.JSLiteralImpl <em>JS Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.JSLiteralImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getJSLiteral()
     * @generated
     */
    EClass JS_LITERAL = eINSTANCE.getJSLiteral();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.RegexLiteralImpl <em>Regex Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.RegexLiteralImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getRegexLiteral()
     * @generated
     */
    EClass REGEX_LITERAL = eINSTANCE.getRegexLiteral();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.LiteralImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ParentheticalImpl <em>Parenthetical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ParentheticalImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getParenthetical()
     * @generated
     */
    EClass PARENTHETICAL = eINSTANCE.getParenthetical();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHETICAL__CONTENT = eINSTANCE.getParenthetical_Content();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.IfImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Dummy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__DUMMY = eINSTANCE.getIf_Dummy();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__CONDITION = eINSTANCE.getIf_Condition();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ForImpl <em>For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ForImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getFor()
     * @generated
     */
    EClass FOR = eINSTANCE.getFor();

    /**
     * The meta object literal for the '<em><b>Dummy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__DUMMY = eINSTANCE.getFor_Dummy();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__BODY = eINSTANCE.getFor_Body();

    /**
     * The meta object literal for the '<em><b>Loop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__LOOP = eINSTANCE.getFor_Loop();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.WhileImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Dummy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__DUMMY = eINSTANCE.getWhile_Dummy();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__BODY = eINSTANCE.getWhile_Body();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__WHEN = eINSTANCE.getWhile_When();

    /**
     * The meta object literal for the '<em><b>Loop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__LOOP = eINSTANCE.getWhile_Loop();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.UntilImpl <em>Until</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.UntilImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getUntil()
     * @generated
     */
    EClass UNTIL = eINSTANCE.getUntil();

    /**
     * The meta object literal for the '<em><b>Dummy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNTIL__DUMMY = eINSTANCE.getUntil_Dummy();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNTIL__BODY = eINSTANCE.getUntil_Body();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNTIL__WHEN = eINSTANCE.getUntil_When();

    /**
     * The meta object literal for the '<em><b>Loop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNTIL__LOOP = eINSTANCE.getUntil_Loop();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.BinaryExpImpl <em>Binary Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.BinaryExpImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getBinaryExp()
     * @generated
     */
    EClass BINARY_EXP = eINSTANCE.getBinaryExp();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.SuperCallImpl <em>Super Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.SuperCallImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getSuperCall()
     * @generated
     */
    EClass SUPER_CALL = eINSTANCE.getSuperCall();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPER_CALL__ARGS = eINSTANCE.getSuperCall_Args();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.ThisAloneImpl <em>This Alone</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.ThisAloneImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getThisAlone()
     * @generated
     */
    EClass THIS_ALONE = eINSTANCE.getThisAlone();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.LoopImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__BODY = eINSTANCE.getLoop_Body();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.TryCatchImpl <em>Try Catch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.TryCatchImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getTryCatch()
     * @generated
     */
    EClass TRY_CATCH = eINSTANCE.getTryCatch();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_CATCH__BODY = eINSTANCE.getTryCatch_Body();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_CATCH__EXCEPTION = eINSTANCE.getTryCatch_Exception();

    /**
     * The meta object literal for the '<em><b>Catch Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_CATCH__CATCH_BLOCK = eINSTANCE.getTryCatch_CatchBlock();

    /**
     * The meta object literal for the '<em><b>Finally Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_CATCH__FINALLY_BLOCK = eINSTANCE.getTryCatch_FinallyBlock();

    /**
     * The meta object literal for the '{@link csep.coffeeScript.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.coffeeScript.impl.SwitchImpl
     * @see csep.coffeeScript.impl.CoffeeScriptPackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__EXP = eINSTANCE.getSwitch_Exp();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__CASES = eINSTANCE.getSwitch_Cases();

    /**
     * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__ELSE_BLOCK = eINSTANCE.getSwitch_ElseBlock();

  }

} //CoffeeScriptPackage
