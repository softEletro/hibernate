/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.bean.Cliente;
import com.hibernate.dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author bcustodio
 */
@WebServlet(name = "TesteLogin", urlPatterns = {"/TesteLogin"})
public class TesteLogin extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ClienteDAO dao = new ClienteDAO();
        
        String nome = req.getParameter("nome");
        String senha = req.getParameter("senha");
        
        // Verifica se os campos estão vazios
        if (!"".equals(nome) && !"".equals(senha)) {
            // Faz a busca no banco de dados
            Cliente cli = dao.login(nome,senha);
            
            // Verifica se o objeto retornou nulo.
            if (cli == null) {
                PrintWriter out = resp.getWriter();
                out.print("<script>alert(\"Nome ou senha incorretos!\");</script>");
            } else {
                int id = cli.getId();
                
                HttpSession session = req.getSession();
                session.setAttribute("id", id);
                
                resp.sendRedirect("ListaCliente");
            }
        } else {
            PrintWriter out = resp.getWriter();
            out.print("<script>alert(\"Preencha todos os campos!\");</script>");
        }
    }
}
