package com.scm.servicesInterface;

import com.scm.dto.ContactDto;

import java.util.List;

public interface ContactService {

    ContactDto createContact(Long userId, ContactDto dto);

    ContactDto getContactById(Long id);

    List<ContactDto> getContactsByUser(Long userId);

    ContactDto updateContact(Long id, ContactDto dto);

    void deleteContact(Long id);
}

