package com.example.demo.businnes.concreters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.businnes.abstracts.LanguageService;
import com.example.demo.businnes.request.CreateLanguage;
import com.example.demo.businnes.request.UpdateLanguage;
import com.example.demo.businnes.responses.GetAllLanguage;
import com.example.demo.core.mappers.ModelMapperService;
import com.example.demo.dataAccess.FrameWorkDao;
import com.example.demo.dataAccess.LanguageDao;
import com.example.demo.entities.FrameWork;
import com.example.demo.entities.Language;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {
private LanguageDao languageDao;
private FrameWorkDao frameWorkDao;
private ModelMapperService modelMapperService;
@Override
public void add(CreateLanguage createLanguage) {
	// TODO Auto-generated method stub
	Language language= this.modelMapperService.forRequest().map(createLanguage, Language.class);

	this.languageDao.save(language);
}

@Override
public List<GetAllLanguage> getAll() {
	// TODO Auto-generated method stub
	List<Language>languages=this.languageDao.findAll();

	List<GetAllLanguage>getAllLanguages=new ArrayList<>();
	Map<Integer,String>frameworks;
	for(Language lang:languages) {
		frameworks=new HashMap<>();
		GetAllLanguage allLanguage=new GetAllLanguage();
		allLanguage.setId(lang.getId());
		allLanguage.setName(lang.getName());
for(FrameWork frameWork:frameWorkDao.findAll()) {
	if(frameWork.getLanguage()==lang) {
		frameworks.put(frameWork.getId(), frameWork.getFrameworkName());
	}
}
	allLanguage.setFrameworks(frameworks);
	getAllLanguages.add(allLanguage);

	
}
return getAllLanguages;		
	}

@Override
public void delete(int id) {
	// TODO Auto-generated method stub
this.languageDao.deleteById(id);	
}

@Override
public void update(UpdateLanguage updateLanguage) {
	// TODO Auto-generated method stub
			Language language=this.modelMapperService.forResponse()
					.map( updateLanguage,Language.class);
			this.languageDao.save(language);
			
	
}
}



