select 
    a.user_id,
case
    when b.user_count is null then 0
    else
    round((b.confirmed_count / b.user_count), 2) END as confirmation_rate
from
    Signups a left join
    (SELECT 
    user_id,
    SUM(CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END) AS confirmed_count,
    COUNT(*) AS user_count
FROM 
    Confirmations
GROUP BY 
    user_id) b
on a.user_id = b.user_id;