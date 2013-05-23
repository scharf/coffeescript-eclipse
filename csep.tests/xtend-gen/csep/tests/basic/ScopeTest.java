package csep.tests.basic;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class ScopeTest extends ParserTestBase {
  @Test
  public void testBuiltIn() {
    this.okNoWarning("console.log 3");
    this.okNoWarning("Math.PI");
    this.expect("missing.log 3", 0, 1);
  }
  
  @Test
  public void testRequire() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("foo = require(\'./foo\')");
    _builder.newLine();
    _builder.append("foo.bar()");
    _builder.newLine();
    this.okNoWarning(_builder);
  }
  
  @Test
  public void testAssignment() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a = 0");
    _builder.newLine();
    _builder.append("b = a + 1");
    _builder.newLine();
    this.okNoWarning(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("a = 1");
    _builder_1.newLine();
    _builder_1.append("a = 2");
    _builder_1.newLine();
    this.okNoWarning(_builder_1);
  }
  
  @Test
  public void testLambdaParameter() {
    this.okNoWarning("fun = (x) -> 2 * x");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fun = (x) ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("2 * x");
    _builder.newLine();
    this.okNoWarning(_builder);
  }
  
  @Test
  public void testForLoopParameter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a = 0");
    _builder.newLine();
    _builder.append("for i in [1..10]");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("a += i");
    _builder.newLine();
    this.okNoWarning(_builder);
  }
}
