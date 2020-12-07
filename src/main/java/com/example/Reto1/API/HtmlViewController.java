package com.example.Reto1.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HtmlViewController {
    
    @GetMapping("/html")
    public ModelAndView shop() {
        ModelAndView vista = new ModelAndView("index");
        vista.addObject("products", ProductsController.products);
        return vista;
    }

}
