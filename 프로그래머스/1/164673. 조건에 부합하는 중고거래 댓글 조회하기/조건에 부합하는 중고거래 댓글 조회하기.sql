-- 코드를 입력하세요
-- 2022년 10월에 작성된 
-- 게시글 제목, 게시글 ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일
-- 댓글 작성일을 기준으로 오름차순 정렬, 댓글 작성일이 같다면 게시글 제목을 기준 오름차순
SELECT UGB.TITLE
    , UGB.BOARD_ID
    , UGR.REPLY_ID
    , UGR.WRITER_ID
    , UGR.CONTENTS
    , DATE_FORMAT(UGR.CREATED_DATE, '%Y-%m-%d') AS CREATE_DATE
FROM USED_GOODS_BOARD AS UGB
INNER
JOIN USED_GOODS_REPLY AS UGR 
ON UGB.BOARD_ID = UGR.BOARD_ID
WHERE DATE_FORMAT(UGB.CREATED_DATE,'%Y-%m') = '2022-10'
ORDER BY UGR.CREATED_DATE, UGB.TITLE
;