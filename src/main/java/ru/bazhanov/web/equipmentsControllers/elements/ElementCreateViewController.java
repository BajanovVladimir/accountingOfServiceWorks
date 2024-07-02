package ru.bazhanov.web.equipmentsControllers.elements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.bazhanov.equipments.dto.ElementDTO;
import ru.bazhanov.equipments.service.interfaces.ComponentService;
import ru.bazhanov.equipments.service.interfaces.ElementService;


@Controller
@RequestMapping("/elementCreateView")
public class ElementCreateViewController {
    private final ComponentService componentService;
    private final ElementService elementService;
    @Autowired
    ElementCreateViewController(ComponentService componentService, ElementService elementService){
        this.componentService = componentService;
        this.elementService = elementService;
    }
    @GetMapping
    public ModelAndView showElementCreateView(){
        ModelAndView mv = new ModelAndView("equipments/elements/elementCreateView");
        mv.addObject("element",new ElementDTO());
        mv.addObject("componentList",componentService.findAll());
        return mv;
    }

    @PostMapping
    public ModelAndView saveNewElement(@ModelAttribute("element") ElementDTO newElementDTO){
        elementService.save(newElementDTO);
        ModelAndView mv = new ModelAndView("equipments/elements/elementCreateView");
        mv.addObject("element", new ElementDTO());
        mv.addObject("componentList", componentService.findAll());
        return mv;
    }
}
