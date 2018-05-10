/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.bean.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leona
 */
@WebServlet(name = "AdicionarItensCarrinho", urlPatterns = {"/AdicionarItensCarrinho"})
public class AdicionarItensCarrinho extends HttpServlet {

     public ArrayList AdicionaItensCarrinho(Cliente dao, ArrayList Listas) {
		// TODO Auto-generated constructor stub
		if (Listas == null){
			Listas = new ArrayList();
		}
		Listas.add(dao.getNome());
		return Listas;
    }
}
