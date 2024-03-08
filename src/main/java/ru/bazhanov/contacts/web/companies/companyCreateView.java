package ru.bazhanov.contacts.web.companies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contacts/companies/companyCreateView")
public class companyCreateView {
    @GetMapping
    public String showCompanyCreateView(){
        return "contacts/companies/companyCreateView";
    }

    @PostMapping
    public ModelAndView addCompany(){
        ModelAndView mv = new ModelAndView("redirect:/contacts/companies/companyCreateView");
        return mv;
    }
}
