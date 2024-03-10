package ru.bazhanov.contacts.service;

import ru.bazhanov.contacts.dto.OrganizationDTO;
import ru.bazhanov.contacts.model.Organization;

public interface OrganizationService {
    Boolean save(OrganizationDTO organizationDTO);
}
