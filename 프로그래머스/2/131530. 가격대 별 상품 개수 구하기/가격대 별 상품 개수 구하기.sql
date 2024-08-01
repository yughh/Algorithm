SELECT  truncate(PRICE, -4) as PRICE_GROUP, count(*) as PRODUCTS
from PRODUCT
group by truncate(PRICE, -4)
order by PRICE_GROUP;