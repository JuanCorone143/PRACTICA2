/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class Arreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de ejecuciones (máximo 100): ");
        int ejecuciones = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (ejecuciones > 100) {
            ejecuciones = 100;
            System.out.println("El número de ejecuciones se ha limitado a 100.");
        }

        for (int i = 0; i < ejecuciones; i++) {
            int[] numeros = generarNumerosAleatorios(1000); // Genera un arreglo de 1000 números aleatorios
            int suma = sumarArreglo(numeros); // Calcula la suma del arreglo

            // Imprime la suma del arreglo
            System.out.println("La suma del arreglo es: " + suma);
        }
        scanner.next();

        //scanner.close();
    }

    // Genera un arreglo de números aleatorios
    public static int[] generarNumerosAleatorios(int longitud) {
        int[] numeros = new int[longitud];
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            numeros[i] = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
        }

        return numeros;
    }

    // Calcula la suma de un arreglo de números
    public static int sumarArreglo(int[] numeros) {
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }
    
}
