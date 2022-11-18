package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_005feditar_005fcarro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
  
        String vcodigo="";
        String vnome="";
        String vmodelo="";
        String vano="";
        String vmarca="";
        String vpotencia="";
        String vimagem ="";
       
         vcodigo = (String) request.getAttribute("aCodigo").toString();
         vnome    = (String) request.getAttribute("atNome").toString();
         vmodelo    = (String) request.getAttribute("aModelo").toString();
        vano = (String) request.getAttribute("aAno").toString();
        vmarca = (String) request.getAttribute("aMarca").toString();
        vpotencia = (String) request.getAttribute("aPotencia").toString();
        vimagem = (String) request.getAttribute("aImagem").toString();
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <h3 class=\"h3 text-center\" >Alterar este Carro?</h3><br/>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-offset-4 col-md-4\">\n");
      out.write("            <div class=\"well well-lg\"> \n");
      out.write("        \n");
      out.write("                <form name=\"form\" action=\"alterar\" method=\"post\">\n");
      out.write("                     Código do carro: <span class=\"badge\"> ");
      out.print(vcodigo);
      out.write("</span>\n");
      out.write("                    <input type=\"hidden\" name=\"codigo\" value=\"");
      out.print(vcodigo);
      out.write("\">\n");
      out.write("                    <br/>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"nome\">Nome:</label> <br>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-addon\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-user\"></span> \n");
      out.write("                            </div>   \n");
      out.write("                            <input type=\"text\" name=\"nome\" value=\"");
      out.print(vnome);
      out.write("\" class=\"form-control\" id=\"nome\">  \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                                          \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"modelo\">Modelo:</label> <br>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-addon\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-lock\"></span> \n");
      out.write("                            </div>  \n");
      out.write("                            <input type=\"text\" name=\"modelo\" value=\"");
      out.print(vmodelo);
      out.write("\" class=\"form-control\" id=\"modelo\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"Ano\">Ano:</label> <br>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-addon\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-lock\"></span> \n");
      out.write("                            </div>  \n");
      out.write("                            <input type=\"text\" name=\"ano\" value=\"");
      out.print(vano);
      out.write("\" class=\"form-control\" id=\"ano\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"Marca\">Marca:</label> <br>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-addon\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-lock\"></span> \n");
      out.write("                            </div>  \n");
      out.write("                            <input type=\"text\" name=\"marca\" value=\"");
      out.print(vmarca);
      out.write("\" class=\"form-control\" id=\"marca\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"Potencia\">Potencia:</label> <br>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-addon\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-lock\"></span> \n");
      out.write("                            </div>  \n");
      out.write("                            <input type=\"text\" name=\"potencia\" value=\"");
      out.print(vpotencia);
      out.write("\" class=\"form-control\" id=\"potencia\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"Imagem\">Imagem: </label> <br>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-addon\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-lock\"></span> \n");
      out.write("                            </div>  \n");
      out.write("                            <input type=\"text\" name=\"imagem\" value=\"");
      out.print(vimagem);
      out.write("\" class=\"form-control\" id=\"imagem\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("                        \n");
      out.write("                   <input type=\"submit\" value=\"Alterar\" class=\"btn btn-info\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
