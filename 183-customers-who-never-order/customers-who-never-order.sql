# Write your MySQL query statement below

select a.name as Customers from Customers a where a.id not in (select c.id as id from Customers c inner join Orders o on c.id = o.customerId);