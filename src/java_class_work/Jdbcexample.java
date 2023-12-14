package java_class_work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcexample {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/techshop";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "joshithameruga@15";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Using Statement
            useStatement(connection);

            // Using PreparedStatement
            usePreparedStatement(connection);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection in the finally block to ensure it's always closed
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void useStatement(Connection connection) throws SQLException {
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Create a Statement
            statement = connection.createStatement();

            // Execute a query
            resultSet = statement.executeQuery("SELECT * FROM customers");

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("customerid");
                String name = resultSet.getString("firstname");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } finally {
            // Close resources in the finally block to ensure they're always closed
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
    }

    private static void usePreparedStatement(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Create a PreparedStatement
            preparedStatement = connection.prepareStatement("SELECT * FROM customers WHERE customerid = ?");

            // Set parameters
            preparedStatement.setInt(1, 1);

            // Execute the query
            resultSet = preparedStatement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("customerid");
                String name = resultSet.getString("firstname");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } finally {
            // Close resources in the finally block to ensure they're always closed
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
}
