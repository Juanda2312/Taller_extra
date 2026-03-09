package co.edu.uniquindio.Punto8;

import java.util.Stack;

//Escribe un método llamado splitStack que tome como parámetros una pila de enteros s, una posición i,
// y divida la pila en dos subpiles. La pila original debe dividirse en dos: la primera subpila tendrá los elementos
// desde el fondo hasta la posición i (sin incluir el elemento en la posición i), y la segunda subpila tendrá los elementos
// restantes, desde la posición i hasta el tope de la pila. nEl método debe devolver las dos subpilas, manteniendo el orden de los
//  elementos en ambas pilas.
//Firma del método:
//public static Pair<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s, int i);
public class Main {
    static void main() {
// ── Caso base ─────────────────────────────────────────────────────────
        // Stack: [1, 2, 3, 4, 5]  (1=fondo, 5=tope)
        // splitStack(s, 2) → pila1: [1,2]  pila2: [3,4,5]
        System.out.println("===== CASO BASE: split(i=2) =====");
        Stack<Integer> s1 = new Stack<>();
        s1.push(1); s1.push(2); s1.push(3); s1.push(4); s1.push(5);
        System.out.println("Stack original : " + s1);

        Pair<Stack<Integer>, Stack<Integer>> r1 = splitStack(s1, 2);
        System.out.println("Subpila 1 (fondo→i): " + r1.value1);   // [1, 2]
        System.out.println("Subpila 2 (i→tope) : " + r1.value2);  // [3, 4, 5]

        System.out.println();

        // ── Dividir en i=0 (pila1 vacía) ──────────────────────────────────────
        System.out.println("===== SPLIT EN i=0 (pila1 vacía) =====");
        Stack<Integer> s2 = new Stack<>();
        s2.push(1); s2.push(2); s2.push(3);
        System.out.println("Stack original : " + s2);

        Pair<Stack<Integer>, Stack<Integer>> r2 = splitStack(s2, 0);
        System.out.println("Subpila 1 (fondo→i): " + r2.value1);   // []
        System.out.println("Subpila 2 (i→tope) : " + r2.value2);  // [1, 2, 3]

        System.out.println();

        // ── Dividir en i=size (pila2 vacía) ───────────────────────────────────
        System.out.println("===== SPLIT EN i=3 (pila2 vacía) =====");
        Stack<Integer> s3 = new Stack<>();
        s3.push(1); s3.push(2); s3.push(3);
        System.out.println("Stack original : " + s3);

        Pair<Stack<Integer>, Stack<Integer>> r3 = splitStack(s3, 3);
        System.out.println("Subpila 1 (fondo→i): " + r3.value1);   // [1, 2, 3]
        System.out.println("Subpila 2 (i→tope) : " + r3.value2);  // []

        System.out.println();

        // ── Un solo elemento ──────────────────────────────────────────────────
        System.out.println("===== UN SOLO ELEMENTO: split(i=1) =====");
        Stack<Integer> s4 = new Stack<>();
        s4.push(42);
        System.out.println("Stack original : " + s4);

        Pair<Stack<Integer>, Stack<Integer>> r4 = splitStack(s4, 1);
        System.out.println("Subpila 1 (fondo→i): " + r4.value1);   // [42]
        System.out.println("Subpila 2 (i→tope) : " + r4.value2);  // []

        // ── Posición inválida (excepción) ─────────────────────────────────────
        System.out.println("===== POSICIÓN INVÁLIDA =====");
        try {
            Stack<Integer> s5 = new Stack<>();
            s5.push(1); s5.push(2); s5.push(3);
            splitStack(s5, 10); // i mayor que el tamaño
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        try {
            Stack<Integer> s6 = new Stack<>();
            s6.push(1);
            splitStack(s6, -1); // i negativo
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    public static Pair<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s, int i) {
        if (i < 0 || i > s.size()) throw new IllegalArgumentException("El valor de i no se puede usar: " + i);
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> spliced = new Stack<>();
        Stack<Integer> remaining = new Stack<>();

        while (!s.isEmpty()) {
            temp.push(s.pop());
        }

        for (int k = 0; k < i; k++) {
            spliced.push(temp.pop());
        }

        while (!temp.isEmpty()) {
            remaining.push(temp.pop());
        }
        return new Pair<>(spliced, remaining);
    }
}
