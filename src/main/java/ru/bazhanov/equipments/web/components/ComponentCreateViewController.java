package ru.bazhanov.equipments.web.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.bazhanov.equipments.dto.ComponentDTO;
import ru.bazhanov.equipments.service.ComponentService;
import ru.bazhanov.equipments.service.ComponentTypeService;

@Controller
@RequestMapping("/componentCreateView")
public class ComponentCreateViewController {

    @Autowired
    private ComponentTypeService componentTypeService;
    @Autowired
    private ComponentService componentService;

    @GetMapping
    public ModelAndView showComponentCreateView(){
        ModelAndView mv = new ModelAndView("equipments/components/componentCreateView");
        mv.addObject("component",new ComponentDTO());
        mv.addObject("componentTypeList", componentTypeService.findAll());
        return mv;
    }

    @PostMapping
    public ModelAndView saveComponent(@ModelAttribute("component") ComponentDTO componentDTO){
        componentService.save(componentDTO);
        ModelAndView mv = new ModelAndView("equipments/components/componentCreateView");
        mv.addObject("component",new ComponentDTO());
        mv.addObject("componentTypeList", componentTypeService.findAll());
        return mv;
    }
}