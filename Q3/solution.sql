SELECT 
    o.owner_id,
    o.owner_name,
    COUNT(DISTINCT ca.category_id) AS different_category_count
FROM 
    article a
    JOIN owner o ON a.owner_id = o.owner_id
    JOIN category_article_mapping cam ON a.article_id = cam.article_id
    JOIN category ca ON cam.category_id = ca.category_id
GROUP BY 
    o.owner_id,
    o.owner_name
ORDER BY 
    different_category_count DESC;