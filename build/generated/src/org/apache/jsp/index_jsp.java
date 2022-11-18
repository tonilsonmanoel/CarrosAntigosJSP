package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.controle.Usuario;
import java.util.ArrayList;
import br.com.controle.Carro;
import br.com.DAO.ManterCarro;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!---->\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Sistema de cadastro</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     ");

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
      out.write(" </p>  <a href=\"perfil.jsp\">Perfil</a> &nbsp;&nbsp;&nbsp; <a href=\"remover.jsp\">Sair</a>\n");
      out.write("            ");
 }  
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </header><!--Cabeçalho de navegação-->\n");
      out.write("    <main class=\"container-geral\">\n");
      out.write("          ");
 
                  String vcodigo="";
                  String vnome="";
                  String vmodelo="";
                  String vano="";
                  String vmarca="";
                  String vpotencia="";
                  String vimagem="";
                  
                  ManterCarro dao = new ManterCarro();
                  Carro ca = new Carro();
                  ArrayList<Carro> nt = dao.pesquisarTudo();
                  
                  for (int i =0; i < nt.size(); i++){
                     ca = nt.get(i);
                     vcodigo=String.valueOf(ca.getCodigo() );
                     vnome = String.valueOf(ca.getNome());
                     vmodelo = String.valueOf(ca.getModelo());
                     vano = String.valueOf(ca.getAno());
                     vmarca = String.valueOf(ca.getMarca());
                     vpotencia = String.valueOf(ca.getPotencia());
                     vimagem = String.valueOf(ca.getImagem());
                  
                    
      out.write("\n");
      out.write("                    <a href=\"Listar.jsp\" style=\"text-decoration:none\"> <div class=\"card-noticia\" >\n");
      out.write("            <h2 >");
      out.print(vnome);
      out.write("</h2>\n");
      out.write("            \n");
      out.write("            <img src=\"");
      out.print(vimagem);
      out.write("\" alt=\"\" width=\"200px\" height=\"150px\">\n");
      out.write("            <p>Modelo: ");
      out.print(vmodelo);
      out.write("<br> Ano: ");
      out.print(vano);
      out.write("<br> Marca: ");
      out.print(vmarca);
      out.write(" <br>Potência: ");
      out.print(vpotencia);
      out.write("  </p>\n");
      out.write("        </div></a>\n");
      out.write("        ");
 
            }
            
      out.write("\n");
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
