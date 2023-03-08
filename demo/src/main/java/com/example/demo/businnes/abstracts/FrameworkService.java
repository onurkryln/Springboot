package com.example.demo.businnes.abstracts;

import java.util.List;

import com.example.demo.businnes.request.CreateFrameWork;
import com.example.demo.businnes.request.UpdateFrameWork;
import com.example.demo.businnes.responses.GetAllFrameWork;



public interface FrameworkService {
	public void add(CreateFrameWork createFramework);
	public List<GetAllFrameWork>getAll();
public void delete(int id);
public void update(UpdateFrameWork updateFrameWork);

}
