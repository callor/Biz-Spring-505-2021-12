package com.callor.finals;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.finals.model.LoginUser;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	/**
	 * 
	 * RequestBody 는
	 * fetch 를 사용하여 JSON 데이터를 보냈을때
	 * VO(DTO) 객체에 자동으로 변환하여 담아주는 설정이다
	 * 단, RequestBody 는 매개변수의 가장 마지막에 한번만 사용할수 있다
	 * 
	 */
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(HttpSession session, 
			@RequestBody LoginUser loginuser, String aaa) {

		/**
		 * 서버에서 loginuser 객체 데이터를 저장하고
		 * 클라이언트와 상태를 공유하기 위하여 준비하라
		 */
		session.setAttribute("USER", loginuser);
		return loginuser.getUsername();
	}

	
	@ResponseBody
	@RequestMapping(value="/loginOK",method=RequestMethod.POST)
	public String loginOk(HttpSession session) {
	
		/**
		 * session 이 생성된 상태에서는
		 * 클라이언트가 서버에 URL 요청을 하면
		 * 브라우저는 자동으로 Session ID 를 Http 프로토콜 body 에 담아서 서버로 전송한다
		 * 서버에서는 전달받은 Session ID 가 유효한지를 내부에서 판단한 후
		 * 유효한 ID 이면 HttpSession 으로부터 저장된 Attribute 를 getter 할 수 있도록
		 * 허용한다.
		 */
		LoginUser loginUser = (LoginUser) session.getAttribute("USER");
		return loginUser.getUsername();
		
	}

}



