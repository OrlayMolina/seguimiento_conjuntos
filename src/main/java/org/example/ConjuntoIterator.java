package org.example;

import java.util.Iterator;
import java.util.List;

public class ConjuntoIterator<E> implements Iterator<E> {

    private List<E> listaConjuntos;
    private int puntero;

    public ConjuntoIterator(List<E> listaConjuntos){
        this.listaConjuntos = listaConjuntos;
        this.puntero = 0;
    }

    @Override
    public boolean hasNext() {
        return puntero < listaConjuntos.size();
    }

    @Override
    public E next() {
        E next = listaConjuntos.get(puntero);
        puntero++;
        return next;
    }
}
