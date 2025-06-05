-- 코드를 작성해주세요
select count(FISH_TYPE) as 'FISH_COUNT', MAX(l) as'MAX_LENGTH', FISH_TYPE
from(select 
ID
,FISH_TYPE
,IFNULL(LENGTH, 10) as l
FROM FISH_INFO) as t
group by FISH_TYPE
having AVG(l)>=33
order by  FISH_TYPE;
