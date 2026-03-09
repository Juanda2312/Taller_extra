package co.edu.uniquindio.Punto7;

//Interfaz Genérica Comparador:
//Enunciado: Crea una interfaz genérica Comparador<T> que tenga un método comparar que reciba dos objetos
// del tipo T y retorne un valor int similar al método compareTo de Comparable.
//
//
//Requisitos:  Crea una implementación de la interfaz Comparador que permita comparar dos
// números, dos cadenas de texto o cualquier otro tipo que implemente esta interfaz.

public class Main {
    static void main() {
// --- Comparador de números ---
        Comparador<Integer> compNumero = new Numero();

        int resultadoN1 = compNumero.comparar(10, 5);
        System.out.println("10 vs 5: " + (resultadoN1 > 0 ? "Mayor" : resultadoN1 < 0 ? "Menor" : "Igual"));

        int resultadoN2 = compNumero.comparar(3, 3);
        System.out.println("3 vs 3: " + (resultadoN2 > 0 ? "Mayor" : resultadoN2 < 0 ? "Menor" : "Igual"));

        int resultadoN3 = compNumero.comparar(2, 8);
        System.out.println("2 vs 8: " + (resultadoN3 > 0 ? "Mayor" : resultadoN3 < 0 ? "Menor" : "Igual"));

        System.out.println();

        // --- Comparador de cadenas ---
        Comparador<String> compCadena = new Cadena();

        int resultadoC1 = compCadena.comparar("manzana", "banana");
        System.out.println("manzana vs banana: " + (resultadoC1 > 0 ? "Mayor" : resultadoC1 < 0 ? "Menor" : "Igual"));

        int resultadoC2 = compCadena.comparar("hola", "hola");
        System.out.println("hola vs hola: " + (resultadoC2 > 0 ? "Mayor" : resultadoC2 < 0 ? "Menor" : "Igual"));

        int resultadoC3 = compCadena.comparar("abc", "xyz");
        System.out.println("abc vs xyz: " + (resultadoC3 > 0 ? "Mayor" : resultadoC3 < 0 ? "Menor" : "Igual"));
    }
}
