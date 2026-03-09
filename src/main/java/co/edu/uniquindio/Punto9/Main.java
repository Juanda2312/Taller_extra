package co.edu.uniquindio.Punto9;

//Enunciado:
//Imagina que trabajas en un sistema de gestión de alquiler de vehículos para una empresa.
// La empresa tiene diferentes tipos de vehículos: automóviles, motos y camiones.
// Todos los vehículos tienen un método común alquilar(), pero cada tipo de vehículo tiene características específicas,
//  como cargar() en el caso de los camiones o conducir() en el caso de las motos.
//La empresa quiere un sistema genérico que pueda manejar cualquier tipo de vehículo sin
// preocuparse del tipo específico (ya que los vehículos pueden variar). Se te ha pedido crear
// un método que reciba una lista de vehículos y ejecute su método alquilar(), pero el
//  tipo de vehículo no está definido de antemano. Además, quieres usar el comodín para que el sistema sea
//  flexible y funcione con cualquier tipo de vehículo.

//Requisitos:
//La clase Vehiculo debe ser una clase base para vehículos, con un método común alquilar().

//Las clases Auto, Moto y Camion deben extender de Vehiculo y sobrescribir el método alquilar().

//Crea un método genérico llamado alquilarVehiculos() que reciba una lista de vehículos de
// cualquier tipo y ejecute el método alquilar() de cada uno.

//Utiliza el comodín ? para que el método sea lo suficientemente flexible como para
// aceptar cualquier tipo de vehículo (es decir, List<? extends Vehiculo>).

import java.util.HashMap;
import java.util.List;

public class Main {
    static void main() {
        // ── Lista mixta de vehículos ──────────────────────────────────────
        System.out.println("===== LISTA MIXTA =====");
        List<Vehiculo> flota = List.of(
                new Auto("ABC-123"),
                new Moto("XYZ-456"),
                new Camion("TRK-789"),
                new Auto("DEF-321")
        );

        HashMap<String, Float> precios = AlquilerVehiculos.alquilarVehiculos(flota);
        precios.forEach((placa, precio) ->
                System.out.println("Placa: " + placa + " → $" + precio));

        System.out.println();

        // ── Lista solo de Autos (List<Auto> → acepta gracias al comodín) ──
        System.out.println("===== SOLO AUTOS =====");
        List<Auto> autos = List.of(new Auto("AAA-001"), new Auto("BBB-002"));
        HashMap<String, Float> preciosAutos = AlquilerVehiculos.alquilarVehiculos(autos);
        preciosAutos.forEach((placa, precio) ->
                System.out.println("Placa: " + placa + " → $" + precio));

        System.out.println();

        // ── Lista solo de Camiones ────────────────────────────────────────
        System.out.println("===== SOLO CAMIONES =====");
        List<Camion> camiones = List.of(new Camion("CAM-001"), new Camion("CAM-002"));
        HashMap<String, Float> preciosCamiones = AlquilerVehiculos.alquilarVehiculos(camiones);
        preciosCamiones.forEach((placa, precio) ->
                System.out.println("Placa: " + placa + " → $" + precio));

        System.out.println();

        // ── Métodos específicos de subclase ───────────────────────────────
        System.out.println("===== MÉTODOS ESPECÍFICOS =====");
        Moto moto = new Moto("MOT-001");
        moto.conducir();

        Camion camion = new Camion("CAM-003");
        camion.cargar();
    }
}
