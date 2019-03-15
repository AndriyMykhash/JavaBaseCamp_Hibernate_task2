package com;

import com.representation.Availability;
import com.representation.Department;
import com.representation.Workers;
import com.service.DepartmentService;
import com.service.WorkersService;

import java.util.List;

public class Main {

    public static void main(String[] arg) {


        HQL_Queries hql = new HQL_Queries();
//        JPA_Criteria jpa = new JPA_Criteria();


        List<Workers> w = hql.getWorkersByDepIdAndAvail(4, Availability.part_time);
        System.out.println(w.get(0).getAge()+" "+ w.get(0).getAvailability()+" "+w.get(0).getDepartment_id()+" "+ w.get(0).getFull_name()+" " +w.get(0).getId());

//        List<Department> l  = jpa.getWorkers(true);
//        List<Workers> l  = jpa.getWorkersByDepIdAndAvail(6, Availability.part_time);
//        for (Workers d : l) {
//            System.out.println(d.getId()+" "+d.getFull_name()+" "+d.getDepartment_id()+" "+d.getAvailability()+" "+d.getAge());
//        }

    }
}
