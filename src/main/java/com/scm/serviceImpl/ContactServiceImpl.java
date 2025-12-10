package com.scm.serviceImpl;

import com.scm.dto.ContactDto;
import com.scm.entities.Contact;
import com.scm.entities.User;
import com.scm.exceptions.ResourceNotFoundException;
import com.scm.repositories.ContactRepository;
import com.scm.repositories.UserRepository;
import com.scm.servicesInterface.ContactService;
import com.scm.utils.mappers.ContactMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepo;
    private final UserRepository userRepo;

    @Override
    public ContactDto createContact(Long userId, ContactDto dto) {
        User user = userRepo.findById(userId).orElse(null);
        Contact contact = ContactMapper.toEntity(dto);
        contact.setUser(user);
        return ContactMapper.toDto(contactRepo.save(contact));
    }

    @Override
    public ContactDto getContactById(Long id) {
        return contactRepo.findById(id)
                .map(ContactMapper::toDto)
                .orElseThrow(()-> new ResourceNotFoundException("Invalid ContactId"));
    }

    @Override
    public List<ContactDto> getContactsByUser(Long userId) {
        return contactRepo.findByUserId(userId)
                .stream()
                .map(ContactMapper::toDto)
                .toList();
    }

    @Override
    public ContactDto updateContact(Long id, ContactDto dto) {
        Contact contact = contactRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Invalid ContactId enter agian with correct ContactId"));


        contact.setName(dto.getName());
        contact.setEmail(dto.getEmail());
        contact.setPhone(dto.getPhone());
        contact.setAddress(dto.getAddress());
        contact.setDescription(dto.getDescription());

        return ContactMapper.toDto(contactRepo.save(contact));
    }

    @Override
    public void deleteContact(Long id) {
        contactRepo.deleteById(id);
    }
}
