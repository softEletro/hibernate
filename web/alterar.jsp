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
        <jsp:useBean id="nome" scope="request" class="java.lang.String" />
        <jsp:useBean id="sobrenome" scope="request" class="java.lang.String" />
        <jsp:useBean id="telefone" scope="request" class="java.lang.String" />
        <jsp:useBean id="senha" scope="request" class="java.lang.String" />
        <jsp:useBean id="id" scope="request" class="java.lang.Long" />
        
        <form action="AlterarCliente">
             <input type="hidden" id="id" name="id" value="<%= id %>" />
            <label>Nome:</label>
            <input type="text" id="nome" name="nome" value="<%= nome %>" />
            <label>Sobrenome:</label>
            <input type="text" id="sobrenome" name="sobrenome" value="<%= sobrenome %>" />
            <label>Telefone</label>
            <input type="text" id="telefone" name="telefone" value="<%= telefone %>" />
            <label>Senha</label>
            <input type="password" id="senha" name="senha" value="<%= senha %>" />
             
            <input type="submit" id="salva" name="salva" value="Salvar" />
        </form>
    </body>
</html>