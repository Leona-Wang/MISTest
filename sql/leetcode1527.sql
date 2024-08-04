SELECT patient_id,patient_name,conditions
FROM leetcode1527.patients
WHERE conditions like '% DIAB1%' or conditions like 'DIAB1%';