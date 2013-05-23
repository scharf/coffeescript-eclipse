package csep.tests.basic;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class LambdaTest extends ParserTestBase {
  @Test
  public void testBasic() {
    this.ok("-> 2");
    this.ok("() -> 3");
    this.ok("(x) -> 2 * x");
    this.ok("(x, y) -> x * y");
    this.ok("(x=1, y) -> x * y");
  }
  
  @Test
  public void testMultiline() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fun = ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("3");
    this.ok(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("fun = (x) ->");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("print x");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("2 * x");
    _builder_1.newLine();
    this.ok(_builder_1);
  }
}
