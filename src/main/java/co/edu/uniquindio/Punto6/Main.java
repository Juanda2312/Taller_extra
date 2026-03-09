package co.edu.uniquindio.Punto6;

//Crea un método genérico llamado maximo que reciba una lista de objetos
// de cualquier tipo que implemente la interfaz Comparable y retorne el objeto máximo.

import java.util.List;

public class Main {
    static void main() {
        // Prueba con enteros
        List<Integer> enteros = List.of(3, 7, 1, 9, 4, 2);
        System.out.println("Máximo de enteros: " + maximo(enteros));

        // Prueba con doubles
        List<Double> doubles = List.of(3.14, 2.71, 1.41, 9.99, 0.57);
        System.out.println("Máximo de doubles: " + maximo(doubles));

        // Prueba con Strings (orden alfabético)
        List<String> palabras = List.of("banana", "manzana", "cereza", "uva");
        System.out.println("Máximo de strings: " + maximo(palabras));

        // Prueba con lista de un solo elemento
        List<Integer> unSoloElemento = List.of(42);
        System.out.println("Máximo de un elemento: " + maximo(unSoloElemento));

        // Prueba con excepción (lista vacía)
        try {
            List<Integer> vacia = List.of();
            maximo(vacia);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }


    public static <T extends Comparable<T>> T maximo(List<T> lista) {
        if (lista.isEmpty())throw new IllegalArgumentException("Sin elementos");
        T maximo = lista.get(0);
        for (T t : lista) {
            if (t.compareTo(maximo) > 0) {
                maximo = t;
            }
        }
        return maximo;
    }
}
