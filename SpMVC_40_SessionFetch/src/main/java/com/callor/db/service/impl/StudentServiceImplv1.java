package com.callor.db.controller.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.db.controller.service.StudentService;
import com.callor.db.dao.StudentDao;
import com.callor.db.model.StudentVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("studentServiceV1")
public class StudentServiceImplv1 implements StudentService{

	private final StudentDao stDao;
	public StudentServiceImplv1(StudentDao stDao) {
		this.stDao = stDao;
	}

	@Override
	public Integer insert() {

		
		List<StudentVO> stList = new ArrayList<StudentVO>();
		
		for(int i = 0 ; i < 10 ; i++) {
			
			String st_num = String.format("%05d", i+1);
			String st_name = String.format("%s 번 학생", st_num);
			Integer st_grade = ((int)Math.random() + 4) + 1;
			
			StudentVO  stVO = new StudentVO(st_num, st_name, st_grade);
			stList.add(stVO);
			
		}
		return stDao.insertAll(stList);
	}

	@Override
	public List<StudentVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findByNames(String search) {

		List<String> searchList = Arrays.asList(search.split(" "));
		log.debug("생성된 검색 리스트 {}",searchList.toString());
		return stDao.findByNames(searchList);
	}

}
