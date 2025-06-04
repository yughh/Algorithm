-- 코드를 입력하세요
select 
    g.CAR_ID
    ,IFNULL(tt.AVAILABILITY, '대여 가능') as 'AVAILABILITY'
from
(select * 
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
) g
left join
(select car_id, AVAILABILITY
from (select 
    CAR_ID
    ,case 
        when END_DATE > '2022-10-15' and START_DATE < '2022-10-17' then '대여중'
     else '대여가능'
     End as 'AVAILABILITY'
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
order by car_id) t
where t.AVAILABILITY = '대여중') as tt
on g.CAR_ID = tt.CAR_ID
order by g.CAR_ID desc;