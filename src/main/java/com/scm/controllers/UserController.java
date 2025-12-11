package com.scm.controllers;



import com.scm.dto.UserDto;
import com.scm.payload.ApiResponse;
import com.scm.servicesInterface.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<ApiResponse<?>> createUser(@Valid @RequestBody UserDto dto) {
        UserDto savedUser = userService.createUser(dto);
        return ResponseEntity.ok(ApiResponse.builder()
                .message("User created successfully")
                .success(true)
                .data(savedUser)
                .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> getById(
            @PathVariable @Min(value = 1, message = "Id must be greater than 0") Long id
    ) {
        UserDto dto = userService.getUserById(id);
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .message("User fetched successfully")
                        .success(true)
                        .data(dto)
                        .build()
        );
    }

    @GetMapping
    public ResponseEntity<ApiResponse<?>> getAll() {
        List<UserDto> list = userService.getAllUsers();
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .message("Users fetched successfully")
                        .success(true)
                        .data(list)
                        .build()
        );
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> delete(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .message("User deleted successfully")
                        .success(true)
                        .data(null)
                        .build()
        );
    }
}
