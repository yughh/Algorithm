select *
from (  SELECT CAR_ID, 
        round(avg(DATEDIFF(end_date, start_date)+1), 1)as AVERAGE_DURATION
        from CAR_RENTAL_COMPANY_RENTAL_HISTORY
        group by CAR_ID) as f
where cast(AVERAGE_DURATION as DECIMAL) >= 7
order by AVERAGE_DURATION desc, CAR_ID desc;