package csep.tests.basic;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class ArrayTest extends ParserTestBase {
  @Test
  public void testBasic() {
    this.ok("[1, 2]");
    this.ok("a = [1, 2]");
    this.ok("a = []");
    this.ok("a = [1, 2].len");
  }
  
  @Test
  public void testLines() {
    this.ok("[1, 2,]");
    this.ok("[1, 2...]");
    this.error("[1,,]");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("indent = [1");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("2]");
    this.ok(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("[");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("1");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("2");
    _builder_1.newLine();
    _builder_1.append("]");
    this.ok(_builder_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("[");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("3, 4,");
    _builder_2.newLine();
    _builder_2.append("]");
    _builder_2.newLine();
    this.ok(_builder_2);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("c = [");
    _builder_3.newLine();
    _builder_3.append("  ");
    _builder_3.append("4...,");
    _builder_3.newLine();
    _builder_3.append("  ");
    _builder_3.append("5,6");
    _builder_3.newLine();
    _builder_3.append("    ");
    _builder_3.append("7");
    _builder_3.newLine();
    _builder_3.append("]");
    this.ok(_builder_3);
  }
  
  @Test
  public void testRangeVsArray() {
    this.ok("a = [1..3]");
  }
}
