# Write your MySQL query statement below
SELECT C.name AS Customers
FROM customers AS C
LEFT JOIN orders AS O ON C.id=O.customerId
WHERE (O.customerId IS NULL);