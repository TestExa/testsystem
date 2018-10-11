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
import com.TestExa.boot.util.MD5Util;
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

	// 首页
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	// 主页
	@RequestMapping("main.html")
	public String main() {
		return "main";
	}

	// 后台主页
	@RequestMapping("manage.html")
	public String manage() {
		return "manage";
	}

	// 注册页
	@RequestMapping("register.html")
	public String register(HttpSession session) {
		session.invalidate();
		return "login";
	}

	// 学生注册操作
	@RequestMapping("register.do")
	public void register(Exstudent exstudent, Model model, HttpSession session, PrintWriter out) {
		try {
			exstudentBiz.register(exstudent);
			out.print("OK"); // 注册成功，从前端ajax跳转至登录界面
		} catch (BizException e) {
			out.print(e.getMessage());
		}
	}

	// 单选题管理
	@RequestMapping("danxuanguanli.html")
	public String danxuanguanli() {
		return "danxuanguanli";
	}

	// 多选题管理
	@RequestMapping("duoxuanguanli.html")
	public String duoxuanguanli() {
		return "duoxuanguanli";
	}

	// 在线考试
	@RequestMapping("zaixiankaoshi.html")
	public String zaixiankaoshi() {
		return "zaixiankaoshi";
	}

	// 成绩單
	@RequestMapping("chengjidan.html")
	public String chengjidan() {
		return "chengjidan";
	}

	// 试卷管理
	@RequestMapping("shijuanguanli.html")
	public String shijuanguanli() {
		return "shijuanguanli";
	}

	// 后台提示页
	@RequestMapping("notice.html")
	public String notice() {
		return "notice";
	}

	// 登陆页
	@RequestMapping("login.html")
	public String login(Integer index, Model model) {
		List<Exschool> lists = exschoolBiz.findAll();
		model.addAttribute("list", lists);
		model.addAttribute("status", index);
		return "login";
	}

	// 登陆操作
	@RequestMapping("logining.do")
	public void logining(Integer status, String name, String pwd, int exsid, Model model, HttpSession session,
			PrintWriter out) {
		if (status == 1) {// 学生登陆
			try {
				Exstudent exstudent = exstudentBiz.login(name, pwd, exsid);
				session.setAttribute("login", exstudent);
				out.print("OK1");
			} catch (BizException e) {
				out.print(e.getMessage());
			}
		} else {// 管理员登陆
			try {
				Exadmin exadmin = exadminBiz.login(name, pwd, exsid);
				out.print("OK2");
				session.setAttribute("login", exadmin);
			} catch (BizException e) {
				out.print(e.getMessage());
			}
		}
	}

	// 单选题
	@RequestMapping("danxuanti.html")
	public String danxuanti() {
		return "danxuanti";
	}

	// 多选题
	@RequestMapping("duoxuanti.html")
	public String duoxuanti() {
		return "duoxuanti";
	}

	// 判断题
	@RequestMapping("panduanti.html")
	public String panduanti() {
		return "panduanti";
	}

	// 填空题
	@RequestMapping("tiankongti.html")
	public String tiankongti() {
		return "tiankongti";
	}
	
	// 主观题
	@RequestMapping("zhuguanti.html")
	public String zhuguanti() {
		return "zhuguanti";
	}

	// 考试说明
	@RequestMapping("kaoshishuoming.html")
	public String kaoshishuoming() {
		return "kaoshishuoming";
	}

	// 查询分数
	@RequestMapping("chaxunfenshu.html")
	public String chaxunfenshu() {
		return "chaxunfenshu";
	}
}
