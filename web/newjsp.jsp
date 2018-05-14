<%-- 
    Document   : newjsp
    Created on : 14/05/2018, 14:51:31
    Author     : bcustodio
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="carrinho" scope="session" class="java.util.List" />
<% int a = 0; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% for (int i=0;i<carrinho.size();i++) { %>
            <%= carrinho.get(i) %>
        <% } %>
    </body>
</html>