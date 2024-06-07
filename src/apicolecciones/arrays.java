/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;

import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        // Crear un arreglo de enteros
        int[] numeros = {5, 2, 8, 3, 1};
        // Ordenar el arreglo
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
        // Buscar un elemento en el arreglo ordenado
        int indice = Arrays.binarySearch(numeros, 3);
        System.out.println("Índice del elemento 3: " + indice);
        // Llenar el arreglo con un valor específico
        Arrays.fill(numeros, 9);
        System.out.println("Arreglo lleno de 9s: " + Arrays.toString(numeros));
        // Copiar el arreglo
        int[] numerosCopiados = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Arreglo copiado: " + Arrays.toString(numerosCopiados));
        // Comprobar si los dos arreglos son iguales
        boolean areEqual = Arrays.equals(numeros, numerosCopiados);
        System.out.println("¿Son iguales los arreglos? " + areEqual);
    }
}
