# Write your MySQL query statement below

select distinct num as ConsecutiveNums from (select id, num, LEAD(num, 1) over (order by id) as num2, LEAD(num, 2) over (order by id) as num3 from logs) as k where num = num2 and num = num3;