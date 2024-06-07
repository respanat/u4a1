/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        // Crear una lista de tipo ArrayList
        ArrayList<String> listarray = new ArrayList<>();
                // Añadir elementos a la lista
        listarray.add("Perro");
        listarray.add("Gato");
        listarray.add("Rata");
                // Mostrar los elementos de la lista
        System.out.println("Elementos en la lista: " + listarray);
                // Obtener y mostrar un elemento usando su índice
        String nombre = listarray.get(1);
        System.out.println("Elemento en el indice 1: " + nombre);
                // Reemplazar un elemento en una posición específica
        listarray.set(1, "Vaca");
        System.out.println("Lista despues de reemplazar el indice 1: " + listarray);
                // Eliminar un elemento usando su índice
        listarray.remove(2);
        System.out.println("Lista despues de eliminar el indice 2: " + listarray);
                // Insertar un elemento en una posición específica
        listarray.add(1, "Pato");
        System.out.println("Lista despues de insertar en el indice 1: " + listarray);
                // Recorrer y mostrar todos los elementos de la lista
        System.out.println("Elementos en la lista:");
        for (String element : listarray) {
            System.out.println(element);
        }
                // Comprobar si la lista contiene un elemento específico
        boolean contienePerro = listarray.contains("Perro");
        System.out.println("Contiene 'Perro'? " + contienePerro);
                // Obtener el tamaño de la lista
        int size = listarray.size();
        System.out.println("Tamaño de la lista: " + size);
    }
}
