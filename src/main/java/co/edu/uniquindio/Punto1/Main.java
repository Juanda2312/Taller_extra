package co.edu.uniquindio.Punto1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

//Implementa un sistema de gestión de tareas utilizando clases y
// métodos genéricos. Cada tarea tiene una descripción, un nivel de prioridad y una fecha de vencimiento.
// Crea una clase Tarea genérica con los siguientes atributos:
//
//descripcion (String)
//prioridad (int)
//fechaVencimiento (Date)
//
//Además, crea una clase ListaDeTareas que permita agregar tareas, obtener tareas por prioridad y
// mostrar todas las tareas ordenadas por fecha de vencimiento.

public class Main {
    public static void main(String[] args) {

        // Crear instancia de ListaDeTareas
        ListaDeTareas<Tarea> lista = new ListaDeTareas<>();

        // Crear fechas usando Calendar
        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.MARCH, 10);
        Date fecha1 = cal.getTime();

        cal.set(2025, Calendar.JANUARY, 5);
        Date fecha2 = cal.getTime();

        cal.set(2025, Calendar.JUNE, 20);
        Date fecha3 = cal.getTime();

        cal.set(2025, Calendar.FEBRUARY, 15);
        Date fecha4 = cal.getTime();

        // Crear tareas con distintas prioridades y fechas
        Tarea tarea1 = new Tarea("Entregar informe", 3, fecha1);
        Tarea tarea2 = new Tarea("Revisar correos", 1, fecha2);
        Tarea tarea3 = new Tarea("Reunión de equipo", 5, fecha3);
        Tarea tarea4 = new Tarea("Actualizar documentación", 2, fecha4);

        // Agregar tareas a la lista
        lista.agregarTarea(tarea1);
        lista.agregarTarea(tarea2);
        lista.agregarTarea(tarea3);
        lista.agregarTarea(tarea4);

        // ── Mostrar tareas ordenadas por prioridad ──────────────────────────
        System.out.println("===== TAREAS ORDENADAS POR PRIORIDAD =====");
        ArrayList<Tarea> porPrioridad = lista.getTareasporPrioridad();
        for (Tarea t : porPrioridad) {
            System.out.println("Prioridad: " + t.getPrioridad()
                    + " | Descripción: " + t.getDescripcion()
                    + " | Fecha: " + t.getFechaVencimiento());
        }

        System.out.println();

        // ── Mostrar tareas ordenadas por fecha de vencimiento ───────────────
        System.out.println("===== TAREAS ORDENADAS POR FECHA DE VENCIMIENTO =====");
        ArrayList<Tarea> porFecha = lista.getTareasporFecha();
        for (Tarea t : porFecha) {
            System.out.println("Fecha: " + t.getFechaVencimiento()
                    + " | Descripción: " + t.getDescripcion()
                    + " | Prioridad: " + t.getPrioridad());
        }

        // ── Mostrar TODAS las tareas (sin ordenar) ──────────────────────────
        System.out.println("===== TODAS LAS TAREAS =====");
        ArrayList<Tarea> todas = lista.getTareas();
        for (Tarea t : todas) {
            System.out.println("Descripción: " + t.getDescripcion()
                    + " | Prioridad: " + t.getPrioridad()
                    + " | Fecha: " + t.getFechaVencimiento());
        }

        System.out.println();

// ── Mostrar tareas filtradas por una prioridad específica ───────────
        int prioridadBuscada = 3;
        System.out.println("===== TAREAS CON PRIORIDAD " + prioridadBuscada + " =====");
        ArrayList<Tarea> filtradas = lista.getTareasporPrioridad(prioridadBuscada);
        if (filtradas.isEmpty()) {
            System.out.println("No hay tareas con prioridad " + prioridadBuscada);
        } else {
            for (Tarea t : filtradas) {
                System.out.println("Descripción: " + t.getDescripcion()
                        + " | Fecha: " + t.getFechaVencimiento());
            }
        }

        System.out.println();

// ── Caso borde: prioridad que no existe ─────────────────────────────
        int prioridadInexistente = 99;
        System.out.println("===== TAREAS CON PRIORIDAD " + prioridadInexistente + " =====");
        ArrayList<Tarea> sinResultados = lista.getTareasporPrioridad(prioridadInexistente);
        if (sinResultados.isEmpty()) {
            System.out.println("No hay tareas con prioridad " + prioridadInexistente);
        }
    }
}