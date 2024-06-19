# Write your MySQL query statement below
SELECT DISTINCT(P1.email) AS Email
FROM person AS P1,person AS P2 
WHERE(P1.email=P2.email) AND (P1.id<>P2.id);