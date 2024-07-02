package ru.bazhanov.equipments.web.componentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.bazhanov.equipments.dto.ComponentTypeDTO;
import ru.bazhanov.equipments.service.interfaces.ComponentTypeService;

@Controller
@RequestMapping("/componentTypeCreateView")
public class ComponentTypeCreateViewController {
    @Autowired
    ComponentTypeService componentTypeService;

    @GetMapping
    public ModelAndView showComponentTypeCreateView(){
        ModelAndView mv = new ModelAndView("equipments/componentTypes/componentTypeCreateView");
        mv.addObject("componentType", new ComponentTypeDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView saveComponentType(@ModelAttribute("componentType") ComponentTypeDTO newComponentType){
        componentTypeService.save(newComponentType);
        ModelAndView mv = new ModelAndView("equipments/componentTypes/componentTypeCreateView");
        mv.addObject("componentType", new ComponentTypeDTO());
        return mv;
    }
}
