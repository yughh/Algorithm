-- 관리자의 실수로 일부 동물의 입양일이 잘못 입력되었습니다. 
-- 보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성해주세요
-- . 이때 결과는 보호 시작일이 빠른 순으로 조회해야합니다.
SELECT o.ANIMAL_ID, o.NAME
from ANIMAL_OUTS o join ANIMAL_INS i
on o.ANIMAL_ID = i.ANIMAL_ID
#where TIMESTAMPDIFF(second, i.DATETIME, o.datetime) < 0
where i.DATETIME > o.datetime
order by i.DATETIME ;