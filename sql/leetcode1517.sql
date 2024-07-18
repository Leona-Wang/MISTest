SELECT user_id,name,mail
FROM leetcode1517.users
WHERE mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$';