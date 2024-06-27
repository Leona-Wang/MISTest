WITH cte AS (SELECT name
FROM leetcode607.salesperson AS S 
LEFT JOIN leetcode607.orders AS O ON O.sales_id=S.sales_id
WHERE com_id =(SELECT com_id
FROM leetcode607.company
WHERE name='RED'))
SELECT name
FROM leetcode607.salesperson
WHERE name NOT IN (SELECT name FROM cte); 




