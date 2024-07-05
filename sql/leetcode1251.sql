SELECT P.product_id,COALESCE(ROUND(SUM(P.price*U.units)/SUM(U.units),2),0) AS average_price
FROM leetcode1251.prices AS P
LEFT JOIN leetcode1251.unitssold AS U
ON P.product_id=U.product_id AND U.purchase_date BETWEEN P.start_date AND P.end_date
GROUP BY P.product_id;