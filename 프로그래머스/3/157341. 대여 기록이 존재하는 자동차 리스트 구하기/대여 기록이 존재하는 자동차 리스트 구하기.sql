-- 코드를 입력하세요
SELECT distinct(h.CAR_ID)
from CAR_RENTAL_COMPANY_CAR as r right join CAR_RENTAL_COMPANY_RENTAL_HISTORY as h
on h.CAR_ID = r.CAR_ID
where r.CAR_TYPE ='세단'
and START_DATE between '2022-10-01' and '2022-10-31' 

order by h.CAR_ID desc;