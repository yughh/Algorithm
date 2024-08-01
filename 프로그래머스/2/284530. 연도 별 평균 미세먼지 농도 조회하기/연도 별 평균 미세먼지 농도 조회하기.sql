#AIR_POLLUTION 테이블에서 수원 지역의 연도 별 평균 미세먼지 오염도와
# 평균 초미세먼지 오염도를 조회하는 SQL문을 작성해주세요. 
# 이때, 평균 미세먼지 오염도와 평균 초미세먼지 오염도의 컬럼명은 각각 PM10, PM2.5로 해 주시고,
# 값은 소수 셋째 자리에서 반올림해주세요.
#결과는 연도를 기준으로 오름차순 정렬해주세요.

select year(YM) as YEAR, round(avg(PM_VAL1), 2) as `PM10`, round(avg(PM_VAL2), 2) as `PM2.5`
from AIR_POLLUTION
where LOCATION2 ='수원'
and LOCATION1 = '경기도'
group by year(YM)
#group by date_format(YM, '%Y')
order by YEAR;