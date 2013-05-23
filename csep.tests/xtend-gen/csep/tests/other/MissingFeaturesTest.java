package csep.tests.other;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class MissingFeaturesTest extends ParserTestBase {
  @Test
  public void testPostIncrement() {
    this.shouldBeOk("a++ + b");
  }
  
  @Test
  public void testPropertyAssignment() {
    this.shouldBeOk("a.b.c = 1");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("temp = a.b");
    _builder.newLine();
    _builder.append("temp.c = 1");
    _builder.newLine();
    this.ok(_builder);
    this.shouldBeOk("f().a = 2");
    this.shouldBeOk("(1 + 2).len = 3");
  }
  
  @Test
  public void testForComprehensionWithBareRange() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cnt = 0");
    _builder.newLine();
    _builder.append("cnt += 1 for [0..5]");
    _builder.newLine();
    this.shouldBeOk(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("cnt = 0");
    _builder_1.newLine();
    _builder_1.append("for i in [0..5]");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("cnt += 1");
    _builder_1.newLine();
    this.ok(_builder_1);
  }
  
  @Test
  public void testForComprehensionWithCompoundLoopVariable() {
    this.shouldBeOk("i+j for [i, j] in matrix");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for elem in matrix");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("[i, j] = elem");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void testLoopWithExpression() {
    this.shouldBeOk("a = loop readInfo()");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a = loop");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("readInfo()");
    _builder.newLine();
    this.ok(_builder);
    this.ok("a = readInfo() while true");
  }
  
  @Test
  public void testClass() {
    this.shouldBeOk("class a.b.c");
    this.shouldBeOk("c = class extends Foo");
    this.shouldBeOk("class A extends B extends C");
    this.shouldBeOk("class \"str\".length");
    this.shouldBeOk("class A extends 3");
  }
  
  /**
   * Lambda variable outside of its scoping shouldn't be resolved,
   * thus it should give a warning
   */
  @Test
  public void testLambdaScoping() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fun = (x) ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("2 * x");
    _builder.newLine();
    _builder.append("x");
    _builder.newLine();
    this.okNoWarning(_builder);
  }
  
  /**
   * @see {NodesCoffeeTest.testOp}
   */
  @Test
  public void testKeywordAsFeatureName() {
    this.shouldBeOk("foo.do = 1");
    this.shouldBeOk("bar.class = \"Anything\"");
  }
  
  /**
   * @see {NodesCoffeeTest.testObj}
   */
  @Test
  public void testCompoundAssignable() {
    this.shouldBeOk("(a or b).prop = 3");
  }
}
