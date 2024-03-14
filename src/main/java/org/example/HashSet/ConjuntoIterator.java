package org.example.HashSet;

import java.util.Iterator;
import java.util.Set;

public class ConjuntoIterator<E> implements Iterator<E> {

    private Iterator<E> iterator;

    public ConjuntoIterator(Conjuntos<E> conjunto) {
        this.iterator = conjunto.iterator();
    }

    public ConjuntoIterator(Set<E> conjuntoElementos) {
        this.iterator = conjuntoElementos.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public E next() {
        return iterator.next();
    }
}
