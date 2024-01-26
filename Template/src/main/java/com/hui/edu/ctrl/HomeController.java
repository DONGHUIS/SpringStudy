package com.hui.edu.ctrl;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	@GetMapping(value = "home.do")
	public String home() {
		log.info("home.do get매핑");
		return "home";
	}
	
	@PostMapping(value="home.do")
	public String home(String param,Model model,HttpServletRequest req) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		String param1=req.getParameter(param);
		log.info("값 가져오기: {} {} ",param,param1);
		return "test";
	}
}
