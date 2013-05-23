package csep.tests.basic;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class DictionaryTest extends ParserTestBase {
  @Test
  public void testBasic() {
    this.ok("obj = {name: \"Jack\", age: 32}");
  }
  
  @Test
  public void testYamlStyle() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("config = ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("name: \"Jack\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("age: 32");
    _builder.newLine();
    this.ok(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("config =");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("development:");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("server: \'localhost\'");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("timeout: 10");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("production:");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("server: \'dreamhost\', port: 8000");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("timeout: 1000");
    _builder_1.newLine();
    this.ok(_builder_1);
  }
}
