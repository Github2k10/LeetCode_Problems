# Write your MySQL query statement below

SELECT product_name, b.unit AS unit FROM Products a INNER JOIN (SELECT product_id, sum(unit) AS unit FROM Orders WHERE order_date BETWEEN "2020/02/01" AND "2020/02/29" GROUP BY product_id) b ON a.product_id = b.product_id WHERE b.unit >= 100;