/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.maven.dao.impl;

import com.gyan.maven.dao.CustomerDAO;
import com.gyan.maven.entity.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin_GYAN
 */
@Repository(value = "customerDAO")

public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAll() throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM tbl_customer";
        return jdbcTemplate.query(sql, new RowMapper<Customer>() {

            @Override
            public Customer mapRow(ResultSet rs, int i) throws SQLException {
                Customer c = new Customer();
                c.setId(rs.getInt("customer_id"));
                c.setFirstName(rs.getString("first_name"));
                c.setLastName(rs.getString("last_name"));
                c.setEmail(rs.getString("email"));
                c.setContactNo(rs.getString("contact_no"));
                c.setAddedDate(rs.getDate("added_date"));
                c.setModifiedDate(rs.getDate("modified_date"));
                c.setStatus(rs.getBoolean("status"));
                return c;

            }
        });
    }

    @Override
    public int insert(Customer customer) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO tbl_customer(first_name,last_name,email,contact_no,status) VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{
            customer.getFirstName(),
            customer.getLastName(),
            customer.getEmail(),
            customer.getContactNo(),
            customer.isStatus()

        });
    }

    @Override
    public Customer getById(int id) throws ClassNotFoundException, SQLException {
  String sql = "SELECT * FROM tbl_customer WHERE customer_id=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{id},new RowMapper<Customer>() {

            @Override
            public Customer mapRow(ResultSet rs, int i) throws SQLException {
                Customer c = new Customer();
                c.setId(rs.getInt("customer_id"));
                c.setFirstName(rs.getString("first_name"));
                c.setLastName(rs.getString("last_name"));
                c.setEmail(rs.getString("email"));
                c.setContactNo(rs.getString("contact_no"));
                c.setAddedDate(rs.getDate("added_date"));
                c.setModifiedDate(rs.getDate("modified_date"));
                c.setStatus(rs.getBoolean("status"));
                return c;

            }
        });
    }

    @Override
    public int update(Customer customer) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE tbl_customer SET first_name=?,last_name=?,email=?,contact_no=?,modified_date=CURRENT_TIMESTAMP,status=? WHERE customer_id=?";
        return jdbcTemplate.update(sql, new Object[]{
            customer.getFirstName(),
            customer.getLastName(),
            customer.getEmail(),
            customer.getContactNo(),
            customer.isStatus(),
            customer.getId()
              
                

        });
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        String sql="DELETE FROM tbl_customer WHERE customer_id=?";
        return jdbcTemplate.update(sql,new Object[]{
            id
            
        });
    }

}
