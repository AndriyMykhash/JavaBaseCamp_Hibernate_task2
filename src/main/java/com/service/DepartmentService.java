package com.service;

import com.dao.DepartmentDao;
import com.representation.Department;

public class DepartmentService {
    private DepartmentDao departmentDao = new DepartmentDao();

    public DepartmentService() {
    }

    public Department findDepartment(Long id) {
        return departmentDao.findById(id);
    }

    public void saveDepartment(Department department) {
        departmentDao.save(department);
    }

    public void deleteDepartment(Department department) {
        departmentDao.delete(department);
    }

    public void updateDepartment(Department department) {
        departmentDao.update(department);
    }
}
