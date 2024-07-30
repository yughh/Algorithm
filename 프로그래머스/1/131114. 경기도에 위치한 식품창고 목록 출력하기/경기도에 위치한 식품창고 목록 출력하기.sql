-- FOOD_WAREHOUSE 테이블에서 경기도에 위치한 창고의 ID, 이름, 주소, 냉동시설 여부를 조회하는 SQL문을 작성해주세요.
-- 이때 냉동시설 여부가 NULL인 경우, 'N'으로 출력시켜 주시고 결과는 창고 ID를 기준으로 오름차순 정렬해주세요.
SELECT WAREHOUSE_ID
        ,WAREHOUSE_NAME
        ,ADDRESS
        ,NVL2(replace(FREEZER_YN, 'N', null), 'Y', 'N') as FREEZER_YN
from FOOD_WAREHOUSE
where ADDRESS Like '%경기도%'
order by WAREHOUSE_ID;