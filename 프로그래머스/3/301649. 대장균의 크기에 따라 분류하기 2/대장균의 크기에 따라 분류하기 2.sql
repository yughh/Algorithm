-- 코드를 작성해주세요
select
t.ID
,case 
    when t.rnk between 1 and (Select count(*) from ECOLI_DATA)/4*1 then 'CRITICAL'
     when t.rnk between  (Select count(*) from ECOLI_DATA)/4*1+1 and  (Select count(*) from ECOLI_DATA)/4*2 then 'HIGH'
      when t.rnk between  (Select count(*) from ECOLI_DATA)/4*2+1 and (Select count(*) from ECOLI_DATA)/4*3 then 'MEDIUM'
      else 'LOW'
     END as 'COLONY_NAME'
from (select 
ID,SIZE_OF_COLONY
,row_number() over(order by SIZE_OF_COLONY desc ) as rnk
from ECOLI_DATA
) as t 
order by ID;
