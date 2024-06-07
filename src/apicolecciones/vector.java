/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;

import java.util.Vector;
import java.util.Enumeration;
public class vector {
    public static void main(String[] args) {
        // Crear una instancia de Vector
        Vector<String> vector = new Vector<>();
        // Añadir elementos al vector
        vector.add("Juan");
        vector.add("María");
        vector.add("Pedro");
        // Obtener y mostrar un elemento usando su índice
        String nombre = vector.get(0);
        System.out.println("Elemento 1: " + nombre);
        // Eliminar un elemento usando su índice
        vector.remove(1); // Elimina "María"
        // Enumerar y mostrar todos los elementos restantes
        Enumeration<String> elements = vector.elements();
        while (elements.hasMoreElements()) {
            String elemento = elements.nextElement();
            System.out.println("Elemento: " + elemento);
        }
        // Verificar si el vector contiene un elemento específico
        boolean containsPedro = vector.contains("Pedro");
        System.out.println("Contiene 'Pedro': " + containsPedro);
        // Mostrar el tamaño del vector
        int size = vector.size();
        System.out.println("Tamaño Vector: " + size);
    }
}
