-- Using BETWEEN
SELECT *
FROM plants
WHERE plant_id BETWEEN 1 AND 10;

-- Using IN
SELECT *
FROM greenhouse
WHERE location IN ('New York', 'Los Angeles');

-- Using LIKE
SELECT *
FROM gardener
WHERE name LIKE '%John%';

