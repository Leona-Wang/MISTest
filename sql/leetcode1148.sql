SELECT DISTINCT author_id AS id
FROM leetcode1148.views
WHERE author_id=viewer_id
ORDER BY author_id ASC;