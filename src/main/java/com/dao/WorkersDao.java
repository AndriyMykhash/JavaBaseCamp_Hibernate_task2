package com.dao;


import com.HibernateSessionFactoryUtil;
import com.representation.Workers;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class WorkersDao {


    public Workers findById(Long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Workers.class, id);
    }

    public void save(Workers workers) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(workers);
        tx1.commit();
        session.close();
    }

    public void update(Workers workers) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(workers);
        tx1.commit();
        session.close();
    }

    public void delete(Workers workers) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(workers);
        tx1.commit();
        session.close();
    }


}

