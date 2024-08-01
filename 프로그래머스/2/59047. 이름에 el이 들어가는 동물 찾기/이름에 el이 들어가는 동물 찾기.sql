SELECT ANIMAL_ID
        ,NAME
from ANIMAL_INS
where UPPER(NAME) Like '%EL%'
and ANIMAL_TYPE = 'Dog'
order by name;