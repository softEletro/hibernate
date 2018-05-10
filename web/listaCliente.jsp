<%-- 
    Document   : buscaCliente
    Created on : 15/04/2018, 15:48:38
    Author     : BrendaÀ
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
        <jsp:useBean id="lista" scope="request" class="java.util.List" />
        <jsp:useBean id="teste" scope="request" class="java.lang.Integer" />
        
        Id da variável da sessão: <%= teste %> 
        <% if (!teste.equals(0)) { %>
         // <a href="Logout" style="color: red;">Sair da sessão</a>
        <% } %><br><br>
        
            <% for (int i=0;i<lista.size();i++) {
            Cliente cli = (Cliente)lista.get(i); %>
            Nome: <%= cli.getNome() %> Telefone: <%= cli.getTelefone() %> <a href="MostraCliente?id=<%= cli.getId() %>">Alterar</a> <a href="InativarCliente?id=<%= cli.getId() %>">Inativar</a><a href="IncluirCarrinho?id=<%= cli.getId() %>">Compra</a><br />
        <% } %>
        
        <br><br>
        <%@include file="/pagina.html" %>
    </body>
</html>