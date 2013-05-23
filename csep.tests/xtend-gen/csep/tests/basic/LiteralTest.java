package csep.tests.basic;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class LiteralTest extends ParserTestBase {
  @Test
  public void testEmbedJS() {
    this.ok("`var i`");
  }
  
  @Test
  public void testRegex() {
    this.ok("/.*/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("///");
    _builder.newLine();
    _builder.append("  ");
    _builder.append(".*");
    _builder.newLine();
    _builder.append("///");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void testHerecomment() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("###");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("1/");
    _builder.newLine();
    _builder.append("###");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void testComment() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# before");
    _builder.newLine();
    _builder.append("a = 0");
    _builder.newLine();
    this.ok(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("a = 0");
    _builder_1.newLine();
    _builder_1.append("# between");
    _builder_1.newLine();
    _builder_1.append("a = 1");
    _builder_1.newLine();
    this.ok(_builder_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("a = 0");
    _builder_2.newLine();
    _builder_2.append("# after");
    _builder_2.newLine();
    this.ok(_builder_2);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("if good");
    _builder_3.newLine();
    _builder_3.append("  ");
    _builder_3.append("# do it");
    _builder_3.newLine();
    _builder_3.append("  ");
    _builder_3.append("doIt()");
    _builder_3.newLine();
    this.ok(_builder_3);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("fun = (x) ->");
    _builder_4.newLine();
    _builder_4.append("  ");
    _builder_4.append("# do something");
    _builder_4.newLine();
    _builder_4.append("  ");
    _builder_4.append("x + 1");
    _builder_4.newLine();
    this.ok(_builder_4);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("a = 1");
    _builder_5.newLine();
    _builder_5.append("#remark");
    _builder_5.newLine();
    _builder_5.append("bb = a");
    _builder_5.newLine();
    this.okNoWarning(_builder_5);
  }
  
  @Test
  public void testStringInterpolation() {
    this.ok("me = \"I am #{firstName} #{lastName}\"");
    this.error("\"It is #{ ++1 }\" exactly");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("name = \"Joe\"");
    _builder.newLine();
    _builder.append("me = \"I am #{name}\"");
    _builder.newLine();
    this.okNoWarning(_builder);
  }
}
