-- 코드를 입력하세요
SELECT ANIMAL_ID
        ,NAME
        --,decode(SEX_UPON_INTAKE,  '%Neutered%', 'O', 'X') as 중성화
        
        ,case
            when SEX_UPON_INTAKE Like '%Neutered%' then 'O'
            when SEX_UPON_INTAKE Like '%Spayed%' then 'O'
            else 'X'
        END as 중성화
from ANIMAL_INS
order by ANIMAL_ID;
