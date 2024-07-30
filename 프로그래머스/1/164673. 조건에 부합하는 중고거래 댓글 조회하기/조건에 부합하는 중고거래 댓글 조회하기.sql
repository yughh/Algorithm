select b.TITLE, b.BOARD_ID,
       r.REPLY_ID, r.WRITER_ID, r.CONTENTS , 
       to_char(r.CREATED_DATE, 'YYYY-MM-DD') as CREATED_DATE
from USED_GOODS_BOARD b 
Inner Join USED_GOODS_REPLY r
on b.BOARD_ID = r.BOARD_ID
where b.CREATED_DATE  Between to_date('2022-10-01', 'YYYY-MM-DD') and to_date('2022-10-31', 'YYYY-MM-DD')
order by r.CREATED_DATE asc, b.TITLE asc;