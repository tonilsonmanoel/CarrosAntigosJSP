package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.controle.Usuario;

public final class CadastroUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("    <!--Fontes do google-->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <!---->\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Sistema de cadastro</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style2.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

       Usuario u  = (Usuario) session.getAttribute("usuarioLogado");
     
      out.write("\n");
      out.write("    <header class=\"header-container\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            ");
 if(u != null){ 
      out.write("\n");
      out.write("            <li><a href=\"Cadastro.jsp\">Cadastrar Carro</a></li>\n");
      out.write("            ");
 } 
      out.write("    \n");
      out.write("                    \n");
      out.write("            <li><a href=\"Listar.jsp\">Listar Carros</a></li>\n");
      out.write("            ");
 if(u == null){        
      out.write("\n");
      out.write("            <li><a href=\"CadastroUsuario.jsp\">Registro</a></li>\n");
      out.write("            <li><a href=\"login.jsp\">Entrar</a></li>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("                 \n");
      out.write("        </ul>\n");
      out.write("            ");
 if(u != null){        
      out.write("\n");
      out.write("            <p class=\"whitep\"> Seja Bem Vindo : ");
      out.print(u.getEmail());
      out.write(" | ");
if(u.getPerfil() == 1){  
      out.write(" Você é Administador | ");
 } 
      out.write(" </p> <a href=\"remover.jsp\">Sair</a>\n");
      out.write("            ");
 }  
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </header><!--Cabeçalho de navegação-->\n");
      out.write("\n");
      out.write("    <main class=\"container-geral\">\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("            <div class=\"icon-container\">\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 640 512\"><!--! Font Awesome Pro 6.1.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. --><path d=\"M224 256c70.7 0 128-57.31 128-128S294.7 0 224 0C153.3 0 96 57.31 96 128S153.3 256 224 256zM274.7 304H173.3C77.61 304 0 381.6 0 477.3C0 496.5 15.52 512 34.66 512h378.7C432.5 512 448 496.5 448 477.3C448 381.6 370.4 304 274.7 304zM616 200h-48v-48C568 138.8 557.3 128 544 128s-24 10.75-24 24v48h-48C458.8 200 448 210.8 448 224s10.75 24 24 24h48v48C520 309.3 530.8 320 544 320s24-10.75 24-24v-48h48C629.3 248 640 237.3 640 224S629.3 200 616 200z\"/></svg>\n");
      out.write("                <h3>Cadastrar:</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form\">\n");
      out.write("                <form method=\"post\" action=\"CadastroLogin\" name=\"frmCadastrarLogin\">\n");
      out.write("                    <p>Nome:</p>\n");
      out.write("                    <input required type=\"email\" name=\"nome\">\n");
      out.write("                    <p>Novo E-mail:</p>\n");
      out.write("                    <input required type=\"text\" name=\"email\">\n");
      out.write("                    <p>Nova senha:</p>\n");
      out.write("                    <input required type=\"password\" name=\"senha\">\n");
      out.write("                   \n");
      out.write("                    <input type=\"submit\" value=\"Enviar\">\n");
      out.write("                     <a href=\"Login.jsp\" id=\"cadastrar-a\">Já tem uma conta? Entrar</a>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("    \n");
      out.write("    <footer>\n");
      out.write("        <p>Feito por Rian Lima</p>\n");
      out.write("    </footer>\n");
      out.write("    <!--Scripts-->\n");
      out.write("    <script src=\"https://kit.fontawesome.com/19376f285c.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
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
