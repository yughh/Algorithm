-- 코드를 입력하세요
select ANIMAL_ID, NAME
from (SELECT i.name, i.animal_id, timestampdiff(second,i.DATETIME, o.DATETIME) as diff
from ANIMAL_INS as i join ANIMAL_OUTS as o
on i.ANIMAL_ID = o.ANIMAL_ID
order by diff desc
limit 2) as t;
