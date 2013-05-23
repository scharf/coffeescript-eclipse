package csep.tests.other;

import csep.tests.ParserTestBase;
import java.io.InputStream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class ErrorLocationTest extends ParserTestBase {
  @Test
  public void testAfterComment() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("# Some comment");
      _builder.newLine();
      _builder.append("if yes then a = 1");
      _builder.newLine();
      final String source = _builder.toString();
      String _plus = ("" + source);
      final InputStream in = this.getAsStream(_plus);
      String _currentFileExtension = this.getCurrentFileExtension();
      String _plus_1 = ("mytestmodel." + _currentFileExtension);
      final URI uri = URI.createURI(_plus_1);
      final XtextResource resource = this.doGetResource(in, uri);
      EList<Diagnostic> _warnings = resource.getWarnings();
      String _plus_2 = ("warnings " + _warnings);
      EList<Diagnostic> _warnings_1 = resource.getWarnings();
      int _size = _warnings_1.size();
      Assert.assertEquals(_plus_2, 0, _size);
      EList<Diagnostic> _errors = resource.getErrors();
      String _plus_3 = ("errors " + _errors);
      EList<Diagnostic> _errors_1 = resource.getErrors();
      int _size_1 = _errors_1.size();
      Assert.assertEquals(_plus_3, 0, _size_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
