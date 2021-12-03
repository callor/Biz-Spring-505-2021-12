package com.callor.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.todo.config.QualifierConfig;
import com.callor.todo.service.FileServiceABS;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.FILE_SERVICE_V1)
public class FileServiceImplV1 extends FileServiceABS{

	@Override
	public String fileUp(MultipartFile file) {
		// TODO Auto-generated method stub

		log.debug("파일업로드 path {}", this.fileUpPath);
		return null;
		
	}

	@Override
	public List<String> filesUp(MultipartHttpServletRequest files) {
		// TODO Auto-generated method stub
		return null;
	}

}
