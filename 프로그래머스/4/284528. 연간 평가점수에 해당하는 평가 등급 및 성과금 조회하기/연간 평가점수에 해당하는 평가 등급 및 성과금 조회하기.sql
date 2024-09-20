-- 코드를 작성해주세요
# HR_DEPARTMENT, HR_EMPLOYEES, HR_GRADE 테이블을 이용해 사원별 성과금 정보를 조회하려합니다
# 평가 점수별 등급과 등급에 따른 성과금 정보가 아래와 같을 때, 사번, 성명, 평가 등급, 성과금을 조회하는 SQL문을 작성해주세요.

# 평가등급의 컬럼명은 GRADE로, 성과금의 컬럼명은 BONUS로 해주세요.
# 결과는 사번 기준으로 오름차순 정렬해주세요.

select g.EMP_NO
        ,e.EMP_NAME
        ,case
            when avg(g.SCORE) >= 96 then "S"
            when avg(g.SCORE) >= 90 then "A"
            when avg(g.SCORE) >= 80 then "B"
            else "C"
         end as  GRADE
         ,case
            when avg(g.SCORE) >= 96 then avg(SAL)*0.2
            when avg(g.SCORE) >= 90 then avg(SAL)* 0.15
            when avg(g.SCORE) >= 80 then avg(SAL)*0.1
            else 0
         end as  BONUS
from 
HR_GRADE as g
join 
HR_EMPLOYEES as e
on g.EMP_NO = e.EMP_NO
Group by g.EMP_NO 
order  by g.EMP_NO  ;