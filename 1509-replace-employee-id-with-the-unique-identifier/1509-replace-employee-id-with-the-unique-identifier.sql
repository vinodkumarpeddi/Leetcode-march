/* Write your PL/SQL query statement below */
select e.unique_id,e1.name from 
Employees e1
LEFT JOIN EmployeeUNI e
ON
e1.id=e.id