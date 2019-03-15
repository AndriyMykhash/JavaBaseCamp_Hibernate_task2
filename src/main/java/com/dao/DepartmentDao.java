package com.dao;

import com.HibernateSessionFactoryUtil;
import com.representation.Department;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentDao {


    public Department findById(Long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Department.class, id);
    }

    public void save(Department department) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(department);
        tx1.commit();
        session.close();
    }

    public void update(Department department) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(department);
        tx1.commit();
        session.close();
    }

    public void delete(Department department) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(department);
        tx1.commit();
        session.close();
    }

}
