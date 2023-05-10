SELECT greenhouse_id, COUNT(*) as plant_count
FROM plants
GROUP BY greenhouse_id;
