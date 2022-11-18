<%-- 
    Document   : Cadastro
    Created on : 02/11/2022, 11:41:05
    Author     : User
--%>

<%@page import="br.com.controle.Usuario"%>
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
            <p class="whitep"> Seja Bem Vindo : <%=u.getEmail()%> | <%if(u.getPerfil() == 1){  %> Você é Administador | <% } %> </p> <a href="remover.jsp">Sair</a>
            <% }  %>
        
        
    </header><!--Cabeçalho de navegação-->
    <main class="container-geral">
        <main class="container-geral">
            <div class="form-container">
                
                <div class="form">
                    <form method="post" action="ServletCadastro">
                        <p>Nome: </p>
                        <input required type="text" name="nome">
                         <p>Modelo: </p>
                        <input required type="text" name="modelo">
                         <p>Ano: </p>
                        <input required type="text" name="ano">
                         <p>Marca: </p>
                        <input required type="text" name="marca">
                         <p>Potencia: </p>
                        <input required type="text" name="potencia">
                        <p>Url da imagem:</p>
                        <input required type="text" name="imagem">
                        <input hidden type="text" name="codigousuario" value="<%=u.getId()%>">
                        <input type="submit" value="Cadastrar">
                    </form>
                </div>
            </div>
        </main>
    </main>
    
    <footer>
        <p>Feito por Rian Lima</p>
    </footer>
    <!--Scripts-->
    <script src="https://kit.fontawesome.com/19376f285c.js" crossorigin="anonymous"></script>
</body>
</html>