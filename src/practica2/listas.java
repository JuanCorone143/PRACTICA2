
package practica2;

import controlador.listas.ListaEnlazada;
import controller.ed.listaEnlazada.exception.EmptyException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class listas {
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
            List<Integer> numeros = generarNumerosAleatorios(1000); // Genera una lista de 1000 números aleatorios
            int suma = sumarLista(numeros); // Calcula la suma de la lista

            // Imprime la suma de la lista
            System.out.println("La suma de la lista es: " + suma);
        }
        scanner.next();
       // scanner.close();
    }

    // Genera una lista de números aleatorios
    public static List<Integer> generarNumerosAleatorios(int longitud) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            numeros.add(random.nextInt(100)); // Agrega un número aleatorio entre 0 y 99 a la lista
        }

        return numeros;
    }

    // Calcula la suma de una lista de números
    public static int sumarLista(List<Integer> numeros) {
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }
}

