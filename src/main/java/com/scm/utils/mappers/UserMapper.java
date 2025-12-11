package com.scm.utils.mappers;


import com.scm.dto.UserDto;
import com.scm.entities.User;

public class UserMapper {

    public static UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())  // ADD THIS
                .about(user.getAbout())
                .imageUrl(user.getImageUrl())
                .role(user.getRole())
                .build();
    }

    public static User toEntity(UserDto dto) {
        return User.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .password(dto.getPassword())  // ADD THIS
                .about(dto.getAbout())
                .imageUrl(dto.getImageUrl())
                .role(dto.getRole())
                .build();
    }

}

