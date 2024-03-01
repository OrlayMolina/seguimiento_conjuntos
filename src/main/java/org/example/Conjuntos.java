package org.example;

import java.util.*;

public class Conjuntos <E extends Comparable <E>> implements Iterable<E>{

    List<E> listaElementos;

    public Conjuntos(){
        this.listaElementos = new ArrayList<>();
    }

    public void agregarElemento(E element) {
        listaElementos.add(element);
    }

    public void unirDosListas(Conjuntos<E> lista1){
        for (E elemento : lista1) {
            listaElementos.add(elemento);
        }

    }

    public void imprimirElementos() {
        for (E elemento : listaElementos) {
            System.out.print(elemento + " ");
        }
    }

    public boolean verificarSiExiste(Conjuntos<E> conjunto) {
        for (E elemento : conjunto) {
            if (!listaElementos.contains(elemento)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return new ConjuntoIterator<>(listaElementos);
    }
}
