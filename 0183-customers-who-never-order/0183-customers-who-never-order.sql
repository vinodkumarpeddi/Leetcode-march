# Write your MySQL query statement below
select name Customers from Customers where id NOT IN(select customerId from Orders)