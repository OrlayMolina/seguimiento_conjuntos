package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class MainConjuntos
{
    public static void main( String[] args )
    {
        Conjuntos<String> listaConjuntos1 = new Conjuntos<>();
        listaConjuntos1.agregarElemento("Juan");
        listaConjuntos1.agregarElemento("Maria");
        listaConjuntos1.agregarElemento("Roberto");

        ConjuntoIterator<String> conjuntoIterator = (ConjuntoIterator<String>) listaConjuntos1.iterator();

        System.out.println("Lista de elementos");
        while(conjuntoIterator.hasNext()){
            System.out.print(conjuntoIterator.next() + " ");
        }

        System.out.println("\nUnir dos listas");

        Conjuntos<String> listaConjuntos2 = new Conjuntos<>();
        listaConjuntos2.agregarElemento("Yarley");
        listaConjuntos2.agregarElemento("Daniela");
        listaConjuntos1.unirDosListas(listaConjuntos2);
        listaConjuntos1.imprimirElementos();

        System.out.println("\nVerificar si existe elemento");
        Conjuntos<String> listaConjuntos3 = new Conjuntos<>();
        listaConjuntos3.agregarElemento("Yarley");
        listaConjuntos3.agregarElemento("Daniela");
        if(listaConjuntos1.verificarSiExiste(listaConjuntos3)){
            System.out.println("Esta en la lista de conjuntos");
        }else {
            System.out.println("No esta en la lista de conjuntos");
        }



    }
}
