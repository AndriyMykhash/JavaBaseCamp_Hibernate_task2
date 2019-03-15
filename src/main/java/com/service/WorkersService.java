package com.service;

import com.dao.WorkersDao;
import com.representation.Workers;

public class WorkersService {

    private WorkersDao workersDao = new WorkersDao();

    public WorkersService() {
    }

    public Workers findWorkers(Long id) {
        return workersDao.findById(id);
    }

    public void saveWorkers(Workers workers) {
        workersDao.save(workers);
    }

    public void deleteWorkers(Workers workers) {
        workersDao.delete(workers);
    }

    public void updateWorkers(Workers workers) {
        workersDao.update(workers);
    }

}
