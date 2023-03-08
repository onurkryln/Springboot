package com.example.demo.businnes.concreters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.businnes.abstracts.FrameworkService;
import com.example.demo.businnes.request.CreateFrameWork;
import com.example.demo.businnes.request.UpdateFrameWork;
import com.example.demo.businnes.responses.GetAllFrameWork;
import com.example.demo.core.mappers.ModelMapperService;
import com.example.demo.dataAccess.FrameWorkDao;
import com.example.demo.entities.FrameWork;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class FrameWorkManager  implements FrameworkService{
	private FrameWorkDao frameworkDao;
	private ModelMapperService modelMapperService;
	@Override
	public void add(CreateFrameWork createFramework) {
		// TODO Auto-generated method stub
		FrameWork framework= this.modelMapperService.forRequest().map(createFramework, FrameWork.class);

		this.frameworkDao.save(framework);
	}

	@Override
	public List<GetAllFrameWork> getAll() {
		// TODO Auto-generated method stub
		List<FrameWork>frameworks=this.frameworkDao.findAll();
		List<GetAllFrameWork>getAllFrameworks=(List<GetAllFrameWork>) frameworks.stream()
				.map(frameworkss->this.modelMapperService.forResponse().
						map(frameworkss ,GetAllFrameWork.class) ).collect(Collectors.toList());
	return getAllFrameworks;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.frameworkDao.deleteById(id);
	}

	@Override
	public void update(UpdateFrameWork updateFrameWork) {
		// TODO Auto-generated method stub
		FrameWork framework=this.modelMapperService.forResponse()
				.map( updateFrameWork,FrameWork.class);
		this.frameworkDao.save(framework);
		
	}

}