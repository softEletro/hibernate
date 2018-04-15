<%-- 
    Document   : cadastro
    Created on : 15/04/2018, 15:51:45
    Author     : BrendaÀ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <form action="SalvaCliente">
            <label>Nome:</label>
            <input type="text" id="nome" name="nome" value="" />
            <label>Sobrenome:</label>
            <input type="text" id="sobrenome" name="sobrenome" value="" />
            
            
            <input type="submit" id="salva" name="salva" value="Salvar" />
        </form>
    </body>
</html>
