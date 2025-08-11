/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Cliente;
import exception.DBException;
import exception.NotFoundException;
import util.DBConnection;
import java.sql.*;

/**
 *
 * @author Joel
 */
public class ClienteDAO {

    public Cliente create(Cliente c) throws DBException {
        String sql = "INSERT INTO cliente(nombre_completo,email,telefono,plan_lealtad) VALUES (?,?,?,?)";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, c.getNombreCompleto());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getTelefono());
            ps.setBoolean(4, c.isPlanLealtad());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    c.setId(rs.getLong(1));
                }
            }
            return c;
        } catch (SQLException e) {
            throw new DBException("Error al crear cliente", e);
        }
    }

    public Cliente findById(Long id) throws DBException, NotFoundException {
        String sql = "SELECT id_cliente,nombre_completo,email,telefono,plan_lealtad FROM cliente WHERE id_cliente=?";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Cliente c = new Cliente();
                    c.setId(rs.getLong("id_cliente"));
                    c.setNombreCompleto(rs.getString("nombre_completo"));
                    c.setEmail(rs.getString("email"));
                    c.setTelefono(rs.getString("telefono"));
                    c.setPlanLealtad(rs.getBoolean("plan_lealtad"));
                    return c;
                } else {
                    throw new NotFoundException("Cliente no encontrado: " + id);
                }
            }
        } catch (SQLException e) {
            throw new DBException("Error al buscar cliente", e);
        }
    }
}

