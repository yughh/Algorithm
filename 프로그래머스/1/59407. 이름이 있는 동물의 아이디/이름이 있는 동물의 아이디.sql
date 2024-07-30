-- 동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL 문을 작성해주세요. 
--단, ID는 오름차순 정렬되어야 합니다.
select ANIMAL_ID
from ANIMAL_INS
where NAME is not null
order by ANIMAL_ID;

