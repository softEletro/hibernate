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
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author leona
 */
@WebServlet(name = "IncluirCarrinho", urlPatterns = {"/IncluirCarrinho"})
public class IncluirCarrinho extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ClienteDAO dao = new ClienteDAO();
        Cliente Cliente = new Cliente();
        int id = Integer.parseInt(req.getParameter("id"));
       
                String nome = req.getParameter("nome");
		Cliente cliente = new Cliente();
		Cliente.setNome(nome);
                /*HttpSession session = req.getSession();*/
            ArrayList retornoLista = new ArrayList();
            retornoLista = new AdicionarItensCarrinho().AdicionaItensCarrinho(cliente, retornoLista);
            HttpSession session = req.getSession(true);
            session.setAttribute("Listas", retornoLista);
            
            Cliente cli = dao.buscaid(id);
            req.setAttribute("nome", cli.getNome());
            req.setAttribute("sobrenome", cli.getSobrenome());
            req.setAttribute("telefone", cli.getTelefone());
            RequestDispatcher rd = req.getRequestDispatcher("Carrinho.jsp");
            rd.forward(req,resp);
            
            /*session.setAttribute("id", id);
            Cliente cli = dao.buscaid(id);
            req.setAttribute("nome", cli.getNome());
            req.setAttribute("sobrenome", cli.getSobrenome());
            req.setAttribute("telefone", cli.getTelefone());
            RequestDispatcher rd = req.getRequestDispatcher("Carrinho.jsp");
            rd.forward(req,resp);
            resp.sendRedirect("Carrinho.jsp");*/
            
         
            
    }
}
