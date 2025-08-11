/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Habitacion;
import model.TipoHabitacion;
import model.EstadoHabitacion;
import exception.DBException;
import exception.NotFoundException;
import util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel
 */
public class HabitacionDAO {

    public Habitacion findById(Long id) throws DBException, NotFoundException {
        String sql = "SELECT id_habitacion, numero_habitacion, id_tipo_habitacion, estado, permite_mascotas, movilidad_reducida, precio_noche FROM habitacion WHERE id_habitacion=?";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Habitacion h = new Habitacion();
                    h.setId(rs.getLong("id_habitacion"));
                    h.setNumero(rs.getString("numero_habitacion"));
                    int tipo = rs.getInt("id_tipo_habitacion");
                    h.setTipo(TipoHabitacion.values()[Math.max(0, tipo)]);
                    h.setEstado(EstadoHabitacion.valueOf(rs.getString("estado")));
                    h.setPermiteMascotas(rs.getBoolean("permite_mascotas"));
                    h.setMovilidadReducida(rs.getBoolean("movilidad_reducida"));
                    h.setPrecioNoche(rs.getBigDecimal("precio_noche"));
                    return h;
                } else {
                    throw new NotFoundException("Habitación no encontrada: " + id);
                }
            }
        } catch (SQLException e) {
            throw new DBException("Error BD findById habitacion", e);
        }
    }

    public List<Habitacion> listDisponiblesBetweenDates(java.time.LocalDate desde, java.time.LocalDate hasta) throws DBException {
        String sql = "SELECT h.id_habitacion, h.numero_habitacion, h.id_tipo_habitacion, h.estado, h.precio_noche "
                + "FROM habitacion h "
                + "LEFT JOIN reserva r ON r.id_habitacion = h.id_habitacion AND NOT (r.fecha_salida <= ? OR r.fecha_entrada >= ?) "
                + "WHERE r.id_reserva IS NULL AND h.estado = 'DISPONIBLE'";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDate(1, Date.valueOf(desde));
            ps.setDate(2, Date.valueOf(hasta));
            try (ResultSet rs = ps.executeQuery()) {
                List<Habitacion> result = new ArrayList<>();
                while (rs.next()) {
                    Habitacion h = new Habitacion();
                    h.setId(rs.getLong("id_habitacion"));
                    h.setNumero(rs.getString("numero_habitacion"));
                    int tipo = rs.getInt("id_tipo_habitacion");
                    h.setTipo(TipoHabitacion.values()[Math.max(0, tipo)]);
                    h.setEstado(EstadoHabitacion.valueOf(rs.getString("estado")));
                    h.setPrecioNoche(rs.getBigDecimal("precio_noche"));
                    result.add(h);
                }
                return result;
            }
        } catch (SQLException e) {
            throw new DBException("Error BD listDisponibles", e);
        }
    }
}

