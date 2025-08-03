/* Write your PL/SQL query statement below */
select customer_id
from
Customer
group by customer_id
HAVING count(DISTINCT product_key)=(select count(*) from Product)