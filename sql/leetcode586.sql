WITH cte AS (
SELECT customer_number,RANK() OVER (ORDER BY COUNT(order_number) DESC) AS M
FROM leetcode586.orders
GROUP BY customer_number)
SELECT customer_number
FROM cte
WHERE M=1;