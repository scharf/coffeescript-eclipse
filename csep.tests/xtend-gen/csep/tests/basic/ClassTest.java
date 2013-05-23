package csep.tests.basic;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class ClassTest extends ParserTestBase {
  @Test
  public void testBasic() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class NicePerson extends Person");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("firstName: \"John\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("lastName: \"Doe\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("introduce: -> print \"I am #{firstName} #{lastName}\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("greet: (other) ->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("print \"Hello #{other}\"");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void testMethods() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class A");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("constructor: (@name) ->");
    _builder.newLine();
    this.ok(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class Drinker extends Person");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("drink: ->");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("@glasses += 1");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("super 2");
    _builder_1.newLine();
    this.ok(_builder_1);
  }
  
  @Test
  public void testAssign() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("exports.Scope = class Scope");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("root: null");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void testConstructor() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class Scope");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("# Comment");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("constructor: (@param) ->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@bar = 0");
    _builder.newLine();
    this.ok(_builder);
  }
}
