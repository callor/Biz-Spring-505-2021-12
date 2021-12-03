package com.callor.todo.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * 
 * @author callor
 * 추상 클래스
 * 1. 인터페이스처럼 다른 클래스의 설계도 역할
 * 2. 중요한 method 는 직업 만들어서
 * 사용할수 있도록 구성된 클래스
 */
public abstract class FileServiceABS {
	
	// 업로드한 파일이 저장될 폴더
	protected String fileUpPath ;
	
	/**
	 * file-context.xml 에 설정된 
	 * winFilePath, macFilePath 값을 가져와서
	 * 변수에 세팅하는 코드
	 */
	@Autowired
	public void fileUpPath(String winPath, String macPath) {
		this.fileUpPath = macPath;
		File path = new File(winPath);
		if(path.exists()) {
			this.fileUpPath = winPath;
		}
	}
	
	public abstract String fileUp(MultipartFile file) ;
	public abstract 
		List<String> filesUp(MultipartHttpServletRequest files);
	
}



