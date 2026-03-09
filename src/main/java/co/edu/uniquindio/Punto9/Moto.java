package co.edu.uniquindio.Punto9;

public class Moto extends Vehiculo{

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public float alquilar() {
        return 25000;
    }

    public void conducir(){
        System.out.println("Moto conduciendo");
    }
}
