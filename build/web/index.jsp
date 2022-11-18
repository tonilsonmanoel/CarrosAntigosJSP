<%-- 
    Document   : index.jsp
    Created on : 06/11/2022, 21:08:07
    Author     : User
--%>

<%@page import="br.com.controle.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.controle.Carro"%>
<%@page import="br.com.DAO.ManterCarro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <!--Fontes do google-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap" rel="stylesheet">
    <!---->

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de cadastro</title>
    <link rel="stylesheet" href="css/style.css">

</head>
<body>
     <%
       Usuario u  = (Usuario) session.getAttribute("usuarioLogado");
     %>
    <header class="header-container">
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <% if(u != null){ %>
            <li><a href="Cadastro.jsp">Cadastrar Carro</a></li>
            <% } %>    
                    
            <li><a href="Listar.jsp">Listar Carros</a></li>
            <% if(u == null){        %>
            <li><a href="CadastroUsuario.jsp">Registro</a></li>
            <li><a href="login.jsp">Entrar</a></li>
            <% } %>
                 
        </ul>
            <% if(u != null){        %>
            <p class="whitep"> Seja Bem Vindo : <%=u.getEmail()%> | <%if(u.getPerfil() == 1){  %> Você é Administador | <% } %> </p>  <a href="perfil.jsp">Perfil</a> &nbsp;&nbsp;&nbsp; <a href="remover.jsp">Sair</a>
            <% }  %>
        
        
    </header><!--Cabeçalho de navegação-->
    <main class="container-geral">
          <% 
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
                  
                    %>
                    <a href="Listar.jsp" style="text-decoration:none"> <div class="card-noticia" >
            <h2 ><%=vnome%></h2>
            
            <img src="<%=vimagem%>" alt="" width="200px" height="150px">
            <p>Modelo: <%=vmodelo%><br> Ano: <%=vano%><br> Marca: <%=vmarca%> <br>Potência: <%=vpotencia%>  </p>
        </div></a>
        <% 
            }
            %>
    </main>
    
    <footer>
        <p>Feito por Rian Lima</p>
    </footer>
    <!--Scripts-->
    <script src="https://kit.fontawesome.com/19376f285c.js" crossorigin="anonymous"></script>
</body>
</html>
