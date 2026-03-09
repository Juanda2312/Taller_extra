package co.edu.uniquindio.Punto5;

import java.util.ArrayList;
import java.util.Stack;


//spliceStack:  Write a method called spliceStack that takes as parameters a stack of integers s,
// a start position i, and an ending position j, and that removes a sequence of elements from s starting at the i’th
// element from the bottom of the stack up to (but not including) the j’th element from the bottom of the stack (
// where position 0 is the bottom of the stack), returning these values in a new stack. The ordering of elements in both
// stacks should be preserved.

public class Main {
    public static void main(String[] args) {

        // ── Caso base ────────────────────────────────────────────────────────
        // Stack: [10, 20, 30, 40, 50]  (10 = fondo, 50 = tope)
        // spliceStack(s, 1, 4) → extrae índices 1,2,3 → [20, 30, 40]
        // s queda: [10, 50]
        System.out.println("===== CASO BASE: splice(1, 4) =====");
        Stack<Integer> s1 = new Stack<>();
        s1.push(10); s1.push(20); s1.push(30); s1.push(40); s1.push(50);
        System.out.println("Stack original: " + s1);

        Stack<Integer> spliced1 = spliceStack(s1, 1, 4);
        System.out.println("Stack extraído: " + spliced1); // [20, 30, 40]
        System.out.println("Stack restante: " + s1);       // [10, 50]

        System.out.println();

        // ── Extraer desde el fondo ───────────────────────────────────────────
        // splice(0, 2) → extrae [10, 20], s queda [30, 40, 50]
        System.out.println("===== DESDE EL FONDO: splice(0, 2) =====");
        Stack<Integer> s2 = new Stack<>();
        s2.push(10); s2.push(20); s2.push(30); s2.push(40); s2.push(50);
        System.out.println("Stack original: " + s2);

        Stack<Integer> spliced2 = spliceStack(s2, 0, 2);
        System.out.println("Stack extraído: " + spliced2); // [10, 20]
        System.out.println("Stack restante: " + s2);       // [30, 40, 50]

        System.out.println();

        // ── Extraer hasta el tope ────────────────────────────────────────────
        // splice(3, 5) → extrae [40, 50], s queda [10, 20, 30]
        System.out.println("===== HASTA EL TOPE: splice(3, 5) =====");
        Stack<Integer> s3 = new Stack<>();
        s3.push(10); s3.push(20); s3.push(30); s3.push(40); s3.push(50);
        System.out.println("Stack original: " + s3);

        Stack<Integer> spliced3 = spliceStack(s3, 3, 5);
        System.out.println("Stack extraído: " + spliced3); // [40, 50]
        System.out.println("Stack restante: " + s3);       // [10, 20, 30]
    }


    static Stack<Integer> spliceStack(Stack<Integer> s, int i, int j) {
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> spliced = new Stack<>();
        Stack<Integer> remaining = new Stack<>();

        int size = s.size();

        while (!s.isEmpty()) {
            temp.push(s.pop());
        }

        for (int k = 0; k < size; k++) {
            int elem = temp.pop();
            if (k >= i && k < j) {
                spliced.push(elem);
            } else {
                remaining.push(elem);
            }
        }

        while (!remaining.isEmpty()) {
            s.push(remaining.pop());
        }

        return spliced;
    }
}
