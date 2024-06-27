SELECT MAX(num) AS num
FROM (
	SELECT num
	FROM leetcode619.mynumbers
	GROUP BY num
	HAVING COUNT(num)=1
)AS appearOnce
;