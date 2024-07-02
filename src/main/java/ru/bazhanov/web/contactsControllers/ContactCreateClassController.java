package ru.bazhanov.web.contactsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.bazhanov.contacts.dto.ContactDTO;
import ru.bazhanov.contacts.model.Organization;
import ru.bazhanov.contacts.service.ContactService;
import ru.bazhanov.contacts.service.OrganizationService;

import java.util.List;

@Controller
@RequestMapping("/contacts/contactCreateView")
public class ContactCreateClassController {

    @Autowired
    private OrganizationService organizationService;
    @Autowired
    private ContactService contactService;

    @GetMapping
    public ModelAndView showContactCreateView(){
        List<Organization> organizationList = organizationService.findAll();
        ModelAndView mv = new ModelAndView("contacts/contactCreateView");
        mv.addObject("organizationList", organizationList);
        mv.addObject("contact",new ContactDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView addContact(@ModelAttribute("contact") ContactDTO contact){
        List<Organization> organizationList = organizationService.findAll();
        contactService.saveContact(contact);
        ModelAndView mv = new ModelAndView("redirect:/contacts/contactCreateView");
        mv.addObject("organizationList", organizationList);
        return mv;
    }
}
