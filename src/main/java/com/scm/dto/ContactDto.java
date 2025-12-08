package com.scm.dto;



import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ContactDto {

    private Long id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String description;
    private String imageUrl;
}

