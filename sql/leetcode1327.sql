WITH cte AS(
SELECT product_id,SUM(unit) AS unit
FROM leetcode1327.orders
WHERE (order_date BETWEEN '2020-02-01' AND '2020-02-29')
GROUP BY product_id)
SELECT P.product_name, C.unit AS unit
FROM cte AS C,leetcode1327.products AS P
WHERE C.unit>=100 AND C.product_id=P.product_id;