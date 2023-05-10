CREATE TABLE plants (
    plant_id INTEGER PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    scientific_name VARCHAR(50),
    description TEXT,
    greenhouse_id INTEGER,
    FOREIGN KEY (greenhouse_id) REFERENCES greenhouse(greenhouse_id)
);

CREATE TABLE greenhouse (
    greenhouse_id INTEGER PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    location VARCHAR(50),
    capacity INTEGER,
    gardener_id INTEGER,
    FOREIGN KEY (gardener_id) REFERENCES gardener(gardener_id)
);

CREATE TABLE gardener (
    gardener_id INTEGER PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    phone VARCHAR(20),
    email VARCHAR(50),
    greenhouse_id INTEGER,
    FOREIGN KEY (greenhouse_id) REFERENCES greenhouse(greenhouse_id)
);
