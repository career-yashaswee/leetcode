SELECT
    t1.Department as Department,
    t1.Employee as Employee,
    t1.Salary as Salary
FROM (
    SELECT
        d.name as Department,
        e.name as Employee,
        e.salary as Salary,
        RANK() OVER(PARTITION BY d.id ORDER BY e.salary DESC) as rk
    FROM
        Employee e LEFT JOIN Department d ON e.departmentId=d.id
) as t1
WHERE
    rk=1
