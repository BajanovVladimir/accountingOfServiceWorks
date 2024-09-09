package ru.bazhanov.web.ordersControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/orderCreateView")
public class OrderCreateController {

    @GetMapping
    public ModelAndView showOrderCreateView(){
        ModelAndView mv = new ModelAndView("orders/orderCreateView");
        return mv;
    }

}
