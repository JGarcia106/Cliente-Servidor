/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import exception.NotFoundException;
import exception.DBException;
import exception.BusinessException;
import util.SerializationUtil;
import service.ReservationService;
import model.*;
import scheduler.CleaningScheduler;

import java.time.LocalDate;
import java.io.IOException;
import util.DBConnection;

/**
 *
 * @author Joel
 */
public class MainDemo {

    public static void main(String[] args) {
        // 🔹 Configurar conexión a BD desde aquí
        DBConnection.configure(
                "jdbc:mysql://localhost:3306/hotel_db?useSSL=false",
                "tu_usuario", // Cambia por tu usuario MySQL
                "tu_contraseña" // Cambia por tu contraseña MySQL
        );

        ReservationService service = new ReservationService();

        try {
            Cliente cliente = new Cliente(null, "Juan Perez", "juan@example.com", "+50688880000", false);
            dao.ClienteDAO clienteDAO = new dao.ClienteDAO();
            cliente = clienteDAO.create(cliente);
            System.out.println("Cliente creado: " + cliente);

            LocalDate desde = LocalDate.now().plusDays(7);
            LocalDate hasta = desde.plusDays(3);

            System.out.println("Buscando habitaciones disponibles entre " + desde + " y " + hasta);
            var disponibles = service.buscarDisponibles(desde, hasta);
            System.out.println("Encontradas: " + disponibles.size());

            if (!disponibles.isEmpty()) {
                Habitacion h = disponibles.get(0);
                var reserva = service.reservar(cliente.getId(), h.getId(), desde, hasta);
                System.out.println("Reserva creada: " + reserva);

                SerializationUtil.serialize(reserva, "reserva_" + reserva.getId() + ".ser");
                System.out.println("Reserva serializada localmente.");
            }

            CleaningScheduler scheduler = new CleaningScheduler();
            Limpieza limpieza = new Limpieza();
            limpieza.setId(1L);
            if (!disponibles.isEmpty()) {
                limpieza.setHabitacion(disponibles.get(0));
            }
            limpieza.setFechaProgramada(LocalDate.now().plusDays(8));
            scheduler.scheduleCleaning(limpieza, 5L);

            Thread.sleep(7000);
            scheduler.shutdown();

        } catch (BusinessException | NotFoundException | DBException | IOException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}
