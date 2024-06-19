# Write your MySQL query statement below
SELECT firstName,lastName,city,state
FROM person AS P
LEFT JOIN address AS A ON A.personId=P.personId;