SELECT COUNT(DISTINCT DEPT) FROM STUDENT WHERE DEPT = "컴퓨터과"

SELECT 학번, 이름 FROM 학생 WHERE 학년 IN (3, 4);

CREATE INDEX IDX_NAME ON STUDENT(NAME);

DELETE FROM 학생 WHERE 이름 = "민수";

ALTER TABLE 학생 ADD 주소 VARCHAR(20);

SELECT 학생정보.학번, 학생정보.이름, 학과정보.학과, 학과정보.지도교수
FROM 학생정보 JOIN 학과정보 ON 학생정보.학과 = 학과정보.학과;

UPDATE 회원 SET 전화번호 = "010-14"
WHERE 회원번호 = "N4";