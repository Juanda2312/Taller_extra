package co.edu.uniquindio.Punto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaDeTareas <T extends Tarea>{
    ArrayList<T> tareas;

    public ListaDeTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(T tarea) {
        tareas.add(tarea);
    }

    public ArrayList<T> getTareasporPrioridad() {
        ArrayList<T> tareaaux = new ArrayList<>(tareas);
        Collections.sort(tareaaux);
        return tareaaux;
    }

    public ArrayList<T> getTareasporFecha() {
        ArrayList<T> tareaaux = new ArrayList<>(this.tareas);
        Collections.sort(tareaaux, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.getFechaVencimiento().compareTo(o2.getFechaVencimiento());
            }
        });
        return tareaaux;
    }

    public ArrayList<T> getTareas() {
        return tareas;
    }

    public ArrayList<T> getTareasporPrioridad(int prioridad) {
        ArrayList<T> tareaaux = getTareasporPrioridad();
        ArrayList<T> tareasfiltradas = new ArrayList<>();
        for (T t : tareaaux) {
            if (t.getPrioridad() == prioridad) {
                tareasfiltradas.add(t);
            }
        }
        return tareasfiltradas;
    }
}
