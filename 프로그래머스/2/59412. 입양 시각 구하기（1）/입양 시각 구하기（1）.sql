-- 09:00부터 19:59까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.
SELECT to_number(DATETIME) as hour, count(DATETIME) as count
from (select ANIMAL_ID
            ,ANIMAL_TYPE
            ,to_char(DATETIME, 'HH24') as DATETIME
            ,NAME 
            ,SEX_UPON_OUTCOME
      from ANIMAL_OUTS)
where to_number(DATETIME) between 9 and 19
group by DATETIME
order by DATETIME;