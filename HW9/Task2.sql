INSERT INTO plants (plant_id, name, scientific_name, description, greenhouse_id)
VALUES (1, 'Rose', 'Rosa damascena', 'A red flower', 1);

INSERT INTO greenhouse (greenhouse_id, name, location, capacity, gardener_id)
VALUES (1, 'Greenhouse 1', 'Paris', 100, 1);

INSERT INTO gardener (gardener_id, name, phone, email, greenhouse_id)
VALUES (1, 'Naz Tekinalp', '+1 555-1234', 'naz@test.com', 1);