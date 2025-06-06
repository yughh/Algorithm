-- PRODUCT 테이블에서 상품 카테고리 코드(PRODUCT_CODE 앞 2자리) 별 상품 개수를 출력하는 SQL문을 작성해주세요. 
-- 결과는 상품 카테고리 코드를 기준으로 오름차순 정렬해주세
SELECT category, count(category) as PRODUCTS
FROM (SELECT substr(PRODUCT_CODE, 1,2) as category from PRODUCT) 
group by category
order by category;