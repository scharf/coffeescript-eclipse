package csep.tests.other;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class CakefileTest extends ParserTestBase {
  @Test
  public void testSimple() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("task \"doit\", \"describe\", ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("answer = 42");
    this.ok(_builder);
  }
}
