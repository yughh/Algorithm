-- 코드를 입력하세요
select Month(start_date) as MONTH , CAR_ID, count(CAR_ID) as RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
 where CAR_ID in (SELECT CAR_ID
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where date_format(START_DATE, '%Y-%m') between '2022-08' and '2022-10'
group by CAR_ID
having count(CAR_ID) > 4)
and date_format(START_DATE, '%Y-%m') between '2022-08' and '2022-10'
group by CAR_ID, Month(start_date)
order by MONTH, CAR_ID desc;

# SELECT CAR_ID, count(CAR_ID)
# from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# where date_format(START_DATE, '%Y-%m') between '2022-08' and '2022-10'
# group by CAR_ID
# having count(CAR_ID) > 4