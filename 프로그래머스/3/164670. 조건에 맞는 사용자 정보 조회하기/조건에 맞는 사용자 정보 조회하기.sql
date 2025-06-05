-- 코드를 입력하세요
SELECT
USER_ID
,NICKNAME
,concat(CITY, " ",STREET_ADDRESS1," ",STREET_ADDRESS2) as '전체주소'
,concat(substring(TLNO, 1, 3),"-",substring(TLNO, 4, 4),"-",substring(TLNO, 8, 4)) as '전화번호'
FROM USED_GOODS_USER
where user_ID in (SELECT WRITER_ID
from USED_GOODS_BOARD 
group by WRITER_ID
having count(WRITER_ID) >2)
order by USER_ID desc;