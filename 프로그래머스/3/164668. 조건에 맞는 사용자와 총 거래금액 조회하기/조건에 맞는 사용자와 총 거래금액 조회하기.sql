-- 코드를 입력하세요
SELECT u.USER_ID, NICKNAME, sum(PRICE) as 'TOTAL_SALES'
from USED_GOODS_BOARD as b left join USED_GOODS_USER as u
on b.WRITER_ID = u.USER_ID
where STATUS ='DONE'
group by u.USER_ID
having sum(PRICE) >= 700000
order by TOTAL_SALES;