package com.scm.controllers;



import com.scm.dto.ContactDto;
import com.scm.servicesInterface.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping("/user/{userId}")
    public ContactDto create(@PathVariable Long userId, @RequestBody ContactDto dto) {
        return contactService.createContact(userId, dto);
    }

    @GetMapping("/{id}")
    public ContactDto getById(@PathVariable Long id) {
        return contactService.getContactById(id);
    }

    @GetMapping("/user/{userId}")
    public List<ContactDto> getByUser(@PathVariable Long userId) {
        return contactService.getContactsByUser(userId);
    }

    @PutMapping("/{id}")
    public ContactDto update(@PathVariable Long id, @RequestBody ContactDto dto) {
        return contactService.updateContact(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        contactService.deleteContact(id);
    }
}
