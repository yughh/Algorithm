-- 가장 최근에 들어온 동물은 언제 들어왔는지 조회하는 SQL 문을 작성해주세요.
select Max(DATETIME)
from ANIMAL_INS;