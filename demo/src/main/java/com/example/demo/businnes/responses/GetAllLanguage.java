package com.example.demo.businnes.responses;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguage {
private int id;
	private String name;
private Map<Integer,String>frameworks; 
}
