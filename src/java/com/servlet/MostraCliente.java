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

/**
 *
 * @author bcustodio
 */
@WebServlet(name = "MostraCliente", urlPatterns = {"/MostraCliente"})
public class MostraCliente extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{ 
        int id = Integer.parseInt(req.getParameter("id"));
        
        ClienteDAO dao= new ClienteDAO();
        Cliente cli = dao.buscaid(id);
        
        String nome = cli.getNome();
        String sobrenome = cli.getSobrenome();
        String telefone = cli.getTelefone();
        String senha = cli.getSenha();
            
        req.setAttribute("nome", nome);
        req.setAttribute("sobrenome", sobrenome);
        req.setAttribute("telefone", telefone);
        req.setAttribute("senha", senha);
        req.setAttribute("id", id);
            
        RequestDispatcher rd = req.getRequestDispatcher("/alterar.jsp");
        rd.forward(req,resp);
    }
}