/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.maven.service.impl;

import com.gyan.maven.dao.CustomerDAO;
import com.gyan.maven.entity.Customer;
import com.gyan.maven.service.CustomerService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin_GYAN
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDAO customerDAO;

    @Override
    public List<Customer> getAll() throws ClassNotFoundException, SQLException {
        return customerDAO.getAll();
    }

    @Override
    public int insert(Customer customer) throws ClassNotFoundException, SQLException {
        return customerDAO.insert(customer);
    }

    @Override
    public Customer getById(int id) throws ClassNotFoundException, SQLException {
        return customerDAO.getById(id);
    }

    @Override
    public int update(Customer customer) throws ClassNotFoundException, SQLException {
        return customerDAO.update(customer);
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        return customerDAO.delete(id);
    }

}
