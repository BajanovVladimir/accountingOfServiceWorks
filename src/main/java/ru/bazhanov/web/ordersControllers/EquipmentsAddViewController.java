package ru.bazhanov.web.ordersControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.bazhanov.equipments.dto.EquipmentDTO;
import ru.bazhanov.equipments.service.interfaces.EquipmentService;

import java.time.LocalDate;


@Controller
@RequestMapping("/orders/equipmentAddView")
public class EquipmentsAddViewController {

    @Autowired
    private EquipmentService equipmentService;

    @GetMapping
    public ModelAndView showEquipmentAddView(@RequestParam(value = "date") LocalDate orderDate){
        ModelAndView mv = new ModelAndView("orders/equipmentAddView");
        mv.addObject("orderDate",orderDate);
        mv.addObject("equipment", new EquipmentDTO());
        mv.addObject("equipmentList", equipmentService.findAll());
        return mv;
    }
    @PostMapping
    public ModelAndView equipmentAdd(){
        ModelAndView mv = new ModelAndView("orders/orderCreateView");
        return mv;
    }
}
