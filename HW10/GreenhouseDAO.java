package HW10;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GreenhouseDAO {
    private Connection connection;

    public GreenhouseDAO(Connection connection) {
        this.connection = connection;
    }

    public void create(Greenhouse greenhouse) throws SQLException {
        String query = "INSERT INTO greenhouse (name, location, capacity, gardener_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, greenhouse.getName());
            statement.setString(2, greenhouse.getLocation());
            statement.setInt(3, greenhouse.getCapacity());
            statement.setInt(4, greenhouse.getGardenerId());
            statement.executeUpdate();
        }
    }

    public void update(Greenhouse greenhouse) throws SQLException {
        String query = "UPDATE greenhouse SET name = ?, location = ?, capacity = ?, gardener_id = ? WHERE greenhouse_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, greenhouse.getName());
            statement.setString(2, greenhouse.getLocation());
            statement.setInt(3, greenhouse.getCapacity());
            statement.setInt(4, greenhouse.getGardenerId());
            statement.setInt(5, greenhouse.getGreenhouseId());
            statement.executeUpdate();
        }
    }

    public void delete(int greenhouseId) throws SQLException {
        String query = "DELETE FROM greenhouse WHERE greenhouse_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, greenhouseId);
            statement.executeUpdate();
        }
    }

    public Greenhouse getById(int greenhouseId) throws SQLException {
        String query = "SELECT * FROM greenhouse WHERE greenhouse_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, greenhouseId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Greenhouse greenhouse = new Greenhouse();
                    greenhouse.setGreenhouseId(resultSet.getInt("greenhouse_id"));
                    greenhouse.setName(resultSet.getString("name"));
                    greenhouse.setLocation(resultSet.getString("location"));
                    greenhouse.setCapacity(resultSet.getInt("capacity"));
                    greenhouse.setGardenerId(resultSet.getInt("gardener_id"));
                    return greenhouse;
                }
            }
        }
        return null;
    }

    public List<Greenhouse> getAll() throws SQLException {
        List<Greenhouse> greenhouses = new ArrayList<>();
        String query = "SELECT * FROM greenhouse";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Greenhouse greenhouse = new Greenhouse();
                greenhouse.setGreenhouseId(resultSet.getInt("greenhouse_id"));
                greenhouse.setName(resultSet.getString("name"));
                greenhouse.setLocation(resultSet.getString("location"));
                greenhouse.setCapacity(resultSet.getInt("capacity"));
                greenhouse.setGardenerId(resultSet.getInt("gardener_id"));
                greenhouses.add(greenhouse);
            }
        }
        return greenhouses;
    }
}
