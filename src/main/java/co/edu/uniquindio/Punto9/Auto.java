package co.edu.uniquindio.Punto9;

public class Auto extends Vehiculo{

    public Auto(String placa) {
        super(placa);
    }

    @Override
    public float alquilar() {
        return 50000;
    }

}
