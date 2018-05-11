/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrinho;

import com.bean.Produto;
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
@WebServlet(name = "adicionar", urlPatterns = {"/adicionar"})
public class adicionar extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession session = req.getSession();
        List carrinho = (List) session.getAttribute("carrinho");
        
        if (carrinho == null) {
            /*carrinho = new Vector();
            session.setAttribute("carrinho", carrinho);*/
            resp.sendRedirect("/index.jsp");
        }
        
        String nome = (String) req.getAttribute("nome");
        Double valor = (Double) req.getAttribute("Valor");
        
        Produto cli = new Produto();
        
        carrinho.add(nome);
        carrinho.add(valor);
        
        RequestDispatcher rd = req.getRequestDispatcher("/testecar.jsp");
        rd.forward(req,resp);
    }
}
