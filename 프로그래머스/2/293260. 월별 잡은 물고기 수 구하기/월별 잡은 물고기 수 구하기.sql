# 월별 잡은 물고기의 수와 월을 출력하는 SQL문을 작성해주세요.
# 잡은 물고기 수 컬럼명은 FISH_COUNT, 월 컬럼명은 MONTH로 해주세요.
# 결과는 월을 기준으로 오름차순 정렬해주세요.
# 단, 월은 숫자형태 (1~12) 로 출력하며 9 이하의 숫자는 두 자리로 출력하지 않습니다. 잡은 물고기가 없는 월은 출력하지 않습니다.
select count(*) as FISH_COUNT 
        ,cast(date_format(TIME, '%m') as signed) as MONTH
from FISH_INFO
Group by cast(date_format(TIME, '%m') as signed)
having count(*) > 0
order by MONTH;