package com.care.root;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
	@RequestMapping("make_session")
	public String makeSession(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("id", "abc123");
		session.setAttribute("name", "全辨悼");
		return "session/makeSession";
	}
	@RequestMapping("result_session")
	public String resultSession() {
		return "session/resultSession";
	}
	@RequestMapping("del_session")
	public String delSession(HttpSession session) {
		session.removeAttribute("id");
		//session.invalidate(); //葛电技记 昏力
		return "session/delSession";
	}
}

