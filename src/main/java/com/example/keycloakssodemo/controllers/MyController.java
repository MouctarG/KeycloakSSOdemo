package com.example.keycloakssodemo.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MyController {

    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

    @GetMapping(path = "/customers")
    public String customers(@RequestParam String name, Principal principal) {
        System.out.println(principal.getName());
      /*  model.addAttribute("customers", customerDAO.findAll());
        model.addAttribute("username", principal.getName());*/
        return "customers";
    }

    @GetMapping(path = "/customer")
    public String customer(HttpServletRequest request) {
        System.out.println(request.getCookies().length);
        System.out.println(request.getCookies()[0].getValue());
      /*  model.addAttribute("customers", customerDAO.findAll());
        model.addAttribute("username", principal.getName());*/
        return "customers";
    }
}
