<%-- 
    Document   : recuperarSenha
    Created on : 12/11/2022, 23:42:00
    Author     : User
--%>

<%@page import="br.com.controle.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <!--Fontes do google-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap" rel="stylesheet">
    <!---->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.1/font/bootstrap-icons.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recuperação Senha</title>
    <link rel="stylesheet" href="css/style2.css">
    
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
            <p class="whitep"> Seja Bem Vindo : <%=u.getEmail()%> | <%if(u.getPerfil() == 1){  %> Você é Administador | <% } %> </p> <a href="remover.jsp">Sair</a>
            <% }  %>
        
        
    </header><!--Cabeçalho de navegação-->
    <main class="container-geral">
        <div class="form-container">
            <div class="icon-container">
                <i class="bi bi-key" style="font-size: 10rem"></i>
                <h3>Recupeção de Senha?</h3>
            </div>
            <div class="form">
                <form method="post" action="RecuperaSenha" name="formRecuperacaoSenha">
                    
                   
                    <p>Digite seu E-mail:</p>
                    <input required type="email" name="email">
                    <input type="submit" value="Redefir Senha">
                    <a href="login.jsp" id="cadastrar-a">Voltar Para o Login</a>
                    
                </form>
            </div>
        </div>
    </main>
    
    <footer>
        <p>Feito por Rian Lima</p>
    </footer>
    <!--Scripts-->
    <script src="https://kit.fontawesome.com/19376f285c.js" crossorigin="anonymous"></script>
</body>
</html>
