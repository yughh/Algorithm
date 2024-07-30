-- 코드를 입력하세요
-- CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서
-- 대여 시작일이 2022년 9월에 속하는 대여 기록에 대해서 
-- 대여 기간이 30일 이상이면 '장기 대여'그렇지 않으면 '단기 대여' 로 표시하는 컬럼(컬럼명: RENT_TYPE)을 추가하여
-- 대여기록을 출력하는 SQL문을 작성해주세요. 
-- 결과는 대여 기록 ID를 기준으로 내림차순 정렬해주세요.
SELECT HISTORY_ID
        ,CAR_ID
        ,to_char(START_DATE, 'YYYY-MM-DD') as START_DATE
        ,to_char(END_DATE, 'YYYY-MM-DD') as END_DATE
        ,case
            when START_DATE +30 <= END_DATE+1 THen '장기 대여'
            else '단기 대여'
        END as RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
where START_DATE Between to_date('2022-09-01', 'YYYY-MM-DD') AND to_date('2022-09-30', 'YYYY-MM-DD')
order by HISTORY_ID desc;