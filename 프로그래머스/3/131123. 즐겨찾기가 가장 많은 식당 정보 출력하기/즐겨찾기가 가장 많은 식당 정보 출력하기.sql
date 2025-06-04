-- 코드를 입력하세요
select i.FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
from REST_INFO i join (SELECT  FOOD_TYPE, max(FAVORITES) as f
from REST_INFO
group by FOOD_TYPE) as t
on t.FOOD_TYPE = i.FOOD_TYPE
and t.f = i.FAVORITES
order by i.FOOD_TYPE desc;