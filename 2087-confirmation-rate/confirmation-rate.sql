SELECT 
    a.user_id,
    CASE WHEN b.user_count IS NULL THEN 0 
    ELSE round((b.confirmed_count / b.user_count), 2) END AS confirmation_rate
FROM
    Signups a 
LEFT JOIN
    (SELECT 
        user_id,
        SUM(CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END) AS confirmed_count,
        COUNT(*) AS user_count
    FROM 
        Confirmations
    GROUP BY user_id) b
ON a.user_id = b.user_id;