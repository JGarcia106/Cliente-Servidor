/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import exception.DBException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joel
 */
public class DBConnection {

    private static String URL = "jdbc:mysql://localhost:3306/TU_BD?useSSL=false";
    private static String USER = "tu_usuario";
    private static String PASS = "tu_contraseña";


    public static void configure(String url, String user, String pass) {
        URL = url;
        USER = user;
        PASS = pass;
    }

    public static Connection getConnection() throws DBException {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new DBException("No se pudo obtener conexion a BD", e);
        }
    }
}

