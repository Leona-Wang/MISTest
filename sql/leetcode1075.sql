SELECT P.project_id,ROUND(SUM(E.experience_years)/COUNT(P.project_id),2) AS average_years
FROM leetcode1075.project AS P
LEFT JOIN leetcode1075.employee AS E
	ON P.employee_id=E.employee_id
GROUP BY P.project_id
;