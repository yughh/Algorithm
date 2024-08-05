-- REST_INFO와 REST_REVIEW 테이블에서 
# 서울에 위치한 식당들의 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회하는 SQL문을 작성해주세요. 
# 이때 리뷰 평균점수는 소수점 세 번째 자리에서 반올림 해주시고 
# 결과는 평균점수를 기준으로 내림차순 정렬해주시고, 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬해주세요.
SELECT r.REST_ID
        ,i.REST_NAME
        ,i.FOOD_TYPE
        ,i.FAVORITES
        ,i.ADDRESS	
        ,Round(avg(REVIEW_SCORE), 2) as SCORE
from REST_INFO i join REST_REVIEW r
on i.REST_ID = r.REST_ID
where ADDRESS Like '서울%'
Group by r.REST_ID
order by SCORE desc , i.FAVORITES desc
;