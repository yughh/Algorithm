select FACTORY_ID
        ,FACTORY_NAME
        ,ADDRESS
from FOOD_FACTORY
where ADDRESS Like '%강원도%'
order by FACTORY_ID;