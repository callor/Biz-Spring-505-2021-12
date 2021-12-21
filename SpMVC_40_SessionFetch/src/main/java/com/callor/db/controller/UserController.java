package com.callor.db.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.callor.db.model.LoginUser;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping(value="/user")
public class UserController {
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST) // ,consumes = "application/json;charset=UTF-8")
	public String login(HttpSession session, @RequestBody LoginUser loginUser ) {
		log.debug("LoginUser {}",loginUser);
		session.setAttribute("USER", loginUser);
		return "OK";
	}

	@RequestMapping(value="/logout",method=RequestMethod.POST) // ,consumes = "application/json;charset=UTF-8")
	public String logout(HttpSession session) {
		session.removeAttribute("USER");
		return "Logout OK";
	}
	
	@RequestMapping(value="/loginOK",method=RequestMethod.POST) // ,consumes = "application/json;charset=UTF-8")
	public String login(HttpSession session) {
		
		LoginUser loginUser = (LoginUser)session.getAttribute("USER");
//		ResponseEntity<LoginUser> retuser = new ResponseEntity<LoginUser>(loginUser);
		if(loginUser != null) {
			
			// 글 저장하기
			log.debug("LoginUser {}",loginUser);
			return "Login OK";
		}
		return "Login fail";
	}

	

}
