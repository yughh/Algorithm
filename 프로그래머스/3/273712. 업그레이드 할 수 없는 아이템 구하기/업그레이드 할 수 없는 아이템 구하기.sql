-- 더 이상 업그레이드할 수 없는 아이템의 아이템 ID(ITEM_ID), 아이템 명(ITEM_NAME), 아이템의 희귀도(RARITY)를 출력하는 
# SQL 문을 작성해 주세요. 이때 결과는 아이템 ID를 기준으로 내림차순 정렬해 주세요.
select i.ITEM_ID
        ,i.ITEM_NAME
        ,i.RARITY
from ITEM_INFO i left outer join ITEM_TREE t
on i.ITEM_ID = t.PARENT_ITEM_ID
where PARENT_ITEM_ID is null
order by i.ITEM_ID desc
;

