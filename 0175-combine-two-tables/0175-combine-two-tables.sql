/* Write your PL/SQL query statement below */
select 
p.firstname,
p.lastname,
a.city,
a.state
from Person p
left JOIN Address a
ON p.personId=a.personId;