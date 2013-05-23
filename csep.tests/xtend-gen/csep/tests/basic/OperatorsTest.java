package csep.tests.basic;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class OperatorsTest extends ParserTestBase {
  @Test
  public void testBinary() {
    this.ok("3 + 2");
    this.ok("4+5");
    this.error("a +");
  }
  
  @Test
  public void testUnaryWithBinary() {
    this.ok("a*-b");
    this.ok("a * -b");
    this.ok("a? + b");
    this.ok("a?+b");
    this.ok("++a - b");
  }
  
  @Test
  public void testCompound() {
    this.ok("1 + 2 * 3");
    this.ok("(1 + 2) * 3");
    this.ok("foo + bar");
    this.ok("(2 == 3) + (2 < 4)");
  }
  
  @Test
  public void testNewLine() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("3 +");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("5");
    this.ok(_builder);
  }
  
  @Test
  public void testBitwise() {
    this.ok("10 &   3");
    this.ok("10 |   3");
    this.ok("10 ^   3");
    this.ok("10 <<  3");
    this.ok("10 >>  3");
    this.ok("10 >>> 3");
    this.ok("num &=   3");
    this.ok("num |=   3");
    this.ok("num ^=   3");
    this.ok("num <<=  3");
    this.ok("num >>=  3");
    this.ok("num >>>= 3");
  }
  
  @Test
  public void testMultipleOperators() {
    this.ok("- -1");
    this.error("--1");
  }
  
  @Test
  public void testInstanceof() {
    this.ok("new String instanceof String");
    this.ok("new Boolean instanceof Boolean");
    this.ok("new Number not instanceof String");
    this.ok("new Array not instanceof Boolean");
  }
  
  @Test
  public void testExistential() {
    this.ok("a ? b");
    this.ok("nothing ? -1");
    this.ok("defined?");
    this.ok("!nothing?");
    this.ok("(1 or 0)?");
  }
  
  @Test
  public void testChainable() {
    this.ok("a < b < c");
  }
  
  @Test
  public void testCombinedComparisons() {
    this.ok("a < b > c");
    this.ok("10 < 20 > 2+3 is 5");
  }
  
  @Test
  public void testThisProperty() {
    this.ok("@foo + this.bar");
  }
}
