package com.example.demo.businnes.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateFrameWork {
	private int id;
	private String frameworkName;
	private int languageId;
}
