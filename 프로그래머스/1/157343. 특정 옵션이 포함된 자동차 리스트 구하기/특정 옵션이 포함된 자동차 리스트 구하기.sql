-- 코드를 입력하세요
--CAR_RENTAL_COMPANY_CAR 테이블에서 '네비게이션' 옵션이 포함된 자동차 리스트를 출력하는 SQL문을 작성해주세요. 결과는 자동차 ID를 기준으로 내림차순 정렬해주세요.

select *
from CAR_RENTAL_COMPANY_CAR
where OPTIONS Like '%네비게이션%'
order by CAR_ID desc;