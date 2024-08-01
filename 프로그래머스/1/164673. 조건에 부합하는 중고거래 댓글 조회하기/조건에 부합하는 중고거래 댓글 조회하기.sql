select b.TITLE, b.BOARD_ID,
       r.REPLY_ID, r.WRITER_ID, r.CONTENTS , 
       Date_Format(r.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE
from USED_GOODS_BOARD b 
Inner Join USED_GOODS_REPLY r
on b.BOARD_ID = r.BOARD_ID
where b.CREATED_DATE  Between Date_Format('2022-10-01', '%Y-%m-%d') and Date_Format('2022-10-31', '%Y-%m-%d')
order by r.CREATED_DATE asc, b.TITLE asc;