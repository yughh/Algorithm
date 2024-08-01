-- 코드를 작성해주세요
select concat(QUARTER(DIFFERENTIATION_DATE), 'Q') as QUARTER
       , count(*) as ECOLI_COUNT
from ECOLI_DATA
group by concat(QUARTER(DIFFERENTIATION_DATE), 'Q') 
order by QUARTER;