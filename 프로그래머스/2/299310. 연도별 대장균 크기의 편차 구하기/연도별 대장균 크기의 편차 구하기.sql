-- 분화된 연도(YEAR), 분화된 연도별 대장균 크기의 편차(YEAR_DEV), 대장균 개체의 ID(ID) 를 출력하는 SQL 문을 작성해주세요. 
#분화된 연도별 대장균 크기의 편차는
# 분화된 연도별 가장 큰 대장균의 크기 - 각 대장균의 크기로 구하며 
# 결과는 연도에 대해 오름차순으로 정렬하고 같은 연도에 대해서는 대장균 크기의 편차에 대해 오름차순으로 정렬해주세요.


# select Year(DIFFERENTIATION_DATE) as y 
#        , Max(SIZE_OF_COLONY) as m
# from ECOLI_DATA
# Group by Year(DIFFERENTIATION_DATE);



select  Year(e.DIFFERENTIATION_DATE) as YEAR
        ,s.m- e.SIZE_OF_COLONY as YEAR_DEV
        ,e.ID
from ECOLI_DATA e join (select Year(DIFFERENTIATION_DATE) as y 
                            , Max(SIZE_OF_COLONY) as m
                        from ECOLI_DATA
                        Group by Year(DIFFERENTIATION_DATE)) s 
on Year(e.DIFFERENTIATION_DATE) = s.y
order by YEAR,YEAR_DEV ;