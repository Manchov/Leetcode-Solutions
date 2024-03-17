# Write your MySQL query statement below
SELECT u.employee_id
FROM 
    (SELECT * FROM Employees LEFT JOIN Salaries USING(employee_id)
    UNION
    SELECT * FROM Employees RIGHT JOIN Salaries USING(employee_id))
AS u WHERE u.salary IS NULL OR u.name IS NULL
ORDER BY employee_id;
