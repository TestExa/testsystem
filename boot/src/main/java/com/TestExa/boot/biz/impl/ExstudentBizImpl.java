package com.TestExa.boot.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestExa.boot.biz.BizException;
import com.TestExa.boot.biz.ExstudentBiz;
import com.TestExa.boot.dao.ExstudentMapper;
import com.TestExa.boot.util.MD5Util;
import com.TestExa.boot.vo.Exstudent;
import com.TestExa.boot.vo.ExstudentExample;
import com.TestExa.boot.vo.ExstudentExample.Criteria;

@Service
public class ExstudentBizImpl implements ExstudentBiz {
	
	@Autowired
	private ExstudentMapper exstudentMapper;

	@Override
	public Exstudent login(String name, String pwd, int exsid) throws BizException {
		if (name == null || "".equals(name)) {
			throw new BizException("用户名不能为空");
		} else if (pwd == null || "".equals(pwd)) {
			throw new BizException("密码不能为空");
		}
		ExstudentExample exstudentExample = new ExstudentExample();
		Criteria criteria = exstudentExample.createCriteria();
		criteria.andExstunameEqualTo(name);
		pwd = MD5Util.MD5(MD5Util.MD5(name + pwd));// 加密
		System.out.println(pwd);
		criteria.andExstupwdEqualTo(pwd);
		criteria.andExsidEqualTo(exsid);
		List<Exstudent> list = exstudentMapper.selectByExample(exstudentExample);
		if (list == null || list.size() ==0) {
			throw new BizException("用户名或密码错误");
		}
		return list.get(0);
	}

}
