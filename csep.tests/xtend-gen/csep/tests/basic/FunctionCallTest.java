package csep.tests.basic;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class FunctionCallTest extends ParserTestBase {
  @Test
  public void testProperty() {
    this.ok("foo.bar");
    this.ok("foo.bar.baz");
    this.ok("\"text\".len");
    this.ok("a.size + b.getSize()");
  }
  
  @Test
  public void testCallSimple() {
    this.ok("foo()");
    this.ok("list.pop()");
    this.ok("\"text\".trim()");
    this.ok("list.pop().remove()");
  }
  
  @Test
  public void testAssignProperty() {
    this.ok("a.b = 1");
  }
  
  @Test
  public void testParameters() {
    this.ok("fun(2)");
    this.ok("fun(2,3)");
    this.ok("fun 4");
    this.ok("print \"Hi, \" + @name");
    this.ok("print @count + \" pieces\"");
    this.error("fun 4 5");
    this.ok("fun 4,5");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fun(");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("6");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("7");
    _builder.newLine();
    _builder.append(")");
    this.ok(_builder);
    this.ok("fun(named=42, 9)");
  }
}
