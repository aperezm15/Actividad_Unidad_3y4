package com.tienda.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    // Configuración de la Base de Datos
    private static final String JDBC_URL = "jdbc:mysql://25.50.109.111:3306/tienda_informatica_final?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root3";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }

    public static void closeConnection(Connection conn) {
    if (conn != null) {
        try {
            conn.close(); 
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
}