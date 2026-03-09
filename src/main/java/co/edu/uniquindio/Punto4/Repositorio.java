package co.edu.uniquindio.Punto4;

import java.util.ArrayList;
import java.util.Iterator;

public class Repositorio<T> implements Iterable<T>{
    ArrayList<T> lista;

    public Repositorio() {
        lista = new ArrayList<>();
    }

    public void agregar(T t) {
        lista.add(t);
    }

    public T get(int i){
        return lista.get(i);
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }

    public Iterator<T> iteratorInverso(){
        return new RepositorioIterator<T>(lista);
    }
}
