/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class collectioncollections{
    public static void main(String[] args) {
        // Crear una colección de tipo ArrayList
        Collection<String> coleccion = new ArrayList<>();
                // Añadir elementos a la colección
        coleccion.add("Pizza");
        coleccion.add("Hamburguesa");
        coleccion.add("Ensalada");
                // Mostrar todos los elementos de la colección
        System.out.println("Elementos en la colección:");
        for (String element : coleccion) {
            System.out.println(element);
        }
                // Convertir la colección a una lista para usar los métodos de Collections
        List<String> lista = new ArrayList<>(coleccion);
                // Ordenar la lista
        Collections.sort(lista);
        System.out.println("\nLista ordenada:");
        for (String element : lista) {
            System.out.println(element);
        }
                // Invertir la lista
        Collections.reverse(lista);
        System.out.println("\nLista invertida:");
        for (String element : lista) {
            System.out.println(element);
        }
                // Mezclar la lista
        Collections.shuffle(lista);
        System.out.println("\nLista mezclada:");
        for (String element : lista) {
            System.out.println(element);
        }
    }
}
