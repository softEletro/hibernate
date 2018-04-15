<%-- 
    Document   : busca
    Created on : 15/04/2018, 16:28:44
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
        <% for (int i=0;i<lista.size();i++) {
            Cliente cli = (Cliente)lista.get(i); %>
            Nome: <%= cli.getNome() %>
        <% } %>
    </body>
</html>
