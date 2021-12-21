package com.callor.db.controller.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.db.dao.StudentDao;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CreateDBServiceV1 {
	
	protected final StudentDao stDao;
	
	@Autowired
	public void create_student() {
		stDao.create_table();
	}

}
