/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;

import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args) {
        // Crear una lista de tipo LinkedList para almacenar datos
        LinkedList<String> granja = new LinkedList<>();
                // Añadir datos a la lista
        granja.add("Vaca");
        granja.add("Gallina");
        granja.add("Caballo");
                // Mostrar los datos de la lista
        System.out.println("Animales en la granja: " + granja);
                // Obtener y mostrar un dato usando su índice
        String granjaP = granja.get(1);
        System.out.println("Animal en el indice 1: " + granjaP);
        // Reemplazar un dato en una posición específica
        granja.set(1, "Oveja");
        System.out.println("Lista despues de reemplazar el indice 1: " + granja);
                // Eliminar un dato usando su índice
        granja.remove(2);
        System.out.println("Lista despues de eliminar el indice 2: " + granja);
                // Insertar un dato al inicio de la lista
        granja.addFirst("Cerdo");
        System.out.println("Lista despues de añadir 'Cerdo' al inicio: " + granja);
                // Insertar un dato al final de la lista
        granja.addLast("Pato");
        System.out.println("Lista despues de añadir 'Pato' al final: " + granja);
                // Obtener y mostrar el primer dato
        String granjaP1 = granja.getFirst();
        System.out.println("Primer animal de la lista: " + granjaP1);
                // Obtener y mostrar el último dato
        String granjaU = granja.getLast();
        System.out.println("Último animal de la lista: " + granjaU);
        // Recorrer y mostrar todos los datos de la lista
        System.out.println("Animales en la granja:");
        for (String animales : granja) {
            System.out.println(animales);
        }
                // Comprobar si la lista contiene un dato específico
        boolean tieneVaca = granja.contains("Vaca");
        System.out.println("¿Contiene 'Vaca'? " + tieneVaca);
                // Obtener el tamaño de la lista
        int size = granja.size();
        System.out.println("Tamaño de la lista: " + size);
    }
}