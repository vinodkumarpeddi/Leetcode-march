/* Write your PL/SQL query statement below */
select u.name as name,COALESCE(SUM(r.distance),0) as travelled_distance 
from Users u left join Rides r
ON u.id=r.user_id
Group by u.id,u.name
order by travelled_distance desc,u.name 