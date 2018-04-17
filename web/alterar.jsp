<%-- 
    Document   : alterar
    Created on : 17/04/2018, 11:42:19
    Author     : bcustodio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bean.Cliente"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>                
        <form action="SalvaCliente">
            <label>Nome:</label><br />
            <input type="text" id="nome" name="nome" value="" /><br />
            <label>Sobrenome:</label><br />
            <input type="text" id="sobrenome" name="sobrenome" value="" /><br /><br />
            
            
            <input type="submit" id="salva" name="salva" value="Salvar" />
        </form>
    </body>
</html>
