WITH cte AS 
(SELECT x,y,z, LEAST(x,y,z) AS min1,GREATEST(LEAST(x,y),LEAST(x,z),LEAST(y,z)) AS min2,GREATEST(x,y,z) AS max
FROM leetcode610.triangle)
SELECT x,y,z,
CASE
	WHEN min1+min2>max THEN 'Yes'
    ELSE 'No'
END AS triangle
FROM cte;
