-- 코드를 입력하세요
select *
from PLACES
where HOST_ID in (SELECT  HOST_ID
from PLACES
group by HOST_ID
having count(HOST_ID) >1)