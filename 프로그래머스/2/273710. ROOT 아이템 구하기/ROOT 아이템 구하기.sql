# ROOT 아이템을 찾아 아이템 ID(ITEM_ID), 아이템 명(ITEM_NAME)을 출력하는 SQL문을 작성해 주세요
#. 이때, 결과는 아이템 ID를 기준으로 오름차순 정렬해 주세요.
# 단, 각 아이템들은 오직 하나의 PARENT 아이템 ID를 가지며, ROOT 아이템의 PARENT 아이템 ID는 NULL 입니다.
# ROOT 아이템이 없는 경우는 존재하지 않습니다.
#ROOT 아이템의 PARENT 아이템 ID는 NULL 입니다.

select t.ITEM_ID, i.ITEM_NAME
from ITEM_INFO i join ITEM_TREE t
on i.ITEM_ID = t.ITEM_ID
where PARENT_ITEM_ID is null;