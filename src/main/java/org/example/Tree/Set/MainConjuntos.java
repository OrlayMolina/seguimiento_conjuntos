package org.example.Tree.Set;

public class MainConjuntos {
    public static void main(String[] args) {
        Conjuntos<String> conjunto1 = new Conjuntos<>();
        conjunto1.agregarElemento("Juan");
        conjunto1.agregarElemento("Maria");
        conjunto1.agregarElemento("Roberto");

        System.out.println("Lista de elementos:");
        conjunto1.imprimirElementos();

        System.out.println("\nUnir dos conjuntos:");
        Conjuntos<String> conjunto2 = new Conjuntos<>();
        conjunto2.agregarElemento("Yarley");
        conjunto2.agregarElemento("Daniela");
        conjunto1.unirDosConjuntos(conjunto2);
        conjunto1.imprimirElementos();

        System.out.println("\nVerificar si existe elemento:");
        Conjuntos<String> conjunto3 = new Conjuntos<>();
        conjunto3.agregarElemento("Yarley");
        conjunto3.agregarElemento("Daniela");
        if (conjunto1.verificarSiExiste(conjunto3)) {
            System.out.println("Está en el conjunto.");
        } else {
            System.out.println("No está en el conjunto.");
        }
    }
}
