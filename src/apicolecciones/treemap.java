/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;
import java.util.TreeMap;
import java.util.Map;
public class treemap {
    public static void main(String[] args) {
        // Crear un mapa de tipo TreeMap para asociar animales de granja con sus alimentos
        TreeMap<String, String> granjacomida = new TreeMap<>();
                // Añadir animales y sus alimentos al mapa
        granjacomida.put("Vaca", "Hierba");
        granjacomida.put("Gallina", "Granos");
        granjacomida.put("Caballo", "Heno");
        granjacomida.put("Cerdo", "Maiz");
        granjacomida.put("Oveja", "Pasto");
                // Mostrar los animales y sus alimentos en orden
        System.out.println("Animales en la granja y sus alimentos (ordenados por clave):");
        for (Map.Entry<String, String> entry : granjacomida.entrySet()) {
            System.out.println(entry.getKey() + " come " + entry.getValue());
        }
                // Obtener y mostrar el alimento de un animal específico
        String comidaCaballo = granjacomida.get("Caballo");
        System.out.println("El Caballo come: " + comidaCaballo);
                // Verificar si un animal específico está en el mapa
        boolean tieneGallina = granjacomida.containsKey("Gallina");
        System.out.println("La granja tiene una Gallina? " + tieneGallina);
                // Eliminar un animal del mapa
        granjacomida.remove("Cerdo");
        System.out.println("Lista despues de eliminar 'Cerdo': " + granjacomida);
                // Obtener el tamaño del mapa
        int size = granjacomida.size();
        System.out.println("Tamaño del mapa: " + size);
                // Mostrar la primera y la última clave en el mapa
        String primerAnimal = granjacomida.firstKey();
        String ultimoAnimal = granjacomida.lastKey();
        System.out.println("El primer animal en el mapa es: " + primerAnimal);
        System.out.println("El último animal en el mapa es: " + ultimoAnimal);
    }
}

