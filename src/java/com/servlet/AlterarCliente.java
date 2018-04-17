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
@WebServlet(name = "AlterarCliente", urlPatterns = {"/AlterarCliente"})
public class AlterarCliente extends HttpServlet {    
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{ 
        //Cliente cli = new Cliente();
        int id = Integer.parseInt(req.getParameter("id"));
        
        ClienteDAO dao = new ClienteDAO();
        
        RequestDispatcher rd = req.getRequestDispatcher("/alterar.jsp");
        rd.forward(req,resp);
    }
}
