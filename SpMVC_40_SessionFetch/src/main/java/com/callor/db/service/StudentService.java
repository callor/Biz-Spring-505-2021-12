package com.callor.db.controller.service;

import java.util.List;

import com.callor.db.model.StudentVO;

public interface StudentService {
	
	public Integer insert();
	public List<StudentVO> selectAll();
	public List<StudentVO> findByNames(String search);
	
}
