package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn = null;
    
    

    public DepartmentDaoJDBC(Connection conn) {
        if(conn != null){
            this.conn = conn;
        }
    }

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
        
        return null;
    }


    @Override
    public List<Department> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
