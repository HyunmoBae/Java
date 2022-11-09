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

SELECT * FROM member
WHERE UPPER(memberId) = 'BBB';

--같지않다
SELECT * FROM member
WHERE UPPER(memberId) <> 'BBB';

-- NULL 값 비교, 같다 is, 같지 않다 is not
SELECT * FROM member
WHERE memberHomePage is NULL;

SELECT * FROM member
WHERE memberHomePage is not NULL;

--range search
--BETWEEN AND
SELECT * FROM member
WHERE memberAge * 1 BETWEEN 20 and 40;

--리스트 IN
SELECT * FROM member
WHERE memberId IN ('bbb','ccc','ddd');

SELECT * FROM member
WHERE memberAge >= 23;

SELECT * FROM member
WHERE memberAge <= 22;

--AND , OR
SELECT * FROM member
WHERE memberAge >= 20 and memberAge <= 40;

SELECT * FROM member
WHERE memberAge >= 20 OR memberAge <= 40;

--패턴문자 비교(_, %)
-- _ : 문자 하나
-- % : 아무런 문자가 안와도 되고, 어떤 문자가 와도 상관없는 패턴

SELECT * FROM member
WHERE memberId LIKE 'b_b';

SELECT * FROM member
WHERE memberEmail LIKE 't_i0520@naver.com';

SELECT * FROM member
WHERE memberEmail LIKE 't%';

--ORDER BY
SELECT * FROM member
ORDER BY memberAge, memberId DESC;

--DISTINCT
SELECT DISTINCT memberGender FROM member;

--별칭
SELECT memberAge * 2 AS doubleage FROM member;

CREATE TABLE member1(
	memberId VARCHAR2(20) PRIMARY KEY,
	memberName VARCHAR2(20) NOT NULL,
	memberAge NUMBER NOT NULL,
	memberAddr VARCHAR2(50) NOT NULL,
	memberEmail VARCHAR2(50) NOT NULL,
	memberGender CHAR(1) NOT NULL,
	memberGeneration NUMBER NOT NULL
)










