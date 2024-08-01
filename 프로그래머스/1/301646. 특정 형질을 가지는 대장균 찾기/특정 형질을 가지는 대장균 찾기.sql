# 2번 형질이 보유하지 않으면서
#1번이나 3번 형질을 보유하고 있는
# 1번 형질 : 2의 0승, 2번 형질 : 2의 1승, 3번 형질 : 2의 2승
# 대장균 개체의 수(COUNT)를 출력하는 SQL 문을 작성해주세요
# 1번과 3번 형질을 모두 보유하고 있는 경우도 1번이나 3번 형질을 보유하고 있는 경우에 포함합니다.

select count(*) as count
from ECOLI_DATA
where GENOTYPE & 2 = 0
and (GENOTYPE & 1  > 0 or GENOTYPE & 4 > 0);