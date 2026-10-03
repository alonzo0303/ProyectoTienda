package com.gnew.tienda;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 


@Controller
public class ClienteController {
    @GetMapping("/alsha-inicio")
    @ResponseBody
    public String index() {
        return "¡El controlador funciona a la perfección!";
    }
}
