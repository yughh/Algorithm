-- 코드를 입력하세요
select t.ANIMAL_ID, t.NAME
from (SELECT o.ANIMAL_ID, o.NAME, i.DATETIME
from ANIMAL_INS as i join ANIMAL_OUTS as o
on o.ANIMAL_ID = i.ANIMAL_ID
where o.DATETIME < i.DATETIME
order by i.DATETIME) as t