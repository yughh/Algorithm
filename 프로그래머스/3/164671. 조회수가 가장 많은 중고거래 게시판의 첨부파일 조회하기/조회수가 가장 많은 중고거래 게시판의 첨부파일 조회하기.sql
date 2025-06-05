-- 코드를 입력하세요
SELECT concat ('/home/grep/src/',BOARD_ID,"/",FILE_ID,FILE_NAME,FILE_EXT) as 'FILE_PATH'
from 
(select *
from USED_GOODS_FILE 
order by FILE_ID desc) as t
where BOARD_ID = (
select BOARD_ID
from USED_GOODS_BOARD
order by views desc 
limit 1
)