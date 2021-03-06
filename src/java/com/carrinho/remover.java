/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrinho;

import com.bean.Cliente;
import com.hibernate.dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
        
        List nomex = new ArrayList();
        List sobrenomex = new ArrayList();
        
        int idCliente = Integer.parseInt(req.getParameter("idCliente"));
      
        for (int i=0; i<carrinho.size(); i++) {
            if (carrinho.get(i).equals(idCliente)) {
                carrinho.remove(i);
            }
        }
       
        session.setAttribute("carrinho", carrinho);
        
        ClienteDAO dao= new ClienteDAO();

        for (int i=0;i<carrinho.size();i++) {
            int id = (int) carrinho.get(i);
            Cliente cli = dao.buscaid(id);

            String nome =  cli.getNome();
            String sobrenome = cli.getSobrenome();

            nomex.add(nome);
            sobrenomex.add(sobrenome);

            req.setAttribute("nome", nomex);
            req.setAttribute("sobrenome", sobrenomex);
        }
        
        if (carrinho.isEmpty()) {
            RequestDispatcher rd = req.getRequestDispatcher("ListaCliente");
            rd.forward(req,resp);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("/testecar.jsp");
            rd.forward(req,resp);
        }
    }
    
}
