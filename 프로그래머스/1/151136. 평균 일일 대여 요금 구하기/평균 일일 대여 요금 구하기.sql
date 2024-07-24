-- 코드를 입력하세요
SELECT round(avg(DAILY_FEE), 0.1) as AVERAGE_FEE
From CAR_RENTAL_COMPANY_CAR
where CAR_TYPE = 'SUV';