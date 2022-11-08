--PRIMARY KEY : UNIQUE + NOT NULL

CREATE TABLE member(
	memberId VARCHAR2(20) PRIMARY KEY,
	memberName VARCHAR2(20) NOT NULL,
	memberAge NUMBER NOT NULL,
	memberEmail VARCHAR2(30) NOT NULL,
	memberGender CHAR(1) NOT NULL,
	memberBithday DATE NOT NULL
)

ALTER TABLE member
ADD memberHomePage VARCHAR2(20);

--1.
INSERT INTO member VALUES('ccc','배현모',24,'tsi0520@naver.com','M',sysdate,null);

--2.
INSERT INTO member(memberId,memberName,memberAge,memberEmail,memberBithday,memberGender) 
VALUES('fff','배현모',24,'tsi0520@naver.com',sysdate,'M');

SELECT memberAge * 2, memberName FROM member;

SELECT COUNT(memberAge) FROM member;


