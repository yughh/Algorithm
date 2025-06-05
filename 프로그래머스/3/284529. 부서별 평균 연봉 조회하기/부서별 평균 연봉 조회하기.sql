-- 코드를 작성해주세요
select e.DEPT_ID, DEPT_NAME_EN, Round(AVG(SAL), 0) as AVG_SAL
from HR_DEPARTMENT as d join HR_EMPLOYEES as e
on d.DEPT_ID = e.DEPT_ID
group by e.DEPT_ID
order by AVG_SAL desc
