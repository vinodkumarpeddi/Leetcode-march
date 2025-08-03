/* Write your PL/SQL query statement below */
select MAX(num) AS num
from (select num from MyNumbers GROUP BY num HAVING count(num)=1)