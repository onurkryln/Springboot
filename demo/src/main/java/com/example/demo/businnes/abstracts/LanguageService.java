package com.example.demo.businnes.abstracts;

import java.util.List;

import com.example.demo.businnes.request.CreateLanguage;
import com.example.demo.businnes.request.UpdateLanguage;
import com.example.demo.businnes.responses.GetAllLanguage;


public interface LanguageService {
	public void add(CreateLanguage createLanguage);
	public List<GetAllLanguage>getAll();
	public void delete(int id);
	public void update(UpdateLanguage updateLanguage);
}
