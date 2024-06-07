/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;
import java.util.SortedSet;
import java.util.TreeSet;
public class sortedset {
    public static void main(String[] args) {
        // Crear un conjunto de tipo TreeSet para almacenar animales de granja
        SortedSet<String> granja = new TreeSet<>();
                // Añadir animales al conjunto
        granja.add("Vaca");
        granja.add("Gallina");
        granja.add("Caballo");
        granja.add("Cerdo");
        granja.add("Oveja");
                // Mostrar los animales del conjunto
        System.out.println("Animales en la granja (ordenados): " + granja);
                // Obtener y mostrar el primer (más bajo) y el último (más alto) animal
        String masBajo = granja.first();
        String masAlto = granja.last();
        System.out.println("Primer animal (ordenado): " + masBajo);
        System.out.println("Último animal (ordenado): " + masAlto);
                // Obtener un subconjunto de animales que son menores que "Oveja"
        SortedSet<String> menor = granja.headSet("Oveja");
        System.out.println("Animales antes de 'Oveja': " + menor);
                // Obtener un subconjunto de animales que son mayores o iguales a "Gallina"
        SortedSet<String> mayor = granja.tailSet("Gallina");
        System.out.println("Animales desde 'Gallina' en adelante: " + mayor);
                // Obtener un subconjunto de animales entre "Gallina" (inclusive) y "Vaca" (exclusivo)
        SortedSet<String> intermedio = granja.subSet("Gallina", "Vaca");
        System.out.println("Animales entre 'Gallina' y 'Vaca': " + intermedio);
    }
}

