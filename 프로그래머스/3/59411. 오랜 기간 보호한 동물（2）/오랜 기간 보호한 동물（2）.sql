-- 입양을 간 동물 중, 보호 기간이 가장 길었던 동물 두 마리의 아이디와 이름을 조회하는 SQL문을 작성해주세요
#  이때 결과는 보호 기간이 긴 순으로 조회해야 합니다.
select s.animal_id, s.name
from (

SELECT o.ANIMAL_ID,	o.NAME, timestampDiff(second, i.DATETIME, o.DATETIME) as t
from ANIMAL_INS i right outer join ANIMAL_OUTS o
on i.ANIMAL_ID = o.ANIMAL_ID
where i.animal_id is not null
order by t desc limit 2
    ) s ;