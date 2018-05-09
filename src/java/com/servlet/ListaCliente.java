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
@WebServlet(name = "ListaCliente", urlPatterns = {"/ListaCliente"})
public class ListaCliente extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{ 
        Cliente cli = new Cliente();
        ClienteDAO dao = new ClienteDAO();
        List lista = dao.listar();
        
        HttpSession session = req.getSession(false);
        
        if (session == null) {
            int id = 0;
            req.setAttribute("teste", id);
        } else {
            req.setAttribute("teste", session.getAttribute("id"));
        }
        
        req.setAttribute("lista", lista);
        
        RequestDispatcher rd = req.getRequestDispatcher("/listaCliente.jsp");
        rd.forward(req,resp);
    }

}
