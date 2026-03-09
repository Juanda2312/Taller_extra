package co.edu.uniquindio.Punto9;

import java.util.HashMap;
import java.util.List;

public class AlquilerVehiculos {
    public static HashMap<String,Float> alquilarVehiculos(List<? extends Vehiculo> vehiculos){
        HashMap<String,Float> mapa = new HashMap<>();
        for (Vehiculo vehiculo : vehiculos){
            float precio = vehiculo.alquilar();
            mapa.put(vehiculo.placa,precio);
        }
        return mapa;
    }
}
