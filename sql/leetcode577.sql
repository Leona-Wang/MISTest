SELECT E.name,B.bonus
FROM leetcode577.employee AS E
LEFT JOIN leetcode577.bonus AS B ON E.empId=B.empId
WHERE B.bonus<1000 OR isnull(B.bonus);