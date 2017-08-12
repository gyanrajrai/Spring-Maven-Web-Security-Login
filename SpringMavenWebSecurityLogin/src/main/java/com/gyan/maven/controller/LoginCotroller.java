/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Admin_GYAN
 */
@Controller
@RequestMapping(value = "/login")
public class LoginCotroller {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "login";

    }

}
