package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.businnes.abstracts.LanguageService;
import com.example.demo.businnes.request.CreateLanguage;
import com.example.demo.businnes.request.UpdateLanguage;
import com.example.demo.businnes.responses.GetAllLanguage;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/language")
@AllArgsConstructor
public class LanguageController {	
private LanguageService languageService;

@PostMapping()
public void add(@RequestBody CreateLanguage createLanguage) {
	this.languageService.add(createLanguage);
}
@GetMapping()
public List<GetAllLanguage>getAll()
{
return this.languageService.getAll();	
}
@DeleteMapping("/{id}")
public void delete(@PathVariable  int id) {
	this.languageService.delete(id);
	
}
@PutMapping()
public void update(@RequestBody UpdateLanguage language) {
	this.languageService.update(language);
	
}
}
