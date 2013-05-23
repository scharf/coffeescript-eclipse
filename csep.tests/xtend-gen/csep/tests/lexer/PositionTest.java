package csep.tests.lexer;

import csep.parser.Helper;
import csep.parser.Lexer;
import csep.tests.ParserTestBase;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.antlr.runtime.CommonToken;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Test;

@SuppressWarnings("all")
public class PositionTest extends ParserTestBase {
  @Test
  public void test_comment() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("value = 0");
    _builder.newLine();
    _builder.append("#complete");
    _builder.newLine();
    _builder.append("a = value");
    _builder.newLine();
    _builder.append("#spaces  ");
    _builder.newLine();
    _builder.append("b = value");
    _builder.newLine();
    final String input = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("IDENTIFIER:value:0:4");
    _builder_1.newLine();
    _builder_1.append("EQUAL:=:6:6");
    _builder_1.newLine();
    _builder_1.append("NUMBER:0:8:8");
    _builder_1.newLine();
    _builder_1.append("TERMINATOR::19:19");
    _builder_1.newLine();
    _builder_1.append("IDENTIFIER:a:20:20");
    _builder_1.newLine();
    _builder_1.append("EQUAL:=:22:22");
    _builder_1.newLine();
    _builder_1.append("IDENTIFIER:value:24:28");
    _builder_1.newLine();
    _builder_1.append("TERMINATOR::39:39");
    _builder_1.newLine();
    _builder_1.append("IDENTIFIER:b:40:40");
    _builder_1.newLine();
    _builder_1.append("EQUAL:=:42:42");
    _builder_1.newLine();
    _builder_1.append("IDENTIFIER:value:44:48");
    _builder_1.newLine();
    _builder_1.append("TERMINATOR::49:48");
    _builder_1.newLine();
    this.checkTokenPositions(input, _builder_1);
  }
  
  @Test
  public void test_stringInterpolation_simple() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("LPAREN:(:0:-1");
    _builder.newLine();
    _builder.append("STRING:\"before \":0:8");
    _builder.newLine();
    _builder.append("PLUS:+:10:9");
    _builder.newLine();
    _builder.append("IDENTIFIER:ref:10:12");
    _builder.newLine();
    _builder.append("RPAREN:):13:12");
    _builder.newLine();
    _builder.append("TERMINATOR::15:14");
    _builder.newLine();
    this.checkTokenPositions(
      "\"before #{ref}\"", _builder);
  }
  
  @Test
  public void test_stringInterpolation_simpleWithStringAfter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("LPAREN:(:0:-1");
    _builder.newLine();
    _builder.append("STRING:\"before \":0:8");
    _builder.newLine();
    _builder.append("PLUS:+:10:9");
    _builder.newLine();
    _builder.append("IDENTIFIER:ref:10:12");
    _builder.newLine();
    _builder.append("PLUS:+:13:12");
    _builder.newLine();
    _builder.append("STRING:\" after\":13:20");
    _builder.newLine();
    _builder.append("RPAREN:):19:18");
    _builder.newLine();
    _builder.append("TERMINATOR::21:20");
    _builder.newLine();
    this.checkTokenPositions(
      "\"before #{ref} after\"", _builder);
  }
  
  @Test
  public void test_stringInterpolation_moreExpressions() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("LPAREN:(:0:-1");
    _builder.newLine();
    _builder.append("STRING:\"before \":0:8");
    _builder.newLine();
    _builder.append("PLUS:+:10:9");
    _builder.newLine();
    _builder.append("IDENTIFIER:ref:10:12");
    _builder.newLine();
    _builder.append("PLUS:+:13:12");
    _builder.newLine();
    _builder.append("STRING:\" and \":13:19");
    _builder.newLine();
    _builder.append("PLUS:+:21:20");
    _builder.newLine();
    _builder.append("IDENTIFIER:other:21:25");
    _builder.newLine();
    _builder.append("RPAREN:):26:25");
    _builder.newLine();
    _builder.append("TERMINATOR::28:27");
    _builder.newLine();
    this.checkTokenPositions(
      "\"before #{ref} and #{other}\"", _builder);
  }
  
  @Test
  public void test_stringInterpolation_offset() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IDENTIFIER:me:0:1");
    _builder.newLine();
    _builder.append("EQUAL:=:3:3");
    _builder.newLine();
    _builder.append("LPAREN:(:5:4");
    _builder.newLine();
    _builder.append("STRING:\"before \":5:13");
    _builder.newLine();
    _builder.append("PLUS:+:15:14");
    _builder.newLine();
    _builder.append("IDENTIFIER:ref:15:17");
    _builder.newLine();
    _builder.append("RPAREN:):18:17");
    _builder.newLine();
    _builder.append("TERMINATOR::20:19");
    _builder.newLine();
    this.checkTokenPositions(
      "me = \"before #{ref}\"", _builder);
  }
  
  @Test
  public void test_stringInterpolation_offsetWithStringAfter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IDENTIFIER:me:0:1");
    _builder.newLine();
    _builder.append("EQUAL:=:3:3");
    _builder.newLine();
    _builder.append("LPAREN:(:5:4");
    _builder.newLine();
    _builder.append("STRING:\"before \":5:13");
    _builder.newLine();
    _builder.append("PLUS:+:15:14");
    _builder.newLine();
    _builder.append("IDENTIFIER:ref:15:17");
    _builder.newLine();
    _builder.append("PLUS:+:18:17");
    _builder.newLine();
    _builder.append("STRING:\" after\":18:25");
    _builder.newLine();
    _builder.append("RPAREN:):24:23");
    _builder.newLine();
    _builder.append("TERMINATOR::26:25");
    _builder.newLine();
    this.checkTokenPositions(
      "me = \"before #{ref} after\"", _builder);
  }
  
  @Test
  public void test_stringInterpolation_spaceAroundExpression() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("LPAREN:(:0:-1");
    _builder.newLine();
    _builder.append("STRING:\"before \":0:8");
    _builder.newLine();
    _builder.append("PLUS:+:10:9");
    _builder.newLine();
    _builder.append("LPAREN:(:10:9");
    _builder.newLine();
    _builder.append("INDENT:1:10:9");
    _builder.newLine();
    _builder.append("IDENTIFIER:ref:11:13");
    _builder.newLine();
    _builder.append("OUTDENT:1:14:13");
    _builder.newLine();
    _builder.append("RPAREN:):17:16");
    _builder.newLine();
    _builder.append("RPAREN:):15:14");
    _builder.newLine();
    _builder.append("TERMINATOR::17:16");
    _builder.newLine();
    this.checkTokenPositions(
      "\"before #{ ref }\"", _builder);
  }
  
  public void checkTokenPositions(final CharSequence input, final CharSequence expected) {
    try {
      Lexer _lexer = new Lexer(input);
      final Lexer lexer = _lexer;
      final List<CommonToken> tokens = lexer.tokenize();
      ArrayList<String> _arrayList = new ArrayList<String>();
      final ArrayList<String> got = _arrayList;
      for (final CommonToken t : tokens) {
        int _channel = t.getChannel();
        boolean _equals = (_channel == CommonToken.DEFAULT_CHANNEL);
        if (_equals) {
          String _nameAndText = Helper.getNameAndText(t);
          String _plus = (_nameAndText + ":");
          int _startIndex = t.getStartIndex();
          String _plus_1 = (_plus + Integer.valueOf(_startIndex));
          String _plus_2 = (_plus_1 + ":");
          int _stopIndex = t.getStopIndex();
          final String s = (_plus_2 + Integer.valueOf(_stopIndex));
          got.add(s);
        }
      }
      String _string = expected.toString();
      String _trim = _string.trim();
      String _join = IterableExtensions.join(got, "\n");
      Assert.assertEquals(_trim, _join);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
