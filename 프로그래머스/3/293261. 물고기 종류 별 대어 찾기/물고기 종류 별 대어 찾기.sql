-- 코드를 작성해주세요
select 
ID
,FISH_NAME
,LENGTH
from (select 
    i.ID
   ,FISH_NAME
    ,LENGTH
    ,rank() over(partition by i.FISH_TYPE order by LENGTH desc) as 'rnk'
from FISH_INFO as i join FISH_NAME_INFO as n
on i.FISH_TYPE = n.FISH_TYPE
) as t
where rnk =1
order by ID;
