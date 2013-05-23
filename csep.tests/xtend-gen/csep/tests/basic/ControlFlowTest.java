package csep.tests.basic;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

@SuppressWarnings("all")
public class ControlFlowTest extends ParserTestBase {
  @Test
  public void testBasicConditionals() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if a");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("1");
    _builder.newLine();
    this.ok(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("if a");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("1");
    _builder_1.newLine();
    _builder_1.append("else if b");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("2");
    _builder_1.newLine();
    this.ok(_builder_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("if a");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("1");
    _builder_2.newLine();
    _builder_2.append("else if b");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("2");
    _builder_2.newLine();
    _builder_2.append("else");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("3");
    _builder_2.newLine();
    this.ok(_builder_2);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("unless a");
    _builder_3.newLine();
    _builder_3.append("  ");
    _builder_3.append("1");
    _builder_3.newLine();
    this.ok(_builder_3);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("unless a");
    _builder_4.newLine();
    _builder_4.append("  ");
    _builder_4.append("1");
    _builder_4.newLine();
    _builder_4.append("else unless b");
    _builder_4.newLine();
    _builder_4.append("  ");
    _builder_4.append("2");
    _builder_4.newLine();
    this.ok(_builder_4);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("unless a");
    _builder_5.newLine();
    _builder_5.append("  ");
    _builder_5.append("1");
    _builder_5.newLine();
    _builder_5.append("else unless b");
    _builder_5.newLine();
    _builder_5.append("  ");
    _builder_5.append("2");
    _builder_5.newLine();
    _builder_5.append("else");
    _builder_5.newLine();
    _builder_5.append("  ");
    _builder_5.append("3");
    _builder_5.newLine();
    this.ok(_builder_5);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("if a");
    _builder_6.newLine();
    _builder_6.append("  ");
    _builder_6.append("1");
    _builder_6.newLine();
    _builder_6.append("else unless b");
    _builder_6.newLine();
    _builder_6.append("  ");
    _builder_6.append("2");
    _builder_6.newLine();
    this.ok(_builder_6);
    this.error("if a b");
    this.error("if a: b");
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append("if a");
    _builder_7.newLine();
    _builder_7.append("b");
    _builder_7.newLine();
    this.error(_builder_7);
  }
  
  @Test
  public void testReservedWords() {
    this.ok("if false then undefined else null");
  }
  
  @Test
  public void testSingleLineConditional() {
    this.ok("if something then 1 else 2");
    this.ok("unless nothing then 1 else 2");
  }
  
  @Test
  public void testNestedConditional() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if a");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("unless b");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if c then d else e");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void testEmptyConditionalBody() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if a");
    _builder.newLine();
    _builder.append("else if b");
    _builder.newLine();
    _builder.append("else");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void testNestedSingleLineConditional() {
    this.ok("if nothing then oops else b = if 0 then oops else nonce");
    this.ok("if nothing then oops else (if 0 then oops else nonce)");
    this.ok("if something then id(if nothing then oops else nonce)");
  }
  
  @Test
  public void testPostfixConditional() {
    this.ok("num = 42 if asked");
    this.ok("num = 0 unless more");
    this.ok("2 if you and me");
    this.ok("you + me if together");
  }
  
  @Test
  public void testForComprehension() {
    this.ok("2*i for i in numbers");
    this.ok("2*i for i in [0..5]");
    this.ok("2*i for i in numbers when i<4");
    this.ok("2*i for i in [0..5] when i<4");
    this.ok("\"${key} is ${value}\" for key, value of foo: 1, bar: 2");
  }
  
  @Test
  public void testForLoop() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sum = 0");
    _builder.newLine();
    _builder.append("for i in numbers");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("sum += i");
    _builder.newLine();
    this.ok(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("positiveSum = 0");
    _builder_1.newLine();
    _builder_1.append("for i in numbers when i>0");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("positiveSum += i");
    _builder_1.newLine();
    this.ok(_builder_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("doubles = for i in numbers");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("2*i");
    _builder_2.newLine();
    this.ok(_builder_2);
  }
  
  @Test
  public void testWhile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while i>0");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("i -= 1");
    _builder.newLine();
    this.ok(_builder);
    this.ok("buy() while supply > demand");
  }
  
  @Test
  public void testTryCatch() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("content = try");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("readFile()");
    _builder.newLine();
    _builder.append("catch IOException");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("null");
    _builder.newLine();
    this.ok(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("try");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("missionImpossible()");
    _builder_1.newLine();
    _builder_1.append("catch error");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("print error");
    _builder_1.newLine();
    _builder_1.append("finally");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("cleanUp()");
    _builder_1.newLine();
    this.ok(_builder_1);
  }
  
  @Test
  public void testSwitch() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("switch day");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("when \"Mon\" then go work");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("when \"Fri\", \"Sat\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if day is bingoDay");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("go bingo");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("else go work");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void testBreakContinue() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while true");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if somethingHappened()");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("break");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else if goOn()");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("continue");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("justWait()");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void testReturnIf() {
    this.ok("return if yes");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if yes");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return 1");
    _builder.newLine();
    this.ok(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("if yes");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("return");
    _builder_1.newLine();
    this.ok(_builder_1);
    this.ok("return 1 if yes");
  }
}
