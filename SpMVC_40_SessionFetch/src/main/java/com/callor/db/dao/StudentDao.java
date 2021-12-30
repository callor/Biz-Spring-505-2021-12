package com.callor.db.dao;

import java.util.List;

import com.callor.db.model.StudentVO;

public interface StudentDao extends GenericDao<StudentVO, String>{
	
	public Integer insertAll(List<StudentVO> stList);
	public void drop_table();
	public List<StudentVO> findByNames(List<String> searchList);
	

}
