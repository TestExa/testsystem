package com.TestExa.boot.web.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TestExa.boot.biz.BizException;
import com.TestExa.boot.biz.ExadminBiz;
import com.TestExa.boot.biz.ExschoolBiz;
import com.TestExa.boot.biz.ExstudentBiz;
import com.TestExa.boot.vo.Exadmin;
import com.TestExa.boot.vo.Exschool;
import com.TestExa.boot.vo.Exstudent;

@Controller
public class IndexPageController {
	
	@Autowired
	private ExschoolBiz exschoolBiz;
	@Autowired
	private ExstudentBiz exstudentBiz;
	@Autowired
	private ExadminBiz exadminBiz;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("main.do")
	public String main() {
		return "main";
	}
	
	@RequestMapping("message.do")
	public String message() {
		return "message";
	}
	
	@RequestMapping("login.do")
	public String login(Integer index, Model model) {
		List<Exschool> lists = exschoolBiz.findAll();
		model.addAttribute("list", lists);
		model.addAttribute("status", index);
		return "login";
	}
	
	@RequestMapping("logining.do")
	public void logining(Integer status, String name, String pwd, int exsid, Model model,
				HttpSession session, PrintWriter out) {
		if (status == 1) {// 学生登陆
			try {
				Exstudent exstudent = exstudentBiz.login(name, pwd, exsid);
				session.setAttribute("login", exstudent);
				out.print("OK1");
			} catch (BizException e) {
				out.print("error");
				model.addAttribute("error", e.getMessage());
			}
		} else {// 管理员登陆
			try {
				Exadmin exadmin = exadminBiz.login(name, pwd, exsid);
				out.print("OK2");
				session.setAttribute("login", exadmin);
			} catch (BizException e) {
				out.print("error");
				model.addAttribute("error", e.getMessage());
			}
		}
	}
	
}
