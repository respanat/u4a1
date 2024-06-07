/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;

import java.util.Hashtable;
import java.util.Enumeration;
public class hashtable {
    public static void main(String[] args) {
        // Crear una instancia de Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Agregar pares clave-valor al hashtable
        hashtable.put("animal", "Perro");
        hashtable.put("raza", "Canchan");
        hashtable.put("pelaje", "Gris");
        // Obtener y mostrar un valor usando una clave
        String animal = hashtable.get("animal");
        System.out.println("Animal: " + animal);
        // Eliminar un par clave-valor
        hashtable.remove("pelaje");
        // Mostrar todas las claves y valores restantes
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = hashtable.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
