package model.dao.impl;

import java.util.List;

import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

    @Override
    public void insert(Department obj) {
       
    }

    @Override
    public void update(Department obj) {
        
    }

    @Override
    public void deleteById(Integer id) {
        
    }

    @Override
    public Department findById(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Department> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
