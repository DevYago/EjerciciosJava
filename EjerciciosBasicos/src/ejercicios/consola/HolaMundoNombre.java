/*
 * El siguiente programa pide al usuario que ingrese su nombre, lee el dato por
 * teclado y luego lo muestra por consola.   
 * 
 */
package ejercicios.consola;

import java.util.Scanner;

/**
 *
 * @author Jesús González
 */
public class HolaMundoNombre {

    /**
     * Metodo Principal Main que recibe como parametro un String
     *
     * @param args
     */
    public static void main(String[] args) {
        //Declaración de Variable de tipo Cadena.
        String nombre = "";

        //Instancia de la Clase Scanner para leer Datos por teclado
        Scanner entrada = new Scanner(System.in);

        //Mensaje en consola para el usuario
        System.out.print("Ingrese su nombre: ");

        //Leemos el valor introducido por teclado
        nombre = entrada.nextLine();

        //Mostramos un mensaje y luego concatenamos el valor leido
        System.out.println("Hola Mundo: " + nombre + " Bienvenido!!!");
    }

}
