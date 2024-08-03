-- CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서
# 2022년 10월 16일에 대여 중인 자동차인 경우 '대여중' 이라고 표시하고, 
#                 대여 중이지 않은 자동차인 경우 '대여 가능'을 표시하는 컬럼(컬럼명: AVAILABILITY)을 추가하여 
# 자동차 ID와 AVAILABILITY 리스트를 출력하는 SQL문을 작성해주세요. 
# 이때 반납 날짜가 2022년 10월 16일인 경우에도 '대여중'으로 표시해주시고 결과는 자동차 ID를 기준으로 내림차순 정렬해주세요.
#대여 가능한 애들...
#대여 불가능한 애들..
# 대여중

# ;
Select c.car_id,  if(AVAILABILITY is null, '대여 가능', '대여중') as AVAILABILITY
from (select car_id
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
order by car_id) c 
left outer join 
(select car_id, '대여중' as AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where end_date >='2022-10-16'
and start_date <= '2022-10-16'
group by car_id, end_date
order by car_id, end_date desc) as a
on c.car_id = a.car_id
order by c.car_id desc;

