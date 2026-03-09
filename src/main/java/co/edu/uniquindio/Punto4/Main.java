package co.edu.uniquindio.Punto4;

import java.util.Iterator;

//Implemente una clase genérica Repositorio<T> que utilice un List<T> interno para
// almacenar objetos. Debe tener los métodos:
//		void agregar(T elemento)
//		T obtener(int indice)
//		Iterator<T> iterator()
//	Haga que Repositorio<T> se pueda recorrer con for-each.  Implemente
//	además un nuevo mecanismo personalizado que recorra la  lista de atrás hacia adelante.

public class Main {
    public static void main(String[] args) {

        Repositorio<String> repo = new Repositorio<>();

        repo.agregar("Primero");
        repo.agregar("Segundo");
        repo.agregar("Tercero");
        repo.agregar("Cuarto");

        // ── obtener por índice ───────────────────────────────────────────────
        System.out.println("===== OBTENER POR ÍNDICE =====");
        System.out.println("Índice 0: " + repo.get(0));
        System.out.println("Índice 2: " + repo.get(2));

        System.out.println();

        // ── for-each normal (adelante → atrás) ──────────────────────────────
        System.out.println("===== FOR-EACH NORMAL =====");
        for (String s : repo) {
            System.out.println(s);
        }

        System.out.println();

        // ── recorrido inverso (atrás → adelante) ────────────────────────────
        System.out.println("===== RECORRIDO INVERSO =====");
        for (Iterator<String> it = repo.iteratorInverso(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
