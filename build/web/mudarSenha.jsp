<%-- 
    Document   : CadastroUsuario
    Created on : 11/11/2022, 12:52:00
    Author     : User
--%>

<%@page import="br.com.DAO.ManterUsuario"%>
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

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de cadastro</title>
    <link rel="stylesheet" href="css/style2.css">

</head>
<body>
    <%
       Usuario u  = (Usuario) session.getAttribute("usuarioLogado");
     %>
    <header class="header-container">
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="Cadastro.jsp">Cadastrar Carro</a></li>   
            <li><a href="Listar.jsp">Listar Carros</a></li> 
        </ul> 
            <p class="whitep"> Seja Bem Vindo : <%=u.getEmail()%> | <%if(u.getPerfil() == 1){  %> Você é Administador | <% } %> </p> <a href="remover.jsp">Sair</a>
           
        
        
    </header><!--Cabeçalho de navegação-->
   
    <main class="container-geral">
        <div class="form-container">
            <div class="icon-container">
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><!--! Font Awesome Pro 6.1.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. --><path d="M224 256c70.7 0 128-57.31 128-128S294.7 0 224 0C153.3 0 96 57.31 96 128S153.3 256 224 256zM274.7 304H173.3C77.61 304 0 381.6 0 477.3C0 496.5 15.52 512 34.66 512h378.7C432.5 512 448 496.5 448 477.3C448 381.6 370.4 304 274.7 304zM616 200h-48v-48C568 138.8 557.3 128 544 128s-24 10.75-24 24v48h-48C458.8 200 448 210.8 448 224s10.75 24 24 24h48v48C520 309.3 530.8 320 544 320s24-10.75 24-24v-48h48C629.3 248 640 237.3 640 224S629.3 200 616 200z"/></svg>
                <h3>Cadastrar:</h3>
            </div>
            <div class="form">
                <form method="post" action="mudarSenha" name="frmMudarSenha">
                    <input hidden type="text" name="id" value="<%=u.getId()%>">
                    <input hidden type="text" name="email" value="<%=u.getEmail()%>">
                    <h2>Mudar Senha: </h2><br>
                    <p>Digite a Senha Atual: </p><br>
                    <input required type="password" name="senhaAtual"><br>
                    <p>Digite a Nova Senha: </p><br>
                    <input required type="password" name="senhaNova"><br>
                    <input type="submit" value="Mudar Senha">
                     <a href="perfil.jsp" id="cadastrar-a">Voltar</a>
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
