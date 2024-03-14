package ru.bazhanov.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bazhanov.contacts.dto.OrganizationDTO;
import ru.bazhanov.contacts.model.Organization;
import ru.bazhanov.contacts.model.repository.OrganizationRepository;

@Service
public class OrganizationBDServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

    @Autowired
    OrganizationBDServiceImpl( OrganizationRepository organizationRepository){
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Boolean save(OrganizationDTO organizationDTO) {
        if(organizationDTO.getName() == null && organizationDTO.getCity() == null){
            return false;
        }
        Organization organization = new Organization(organizationDTO.getName(),organizationDTO.getCity());
        organizationRepository.save(organization);
        return true;
    }
}
