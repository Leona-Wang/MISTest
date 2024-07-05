SELECT unique_id,name
FROM leetcode1378.employees AS E 
LEFT JOIN leetcode1378.employeeuni AS UNI
ON E.id=UNI.id;