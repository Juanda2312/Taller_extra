package co.edu.uniquindio.Punto1;

import java.util.Date;

public class Tarea implements Comparable<Tarea>{
    String descripcion;
    int prioridad;
    Date fechaVencimiento;

    public Tarea(String descripcion, int prioridad, Date fechaVencimiento) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    @Override
    public int compareTo(Tarea o) {
        return this.prioridad - o.prioridad;
    }
}
