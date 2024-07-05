WITH cte AS(
SELECT student_id,subject_name,COUNT(student_id) AS attended_exams
FROM leetcode1280.examinations
GROUP BY student_id,subject_name)
SELECT S.student_id,S.student_name,SUB.subject_name,COALESCE(C.attended_exams, 0) AS attended_exams
FROM leetcode1280.students AS S
CROSS JOIN leetcode1280.subjects AS SUB
LEFT JOIN cte AS C 
ON (S.student_id=C.student_id AND SUB.subject_name=C.subject_name)
ORDER BY S.student_id, SUB.subject_name;
