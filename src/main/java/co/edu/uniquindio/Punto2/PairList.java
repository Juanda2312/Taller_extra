package co.edu.uniquindio.Punto2;

import java.util.ArrayList;

public class PairList <K,V>{
    ArrayList<Pair<K,V>> pairs;

    public PairList() {
        pairs = new ArrayList<>();
    }

    public void add(K key, V value) {
        pairs.add(new Pair<>(key, value));
    }

    public void remove(K key) {
        pairs.removeIf(pair -> pair.getKey().equals(key));
    }

    public V get(K key) {
        return pairs.stream().filter(pair -> pair.getKey().equals(key)).findFirst().map(Pair::getValue).orElse(null);
    }

}
