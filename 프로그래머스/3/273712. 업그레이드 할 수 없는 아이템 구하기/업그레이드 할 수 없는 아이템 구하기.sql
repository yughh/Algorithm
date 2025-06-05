# -- 코드를 작성해주세요
select 
ITEM_ID
,ITEM_NAME
,RARITY
from ITEM_INFO
where ITEM_ID in (select ITEM_ID
from
(select 
ITEM_ID
from ITEM_TREE )p1 

left outer join
(select 
PARENT_ITEM_ID
from ITEM_TREE )p2
on p1.ITEM_ID = p2.PARENT_ITEM_ID
where p2.PARENT_ITEM_ID is null )
order by ITEM_ID desc;