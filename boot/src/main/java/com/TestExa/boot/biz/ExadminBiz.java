package com.TestExa.boot.biz;

import com.TestExa.boot.vo.Exadmin;

public interface ExadminBiz {
	
	public Exadmin login(String name, String pwd, int exsid) throws BizException;

}
