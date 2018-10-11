package com.TestExa.boot.biz;

import com.TestExa.boot.vo.Exstudent;

public interface ExstudentBiz {
	
	public Exstudent login(String name, String pwd, int exsid) throws BizException ;
	
	public int register(Exstudent exstudent) throws BizException;

}
