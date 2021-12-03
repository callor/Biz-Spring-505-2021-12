package com.callor.todo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.callor.todo.config.QualifierConfig;
import com.callor.todo.service.FileServiceABS;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	private final List<String> todoList
		= new ArrayList<String>();
	
	private final FileServiceABS fileService;
	public HomeController(
			
		@Qualifier(QualifierConfig.SERVICE.FILE_SERVICE_V1)
		FileServiceABS fileService) {
		this.fileService = fileService;
	
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value={"/",""} , method=RequestMethod.POST)
	public String home(
			Model model,
			String to_text,
			@RequestParam("to_image") MultipartFile to_image
			
		) {
		
		fileService.fileUp(to_image);
		
		todoList.add(to_text);
		model.addAttribute("TODOLIST",todoList);
		
		log.debug("TODO {}", to_text);
		log.debug("이미지 {}", to_image.getOriginalFilename());
		return "home";
		
	}
}
