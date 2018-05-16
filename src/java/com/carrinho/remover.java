/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrinho;

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
@WebServlet(name = "remover", urlPatterns = {"/remover"})
public class remover extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession session = req.getSession();
        List carrinho = (List) session.getAttribute("carrinho");
        
        String idCliente = req.getParameter("idCliente");
        
        for (int i=0; i<carrinho.size(); i++) {
            if (carrinho.get(i).equals(idCliente)) {
                carrinho.remove(idCliente);
            }
        }
        
        session.setAttribute("carrinho", carrinho);
        
        RequestDispatcher rd = req.getRequestDispatcher("adicionar");
        rd.forward(req,resp);
    }
}
