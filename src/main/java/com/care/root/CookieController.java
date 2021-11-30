package com.care.root;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {
	@GetMapping("cookie")
	public String cookie(HttpServletResponse response,
							HttpServletRequestWrapper req) {
		Cookie cook = new Cookie ("myCookie", "ÄíÅ°»ý¼º");
		cook.setMaxAge(5);
		
		response.addCookie(cook);
		
		for(Cookie c : req.getCookies() ) {
			System.out.println(c.getName());
		}
		
		return "cook/cookie";
	}
}
