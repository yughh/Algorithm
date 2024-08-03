-- 대장균 개체의 ID(ID)와 자식의 수(CHILD_COUNT)를 출력하는 SQL 문을 작성해주세요. 
# 자식이 없다면 자식의 수는 0으로 출력해주세요. 이때 결과는 개체의 ID 에 대해 오름차순 정렬해주세요.
# select d.id
#         ,ifnull(cnt, 0) as CHILD_COUNT
# from ECOLI_DATA d left outer join 
# (
#     select PARENT_ID
#             ,count(PARENT_ID) as cnt 
#     from ECOLI_DATA
#     where PARENT_ID is not null
#     group by PARENT_ID
# ) s
# on d.PARENT_ID = s.PARENT_ID
# order by d.id;


select d.id
        ,ifnull(cnt, 0) as CHILD_COUNT
from ECOLI_DATA d left outer join 
(
    select PARENT_ID
            ,count(PARENT_ID) as cnt 
    from ECOLI_DATA
    where PARENT_ID is not null
    group by PARENT_ID
) s
on d.id = s.PARENT_ID
order by d.id;
