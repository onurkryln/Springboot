package com.example.demo.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Language;

public interface LanguageDao extends JpaRepository<Language, Integer> {


}
