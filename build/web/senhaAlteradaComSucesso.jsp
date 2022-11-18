<%-- 
    Document   : recuperacaosucesso
    Created on : 13/11/2022, 00:33:37
    Author     : User
--%>
<%@page import="br.com.controle.EnviarEmail"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" href="css/style.css">
<script language="Javascript">
	var timer = 2;
	function countdown() {
		if (timer > 0) {
			timer -= 1;
			setTimeout("countdown()", 3000);
		} else {
                    
			location.href = 'perfil.jsp';
		}
	}
	countdown();
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recuperação Senha Sucesso</title>
</head>
<body>
    <center>
	<%
		String senhaAtualizada = request.getAttribute("senhaAlterada").toString();
                
                
                    out.println("<h4>Senha Alterada Com Sucesso!<h4>");
                    out.println("Você será redirecionado para pagina do perfil");
                    
                
                
	%>
    </center>
    </body>
</html>

