package csep.tests.basic;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class AssignTest extends ParserTestBase {
  @Test
  public void testBasic() {
    this.ok("a = 3");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a = 3");
    _builder.newLine();
    _builder.append("b = 4");
    _builder.newLine();
    this.ok(_builder);
  }
  
  /**
   * Unfortunately, checking is not called by the testing framework,
   * so this one will succeed no matter what.
   */
  @Test
  public void testReassign() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a = 2");
    _builder.newLine();
    _builder.append("a = 3");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void testErrorInRewriter() {
    this.error("a = ]");
  }
  
  @Test
  public void testErrorInScanner() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("before = 1");
    _builder.newLine();
    _builder.append("case = 2");
    _builder.newLine();
    _builder.append("unreached = 3");
    _builder.newLine();
    this.error(_builder);
  }
  
  @Test
  public void testDestructure() {
    this.ok("[a, b] = [1, 2]");
  }
  
  @Test
  public void testBoolean() {
    this.ok("a or= 2");
    this.ok("a ||= 1");
    this.ok("a ?= b");
  }
  
  @Test
  public void testCompound() {
    this.ok("a = b = 1");
    this.ok("a = ++b");
    this.ok("[a, b, c] = [1, 2, 3]");
  }
  
  @Test
  public void testUnassignable() {
    this.error("1 = 2");
    this.error("(a + b) = 2");
    this.ok("foo.bar = 3");
    this.error("foo.bar() = 3");
  }
  
  @Test
  public void testThisProperty() {
    this.ok("@count = 1");
    this.ok("@server.production.name = \"local\"");
    this.ok("this.owner.age = 32");
  }
  
  @Test
  public void testProperty() {
    this.ok("a.b = 1");
    this.ok("Clazz::counter = 1");
  }
}
