package org.example.Tree.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Conjuntos<E extends Comparable<E>> implements Iterable<E> {

    private TreeSet<E> conjuntoElementos;

    public Conjuntos() {
        this.conjuntoElementos = new TreeSet<>();
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

    public TreeSet<E> getConjuntoElementos() {
        return conjuntoElementos;
    }

    @Override
    public Iterator<E> iterator() {
        return conjuntoElementos.iterator();
    }
}

