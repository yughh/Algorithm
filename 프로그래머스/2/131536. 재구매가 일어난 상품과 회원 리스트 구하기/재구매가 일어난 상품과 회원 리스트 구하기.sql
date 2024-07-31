-- 코드를 입력하세요
SELECT USER_ID, PRODUCT_ID
FROM ONLINE_SALE
Group by USER_ID, PRODUCT_ID

having count(product_id) > 1 
order by USER_ID, PRODUCT_ID desc;