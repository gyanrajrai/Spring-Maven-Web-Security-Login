/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.maven.dao;

import com.gyan.maven.entity.Customer;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Admin_GYAN
 */
public interface CustomerDAO {

    List<Customer> getAll() throws ClassNotFoundException, SQLException;

    int insert(Customer customer) throws ClassNotFoundException, SQLException;

    Customer getById(int id) throws ClassNotFoundException, SQLException;

    int update(Customer customer) throws ClassNotFoundException, SQLException;

    int delete(int id) throws ClassNotFoundException, SQLException;

}
