package co.edu.uniquindio.Punto10;

//Escriba un método llamado mergeQueues que reciba dos colas Queue<T> y
// devuelva una nueva cola que intercale los elementos de ambas colas.
//Ejemplo
//Entrada
//cola1 = [1,3,5]
//cola2 = [2,4,6]
//Salida
//[1,2,3,4,5,6]

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static void main() {
// ── Caso base (ambas del mismo tamaño) ────────────────────────────
        System.out.println("===== CASO BASE =====");
        Queue<Integer> c1 = new LinkedList<>();
        Queue<Integer> c2 = new LinkedList<>();
        c1.add(1); c1.add(3); c1.add(5);
        c2.add(2); c2.add(4); c2.add(6);
        System.out.println("Cola 1: " + c1);
        System.out.println("Cola 2: " + c2);
        System.out.println("Intercalada: " + mergeQueues(c1, c2)); // [1,2,3,4,5,6]

        System.out.println();

        // ── Demuestra el problema del orden (valores desordenados) ────────
        System.out.println("===== ORDEN PRESERVADO =====");
        Queue<Integer> c3 = new LinkedList<>();
        Queue<Integer> c4 = new LinkedList<>();
        c3.add(5); c3.add(1); c3.add(3);
        c4.add(6); c4.add(2); c4.add(4);
        System.out.println("Cola 1: " + c3);
        System.out.println("Cola 2: " + c4);
        System.out.println("Intercalada: " + mergeQueues(c3, c4)); // [5,6,1,2,3,4]

        System.out.println();

        // ── Cola 1 más larga ──────────────────────────────────────────────
        System.out.println("===== COLA 1 MÁS LARGA =====");
        Queue<Integer> c5 = new LinkedList<>();
        Queue<Integer> c6 = new LinkedList<>();
        c5.add(1); c5.add(2); c5.add(3); c5.add(4);
        c6.add(10); c6.add(20);
        System.out.println("Cola 1: " + c5);
        System.out.println("Cola 2: " + c6);
        System.out.println("Intercalada: " + mergeQueues(c5, c6)); // [1,10,2,20,3,4]

        System.out.println();

        // ── Una cola vacía ────────────────────────────────────────────────
        System.out.println("===== UNA COLA VACÍA =====");
        Queue<Integer> c7 = new LinkedList<>();
        Queue<Integer> c8 = new LinkedList<>();
        c7.add(1); c7.add(2); c7.add(3);
        System.out.println("Cola 1: " + c7);
        System.out.println("Cola 2: " + c8);
        System.out.println("Intercalada: " + mergeQueues(c7, c8)); // [1,2,3]
    }

    public static Queue<Integer> mergeQueues(Queue<Integer> cola1, Queue<Integer> cola2) {
        Queue<Integer> colaIntercalada = new LinkedList<>();
        while (cola1.peek() != null || cola2.peek() != null){
            if (cola1.peek() != null)colaIntercalada.add(cola1.poll());
            if (cola2.peek() != null)colaIntercalada.add(cola2.poll());
        }
        return colaIntercalada;
    }
}
