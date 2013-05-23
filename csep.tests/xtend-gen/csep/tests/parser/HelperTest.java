package csep.tests.parser;

import csep.parser.Helper;
import junit.framework.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class HelperTest {
  @Test
  public void testAssignmentBlock() {
    this.block("a =");
    this.block("  a =");
    this.block("\ta =");
    this.block("a = ");
    this.block("a=");
    this.block("a or=");
  }
  
  @Test
  public void testConditionalBlock() {
    this.block("if a");
    this.block("unless a");
    this.block("else");
    this.block("else if num == 42");
    this.noBlock("if zero then 0 else 1");
    this.noBlock("a = 0 if zero");
    this.noBlock("ifValid()");
    this.block("switch day");
    this.block("when \"Monday\"");
    this.noBlock("when \"Sunday\" then sleep()");
  }
  
  @Test
  public void testOtherBlock() {
    this.block("for a in [1..10]");
    this.noBlock("a = for a in [1..10]");
    this.block("fun = (x) ->");
    this.block("while x > 0");
    this.block("try");
    this.block("catch error");
    this.block("finally");
    this.block("class Foo");
    this.block("class Foo extends Bar");
    this.block("key:");
  }
  
  public void block(final String line) {
    boolean _isBlockContainer = Helper.isBlockContainer(line);
    Assert.assertTrue(_isBlockContainer);
  }
  
  public void noBlock(final String line) {
    boolean _isBlockContainer = Helper.isBlockContainer(line);
    Assert.assertFalse(_isBlockContainer);
  }
}
