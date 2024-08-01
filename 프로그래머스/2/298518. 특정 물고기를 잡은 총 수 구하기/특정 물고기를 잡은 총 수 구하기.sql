-- 코드를 작성해주세요
select count(*) as FISH_COUNT
FROM FISH_INFO i join FISH_NAME_INFO n
on i.FISH_TYPE = n.FISH_TYPE
where n.FISH_NAME in ('BASS', 'SNAPPER');