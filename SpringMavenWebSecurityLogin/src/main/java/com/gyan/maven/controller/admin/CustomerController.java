/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.maven.controller.admin;

import com.gyan.maven.entity.Customer;
import com.gyan.maven.service.CustomerService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Admin_GYAN
 */
@Controller
@RequestMapping(value = "/admin/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerServie;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("customers", customerServie.getAll());

        return "admin/customer/index";

    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)

    public String edit(Model model, @PathVariable("id") int id) throws ClassNotFoundException, SQLException {
        model.addAttribute("cus", customerServie.getById(id));
        return "admin/customer/edit";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) throws ClassNotFoundException, SQLException {
        customerServie.delete(id);
        return "redirect:/admin/customer";

    }
     @RequestMapping(value ="/save",method =RequestMethod.POST)
    public String save(@ModelAttribute("Customer")Customer customer) throws ClassNotFoundException, SQLException {
       if(customer.getId()>0){
        customerServie.update(customer);
       }else{
           customerServie.insert(customer);
       }
        return "redirect:/admin/customer?success&action=save";

    }
     @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
     return "admin/customer/add";
    }
    @RequestMapping(value ="/addcustomer",method = RequestMethod.POST)
    public String addcustomer(@ModelAttribute("Customer")Customer customer) throws ClassNotFoundException, SQLException{
        customerServie.insert(customer);
        return "redirect:/admin/customer?pass&got=add";
        
    }


}
