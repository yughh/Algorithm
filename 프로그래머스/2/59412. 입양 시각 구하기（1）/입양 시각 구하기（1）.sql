SELECT cast(DATETIME as decimal) as hour, count(DATETIME) as count
from (select ANIMAL_ID
            ,ANIMAL_TYPE
            ,date_format(DATETIME, '%H') as DATETIME
            ,NAME 
            ,SEX_UPON_OUTCOME
      from ANIMAL_OUTS) as f
where cast(DATETIME as decimal) between 9 and 19
group by DATETIME
order by DATETIME;