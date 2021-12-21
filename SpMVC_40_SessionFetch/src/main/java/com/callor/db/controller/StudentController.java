package com.callor.db.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.db.controller.service.StudentService;
import com.callor.db.dao.StudentDao;
import com.callor.db.model.StudentVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/student")
public class StudentController {
		
	private final StudentService stService;
	private final StudentDao stDao;
	public StudentController(StudentService stService,StudentDao stDao) {
		this.stService = stService;
		this.stDao = stDao;
	}
	
	@RequestMapping(value= {"/",""},method=RequestMethod.GET)
	public String home() {
		return "student";
	}
	

	@ResponseBody
	@RequestMapping(value= {"/",""},method=RequestMethod.POST)
	public List<StudentVO> home(String search) {
		
		List<StudentVO> stList = stService.findByNames(search);
		return stList;
	}

	
	@ResponseBody
	@RequestMapping(value="/insert",method=RequestMethod.GET,produces = "text/html;charset=UTF-8")
	public String insert() {
		return String.format("%d 개의 데이터 INERT", stService.insert());
	}

	@RequestMapping(value="/create",method=RequestMethod.GET,produces = "text/html;charset=UTF-8")
	public String drop_create() {
		
		stDao.drop_table();
		stDao.create_table();
		
		// return String.format("student 테이블 다시 생성");
		return "redirect:/student";
	}

	
	
}
