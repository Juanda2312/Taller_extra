package co.edu.uniquindio.Punto2;

//Crea una clase PairList genérica que almacene una lista de pares de valores(clave ,valor)
// genéricos y tenga métodos para agregar, eliminar y obtener pares.

public class Main {
    public static void main(String[] args) {

        // ── PairList<String, Integer> ────────────────────────────────────────
        System.out.println("===== AGENDA DE EDADES =====");
        PairList<String, Integer> edades = new PairList<>();

        edades.add("Juan", 25);
        edades.add("Ana", 30);
        edades.add("Pedro", 22);
        edades.add("María", 28);

        // get: clave existente
        System.out.println("Edad de Ana: " + edades.get("Ana"));

        // get: clave inexistente (prueba el fix del bug)
        System.out.println("Edad de Carlos (no existe): " + edades.get("Carlos"));

        // remove y verificar
        edades.remove("Pedro");
        System.out.println("Edad de Pedro tras eliminarlo: " + edades.get("Pedro"));

        System.out.println();

        // ── PairList<Integer, String> ────────────────────────────────────────
        System.out.println("===== CÓDIGOS DE ERROR =====");
        PairList<Integer, String> errores = new PairList<>();

        errores.add(404, "Not Found");
        errores.add(500, "Internal Server Error");
        errores.add(200, "OK");

        System.out.println("Código 404: " + errores.get(404));
        System.out.println("Código 200: " + errores.get(200));

        errores.remove(500);
        System.out.println("Código 500 tras eliminarlo: " + errores.get(500));
    }
}
