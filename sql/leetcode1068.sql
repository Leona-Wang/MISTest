SELECT P.product_name,S.year,S.price
FROM leetcode1068.sales AS S
LEFT JOIN leetcode1068.product AS P ON S.product_id=P.product_id;