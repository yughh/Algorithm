-- 코드를 작성해주세요
select f3.id
from ECOLI_DATA f3
inner join (select f.id
            from ECOLI_DATA as f
            Join (select ID
                    from ECOLI_DATA
                    where PARENT_ID is null) as f1
            on f.parent_id = f1.id) as f2 
on f3.PARENT_ID = f2.id        
order by f3.id;

