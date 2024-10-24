# Write your MySQL query statement below
delete from Person where id not in (select * from (select MIN(id) as id from Person group by email) as keep);