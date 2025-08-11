/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scheduler;

import model.Limpieza;
import model.EstadoLimpieza;
import java.time.LocalDate;
import java.util.concurrent.*;
import java.util.*;

/**
 *
 * @author Joel
 */
public class CleaningScheduler {

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
    private final Map<Long, Limpieza> tasks = new ConcurrentHashMap<>();

    public void scheduleCleaning(Limpieza l, long delaySeconds) {
        tasks.put(l.getId(), l);
        scheduler.schedule(() -> {
            l.setEstado(EstadoLimpieza.COMPLETADA);
            l.setComentario("Limpieza realizada por sistema a las " + LocalDate.now());
            System.out.println("Limpieza completada para habitacion: " + l.getHabitacion().getNumero());
            tasks.remove(l.getId());
        }, delaySeconds, TimeUnit.SECONDS);
    }

    public void shutdown() {
        scheduler.shutdown();
    }
}

