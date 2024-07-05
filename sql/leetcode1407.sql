WITH cte AS (
SELECT user_id,SUM(distance) AS distance
FROM leetcode1407.rides
GROUP BY user_id)
SELECT name,COALESCE(distance, 0) AS travelled_distance
FROM leetcode1407.users AS U
LEFT JOIN cte AS C
ON U.id=C.user_id
ORDER BY distance DESC,name ASC;
