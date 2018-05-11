<%-- 
    Document   : testecar
    Created on : 11/05/2018, 11:31:48
    Author     : bcustodio
--%>

<%@page import="java.text.NumberFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.Produto"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <thead>
                <th>Nome</th>
                <th>Valor</th>
                <th></th>
            </thead>
            <tbody>
                <%  
                List carrinho = (List) session.getAttribute("carrinho");
                double total = 0;
                for (int cont = 0; cont < carrinho.size(); cont++) {
                    Produto p = (Produto) carrinho.get(cont);
                    total += p.getValor();%>
                    <tr>
                        <td><%= p.getNome() %></td>
                        <td><%= p.getValor() %></td>
                    </tr>
                <% } %>
                Total: <% out.println(NumberFormat.getCurrencyInstance().format(total)); %>
            </tbody>
        </table>
    </body>
</html>
