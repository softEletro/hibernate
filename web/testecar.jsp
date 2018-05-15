<%-- 
    Document   : newjsp
    Created on : 14/05/2018, 14:51:31
    Author     : bcustodio
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bean.Cliente"%>
<jsp:useBean id="carrinho" scope="session" class="java.util.List" />
<jsp:useBean id="nome" scope="request" class="java.lang.String" />
<jsp:useBean id="teste" scope="request" class="java.lang.Integer" />
<% int a = 0; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= carrinho %><br><br><br>
        <% for (int i=0;i<carrinho.size();i++) { %>
            <%= nome %> / <%= teste %>
        <% } %>
    </body>
</html>