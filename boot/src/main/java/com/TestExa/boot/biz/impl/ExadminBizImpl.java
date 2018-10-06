package com.TestExa.boot.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestExa.boot.biz.BizException;
import com.TestExa.boot.biz.ExadminBiz;
import com.TestExa.boot.dao.ExadminMapper;
import com.TestExa.boot.util.MD5Util;
import com.TestExa.boot.vo.Exadmin;
import com.TestExa.boot.vo.ExadminExample;
import com.TestExa.boot.vo.ExadminExample.Criteria;

@Service
public class ExadminBizImpl implements ExadminBiz {
	
	@Autowired
	private ExadminMapper exadminMapper;

	@Override
	public Exadmin login(String name, String pwd, int exsid) throws BizException {
		if (name == null || "".equals(name)) {
			throw new BizException("用户名不能为空");
		} else if (pwd == null || "".equals(pwd)) {
			throw new BizException("密码不能为空");
		}
		ExadminExample exadminExample = new ExadminExample();
		Criteria criteria = exadminExample.createCriteria();
		criteria.andExanameEqualTo(name);
		pwd = MD5Util.MD5(MD5Util.MD5(name + pwd));// 加密
		System.out.println(pwd);
		criteria.andExapwdEqualTo(pwd);
		criteria.andExsidEqualTo(exsid);
		List<Exadmin> list = exadminMapper.selectByExample(exadminExample);
		if (list == null || list.size() ==0) {
			throw new BizException("用户名或密码错误");
		}
		return list.get(0);
	}

}
