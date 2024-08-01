#D162번 개발자의 경우 SKILL_CODE가 8452 = 8192 + 256 +4 로 Vue, Python, Cpp 스킬을 보유하고 있습니다.
# D164번 개발자의 경우 SKILL_CODE가 1024 로 C# 스킬을 보유하고 있습니다.
# D165번 개발자의 경우 SKILL_CODE가 400 = 256 + 128 + 16 으로 Python, Java, JavaScript 스킬을 보유하고 있습니다.

# select ID,EMAIL,FIRST_NAME,LAST_NAME
select DISTINCT(ID) 
        ,EMAIL,FIRST_NAME,LAST_NAME
from (  select *
        from DEVELOPERS left outer join SKILLCODES
        on SKILL_CODE >= CODE
        where SKILL_CODE & CODE
        order by ID, CODE desc ) s
where NAME in ('Python', 'C#')
order by ID;