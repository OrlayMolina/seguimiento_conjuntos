package org.example.Tree.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ConjuntoIterator<E extends Comparable<E>> implements Iterator<E> {

    private Iterator<E> iterator;

    public ConjuntoIterator(Conjuntos<E> conjunto) {
        this.iterator = conjunto.iterator();
    }

    public ConjuntoIterator(TreeSet<E> conjuntoElementos) {
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
