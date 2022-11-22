DROP TABLE member1 PURGE;
CREATE TABLE member1(
	memberId VARCHAR2(20) PRIMARY KEY,
	memberPasswd VARCHAR2(20) NOT NULL,
	memberName VARCHAR2(20) NOT NULL,
	memberAge NUMBER NOT NULL,
	memberEmail VARCHAR2(50) NOT NULL,
	memberGender CHAR(1) NOT NULL,
	memberGeneration NUMBER NOT NULL,
	zipCode VARCHAR2(5) NOT NULL,
	memberAddr1 VARCHAR2(30) NOT NULL,
	memberAddr2 VARCHAR2(30) NOT NULL
)

ALTER TABLE member1
ADD memberPasswd VARCHAR2(20);

CREATE TABLE Address(
	zipCodeId NUMBER PRIMARY KEY, 
	zipCode VARCHAR2(5) NOT NULL,
	do VARCHAR2(21) NOT NULL,
	si VARCHAR2(21) NOT NULL,
	gugun VARCHAR2(21) NOT NULL,
	dong VARCHAR2(21) NOT NULL,
	ro VARCHAR2(21) NOT NULL,
	bunzi VARCHAR2(20) NOT NULL
)

ALTER TABLE member1 modify memberAddr1 varchar2(100);

CREATE SEQUENCE Address_seq;

INSERT INTO Address VALUES(Address_seq.nextval, '11111','경상북도','경산시','하양읍',' ','하양로','13-13');
INSERT INTO Address VALUES(Address_seq.nextval, '11111','경상북도','경산시','하양읍',' ','하양로','13-15');
INSERT INTO Address VALUES(Address_seq.nextval, '11111','경상북도','경산시','하양읍',' ','하양로','13-14');
INSERT INTO Address VALUES(Address_seq.nextval, '11111','경상북도','경산시','하양읍',' ','하양로','13-16');
