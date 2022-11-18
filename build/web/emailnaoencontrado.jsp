<%@page import="br.com.controle.Usuario"%>
<%@page isErrorPage="true" %>
<%@page import="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" href="css/style.css">
<style type="text/css">

#cabecalho{
      width:800px;
      height:100px;
       }

#corpo{
      width:800px;
      height:450px;
       }
#rodape{
      width:800px;
      height:100px;
       }
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<body>
     <%
       Usuario u  = (Usuario) session.getAttribute("usuarioLogado");
       String emailnaoencontrado = request.getAttribute("emailnaoencontrado").toString();
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
            <p class="whitep"> Seja Bem Vindo : <%=u.getEmail()%> | <%if(u.getPerfil() == 1){  %> Você é Administador | <% } %> </p> <a href="remover.jsp">Sair</a>
            <% }  %>
        
        
    </header><!--Cabeçalho de navegação-->
<div align="center">
 <div id="cabecalho">    </div>
 <div id="corpo">
     <img src="imagens/erro1.jpg"/>
     <% if(emailnaoencontrado.equals("emailnaoencontrado")) { %>
     
     <hr/>
     <h3> Email não encontrado! </h3><br/>
     <br/>     
     <hr/>
     <a href="recuperarSenha.jsp">Tentar Novamente</a> <a href="CadastroUsuario.jsp">Cadastre-se</a>
     <% } %>
     <% if(emailnaoencontrado.equals("senhaIncorreta")) { %>
     
     <hr/>
     <h3> Senha Atual Incorreta! </h3><br/>
     <br/>     
     <hr/>
     <a href="mudarSenha.jsp">Tentar Novamente</a> <a href="CadastroUsuario.jsp">Cadastre-se</a>
     <% } %>

</div>
 <div id="rodape">   </div>

</div>

</body>
</html>