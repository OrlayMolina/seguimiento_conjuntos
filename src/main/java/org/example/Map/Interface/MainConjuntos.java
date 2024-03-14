package org.example.Map.Interface;

public class MainConjuntos {
    public static void main(String[] args) {
        Conjuntos<String> conjunto1 = new Conjuntos<>();
        conjunto1.agregarElemento("Juan", 1);
        conjunto1.agregarElemento("Maria", 2);
        conjunto1.agregarElemento("Roberto", 3);

        System.out.println("Lista de elementos:");
        conjunto1.imprimirElementos();

        System.out.println("\nUnir dos conjuntos:");
        Conjuntos<String> conjunto2 = new Conjuntos<>();
        conjunto2.agregarElemento("Yarley", 4);
        conjunto2.agregarElemento("Daniela", 5);
        conjunto1.unirDosConjuntos(conjunto2);
        conjunto1.imprimirElementos();

        System.out.println("\nVerificar si existe elemento:");
        Conjuntos<String> conjunto3 = new Conjuntos<>();
        conjunto3.agregarElemento("Yarley", 4);
        conjunto3.agregarElemento("Daniela", 5);
        if (conjunto1.verificarSiExiste(conjunto3)) {
            System.out.println("Está en el conjunto.");
        } else {
            System.out.println("No está en el conjunto.");
        }
    }
}
