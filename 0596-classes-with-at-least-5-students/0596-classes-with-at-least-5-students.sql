/* Write your PL/SQL query statement below */
select class from Courses GROUP BY class HAVING count(*)>=5