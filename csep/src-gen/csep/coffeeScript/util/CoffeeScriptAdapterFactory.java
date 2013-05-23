/**
 */
package csep.coffeeScript.util;

import csep.coffeeScript.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see csep.coffeeScript.CoffeeScriptPackage
 * @generated
 */
public class CoffeeScriptAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CoffeeScriptPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoffeeScriptAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CoffeeScriptPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoffeeScriptSwitch<Adapter> modelSwitch =
    new CoffeeScriptSwitch<Adapter>()
    {
      @Override
      public Adapter caseRoot(Root object)
      {
        return createRootAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseLine(Line object)
      {
        return createLineAdapter();
      }
      @Override
      public Adapter caseStmt(Stmt object)
      {
        return createStmtAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
      }
      @Override
      public Adapter caseRequireStmt(RequireStmt object)
      {
        return createRequireStmtAdapter();
      }
      @Override
      public Adapter caseReturnStmt(ReturnStmt object)
      {
        return createReturnStmtAdapter();
      }
      @Override
      public Adapter caseThrowStmt(ThrowStmt object)
      {
        return createThrowStmtAdapter();
      }
      @Override
      public Adapter caseSuperClass(SuperClass object)
      {
        return createSuperClassAdapter();
      }
      @Override
      public Adapter caseClassDeclaration(ClassDeclaration object)
      {
        return createClassDeclarationAdapter();
      }
      @Override
      public Adapter caseAssignedClassDeclaration(AssignedClassDeclaration object)
      {
        return createAssignedClassDeclarationAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseForValue(ForValue object)
      {
        return createForValueAdapter();
      }
      @Override
      public Adapter caseForSource(ForSource object)
      {
        return createForSourceAdapter();
      }
      @Override
      public Adapter caseRange(Range object)
      {
        return createRangeAdapter();
      }
      @Override
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseFeatureCall(FeatureCall object)
      {
        return createFeatureCallAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter casePropertyAccess(PropertyAccess object)
      {
        return createPropertyAccessAdapter();
      }
      @Override
      public Adapter caseThisProperty(ThisProperty object)
      {
        return createThisPropertyAdapter();
      }
      @Override
      public Adapter caseNamedPropertyAccess(NamedPropertyAccess object)
      {
        return createNamedPropertyAccessAdapter();
      }
      @Override
      public Adapter caseIndexedPropertyAccess(IndexedPropertyAccess object)
      {
        return createIndexedPropertyAccessAdapter();
      }
      @Override
      public Adapter caseIndex(Index object)
      {
        return createIndexAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseCase(Case object)
      {
        return createCaseAdapter();
      }
      @Override
      public Adapter caseIfExp(IfExp object)
      {
        return createIfExpAdapter();
      }
      @Override
      public Adapter caseCondBlock(CondBlock object)
      {
        return createCondBlockAdapter();
      }
      @Override
      public Adapter caseIdRef(IdRef object)
      {
        return createIdRefAdapter();
      }
      @Override
      public Adapter caseId(Id object)
      {
        return createIdAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseAssignableArray(AssignableArray object)
      {
        return createAssignableArrayAdapter();
      }
      @Override
      public Adapter caseAssignableArgList(AssignableArgList object)
      {
        return createAssignableArgListAdapter();
      }
      @Override
      public Adapter caseAssignableArg(AssignableArg object)
      {
        return createAssignableArgAdapter();
      }
      @Override
      public Adapter caseAssignable(Assignable object)
      {
        return createAssignableAdapter();
      }
      @Override
      public Adapter caseArg(Arg object)
      {
        return createArgAdapter();
      }
      @Override
      public Adapter caseArgLine(ArgLine object)
      {
        return createArgLineAdapter();
      }
      @Override
      public Adapter caseExplicitArgList(ExplicitArgList object)
      {
        return createExplicitArgListAdapter();
      }
      @Override
      public Adapter caseArgList(ArgList object)
      {
        return createArgListAdapter();
      }
      @Override
      public Adapter caseArray(Array object)
      {
        return createArrayAdapter();
      }
      @Override
      public Adapter caseDictionary(Dictionary object)
      {
        return createDictionaryAdapter();
      }
      @Override
      public Adapter caseDictItems(DictItems object)
      {
        return createDictItemsAdapter();
      }
      @Override
      public Adapter caseExplicitDictItems(ExplicitDictItems object)
      {
        return createExplicitDictItemsAdapter();
      }
      @Override
      public Adapter caseDictLine(DictLine object)
      {
        return createDictLineAdapter();
      }
      @Override
      public Adapter caseDictItem(DictItem object)
      {
        return createDictItemAdapter();
      }
      @Override
      public Adapter caseDictKey(DictKey object)
      {
        return createDictKeyAdapter();
      }
      @Override
      public Adapter caseLambda(Lambda object)
      {
        return createLambdaAdapter();
      }
      @Override
      public Adapter caseParam(Param object)
      {
        return createParamAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseBoolLiteral(BoolLiteral object)
      {
        return createBoolLiteralAdapter();
      }
      @Override
      public Adapter caseJSLiteral(JSLiteral object)
      {
        return createJSLiteralAdapter();
      }
      @Override
      public Adapter caseRegexLiteral(RegexLiteral object)
      {
        return createRegexLiteralAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseParenthetical(Parenthetical object)
      {
        return createParentheticalAdapter();
      }
      @Override
      public Adapter caseIf(If object)
      {
        return createIfAdapter();
      }
      @Override
      public Adapter caseFor(For object)
      {
        return createForAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter caseUntil(Until object)
      {
        return createUntilAdapter();
      }
      @Override
      public Adapter caseBinaryExp(BinaryExp object)
      {
        return createBinaryExpAdapter();
      }
      @Override
      public Adapter caseSuperCall(SuperCall object)
      {
        return createSuperCallAdapter();
      }
      @Override
      public Adapter caseThisAlone(ThisAlone object)
      {
        return createThisAloneAdapter();
      }
      @Override
      public Adapter caseLoop(Loop object)
      {
        return createLoopAdapter();
      }
      @Override
      public Adapter caseTryCatch(TryCatch object)
      {
        return createTryCatchAdapter();
      }
      @Override
      public Adapter caseSwitch(Switch object)
      {
        return createSwitchAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Root
   * @generated
   */
  public Adapter createRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Line
   * @generated
   */
  public Adapter createLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Stmt
   * @generated
   */
  public Adapter createStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.RequireStmt <em>Require Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.RequireStmt
   * @generated
   */
  public Adapter createRequireStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ReturnStmt <em>Return Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ReturnStmt
   * @generated
   */
  public Adapter createReturnStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ThrowStmt <em>Throw Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ThrowStmt
   * @generated
   */
  public Adapter createThrowStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.SuperClass <em>Super Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.SuperClass
   * @generated
   */
  public Adapter createSuperClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ClassDeclaration
   * @generated
   */
  public Adapter createClassDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.AssignedClassDeclaration <em>Assigned Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.AssignedClassDeclaration
   * @generated
   */
  public Adapter createAssignedClassDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ForValue <em>For Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ForValue
   * @generated
   */
  public Adapter createForValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ForSource <em>For Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ForSource
   * @generated
   */
  public Adapter createForSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Range
   * @generated
   */
  public Adapter createRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.FeatureCall <em>Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.FeatureCall
   * @generated
   */
  public Adapter createFeatureCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.PropertyAccess <em>Property Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.PropertyAccess
   * @generated
   */
  public Adapter createPropertyAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ThisProperty <em>This Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ThisProperty
   * @generated
   */
  public Adapter createThisPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.NamedPropertyAccess <em>Named Property Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.NamedPropertyAccess
   * @generated
   */
  public Adapter createNamedPropertyAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.IndexedPropertyAccess <em>Indexed Property Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.IndexedPropertyAccess
   * @generated
   */
  public Adapter createIndexedPropertyAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Index <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Index
   * @generated
   */
  public Adapter createIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Case
   * @generated
   */
  public Adapter createCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.IfExp <em>If Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.IfExp
   * @generated
   */
  public Adapter createIfExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.CondBlock <em>Cond Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.CondBlock
   * @generated
   */
  public Adapter createCondBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.IdRef <em>Id Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.IdRef
   * @generated
   */
  public Adapter createIdRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Id <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Id
   * @generated
   */
  public Adapter createIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.AssignableArray <em>Assignable Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.AssignableArray
   * @generated
   */
  public Adapter createAssignableArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.AssignableArgList <em>Assignable Arg List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.AssignableArgList
   * @generated
   */
  public Adapter createAssignableArgListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.AssignableArg <em>Assignable Arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.AssignableArg
   * @generated
   */
  public Adapter createAssignableArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Assignable <em>Assignable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Assignable
   * @generated
   */
  public Adapter createAssignableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Arg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Arg
   * @generated
   */
  public Adapter createArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ArgLine <em>Arg Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ArgLine
   * @generated
   */
  public Adapter createArgLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ExplicitArgList <em>Explicit Arg List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ExplicitArgList
   * @generated
   */
  public Adapter createExplicitArgListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ArgList <em>Arg List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ArgList
   * @generated
   */
  public Adapter createArgListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Array
   * @generated
   */
  public Adapter createArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Dictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Dictionary
   * @generated
   */
  public Adapter createDictionaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.DictItems <em>Dict Items</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.DictItems
   * @generated
   */
  public Adapter createDictItemsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ExplicitDictItems <em>Explicit Dict Items</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ExplicitDictItems
   * @generated
   */
  public Adapter createExplicitDictItemsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.DictLine <em>Dict Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.DictLine
   * @generated
   */
  public Adapter createDictLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.DictItem <em>Dict Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.DictItem
   * @generated
   */
  public Adapter createDictItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.DictKey <em>Dict Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.DictKey
   * @generated
   */
  public Adapter createDictKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Lambda <em>Lambda</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Lambda
   * @generated
   */
  public Adapter createLambdaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Param
   * @generated
   */
  public Adapter createParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.BoolLiteral <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.BoolLiteral
   * @generated
   */
  public Adapter createBoolLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.JSLiteral <em>JS Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.JSLiteral
   * @generated
   */
  public Adapter createJSLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.RegexLiteral <em>Regex Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.RegexLiteral
   * @generated
   */
  public Adapter createRegexLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Parenthetical <em>Parenthetical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Parenthetical
   * @generated
   */
  public Adapter createParentheticalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.If
   * @generated
   */
  public Adapter createIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.For
   * @generated
   */
  public Adapter createForAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Until <em>Until</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Until
   * @generated
   */
  public Adapter createUntilAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.BinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.BinaryExp
   * @generated
   */
  public Adapter createBinaryExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.SuperCall <em>Super Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.SuperCall
   * @generated
   */
  public Adapter createSuperCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.ThisAlone <em>This Alone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.ThisAlone
   * @generated
   */
  public Adapter createThisAloneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Loop
   * @generated
   */
  public Adapter createLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.TryCatch <em>Try Catch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.TryCatch
   * @generated
   */
  public Adapter createTryCatchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link csep.coffeeScript.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see csep.coffeeScript.Switch
   * @generated
   */
  public Adapter createSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CoffeeScriptAdapterFactory
