package com.scm.utils.mappers;



import com.scm.dto.ContactDto;
import com.scm.entities.Contact;

public class ContactMapper {

    public static ContactDto toDto(Contact c) {
        ContactDto dto = new ContactDto();
        dto.setId(c.getId());
        dto.setName(c.getName());
        dto.setPhone(c.getPhone());
        dto.setEmail(c.getEmail());
        dto.setAddress(c.getAddress());
        dto.setDescription(c.getDescription());
        dto.setImageUrl(c.getImageUrl());
        return dto;
    }

    public static Contact toEntity(ContactDto dto) {
        return Contact.builder()
                .id(dto.getId())
                .name(dto.getName())
                .phone(dto.getPhone())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .description(dto.getDescription())
                .imageUrl(dto.getImageUrl())
                .build();
    }
}

