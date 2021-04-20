package com.contact.demo.reposotories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contact.demo.entities.ContactEntity;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {
}