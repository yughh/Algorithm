-- 코드를 입력하세요
SELECT product_code, sum(SALES_AMOUNT) * avg(PRICE) as SALES
from OFFLINE_SALE o left outer join PRODUCT p
on o.PRODUCT_ID = p.PRODUCT_ID
group by product_code
order by SALES desc, product_code;