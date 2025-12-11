package com.scm.controllers;



import com.scm.dto.ContactDto;
import com.scm.payload.ApiResponse;
import com.scm.servicesInterface.ContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping("/user/{userId}")
    public ResponseEntity<ApiResponse<?>> create(
            @PathVariable Long userId,
            @Valid @RequestBody ContactDto dto) {
        ContactDto saved = contactService.createContact(userId, dto);
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .message("Contact created successfully")
                        .success(true)
                        .data(saved)
                        .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> getById(@PathVariable Long id) {
        ContactDto dto = contactService.getContactById(id);
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .message("Contact fetched successfully")
                        .success(true)
                        .data(dto)
                        .build()
        );
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<ApiResponse<?>> getByUser(@PathVariable Long userId) {
        List<ContactDto> list = contactService.getContactsByUser(userId);
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .message("User contacts fetched successfully")
                        .success(true)
                        .data(list)
                        .build()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> update(
            @PathVariable Long id,
            @Valid @RequestBody ContactDto dto
    ) {
        ContactDto updated = contactService.updateContact(id, dto);
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .message("Contact updated successfully")
                        .success(true)
                        .data(updated)
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> delete(@PathVariable Long id) {
        contactService.deleteContact(id);
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .message("Contact deleted successfully")
                        .success(true)
                        .data(null)
                        .build()
        );
    }
}
