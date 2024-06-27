SELECT id,movie,description,rating
FROM leetcode620.cinema
WHERE id%2=1 AND description NOT IN ('boring')
ORDER BY rating DESC;