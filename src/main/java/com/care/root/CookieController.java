package com.care.root;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	@RequestMapping("cookie")
	public String cookie(HttpServletResponse response,
							HttpServletRequestWrapper req,
					@CookieValue(value= "myCookie", required = false) Cookie cookie) {
		System.out.println("cookie : "+cookie);
		Cookie cook = new Cookie ("myCookie", "ÄíÅ°»ý¼º");
		cook.setMaxAge(5);
		
		response.addCookie(cook);
		
		for(Cookie c : req.getCookies() ) {
			System.out.println(c.getName());
		}
		
		return "cook/cookie";
	}
}
