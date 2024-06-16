-- 코드를 작성해주세요
-- 물고기 종류 별로 가장 큰 물고기의 ID, 물고기 이름, 길이
SELECT A.ID, 
        B.FISH_NAME,
        A.LENGTH
FROM FISH_INFO AS A
INNER 
JOIN FISH_NAME_INFO AS B ON A.FISH_TYPE = B.FISH_TYPE
WHERE A.LENGTH IN (SELECT MAX(LENGTH)
                  FROM FISH_INFO
                  WHERE FISH_TYPE = B.FISH_TYPE
                  GROUP BY FISH_TYPE)
ORDER BY A.ID
;
;