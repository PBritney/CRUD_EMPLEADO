package com.example.empleado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author BRITNEY
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
