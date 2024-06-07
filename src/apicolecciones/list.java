/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;
import java.util.List;
import java.util.ArrayList;
public class list {
    public static void main(String[] args) {
        // Crear una lista de tipo ArrayList
        List<String> lista = new ArrayList<>();
                // Añadir elementos a la lista
        lista.add("Maiz");
        lista.add("Garbanzo");
        lista.add("Arveja");
                // Obtener y mostrar un elemento usando su índice
        String nombre = lista.get(1);
        System.out.println("Elemento en el indice 1: " + nombre);
                // Reemplazar un elemento en una posición específica
        lista.set(1, "Lenteja");
        System.out.println("Lista despues de reemplazar el indice 1: " + lista);
                // Eliminar un elemento usando su índice
        lista.remove(2);
        System.out.println("Lista despues de eliminar el indice 2: " + lista);
                // Insertar un elemento en una posición específica
        lista.add(1, "Frijol");
        System.out.println("Lista despues de insertar en el indice 1: " + lista);
                // Recorrer y mostrar todos los elementos de la lista
        System.out.println("Elementos en la lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}

