SELECT actor_id,director_id
FROM leetcode1050.actordirector
GROUP BY actor_id,director_id
HAVING COUNT(actor_id)>=3;