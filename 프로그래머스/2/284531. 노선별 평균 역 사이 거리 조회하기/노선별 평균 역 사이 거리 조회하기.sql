select ROUTE
        ,concat(cast(round(sum(D_BETWEEN_DIST) , 1) as double) , 'km') as TOTAL_DISTANCE
        ,concat(cast(round(avg(D_BETWEEN_DIST) , 2) as double) , 'km') as AVERAGE_DISTANCE
from SUBWAY_DISTANCE
group by ROUTE
order by sum(D_BETWEEN_DIST) desc;
#order by TOTAL_DISTANCE desc;