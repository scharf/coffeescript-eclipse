/**
 */
package csep.example.cake.cakefile.impl;

import csep.example.cake.cakefile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CakefileFactoryImpl extends EFactoryImpl implements CakefileFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CakefileFactory init()
  {
    try
    {
      CakefileFactory theCakefileFactory = (CakefileFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.example.csep/cake/Cakefile"); 
      if (theCakefileFactory != null)
      {
        return theCakefileFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CakefileFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CakefileFactoryImpl()
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
      case CakefilePackage.CAKEFILE: return createCakefile();
      case CakefilePackage.TASK_DECLARATION: return createTaskDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cakefile createCakefile()
  {
    CakefileImpl cakefile = new CakefileImpl();
    return cakefile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDeclaration createTaskDeclaration()
  {
    TaskDeclarationImpl taskDeclaration = new TaskDeclarationImpl();
    return taskDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CakefilePackage getCakefilePackage()
  {
    return (CakefilePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CakefilePackage getPackage()
  {
    return CakefilePackage.eINSTANCE;
  }

} //CakefileFactoryImpl
