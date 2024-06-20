WITH cte AS (SELECT id,recordDate,temperature,LAG(temperature) OVER (ORDER BY recordDate) AS prev_tem,LAG(recordDate) OVER (ORDER BY recordDate) AS prev_date
FROM leetcode197.weather)
SELECT id 
FROM cte
WHERE (temperature>prev_tem) AND ( DATE_SUB(recordDate, INTERVAL 1 DAY) = prev_date);
/*DATE_SUB:找現有資料跟前一筆資料是否差一天*/