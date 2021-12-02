package com.callor.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/file")
public class FileController {
	
	@RequestMapping(value= {"/",""},method=RequestMethod.GET)
	public String fileUp() {
		return "write";
	}
	
	/**
	 * 
	 * form에서 전달한 파일을 수신할 Controller
	 * 송신 : 보내기, 수신 : 받기
	 * 
	 * MultipartFile 로 파일을 수신할때는
	 * @RequestParam 에 form 의 input file tag 의 이름을
	 * 지정해 주는 것이 오류가 적다
	 */
	@RequestMapping(value= {"/",""},method=RequestMethod.POST)
	public String fileUp(
			String to_title,
			@RequestParam("to_image") 
			MultipartFile rev_image) {
		
		log.debug("TODO {}", to_title);
		log.debug("파일 {}", rev_image.getOriginalFilename());
		return "redirect:/file";
	}
}
