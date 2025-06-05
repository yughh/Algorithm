-- 코드를 작성해주세요
select e.ID
,IFNULL(CHILD_COUNT, 0) as CHILD_COUNT
from ECOLI_DATA as e left join (select 
p1.ID
,count(p1.ID) as CHILD_COUNT
from ECOLI_DATA  p1 left join ECOLI_DATA p2
on p1.ID = p2.PARENT_ID
where p2.PARENT_ID is not null
group by p1.ID ) as t
on e.id = t.id
order by  e.ID;
