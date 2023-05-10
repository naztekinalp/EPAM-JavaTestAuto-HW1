package HW10;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GardenerDAO {
    private Connection connection;

    public GardenerDAO(Connection connection) {
        this.connection = connection;
    }

    public void create(Gardener gardener) throws SQLException {
        String query = "INSERT INTO gardener (name, phone, email, greenhouse_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, gardener.getName());
            statement.setString(2, gardener.getPhone());
            statement.setString(3, gardener.getEmail());
            statement.setInt(4, gardener.getGreenhouseId());
            statement.executeUpdate();
        }
    }

    public void update(Gardener gardener) throws SQLException {
        String query = "UPDATE gardener SET name = ?, phone = ?, email = ?, greenhouse_id = ? WHERE gardener_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, gardener.getName());
            statement.setString(2, gardener.getPhone());
            statement.setString(3, gardener.getEmail());
            statement.setInt(4, gardener.getGreenhouseId());
            statement.setInt(5, gardener.getGardenerId());
            statement.executeUpdate();
        }
    }

    public void delete(int gardenerId) throws SQLException {
        String query = "DELETE FROM gardener WHERE gardener_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, gardenerId);
            statement.executeUpdate();
        }
    }

    public Gardener getById(int gardenerId) throws SQLException {
        String query = "SELECT * FROM gardener WHERE gardener_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, gardenerId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Gardener gardener = new Gardener();
                    gardener.setGardenerId(resultSet.getInt("gardener_id"));
                    gardener.setName(resultSet.getString("name"));
                    gardener.setPhone(resultSet.getString("phone"));
                    gardener.setEmail(resultSet.getString("email"));
                    gardener.setGreenhouseId(resultSet.getInt("greenhouse_id"));
                    return gardener;
                }
            }
        }
        return null;
    }

    public List<Gardener> getAll() throws SQLException {
        List<Gardener> gardeners = new ArrayList<>();
        String query = "SELECT * FROM gardener";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Gardener gardener = new Gardener();
                gardener.setGardenerId(resultSet.getInt("gardener_id"));
                gardener.setName(resultSet.getString("name"));
                gardener.setPhone(resultSet.getString("phone"));
                gardener.setEmail(resultSet.getString("email"));
                gardener.setGreenhouseId(resultSet.getInt("greenhouse_id"));
                gardeners.add(gardener);
            }
        }
        return gardeners;
    }
}

