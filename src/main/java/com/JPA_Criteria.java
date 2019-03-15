package com;

import com.representation.Availability;
import com.representation.Department;
import com.representation.Workers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class JPA_Criteria {

    public List<Department> getWorkers(boolean status) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Persistence");
        EntityManager entitymanager = emfactory.createEntityManager();
        CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        Root from = criteriaQuery.from(Department.class);

        CriteriaQuery select = criteriaQuery.select(from);
        criteriaQuery.where(criteriaBuilder.equal(from.get("status"),status));
        TypedQuery typedQuery = entitymanager.createQuery(select);
        List dep = typedQuery.getResultList();

        entitymanager.close();
        emfactory.close();

        if (dep.isEmpty())
            return null;
        return dep;
    }


    public List<Workers> getWorkersByDepIdAndAvail(long depId, Availability avail){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Persistence");
        EntityManager manager = emfactory.createEntityManager();
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        Root from = criteriaQuery.from(Workers.class);

        CriteriaQuery query = criteriaQuery.select(from);
        criteriaQuery.where(criteriaBuilder.equal(from.get("department_id"),depId),
                criteriaBuilder.equal(from.get("availability"),avail));
        TypedQuery typedQuery = manager.createQuery(query);
        List dep = typedQuery.getResultList();

        manager.close();
        emfactory.close();

        if (dep.isEmpty()) {
            return null;
        }
        return dep;

    }

}
