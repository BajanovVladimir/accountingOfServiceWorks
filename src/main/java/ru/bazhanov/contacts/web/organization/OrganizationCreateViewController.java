package ru.bazhanov.contacts.web.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.bazhanov.contacts.dto.OrganizationDTO;
import ru.bazhanov.contacts.model.Organization;
import ru.bazhanov.contacts.service.OrganizationService;

@Controller
@RequestMapping("/contacts/companies/companyCreateView")
public class OrganizationCreateViewController {


    private final OrganizationService organizationService;

    @Autowired
    OrganizationCreateViewController(OrganizationService organizationService){
       this.organizationService = organizationService;
    }

    @GetMapping
    public ModelAndView showCompanyCreateView(){
        ModelAndView mv =new ModelAndView("contacts/companies/companyCreateView");
        mv.addObject("organization", new Organization());
        return mv;
    }

    @PostMapping
    public ModelAndView addCompany(@ModelAttribute("organization") OrganizationDTO organization){
        organizationService.save(organization);
        ModelAndView mv = new ModelAndView("redirect:/contacts/companies/companyCreateView");
        mv.addObject("organization", new Organization());
        return mv;
    }
}
