<%-- 
    Document   : login
    Created on : 09/05/2018, 09:41:01
    Author     : bcustodio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="TesteLogin">
            Nome: <input type="text" name="nome" id="nome" value="" /><br />
            Senha: <input type="password" name="senha" id="senha" value="" /><br />
            <input type="submit" name="salvar" value="Entrar" />
        </form>
    </body>
</html>
