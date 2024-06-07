/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;

import java.util.HashSet;
import java.util.Set;
public class set {
    public static void main(String[] args) {
        // Crear un conjunto de tipo HashSet para almacenar animales de granja
        Set<String> granja = new HashSet<>();
                // Añadir animales al conjunto
        granja.add("Vaca");
        granja.add("Gallina");
        granja.add("Caballo");
        granja.add("Cerdo");
        granja.add("Oveja");
                // Intentar añadir un duplicado
        boolean wasAdded = granja.add("Vaca"); // Esto no tendrá efecto, ya que "Vaca" ya está en el conjunto
                // Mostrar los animales del conjunto
        System.out.println("Animales en la granja: " + granja);
                // Verificar si un animal está en el conjunto
        boolean tieneGallina = granja.contains("Gallina");
        System.out.println("¿Hay 'Gallina'? " + tieneGallina);
                // Eliminar un animal del conjunto
        granja.remove("Cerdo");
        System.out.println("Lista despues de eliminar 'Cerdo': " + granja);
                // Obtener el tamaño del conjunto
        int size = granja.size();
        System.out.println("Tamaño del conjunto: " + size);
                // Recorrer y mostrar todos los animales del conjunto
        System.out.println("Animales en la granja:");
        for (String animal : granja) {
            System.out.println(animal);
        }
        System.out.println(System.getProperty("file.encoding"));
    }
}

