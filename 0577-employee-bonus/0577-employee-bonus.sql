/* Write your PL/SQL query statement below */
select e.name,b.bonus
from
Employee e
LEFT JOIN
Bonus b
ON e.empId=b.empId
where b.bonus<1000 or b.bonus IS NULL