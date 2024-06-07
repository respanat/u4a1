/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;

import java.util.Vector;
import java.util.Enumeration;

public class enumeration{
    public static void main(String[] args) {
        // Crear una instancia de Vector y agregar elementos
        Vector<String> vector = new Vector<>();
        vector.add("Gato");
        vector.add("Tigre");
        vector.add("León");

        // Obtener una enumeración del vector
        Enumeration<String> enumeration = vector.elements();

        // Usar la enumeración para recorrer y mostrar los elementos
        System.out.println("Elementos en el vector:");
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element);
        }
    }
}

