package com;

import com.representation.Availability;
import com.representation.Department;
import com.representation.Workers;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class HQL_Queries {


    public List<Workers> getWorkersByDepIdAndAvail(long depId, Availability avail){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        Query query = session.createQuery("from Workers  where department_id="+depId+" and availability="+('\''+avail.toString()+'\''));
        List workers =  query.getResultList();

        tx1.commit();
        session.close();
        if (workers.isEmpty())
            return null;
        return workers;
    }

    public List<Department> getWorkers(boolean status){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        Query query = session.createQuery("from Department  where status="+status);
        List dep = ((org.hibernate.query.Query) query).list();

        tx1.commit();
        session.close();
        if (dep.isEmpty())
            return null;
        return dep;
    }




}

//    -using HQL, get workers by `department_id` and `availability`.
//    -using HQL, get all active departments.-using JPA criteria,
//       get workers by `department_id` and `availability`.
//    -using JPA criteria, get all active departments.