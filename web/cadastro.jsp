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
        <script>
            function tentativa() {
                alert("Salvo com sucesso");
            }
        </script>
        <form action="SalvaCliente" onsubmit="tentativa();">
            <label>Nome:</label>
            <input type="text" id="nome" name="nome" value="" /><br />
            <label>Sobrenome:</label>
            <input type="text" id="sobrenome" name="sobrenome" value="" /><br />
            <label>Telefone</label>
            <input type="text" id="telefone" name="telefone" value="" /><br />
            <label>Senha</label>
            <input type="password" id="senha" name="senha" value="" /><br />
             
            <input type="submit" id="salva" name="salva" value="Salvar" />
        </form>
    </body>
</html>
