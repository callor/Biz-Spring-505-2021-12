package com.callor.todo.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.todo.config.QualifierConfig;
import com.callor.todo.service.FileServiceABS;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.FILE_SERVICE_V1)
public class FileServiceImplV1 extends FileServiceABS{

	/***
	 * fileUp()
	 * 1개의 파일을 서버의 특정폴더(fileUpPath)에 업로드하기
	 * 
	 * 1. fileUpPath 가 정상적으로 있는지 검사
	 * 2. 폴더가 없으면 폴더 생성하기
	 * 3. 원본파일이름을 겹쳐서 업로드 되지 않도록 방지정책
	 * 	UUID + 파일이름 형식으로 파일명을 변경하여 저장
	 * 4. 저장이 완료되면 저장된 파일명을 return 
	 * 
	 */
	@Override
	public Map<String,String> fileUp(MultipartFile file) {
		// TODO Auto-generated method stub

		log.debug("파일업로드 path {}", this.fileUpPath);

		// 파일정보가 없으면 더이상 진행하지 말기
		if(file.isEmpty()) {
			log.debug("파일없음 path {}", this.fileUpPath);
			return null;
		}
		
		// 업로드 폴더를 검사하기
		File dir = new File(fileUpPath);
		
		// 업로드할 폴더가 없으면
		if(!dir.exists()) {
			dir.mkdirs(); // 폴더생성하기
		}
		String strUUID = UUID.randomUUID().toString();
		
		// 원본 파일이름 추출
		String originalFilaName = file.getOriginalFilename();
		// UUID + "-" + 원래이름
		String saveFileName 
		= String.format("%s-%s", strUUID,originalFilaName);

		// 저장할 폴더와 파일이름을 매개변수로 전달하여
		// 파일을 저장하기 위하여 File 객체 생성
		File uploadFile = new File(fileUpPath,saveFileName);
		try {
			file.transferTo(uploadFile);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String, String> retFileName
				= new HashMap<String,String>();
		
		retFileName
			.put(QualifierConfig.FILE_SERVICE.ORIGINAL,
				originalFilaName);
		
		retFileName
			.put(QualifierConfig.FILE_SERVICE.SAVENAME, 
					saveFileName);
		
		return retFileName;
		
	}

	@Override
	public List<Map<String,String>> filesUp(MultipartHttpServletRequest files) {
		// TODO Auto-generated method stub
		return null;
	}

}
