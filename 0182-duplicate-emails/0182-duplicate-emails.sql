/* Write your PL/SQL query statement below */
select email AS Email from Person GROUP BY email HAVING count(*)>1