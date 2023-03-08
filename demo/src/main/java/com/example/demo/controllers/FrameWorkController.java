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

import com.example.demo.businnes.abstracts.FrameworkService;
import com.example.demo.businnes.request.CreateFrameWork;
import com.example.demo.businnes.request.UpdateFrameWork;
import com.example.demo.businnes.responses.GetAllFrameWork;


import lombok.AllArgsConstructor;
@RestController
@RequestMapping("/api/framework")
@AllArgsConstructor
public class FrameWorkController {
	private FrameworkService frameworkService;

	@PostMapping()
	public void add(@RequestBody CreateFrameWork createFramework) {
		this.frameworkService.add(createFramework);
	}
	@GetMapping()
	public List<GetAllFrameWork>getAll()
	{
	return this.frameworkService.getAll();	
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable  int id) {
		this.frameworkService.delete(id);
		
	}
	@PutMapping()
	public void update(@RequestBody UpdateFrameWork updateFrameWork) {
		this.frameworkService.update(updateFrameWork);
		
	}
}
