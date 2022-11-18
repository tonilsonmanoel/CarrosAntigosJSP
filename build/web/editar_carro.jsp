<%-- 
    Document   : editar_carro
    Created on : 06/11/2022, 20:05:17
    Author     : User
--%>

<%@page import="br.com.controle.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <link rel="stylesheet" href="css/style.css">
     <!-- Linha para utilizar o JavaScript -->
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
       <title>Editar_Carro</title>
    </head>
    <%  
        String vcodigo="";
        String vnome="";
        String vmodelo="";
        String vano="";
        String vmarca="";
        String vpotencia="";
        String vimagem ="";
        String vcodigousuario="";
       
         vcodigo = (String) request.getAttribute("aCodigo").toString();
         vnome    = (String) request.getAttribute("aNome").toString();
         vmodelo    = (String) request.getAttribute("aModelo").toString();
        vano = (String) request.getAttribute("aAno").toString();
        vmarca = (String) request.getAttribute("aMarca").toString();
        vpotencia = (String) request.getAttribute("aPotencia").toString();
        vimagem = (String) request.getAttribute("aImagem").toString();
        vcodigousuario = request.getAttribute("aCodigoUsuario").toString();
        
    %>
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
                    <form method="post" action="alterar">
                        <center><h2>Editar Carro?</h2></center><br>
                        <p>Código do Carro: <%=vcodigo%> </p><br>
                        <input hidden required type="text" name="codigo" value="<%=vcodigo%>">
                        <p>Nome: </p>
                        <input required type="text" name="nome" value="<%=vnome%>">
                         <p>Modelo: </p>
                         <input required type="text" name="modelo" value="<%=vmodelo%>">
                         <p>Ano: </p>
                         <input required type="text" name="ano" value="<%=vano%>">
                         <p>Marca: </p>
                         <input required type="text" name="marca" value="<%=vmarca%>">
                         <p>Potencia: </p>
                        <input required type="text" name="potencia" value="<%=vpotencia%>">
                        <p>Url da imagem:</p>
                        <input required type="text" name="imagem" value="<%=vimagem%>">
                        <input hidden type="text" name="codigousuario" value="<%=vcodigousuario%>">
                        <input type="submit" value="Alterar">
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