package co.edu.uniquindio.Punto4;

import java.util.ArrayList;
import java.util.Iterator;

public class RepositorioIterator<T> implements Iterator {

    int i;
    ArrayList<T> lista;

    public RepositorioIterator(ArrayList<T> lista) {
        this.lista = lista;
        i = lista.size()-1;
    }

    @Override
    public boolean hasNext() {
       return i>=0;
    }

    @Override
    public Object next() {
        if (hasNext()){
            return lista.get(i--);
        }else{
            return null;
        }
    }
}
