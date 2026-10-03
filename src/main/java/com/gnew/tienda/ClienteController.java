package com.gnew.tienda;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 


@Controller 
public class ClienteController {
    @GetMapping("/hola")
    public String index() {
        return "cliente/index";
    }
}

