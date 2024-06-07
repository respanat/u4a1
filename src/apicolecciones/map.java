/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;
import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args) {
        // Crear un mapa de tipo HashMap para asociar animales de granja con sus sonidos
        Map<String, String> granjasonora = new HashMap<>();
                // Añadir animales y sus sonidos al mapa
        granjasonora.put("Vaca", "Muuu");
        granjasonora.put("Gallina", "Cloc");
        granjasonora.put("Caballo", "Hiiii");
        granjasonora.put("Cerdo", "Oinc");
        granjasonora.put("Oveja", "Beee");
                // Mostrar los animales y sus sonidos
        System.out.println("Animales en la granja y sus sonidos:");
        for (Map.Entry<String, String> entry : granjasonora.entrySet()) {
            System.out.println(entry.getKey() + " hace " + entry.getValue());
        }
                // Obtener y mostrar el sonido de un animal específico
        String sonidoCaballo = granjasonora.get("Caballo");
        System.out.println("El Caballo hace: " + sonidoCaballo);
                // Verificar si un animal específico está en el mapa
        boolean tieneGallina = granjasonora.containsKey("Gallina");
        System.out.println("¿La granja tiene una Gallina? " + tieneGallina);
                // Eliminar un animal del mapa
        granjasonora.remove("Cerdo");
        System.out.println("Lista después de eliminar 'Cerdo': " + granjasonora);
                // Obtener el tamaño del mapa
        int size = granjasonora.size();
        System.out.println("Tamaño del mapa: " + size);
    }
}
