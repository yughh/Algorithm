--BOOK 테이블에서 2021년에 출판된 '인문' 카테고리에 속하는 도서 리스트를 찾아서 
-- 도서 ID(BOOK_ID), 출판일 (PUBLISHED_DATE)을 출력하는 SQL문을 작성해주세요.
--결과는 출판일을 기준으로 오름차순 정렬해주세요.

select BOOK_ID
        ,to_char(PUBLISHED_DATE, 'YYYY-MM-DD') as PUBLISHED_DATE
from BOOK
where to_char(PUBLISHED_DATE, 'YYYY') = '2021'
and CATEGORY = '인문'
order by PUBLISHED_DATE;
