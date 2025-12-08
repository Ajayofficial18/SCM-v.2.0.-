package com.scm.dto;

import com.scm.enums.Role;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String about;
    private String imageUrl;
    private Role role;
}

