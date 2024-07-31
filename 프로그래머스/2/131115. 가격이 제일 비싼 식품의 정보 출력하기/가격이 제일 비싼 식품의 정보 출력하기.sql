select *
from FOOD_PRODUCT
where price = (select Max(price) from FOOD_PRODUCT);