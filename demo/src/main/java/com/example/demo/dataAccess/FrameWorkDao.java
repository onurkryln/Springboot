package com.example.demo.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.FrameWork;

public interface FrameWorkDao extends JpaRepository<FrameWork, Integer> {

	
}
