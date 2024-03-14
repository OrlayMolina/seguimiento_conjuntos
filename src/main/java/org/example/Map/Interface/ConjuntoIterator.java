package org.example.Map.Interface;

import java.util.Iterator;
import java.util.Map;

public class ConjuntoIterator<E extends Comparable<E>> implements Iterator<Map.Entry<E, Integer>> {

    private Iterator<Map.Entry<E, Integer>> iterator;

    public ConjuntoIterator(Conjuntos<E> conjunto) {
        this.iterator = conjunto.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Map.Entry<E, Integer> next() {
        return iterator.next();
    }
}
