SELECT player_id,MIN(event_date) AS first_login
FROM leetcode511.activity
GROUP BY player_id
ORDER BY player_id ASC;