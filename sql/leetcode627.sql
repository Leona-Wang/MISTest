SET SQL_SAFE_UPDATES = 0;
UPDATE
    leetcode627.salary
SET
    sex = IF(sex = 'm', 'f', 'm');
#UPDATE leetcode627.salary
#SET sex=CASE
#	WHEN sex='f' THEN 'm'
#    WHEN sex='m' THEN 'f'
#    ELSE sex
#    END
#WHERE sex IN ('f','m');
SET SQL_SAFE_UPDATES = 1;

