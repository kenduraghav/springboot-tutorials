package com.thorben.janssen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thorben.janssen.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
