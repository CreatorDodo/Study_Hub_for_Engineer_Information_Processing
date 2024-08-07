SELECT COUNT(DISTINCT DEPT) FROM STUDENT WHERE DEPT = "컴퓨터과"

SELECT 학번, 이름 FROM 학생 WHERE 학년 IN (3, 4);

CREATE INDEX IDX_NAME ON STUDENT(NAME);

DELETE FROM 학생 WHERE 이름 = "민수";

ALTER TABLE 학생 ADD 주소 VARCHAR(20);

SELECT 학생정보.학번, 학생정보.이름, 학과정보.학과, 학과정보.지도교수
FROM 학생정보 JOIN 학과정보 ON 학생정보.학과 = 학과정보.학과;

UPDATE 회원 SET 전화번호 = "010-14"
WHERE 회원번호 = "N4";

-- 16번 [21년 2회]
SELECT *
FROM 학생
WHERE 이름 LIKE "이%" ORDER BY 이름 DESC;

SELECT NAME, SCORE
FROM 성적
ORDER BY SCORE DESC;

SELECT COUNT(*) CNT FROM SOO CROSS JOIN JEBI
WHERE SOO.NAME LIKE JEBI.RULE;

SELECT COUNT(COL2)
FROM TB
WHERE COL1 IN(2,3) OR COL2 IN(3,5);

SELECT DISTINCT COUNT(부서코드) FROM 직원;

DELETE FROM 부서 WHERE 부서코드 = '20';
SELECT COUNT(DISTINCT 직원코드) FROM 직원;

SELECT 과목이름, MIN(점수) AS 최소점수, MAX(점수) AS 최대점수 FROM 성적
GROUP BY 과목이름
HAVING AVG(점수) >= 90;

SELECT 학과, COUNT(학과) AS '학과별튜플수' FROM 학생
GROUP BY 학과;

SELECT 학과, COUNT(*) AS '학과별튜플수' FROM 학생
GROUP BY 학과;

CREATE INDEX 사번인덱스 ON 사원(사번);

CREATE TABLE 사람
(
    이름 VARCHAR(10),
    성별 CHAR(1) CHECK(성별 IN ('M', 'F')),
);

ALTER TABLE 사원 ADD 전화번호 VARCHAR(11);

CREATE VIEW 사원뷰 AS
SELECT 사번, 이름 FROM 사원 WHERE 성별 = 'M';

SELECT DISTINCT 전공 FROM 학생;

SELECT 학번 FROM 학생 WHERE 이름 LIKE '이%';

SELECT 주소 FROM 학생 WHERE 주소 IS NOT NULL;

SELECT * FROM 교수 WHERE 전공 IN ('컴퓨터공학', '전자공학');

SELECT 이름 FROM 고객 WHERE 나이 BETWEEN 50 AND 59 AND 성별 = '남';

SELECT * FROM 성적 ORDER BY 성적 DESC;

SELECT A.책번호, A.책이름, B.책번호, B.가격 FROM 도서 A LEFT JOIN 도서가격 B ON A.책번호 = B.책번호;

INSERT INTO EMPLOYEE(NAME, AGE, SALARY) VALUES('홍길동', 24, 300);

DELETE FROM EMPLOYEE WHERE SALARY <= 300;

GRANT UPDATE ON 학생 TO 장길산;

SELECT 부서, AVG(급여) AS 급여 FROM 급여 GROUP BY 부서;

SELECT 부서, 직책, SUM(급여) AS 급여 FROM 급여 GROUP BY 부서, 직책;

SELECT 이름 FROM 학생 GROUP BY 이름 HAVING AVG(성적) > 4.0;

SELECT 학교명, 학년, SUM(인원) AS 인원 FROM 학교 GROUP BY ROLLUP(학교명, 학년);

SELECT 이름 ,점수, DENSE_RANK() OVER(ORDER BY 점수 DESC) AS 등수 FROM 학생;

ALTER TABLE 사원 DROP 생년월일;

CREATE TABLE 사람
(
    이름 VARCHAR(10),
    생년월일 CHAR(8) NOT NULL
);

CREATE VIEW 학생뷰 AS
SELECT 학번, 이름 FROM 학생 WHERE 전공 = '전산';

CREATE INDEX 학번인덱스 ON 학생(학번);

CREATE TABLE 교수
(
    교번 VARCHAR(10) PRIMARY KEY,
    이름 VARCHAR(10),
    임용일 VARCHAR(8) NOT NULL
);

ALTER TABLE 성적 ADD 학점 VARCHAR(4) NOT NULL;

SELECT 학번, 이름 FROM 학생 WHERE 학과 = '전산과';

SELECT 부서, SUM(급여) AS 급여 FROM 급여 GROUP BY 부서 HAVING SUM(급여) > 6000;

SELECT 이름, 과목, 학점 FROM 성적 ORDER BY 학점 DESC, 이름 ASC;

SELECT A.책번호, A.책명, B.가격 FROM 도서 A JOIN 도서가격 B ON A.책번호 = B.책번호;

SELECT A.책번호, A.책명, B.책번호, B.가격 FROM 도서 A FULL OUTER JOIN 도서가격 B ON A.책번호 = B.책번호;

SELECT MAX(가격) AS 가격 FROM 도서가격 WHERE 책번호 IN (SELECT 책번호 FROM 도서 WHERE 책명 = '자료구조');

INSERT INTO 학생(학번, 성명, 학년, 수강과목) VALUES(3000, '장길산', 3, '수학');

UPDATE 학생 SET 수강과목 = '영어' WHERE 학번 = 1000;

DELETE FROM 학생 WHERE 학번 = 3000;

GRANT SELECT ON 사원 TO 홍길동;

REVOKE UPDATE ON 학생 FROM 장길산;

UPDATE EMPLOYEE SET SALARY = 250 WHERE AGE <= 25;

REVOKE SELECT ON 학생 FROM 홍길동;

SELECT 학번, 이름 FROM 학생 WHERE 학년 IN (3, 4);

CREATE IN INDEX IDX_NAME ON STUDENT(NAME);

DELETE FROM 학생 WHERE 이름 = '민수';

SELECT 과목이름, MIN(점수) AS 최소점수, MAX(점수) AS 최대점수 FROM 성적
GROUP BY 과목이름 HAVING AVG(점수) >= 90;

SELECT 학과, COUNT(학과) AS 학과별튜플수 FROM 학생 GROUP BY 학과;

