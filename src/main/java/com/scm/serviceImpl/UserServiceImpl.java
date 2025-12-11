package com.scm.serviceImpl;


import com.scm.dto.UserDto;
import com.scm.entities.User;
import com.scm.exceptions.BadRequestException;
import com.scm.exceptions.ResourceNotFoundException;
import com.scm.repositories.UserRepository;
import com.scm.servicesInterface.UserService;
import com.scm.utils.mappers.UserMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.toEntity(userDto);
        User saved = userRepository.save(user);
        return UserMapper.toDto(saved);
    }

    @Override
    public UserDto getUserById(Long userId) {
        return userRepository.findById(userId)
                .map(UserMapper::toDto)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));
    }

    @Override
    public UserDto getUserByEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new BadRequestException("Email cannot be empty");
        }
        return userRepository.findByEmail(email)
                .map(UserMapper::toDto)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with email " + email));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toDto)
                .toList();
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid User ID"));
        userRepository.delete(user);
    }
}

