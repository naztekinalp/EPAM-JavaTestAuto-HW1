SELECT *
FROM plants
JOIN greenhouse ON plants.greenhouse_id = greenhouse.greenhouse_id
JOIN gardener ON greenhouse.gardener_id = gardener.gardener_id
ORDER BY plants.name;
