SELECT class
FROM leetcode596.courses
GROUP BY class
HAVING count(class)>5;
