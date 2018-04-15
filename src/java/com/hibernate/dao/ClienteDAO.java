/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.dao;

import com.bean.Cliente;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author bcustodio
 */
public class ClienteDAO {
    
    public void salvar(Cliente cli){
        // Cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Inicia uma transação
        session.beginTransaction();
        
        // Realiza a operação salvar
        session.persist(cli);
        
        // Comita a transação
        session.getTransaction().commit();
        
        // Libera a memória e encerra a sessão
        session.flush();
        session.close();
    }
    
    /*public list<Cliente> getList() { 
        Cliente cli = new Cliente();
        String cliente = null;
        Query query = null;
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        // Faz a mágica
        query = session.createQuery("select * from Cliente");
        
        //cliente = (String) query.uniqueResult();
        
        session.getTransaction().commit();   
        
        return cliente;
        
        session.flush();
        session.close();
    }*/

    public List<Cliente> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        Criteria cli = session.createCriteria(Cliente.class);
        
        return cli.list();
    }
}
