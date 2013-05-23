/**
 */
package csep.coffeeScript.util;

import csep.coffeeScript.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see csep.coffeeScript.CoffeeScriptPackage
 * @generated
 */
public class CoffeeScriptSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CoffeeScriptPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoffeeScriptSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CoffeeScriptPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CoffeeScriptPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = caseBlock(body);
        if (result == null) result = caseRoot(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.LINE:
      {
        Line line = (Line)theEObject;
        T result = caseLine(line);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.STMT:
      {
        Stmt stmt = (Stmt)theEObject;
        T result = caseStmt(stmt);
        if (result == null) result = caseLine(stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseStmt(comment);
        if (result == null) result = caseLine(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.REQUIRE_STMT:
      {
        RequireStmt requireStmt = (RequireStmt)theEObject;
        T result = caseRequireStmt(requireStmt);
        if (result == null) result = caseStmt(requireStmt);
        if (result == null) result = caseLine(requireStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.RETURN_STMT:
      {
        ReturnStmt returnStmt = (ReturnStmt)theEObject;
        T result = caseReturnStmt(returnStmt);
        if (result == null) result = caseStmt(returnStmt);
        if (result == null) result = caseLine(returnStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.THROW_STMT:
      {
        ThrowStmt throwStmt = (ThrowStmt)theEObject;
        T result = caseThrowStmt(throwStmt);
        if (result == null) result = caseStmt(throwStmt);
        if (result == null) result = caseLine(throwStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.SUPER_CLASS:
      {
        SuperClass superClass = (SuperClass)theEObject;
        T result = caseSuperClass(superClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.CLASS_DECLARATION:
      {
        ClassDeclaration classDeclaration = (ClassDeclaration)theEObject;
        T result = caseClassDeclaration(classDeclaration);
        if (result == null) result = caseStmt(classDeclaration);
        if (result == null) result = caseAssignedClassDeclaration(classDeclaration);
        if (result == null) result = caseExpression(classDeclaration);
        if (result == null) result = caseLine(classDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ASSIGNED_CLASS_DECLARATION:
      {
        AssignedClassDeclaration assignedClassDeclaration = (AssignedClassDeclaration)theEObject;
        T result = caseAssignedClassDeclaration(assignedClassDeclaration);
        if (result == null) result = caseExpression(assignedClassDeclaration);
        if (result == null) result = caseLine(assignedClassDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseLine(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.FOR_VALUE:
      {
        ForValue forValue = (ForValue)theEObject;
        T result = caseForValue(forValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.FOR_SOURCE:
      {
        ForSource forSource = (ForSource)theEObject;
        T result = caseForSource(forSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.RANGE:
      {
        Range range = (Range)theEObject;
        T result = caseRange(range);
        if (result == null) result = casePrimaryExpression(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = caseExpression(application);
        if (result == null) result = caseLine(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.FEATURE_CALL:
      {
        FeatureCall featureCall = (FeatureCall)theEObject;
        T result = caseFeatureCall(featureCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = caseFeatureCall(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.PROPERTY_ACCESS:
      {
        PropertyAccess propertyAccess = (PropertyAccess)theEObject;
        T result = casePropertyAccess(propertyAccess);
        if (result == null) result = caseFeatureCall(propertyAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.THIS_PROPERTY:
      {
        ThisProperty thisProperty = (ThisProperty)theEObject;
        T result = caseThisProperty(thisProperty);
        if (result == null) result = casePrimaryExpression(thisProperty);
        if (result == null) result = caseParam(thisProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS:
      {
        NamedPropertyAccess namedPropertyAccess = (NamedPropertyAccess)theEObject;
        T result = caseNamedPropertyAccess(namedPropertyAccess);
        if (result == null) result = casePropertyAccess(namedPropertyAccess);
        if (result == null) result = caseFeatureCall(namedPropertyAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.INDEXED_PROPERTY_ACCESS:
      {
        IndexedPropertyAccess indexedPropertyAccess = (IndexedPropertyAccess)theEObject;
        T result = caseIndexedPropertyAccess(indexedPropertyAccess);
        if (result == null) result = casePropertyAccess(indexedPropertyAccess);
        if (result == null) result = caseFeatureCall(indexedPropertyAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.INDEX:
      {
        Index index = (Index)theEObject;
        T result = caseIndex(index);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.PRIMARY_EXPRESSION:
      {
        PrimaryExpression primaryExpression = (PrimaryExpression)theEObject;
        T result = casePrimaryExpression(primaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseRoot(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.CASE:
      {
        Case case_ = (Case)theEObject;
        T result = caseCase(case_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.IF_EXP:
      {
        IfExp ifExp = (IfExp)theEObject;
        T result = caseIfExp(ifExp);
        if (result == null) result = casePrimaryExpression(ifExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.COND_BLOCK:
      {
        CondBlock condBlock = (CondBlock)theEObject;
        T result = caseCondBlock(condBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ID_REF:
      {
        IdRef idRef = (IdRef)theEObject;
        T result = caseIdRef(idRef);
        if (result == null) result = casePrimaryExpression(idRef);
        if (result == null) result = caseProperty(idRef);
        if (result == null) result = caseSuperClass(idRef);
        if (result == null) result = caseVariable(idRef);
        if (result == null) result = caseExpression(idRef);
        if (result == null) result = caseAssignable(idRef);
        if (result == null) result = caseLine(idRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ID:
      {
        Id id = (Id)theEObject;
        T result = caseId(id);
        if (result == null) result = caseForValue(id);
        if (result == null) result = caseThisProperty(id);
        if (result == null) result = caseVariable(id);
        if (result == null) result = caseDictKey(id);
        if (result == null) result = casePrimaryExpression(id);
        if (result == null) result = caseParam(id);
        if (result == null) result = caseExpression(id);
        if (result == null) result = caseAssignable(id);
        if (result == null) result = caseLine(id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = caseSuperClass(property);
        if (result == null) result = caseVariable(property);
        if (result == null) result = caseExpression(property);
        if (result == null) result = caseAssignable(property);
        if (result == null) result = caseLine(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseExpression(variable);
        if (result == null) result = caseAssignable(variable);
        if (result == null) result = caseLine(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ASSIGNABLE_ARRAY:
      {
        AssignableArray assignableArray = (AssignableArray)theEObject;
        T result = caseAssignableArray(assignableArray);
        if (result == null) result = caseAssignable(assignableArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ASSIGNABLE_ARG_LIST:
      {
        AssignableArgList assignableArgList = (AssignableArgList)theEObject;
        T result = caseAssignableArgList(assignableArgList);
        if (result == null) result = caseAssignableArray(assignableArgList);
        if (result == null) result = caseAssignable(assignableArgList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ASSIGNABLE_ARG:
      {
        AssignableArg assignableArg = (AssignableArg)theEObject;
        T result = caseAssignableArg(assignableArg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ASSIGNABLE:
      {
        Assignable assignable = (Assignable)theEObject;
        T result = caseAssignable(assignable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ARG:
      {
        Arg arg = (Arg)theEObject;
        T result = caseArg(arg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ARG_LINE:
      {
        ArgLine argLine = (ArgLine)theEObject;
        T result = caseArgLine(argLine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.EXPLICIT_ARG_LIST:
      {
        ExplicitArgList explicitArgList = (ExplicitArgList)theEObject;
        T result = caseExplicitArgList(explicitArgList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ARG_LIST:
      {
        ArgList argList = (ArgList)theEObject;
        T result = caseArgList(argList);
        if (result == null) result = caseArray(argList);
        if (result == null) result = casePrimaryExpression(argList);
        if (result == null) result = caseParam(argList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.ARRAY:
      {
        Array array = (Array)theEObject;
        T result = caseArray(array);
        if (result == null) result = casePrimaryExpression(array);
        if (result == null) result = caseParam(array);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.DICTIONARY:
      {
        Dictionary dictionary = (Dictionary)theEObject;
        T result = caseDictionary(dictionary);
        if (result == null) result = casePrimaryExpression(dictionary);
        if (result == null) result = caseAssignable(dictionary);
        if (result == null) result = caseParam(dictionary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.DICT_ITEMS:
      {
        DictItems dictItems = (DictItems)theEObject;
        T result = caseDictItems(dictItems);
        if (result == null) result = caseDictionary(dictItems);
        if (result == null) result = casePrimaryExpression(dictItems);
        if (result == null) result = caseAssignable(dictItems);
        if (result == null) result = caseParam(dictItems);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.EXPLICIT_DICT_ITEMS:
      {
        ExplicitDictItems explicitDictItems = (ExplicitDictItems)theEObject;
        T result = caseExplicitDictItems(explicitDictItems);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.DICT_LINE:
      {
        DictLine dictLine = (DictLine)theEObject;
        T result = caseDictLine(dictLine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.DICT_ITEM:
      {
        DictItem dictItem = (DictItem)theEObject;
        T result = caseDictItem(dictItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.DICT_KEY:
      {
        DictKey dictKey = (DictKey)theEObject;
        T result = caseDictKey(dictKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.LAMBDA:
      {
        Lambda lambda = (Lambda)theEObject;
        T result = caseLambda(lambda);
        if (result == null) result = casePrimaryExpression(lambda);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.PARAM:
      {
        Param param = (Param)theEObject;
        T result = caseParam(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseLiteral(numberLiteral);
        if (result == null) result = casePrimaryExpression(numberLiteral);
        if (result == null) result = caseDictKey(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseLiteral(stringLiteral);
        if (result == null) result = casePrimaryExpression(stringLiteral);
        if (result == null) result = caseDictKey(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.BOOL_LITERAL:
      {
        BoolLiteral boolLiteral = (BoolLiteral)theEObject;
        T result = caseBoolLiteral(boolLiteral);
        if (result == null) result = caseLiteral(boolLiteral);
        if (result == null) result = casePrimaryExpression(boolLiteral);
        if (result == null) result = caseDictKey(boolLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.JS_LITERAL:
      {
        JSLiteral jsLiteral = (JSLiteral)theEObject;
        T result = caseJSLiteral(jsLiteral);
        if (result == null) result = caseLiteral(jsLiteral);
        if (result == null) result = casePrimaryExpression(jsLiteral);
        if (result == null) result = caseDictKey(jsLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.REGEX_LITERAL:
      {
        RegexLiteral regexLiteral = (RegexLiteral)theEObject;
        T result = caseRegexLiteral(regexLiteral);
        if (result == null) result = caseLiteral(regexLiteral);
        if (result == null) result = casePrimaryExpression(regexLiteral);
        if (result == null) result = caseDictKey(regexLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = casePrimaryExpression(literal);
        if (result == null) result = caseDictKey(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.PARENTHETICAL:
      {
        Parenthetical parenthetical = (Parenthetical)theEObject;
        T result = caseParenthetical(parenthetical);
        if (result == null) result = casePrimaryExpression(parenthetical);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.IF:
      {
        If if_ = (If)theEObject;
        T result = caseIf(if_);
        if (result == null) result = caseExpression(if_);
        if (result == null) result = caseLine(if_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.FOR:
      {
        For for_ = (For)theEObject;
        T result = caseFor(for_);
        if (result == null) result = caseExpression(for_);
        if (result == null) result = casePrimaryExpression(for_);
        if (result == null) result = caseLine(for_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.WHILE:
      {
        While while_ = (While)theEObject;
        T result = caseWhile(while_);
        if (result == null) result = caseExpression(while_);
        if (result == null) result = casePrimaryExpression(while_);
        if (result == null) result = caseLine(while_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.UNTIL:
      {
        Until until = (Until)theEObject;
        T result = caseUntil(until);
        if (result == null) result = caseExpression(until);
        if (result == null) result = casePrimaryExpression(until);
        if (result == null) result = caseLine(until);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.BINARY_EXP:
      {
        BinaryExp binaryExp = (BinaryExp)theEObject;
        T result = caseBinaryExp(binaryExp);
        if (result == null) result = caseExpression(binaryExp);
        if (result == null) result = caseLine(binaryExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.SUPER_CALL:
      {
        SuperCall superCall = (SuperCall)theEObject;
        T result = caseSuperCall(superCall);
        if (result == null) result = caseApplication(superCall);
        if (result == null) result = caseExpression(superCall);
        if (result == null) result = caseLine(superCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.THIS_ALONE:
      {
        ThisAlone thisAlone = (ThisAlone)theEObject;
        T result = caseThisAlone(thisAlone);
        if (result == null) result = casePrimaryExpression(thisAlone);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.LOOP:
      {
        Loop loop = (Loop)theEObject;
        T result = caseLoop(loop);
        if (result == null) result = casePrimaryExpression(loop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.TRY_CATCH:
      {
        TryCatch tryCatch = (TryCatch)theEObject;
        T result = caseTryCatch(tryCatch);
        if (result == null) result = casePrimaryExpression(tryCatch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CoffeeScriptPackage.SWITCH:
      {
        csep.coffeeScript.Switch switch_ = (csep.coffeeScript.Switch)theEObject;
        T result = caseSwitch(switch_);
        if (result == null) result = casePrimaryExpression(switch_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLine(Line object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStmt(Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Require Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Require Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequireStmt(RequireStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnStmt(ReturnStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Throw Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Throw Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThrowStmt(ThrowStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Super Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Super Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuperClass(SuperClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDeclaration(ClassDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assigned Class Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assigned Class Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignedClassDeclaration(AssignedClassDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForValue(ForValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForSource(ForSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRange(Range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureCall(FeatureCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyAccess(PropertyAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>This Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>This Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThisProperty(ThisProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Property Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Property Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedPropertyAccess(NamedPropertyAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indexed Property Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indexed Property Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexedPropertyAccess(IndexedPropertyAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndex(Index object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryExpression(PrimaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase(Case object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfExp(IfExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cond Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cond Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondBlock(CondBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdRef(IdRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseId(Id object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignable Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignable Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignableArray(AssignableArray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignable Arg List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignable Arg List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignableArgList(AssignableArgList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignable Arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignable Arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignableArg(AssignableArg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignable(Assignable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArg(Arg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgLine(ArgLine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Explicit Arg List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Explicit Arg List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExplicitArgList(ExplicitArgList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgList(ArgList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray(Array object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dictionary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dictionary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictionary(Dictionary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dict Items</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dict Items</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictItems(DictItems object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Explicit Dict Items</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Explicit Dict Items</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExplicitDictItems(ExplicitDictItems object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dict Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dict Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictLine(DictLine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dict Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dict Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictItem(DictItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dict Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dict Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictKey(DictKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lambda</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lambda</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLambda(Lambda object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam(Param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolLiteral(BoolLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JS Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JS Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJSLiteral(JSLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regex Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regex Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegexLiteral(RegexLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthetical</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthetical</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthetical(Parenthetical object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf(If object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor(For object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile(While object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Until</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Until</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUntil(Until object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExp(BinaryExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Super Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Super Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuperCall(SuperCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>This Alone</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>This Alone</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThisAlone(ThisAlone object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoop(Loop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Try Catch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Try Catch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTryCatch(TryCatch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch(csep.coffeeScript.Switch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CoffeeScriptSwitch
