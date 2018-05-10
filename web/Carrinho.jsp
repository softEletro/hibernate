<%-- 
    Document   : Carrinho
    Created on : 10/05/2018, 16:14:05
    Author     : leona
--%>
<jsp:useBean id="nome" scope="request" class="java.lang.String" />
<jsp:useBean id="sobrenome" scope="request" class="java.lang.String" />
<jsp:useBean id="telefone" scope="request" class="java.lang.String" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <form action="Carrinho">
          <table class="table table-hover">
          <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Sobrenome</th>
                            <th>Telefone</th>
                            <td><%=nome%></td>
                            <td><%=sobrenome%></td>
                            <td><%=telefone%></td>
                            
                            
                        </tr>
                    </thead>
                    </table>
            <a href="ListaCliente">Listagem</a><br />
        </form>
     </body>
</html>
