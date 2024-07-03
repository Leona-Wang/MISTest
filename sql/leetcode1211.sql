WITH cte AS (
SELECT query_name,COUNT(query_name) AS k
FROM leetcode1211.queries
WHERE rating<3
GROUP BY query_name
)
SELECT Q.query_name,ROUND(SUM(rating/position)/COUNT(Q.query_Name),2) AS quality,ROUND(COALESCE(MAX(C.k), 0)/COUNT(Q.query_name)*100,2) AS poor_query_percentage
FROM leetcode1211.queries AS Q
LEFT JOIN cte AS C ON (C.query_name=Q.query_name)
WHERE Q.query_name IS NOT NULL
GROUP BY Q.query_name;