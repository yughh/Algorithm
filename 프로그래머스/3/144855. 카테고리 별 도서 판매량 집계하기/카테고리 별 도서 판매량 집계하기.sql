-- 코드를 입력하세요
SELECT CATEGORY, sum(SALES) as TOTAL_SALES
from BOOK_SALES as s join BOOK as b
on s.book_id = b.book_id
where Month(SALES_DATE) = 1
group by category 
order by CATEGORY;