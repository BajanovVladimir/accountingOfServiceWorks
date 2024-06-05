package ru.bazhanov.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bazhanov.contacts.dto.OrganizationDTO;
import ru.bazhanov.contacts.model.Organization;
import ru.bazhanov.contacts.repository.OrganizationRepository;

import java.util.List;

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
        if(organizationRepository.findByNameAndCity(organizationDTO.getName(),organizationDTO.getCity()) == null){
            Organization organization = new Organization(organizationDTO.getName(),organizationDTO.getCity());
            organizationRepository.save(organization);
        }
        return true;
    }

    @Override
    public List<Organization> findAll() {
        return organizationRepository.findAll(Sort.by(Sort.Order.asc("name")));
    }
    @Override
    public Organization findById(Integer id) {
        return organizationRepository.getReferenceById(id);
    }
}
