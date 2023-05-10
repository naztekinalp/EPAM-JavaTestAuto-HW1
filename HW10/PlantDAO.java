package HW10;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlantDAO {
    private Connection connection;

    public PlantDAO(Connection connection) {
        this.connection = connection;
    }

    public void create(Plant plant) throws SQLException {
        String query = "INSERT INTO plants (name, scientific_name, description, greenhouse_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, plant.getName());
            statement.setString(2, plant.getScientificName());
            statement.setString(3, plant.getDescription());
            statement.setInt(4, plant.getGreenhouseId());
            statement.executeUpdate();
        }
    }

    public void update(Plant plant) throws SQLException {
        String query = "UPDATE plants SET name = ?, scientific_name = ?, description = ?, greenhouse_id = ? WHERE plant_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, plant.getName());
            statement.setString(2, plant.getScientificName());
            statement.setString(3, plant.getDescription());
            statement.setInt(4, plant.getGreenhouseId());
            statement.setInt(5, plant.getPlantId());
            statement.executeUpdate();
        }
    }

    public void delete(int plantId) throws SQLException {
        String query = "DELETE FROM plants WHERE plant_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, plantId);
            statement.executeUpdate();
        }
    }

    public Plant getById(int plantId) throws SQLException {
        String query = "SELECT * FROM plants WHERE plant_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, plantId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Plant plant = new Plant();
                    plant.setPlantId(resultSet.getInt("plant_id"));
                    plant.setName(resultSet.getString("name"));
                    plant.setScientificName(resultSet.getString("scientific_name"));
                    plant.setDescription(resultSet.getString("description"));
                    plant.setGreenhouseId(resultSet.getInt("greenhouse_id"));
                    return plant;
                }
            }
        }
        return null;
    }

    public List<Plant> getAll() throws SQLException {
        List<Plant> plants = new ArrayList<>();
        String query = "SELECT * FROM plants";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Plant plant = new Plant();
                plant.setPlantId(resultSet.getInt("plant_id"));
                plant.setName(resultSet.getString("name"));
                plant.setScientificName(resultSet.getString("scientific_name"));
                plant.setDescription(resultSet.getString("description"));
                plant.setGreenhouseId(resultSet.getInt("greenhouse_id"));
                plants.add(plant);
            }
        }
        return plants;
    }
}
