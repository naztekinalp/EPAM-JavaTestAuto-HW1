INSERT INTO plants (plant_id, name, scientific_name, description, greenhouse_id)
VALUES (1, 'Tomato', 'Solanum lycopersicum', 'A juicy, red fruit', 1);

INSERT INTO greenhouse (greenhouse_id, name, location, capacity, gardener_id)
VALUES (1, 'Greenhouse 1', 'New York', 100, 1);

INSERT INTO gardener (gardener_id, name, phone, email, greenhouse_id)
VALUES (1, 'John Doe', '+1 555-1234', 'johndoe@example.com', 1);