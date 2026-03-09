package co.edu.uniquindio.Punto9;

public class Camion extends Vehiculo{
    public Camion(String placa) {
        super(placa);
    }
    @Override
    public float alquilar() {
        return 100000;
    }
    public void cargar(){
        System.out.println("Camion cargando");
    }

}
