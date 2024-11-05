# Write your MySQL query statement below

SELECT product_name, sum(unit) AS unit FROM Orders a INNER JOIN Products b ON a.product_id = b.product_id WHERE order_date BETWEEN "2020/02/01" AND "2020/02/29" GROUP BY a.product_id HAVING sum(unit) >= 100;