package com.scm.utils.mappers;



import com.scm.dto.ContactDto;
import com.scm.entities.Contact;

public class ContactMapper {

    public static ContactDto toDto(Contact c) {
        return ContactDto.builder()
                .id(c.getId())
                .name(c.getName())
                .phone(c.getPhone())
                .email(c.getEmail())
                .address(c.getAddress())
                .description(c.getDescription())
                .imageUrl(c.getImageUrl())
                .build();
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

