-- 코드를 입력하세요
SELECT Round(sum(DAILY_FEE)/count(DAILY_FEE), 0) as AVERAGE_FEE 
From CAR_RENTAL_COMPANY_CAR
where CAR_TYPE = 'SUV'