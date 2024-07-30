-- 코드를 입력하세요
-- 상반기에 판매된 아이스크림의 맛을 총주문량을 기준으로 내림차순 정렬하고 
-- 총주문량이 같다면 출하 번호를 기준으로 오름차순 정렬하여 조회하는 SQL 문을 작성해주세요.
SELECT FLAVOR
From FIRST_HALF
order by TOTAL_ORDER desc, SHIPMENT_ID;