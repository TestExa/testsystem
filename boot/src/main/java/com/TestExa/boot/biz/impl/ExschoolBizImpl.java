package com.TestExa.boot.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestExa.boot.biz.ExschoolBiz;
import com.TestExa.boot.dao.ExschoolMapper;
import com.TestExa.boot.vo.Exschool;

@Service
public class ExschoolBizImpl implements ExschoolBiz {
	
	@Autowired
	private ExschoolMapper exschoolMapper;

	@Override
	public List<Exschool> findAll() {
		return exschoolMapper.selectByExample(null);
	}

}
