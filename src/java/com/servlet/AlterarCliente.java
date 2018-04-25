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
@WebServlet(name = "AlterarCliente", urlPatterns = {"/AlterarCliente"})
public class AlterarCliente extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{ 
        Long id = Long.parseLong(req.getParameter("id"));
           
        ClienteDAO dao= new ClienteDAO();
        Cliente cli = dao.buscaid(id);
        
        cli.setNome(req.getParameter("nome"));
        cli.setSobrenome(req.getParameter("sobrenome"));
        cli.setTelefone(req.getParameter("telefone"));
        
        dao.altera(cli);
    }
}
