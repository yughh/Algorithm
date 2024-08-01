-- 아이템의 희귀도가 'RARE'인 아이템들의 모든 다음 업그레이드 아이템의 아이템 ID(ITEM_ID), 아이템 명(ITEM_NAME), 아이템의 희귀도(RARITY)를 출력하는 SQL 문을 작성해 주세요
-- . 이때 결과는 아이템 ID를 기준으로 내림차순 정렬주세요.
select t.ITEM_ID, i.ITEM_NAME, i.RARITY
from ITEM_INFO  i join ITEM_TREE t
on i.ITEM_ID = t.ITEM_ID
join (select ITEM_ID,ITEM_NAME from ITEM_INFO where RARITY = 'rare' ) as l
on t.PARENT_ITEM_ID = l.ITEM_ID
order by ITEM_ID desc;
