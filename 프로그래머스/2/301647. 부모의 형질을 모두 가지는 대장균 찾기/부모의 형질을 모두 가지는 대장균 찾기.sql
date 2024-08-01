-- 코드를 작성해주세요
select e1.ID
        ,e1.GENOTYPE
        ,e2.GENOTYPE as PARENT_GENOTYPE
from ECOLI_DATA e1 left outer join ECOLI_DATA e2
on e1.PARENT_ID = e2.ID
where e2.GENOTYPE is not null 
and e1.GENOTYPE & e2.GENOTYPE  = e2.GENOTYPE;