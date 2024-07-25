-- 코드를 입력하세요
Select DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, "%Y-%m-%d") as HIRE_YMD
From Doctor 
where MCDP_CD = "CS" 
or MCDP_CD = "GS"
order by HIRE_YMD DESC, DR_NAME ASC;