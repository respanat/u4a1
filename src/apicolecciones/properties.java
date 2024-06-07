/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;

import java.util.Properties;
import java.util.Enumeration;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class properties {
    public static void main(String[] args) {
        // Crear una instancia de Properties
        Properties properties = new Properties();
        // Establecer propiedades
        properties.setProperty("usuario", "admin");
        properties.setProperty("contraseña", "12345");
        properties.setProperty("database", "DB1");
        // Guardar propiedades en un archivo
        try (FileOutputStream out = new FileOutputStream("config.properties")) {
            properties.store(out, "Configuraciones de la aplicación");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Crear una nueva instancia de Properties para cargar las propiedades
        Properties loadedProperties = new Properties();
        try (FileInputStream in = new FileInputStream("config.properties")) {
            loadedProperties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Obtener y mostrar las propiedades cargadas
        System.out.println("Usuario: " + loadedProperties.getProperty("usuario"));
        System.out.println("Contraseña: " + loadedProperties.getProperty("contraseña"));
        System.out.println("Database: " + loadedProperties.getProperty("database"));
        // Enumerar y mostrar todas las propiedades cargadas
        Enumeration<?> propertyNames = loadedProperties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String key = (String) propertyNames.nextElement();
            String value = loadedProperties.getProperty(key);
            System.out.println(key + ": " + value);
        }
    }
}

