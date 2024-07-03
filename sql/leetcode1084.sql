SELECT DISTINCT S.product_id,P.product_name
FROM leetcode1084.product AS P,leetcode1084.sales AS S
WHERE (S.sale_date BETWEEN '2019-01-01' AND '2019-03-31' 
AND S.product_id NOT IN 
	(SELECT DISTINCT S.product_id 
    FROM leetcode1084.sales AS S
    WHERE sale_date>'2019-03-31' OR sale_date<'2019-01-01')) 
AND S.product_id=P.product_id;
