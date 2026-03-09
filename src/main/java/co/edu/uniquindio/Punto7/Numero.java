package co.edu.uniquindio.Punto7;

public class Numero implements Comparador<Integer>{

    @Override
    public int comparar(Integer a, Integer b) {
        return a - b;
    }
}
