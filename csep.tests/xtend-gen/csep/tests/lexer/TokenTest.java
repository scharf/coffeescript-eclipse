package csep.tests.lexer;

import csep.parser.Lexer;
import csep.tests.ParserTestBase;
import java.util.List;
import junit.framework.Assert;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Test;

@SuppressWarnings("all")
public class TokenTest extends ParserTestBase {
  @Test
  public void testBasic() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("number = 42");
    _builder.newLine();
    _builder.append("answer=42");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("IDENTIFIER:number");
    _builder_1.newLine();
    _builder_1.append("EQUAL:=");
    _builder_1.newLine();
    _builder_1.append("NUMBER:42");
    _builder_1.newLine();
    _builder_1.append("TERMINATOR:");
    _builder_1.newLine();
    _builder_1.append("IDENTIFIER:answer");
    _builder_1.newLine();
    _builder_1.append("EQUAL:=");
    _builder_1.newLine();
    _builder_1.append("NUMBER:42");
    _builder_1.newLine();
    _builder_1.append("TERMINATOR:");
    _builder_1.newLine();
    this.check(_builder, _builder_1);
  }
  
  @Test
  public void testIncomplete() {
    this.checkCount("", 0);
    this.checkCount("if ", 2);
    this.checkCount("if a ", 3);
  }
  
  @Test
  public void testMoreOutdents() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a = 1");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("b");
    _builder.newLine();
    _builder.append("c");
    _builder.newLine();
    this.checkCount(_builder, 9);
  }
  
  @Test
  public void testErrorInRewriter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("before = 0");
    _builder.newLine();
    _builder.append("tooManyParens = )");
    _builder.newLine();
    _builder.append("unreached = 42");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("IDENTIFIER:before");
    _builder_1.newLine();
    _builder_1.append("EQUAL:=");
    _builder_1.newLine();
    _builder_1.append("NUMBER:0");
    _builder_1.newLine();
    _builder_1.append("TERMINATOR:");
    _builder_1.newLine();
    _builder_1.append("IDENTIFIER:tooManyParens");
    _builder_1.newLine();
    _builder_1.append("EQUAL:=");
    _builder_1.newLine();
    this.check(_builder, _builder_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("before = 0");
    _builder_2.newLine();
    _builder_2.append("unclosedParen = (");
    _builder_2.newLine();
    _builder_2.append("unreached = 42");
    _builder_2.newLine();
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("IDENTIFIER:before");
    _builder_3.newLine();
    _builder_3.append("EQUAL:=");
    _builder_3.newLine();
    _builder_3.append("NUMBER:0");
    _builder_3.newLine();
    _builder_3.append("TERMINATOR:");
    _builder_3.newLine();
    _builder_3.append("IDENTIFIER:unclosedParen");
    _builder_3.newLine();
    _builder_3.append("EQUAL:=");
    _builder_3.newLine();
    this.check(_builder_2, _builder_3);
  }
  
  @Test
  public void testErrorInScanner() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("before = 0");
    _builder.newLine();
    _builder.append("case = 1");
    _builder.newLine();
    _builder.append("unreached = 42");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("IDENTIFIER:before");
    _builder_1.newLine();
    _builder_1.append("EQUAL:=");
    _builder_1.newLine();
    _builder_1.append("NUMBER:0");
    _builder_1.newLine();
    _builder_1.append("TERMINATOR:");
    _builder_1.newLine();
    this.check(_builder, _builder_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("IDENTIFIER:unclosedCurlyBrace");
    _builder_2.newLine();
    _builder_2.append("EQUAL:=");
    _builder_2.newLine();
    this.check("unclosedCurlyBrace = \"before #{ interpolation \"", _builder_2);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("IDENTIFIER:unfinishedString");
    _builder_3.newLine();
    _builder_3.append("EQUAL:=");
    _builder_3.newLine();
    this.check("unfinishedString = \"before #{ interpolation", _builder_3);
  }
  
  @Test
  public void testPostfixIf() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IDENTIFIER:num");
    _builder.newLine();
    _builder.append("EQUAL:=");
    _builder.newLine();
    _builder.append("NUMBER:2");
    _builder.newLine();
    _builder.append("POST_IF:if");
    _builder.newLine();
    _builder.append("IDENTIFIER:even");
    _builder.newLine();
    _builder.append("TERMINATOR:");
    _builder.newLine();
    this.check("num = 2 if even", _builder);
  }
  
  @Test
  public void testHerecomment() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("before");
    _builder.newLine();
    _builder.append("###");
    _builder.newLine();
    _builder.append("Comment");
    _builder.newLine();
    _builder.append("###");
    _builder.newLine();
    _builder.append("after");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("IDENTIFIER:before");
    _builder_1.newLine();
    _builder_1.append("TERMINATOR:");
    _builder_1.newLine();
    _builder_1.append("HERECOMMENT:Comment");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("TERMINATOR:");
    _builder_1.newLine();
    _builder_1.append("IDENTIFIER:after");
    _builder_1.newLine();
    _builder_1.append("TERMINATOR:");
    _builder_1.newLine();
    this.check(_builder, _builder_1);
  }
  
  @Test
  public void testComment() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# remark");
    _builder.newLine();
    _builder.append("a = 1");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("IDENTIFIER:a");
    _builder_1.newLine();
    _builder_1.append("EQUAL:=");
    _builder_1.newLine();
    _builder_1.append("NUMBER:1");
    _builder_1.newLine();
    _builder_1.append("TERMINATOR:    \t");
    _builder_1.newLine();
    this.check(_builder, _builder_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("#### Important remark, not herecomment");
    _builder_2.newLine();
    _builder_2.append("a = 1");
    _builder_2.newLine();
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("IDENTIFIER:a");
    _builder_3.newLine();
    _builder_3.append("EQUAL:=");
    _builder_3.newLine();
    _builder_3.append("NUMBER:1");
    _builder_3.newLine();
    _builder_3.append("TERMINATOR:    \t");
    _builder_3.newLine();
    this.check(_builder_2, _builder_3);
  }
  
  @Test
  public void testStringInterpolation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IDENTIFIER:me");
    _builder.newLine();
    _builder.append("EQUAL:=");
    _builder.newLine();
    _builder.append("LPAREN:(");
    _builder.newLine();
    _builder.append("STRING:\"I am \"");
    _builder.newLine();
    _builder.append("PLUS:+");
    _builder.newLine();
    _builder.append("IDENTIFIER:name");
    _builder.newLine();
    _builder.append("RPAREN:)");
    _builder.newLine();
    _builder.append("TERMINATOR:");
    _builder.newLine();
    this.check("me = \"I am #{name}\"", _builder);
  }
  
  @Test
  public void testFirstLineIndented() {
    this.ok("  a = 3");
    this.ok("a = 3  ");
  }
  
  public void check(final CharSequence input, final CharSequence expectedStr) {
    try {
      Lexer _lexer = new Lexer(input);
      final Lexer lexer = _lexer;
      final List<String> tokens = lexer.tokenizeToStrings();
      final String tokensStr = IterableExtensions.join(tokens, "\n");
      String _string = expectedStr.toString();
      String _trim = _string.trim();
      Assert.assertEquals(_trim, tokensStr);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void checkCount(final CharSequence input, final int expectLength) {
    try {
      Lexer _lexer = new Lexer(input);
      final Lexer lexer = _lexer;
      final List<String> tokens = lexer.tokenizeToStrings();
      int _size = tokens.size();
      Assert.assertEquals(expectLength, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
