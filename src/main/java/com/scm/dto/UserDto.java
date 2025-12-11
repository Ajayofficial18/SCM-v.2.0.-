package com.scm.dto;

import com.scm.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

//@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
//public class UserDto {
//
//    private Long id;
//    private String name;
//    private String email;
//    private String about;
//    private String imageUrl;
//    private Role role;
//}

//package com.scm.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
@Builder
@Data
public class UserDto {

    private Long id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    private String about;

    private String imageUrl;

    private Role role;
}


