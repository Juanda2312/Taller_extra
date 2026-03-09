package co.edu.uniquindio.Punto7;

public class Cadena implements Comparador<String>{

    @Override
    public int comparar(String a, String b) {
        return a.compareTo(b);
    }
}
