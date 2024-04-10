package ru.bazhanov.contacts.service;

import ru.bazhanov.contacts.dto.OrganizationDTO;
import ru.bazhanov.contacts.model.Organization;

import java.util.List;

public interface OrganizationService {
    Boolean save(OrganizationDTO organizationDTO);
    List<Organization> findAll();
    Organization findById(Integer id);
}
