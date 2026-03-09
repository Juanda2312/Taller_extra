package co.edu.uniquindio.Punto9;

public abstract class Vehiculo {
    String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public abstract float alquilar();
}
