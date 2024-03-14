package org.example.Map.Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Conjuntos<E extends Comparable<E>> implements Iterable<Map.Entry<E, Integer>> {

    private HashMap<E, Integer> conjuntoElementos;

    public Conjuntos() {
        this.conjuntoElementos = new HashMap<>();
    }

    public void agregarElemento(E element, Integer value) {
        conjuntoElementos.put(element, value);
    }

    public void unirDosConjuntos(Conjuntos<E> conjunto) {
        conjuntoElementos.putAll(conjunto.getConjuntoElementos());
    }

    public void imprimirElementos() {
        for (Map.Entry<E, Integer> entry : conjuntoElementos.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
    }

    public boolean verificarSiExiste(Conjuntos<E> conjunto) {
        for (E elemento : conjunto.getConjuntoElementos().keySet()) {
            if (!conjuntoElementos.containsKey(elemento)) {
                return false;
            }
        }
        return true;
    }


    public HashMap<E, Integer> getConjuntoElementos() {
        return conjuntoElementos;
    }

    @Override
    public Iterator<Map.Entry<E, Integer>> iterator() {
        return conjuntoElementos.entrySet().iterator();
    }
}
