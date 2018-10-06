USE examsystem;

-- 学校表exschool	校园编号	校园名
CREATE TABLE exschool(
	exsid INT PRIMARY KEY AUTO_INCREMENT,
	exsname VARCHAR(20)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 管理员表exadmin	管理员id	管理员名 密码	性别 生日 电话 邮箱 住址 校园编号（exschool，一对多）
CREATE TABLE exadmin(
	exaid INT PRIMARY KEY AUTO_INCREMENT,
	exaname VARCHAR(20),
	exapwd VARCHAR(32),
	exasex VARCHAR(2),
	exabirth DATE,
	exatel CHAR(11),
	exaemail VARCHAR(9),
	exaaddr VARCHAR(50),
	exsid INT,
	CONSTRAINT fk_exadmin FOREIGN KEY(exsid) REFERENCES exschool(exsid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 教师信息表
CREATE TABLE exteacher(
	extid INT PRIMARY KEY AUTO_INCREMENT,
	extname VARCHAR(20),
	extpwd VARCHAR(32),
	extsex VARCHAR(2),
	extbirth DATE,
	exttel CHAR(11),
	extqq VARCHAR(11),
	extemail VARCHAR(20),
	extaddr VARCHAR(50),
	exsid INT,
	CONSTRAINT fk_exteacher FOREIGN KEY (exsid) REFERENCES exschool(exsid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 学生信息表exuser	用户id	学号	用户名	密码	电话	邮箱地址	校园编号（exschool，一对多）
CREATE TABLE exstudent(
	exstuid INT PRIMARY KEY AUTO_INCREMENT,
	exstunumber INT,
	exstuname VARCHAR(20),
	exstupwd VARCHAR(32),
	exstusex VARCHAR(2),
	exstubirth DATE,
	exstutel CHAR(11),
	exstuqq VARCHAR(11),
	exstuemail VARCHAR(20),
	exstuaddr VARCHAR(50),
	exsid INT,
	CONSTRAINT fk_exstudent FOREIGN KEY (exsid) REFERENCES exschool(exsid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 学期exterm	学期id	学期时间
CREATE TABLE exterm(
	exteid INT PRIMARY KEY AUTO_INCREMENT,
	extbegin DATE,
	extend DATE
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 科目表exsubject	科目id	科目名	修改时间	校园编号（exschool，一对多）
CREATE TABLE exsubject(
	exsubid INT PRIMARY KEY AUTO_INCREMENT,
	exsubname VARCHAR(20),
	exsubtime DATE,
	exsid INT,
	CONSTRAINT fk_exsubject FOREIGN KEY (exsid) REFERENCES exschool(exsid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 题型表extype	题型号	题型名
CREATE TABLE extype(
	extid INT PRIMARY KEY AUTO_INCREMENT,
	extname VARCHAR(20)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 试卷信息表expaper	试卷id	修改时间	学期id（exterm，一对多）	科目id（exsubject，一对多） 出卷时间	答卷时间
CREATE TABLE expaper(
	expid INT PRIMARY KEY AUTO_INCREMENT,
	exstime DATE,
	exteid INT,
	exsid INT,
	expdata DATETIME,
	exptime DATETIME,
	CONSTRAINT fk_expaper FOREIGN KEY (exsid) REFERENCES exschool(exsid),
	CONSTRAINT fk_expaper1 FOREIGN KEY (exteid) REFERENCES exterm(exteid)	
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 题目表exquestions	题号	题目内容	题型号（extype，一对一）	试卷id（expaper，一对多）
CREATE TABLE exquestions(
	exqid INT PRIMARY KEY AUTO_INCREMENT,
	exqinfo	VARCHAR(200),
	extid INT,
	expid INT,
	exsubid INT,
	CONSTRAINT fk_exquestions FOREIGN KEY (extid) REFERENCES extype(extid),
	CONSTRAINT fk_exquestions1 FOREIGN KEY (expid) REFERENCES expaper(expid),
	CONSTRAINT fk_exquestions2 FOREIGN KEY (exsubid) REFERENCES exsubject(exsubid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;


-- 选项表exoption	选项id	选项A	选项内容	状态（答案是否正确）	题号（exquestions，一对多）
-- （A,B,C,D可动态修改，以此来调整答案顺序，如果是填空题，则题号为一对一）
CREATE TABLE exoption(
	exoid	INT PRIMARY KEY AUTO_INCREMENT,
	exop	INT,-- 1,2,3,4代替
	exoinfo VARCHAR(50),
	exoindex INT,
	exqid INT,
	CONSTRAINT fk_exoption FOREIGN KEY (exqid) REFERENCES exquestions(exqid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;


-- 答案表exanswer	答案id	答案	题号（exquestions，一对一）	试卷id（expaper，一对多）
CREATE TABLE exanswer(
	exaid INT PRIMARY KEY AUTO_INCREMENT,
	exainfo	VARCHAR(200),
	exqid INT,
	expid INT,
	CONSTRAINT fk_exanswer FOREIGN KEY(exqid) REFERENCES exquestions(exqid),
	CONSTRAINT fk_exanswer1 FOREIGN KEY(expid) REFERENCES expaper(expid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 题目试卷表 exquestion_paper	试卷id  题目编号，存的时候用‘,’隔开，读取的时候分割开,此表可要可不要
CREATE TABLE exquestion_paper(
	expid INT,
	exqid INT,
	CONSTRAINT fk_expaperinfo FOREIGN KEY(expid) REFERENCES expaper(expid),
	CONSTRAINT fk_expaperinfo1 FOREIGN KEY(exqid) REFERENCES exquestions(exqid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 成绩表exscore	成绩id	成绩	登记时间	试卷id（expaper，一对一）	用户名id（exuser）
CREATE TABLE exscore(
	exscid INT PRIMARY KEY AUTO_INCREMENT,
	exscore	INT,
	exstime DATE,
	expid INT,
	exstuid INT,
	CONSTRAINT fk_exscore FOREIGN KEY(exstuid) REFERENCES exstudent(exstuid),
	CONSTRAINT fk_exscore1 FOREIGN KEY(expid) REFERENCES expaper(expid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 考试信息表 学生id	试卷id	 学生答题记录	开始时间	结束时间	剩余时间
CREATE TABLE examinfo(
	exstuid INT,
	expid INT,
	exrecord VARCHAR(200),
	startime DATETIME,
	endtime DATETIME,
	sparetime INT,
	CONSTRAINT fk_examinfo FOREIGN KEY(exstuid) REFERENCES exstudent(exstuid),
	CONSTRAINT fk_examinfo1 FOREIGN KEY(expid) REFERENCES expaper(expid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- 学生试卷表 studentpaper 	学生id	试卷id	 是否已考
CREATE TABLE exstudentpaper(
	exstuid INT,
	expid INT,
	istested INT DEFAULT 0,
	CONSTRAINT fk_exstudentpaper FOREIGN KEY(exstuid) REFERENCES exstudent(exstuid),
	CONSTRAINT fk_exstudentpaper1 FOREIGN KEY(expid) REFERENCES expaper(expid)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

commit;
	