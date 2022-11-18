package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;

public final class errodeusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("#cabecalho{\n");
      out.write("      width:800px;\n");
      out.write("      height:100px;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("#corpo{\n");
      out.write("      width:800px;\n");
      out.write("      height:450px;\n");
      out.write("       }\n");
      out.write("#rodape{\n");
      out.write("      width:800px;\n");
      out.write("      height:100px;\n");
      out.write("       }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Error</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div align=\"center\">\n");
      out.write(" <div id=\"cabecalho\">    </div>\n");
      out.write(" <div id=\"corpo\">\n");
      out.write("\n");
      out.write("     <img src=\"imagens/erro1.jpg\"/>\n");
      out.write("     <hr/>\n");
      out.write("    \t<h3> Email e Senha incorretos </h3><br/>\n");
      out.write("     <br/>     \n");
      out.write("     <hr/>\n");
      out.write("     <a href=\"login.jsp\">Tentar Novamente</a> <a href=\"CadastroUsuario.jsp\">Cadastre-se</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write(" <div id=\"rodape\">   </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
