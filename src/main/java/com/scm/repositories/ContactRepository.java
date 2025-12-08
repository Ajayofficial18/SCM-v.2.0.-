package com.scm.repositories;

import com.scm.entities.Contact;
import com.scm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findByUser(User user);

    List<Contact> findByUserId(Long userId);
}

