/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
public class dictionary {
    public static void main(String[] args) {
        // Crear un diccionario utilizando Hashtable, que es una implementación de Dictionary
        Dictionary<String, String> dict = new Hashtable<>();
        // Agregar pares clave-valor al diccionario
        dict.put("nombre", "Platón");
        dict.put("edad", "25");
        dict.put("ciudad", "Madrid");

        // Obtener y mostrar un valor usando una clave
        String nombre = dict.get("nombre");
        System.out.println("Nombre: " + nombre);
        // Eliminar un par clave-valor
        dict.remove("edad");
        // Mostrar todas las claves y valores restantes
        Enumeration<String> keys = dict.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = dict.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
