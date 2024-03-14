package org.example.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Conjuntos<E> implements Iterable<E> {

    private HashSet<E> conjuntoElementos;

    public Conjuntos() {
        this.conjuntoElementos = new HashSet<>();
    }

    public void agregarElemento(E element) {
        conjuntoElementos.add(element);
    }

    public void unirDosConjuntos(Conjuntos<E> conjunto) {
        conjuntoElementos.addAll(conjunto.getConjuntoElementos());
    }

    public void imprimirElementos() {
        for (E elemento : conjuntoElementos) {
            System.out.print(elemento + " ");
        }
    }

    public boolean verificarSiExiste(Conjuntos<E> conjunto) {
        return conjuntoElementos.containsAll(conjunto.getConjuntoElementos());
    }

    public HashSet<E> getConjuntoElementos() {
        return conjuntoElementos;
    }

    @Override
    public Iterator<E> iterator() {
        return conjuntoElementos.iterator();
    }
}

