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
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author bcustodio
 */
public class ClienteDAO {
    // Salva o cliente.
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

    // Lista todos os clientes.
    public List<Cliente> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        Criteria cli = session.createCriteria(Cliente.class);
        
        return cli.list();
    }
    
    // Busca cliente por nome.
    public List<Cliente> buscaNome(String nome) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria crit = session.createCriteria(Cliente.class).add(Restrictions.eq("nome",nome));
        return crit.list();
    }
    
    // Busca cliente por nome.
    public Cliente buscaid(Long id) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
         return (Cliente)session.createCriteria(Cliente.class).add(Restrictions.eq("id",id)).uniqueResult();
    }
    
    // Salva o cliente.
    public void altera(Cliente cli){
        // Cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Inicia uma transação
        session.beginTransaction();
        
        // Realiza a operação salvar
        session.update(cli);
        
        // Comita a transação
        session.getTransaction().commit();
        
        // Libera a memória e encerra a sessão
        session.flush();
        session.close();
        
    }
}
