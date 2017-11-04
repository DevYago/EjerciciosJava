/*
 * Ejercicio donde se define un array de 10 enteros. Luego pedimos al usuario que
 * ingrese valores numéricos (no mas de diez) y los guardamos en el array
 * por ultimo, recorremo el array para mostrar su contenido.
 */
package ejercios.basicos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesús González
 */
public class SolicitaNumerosArray {

    public static void main(String[] args) {
        String str = "";
        int contador = 0;//Variable contador que nos va permitir controlar las iteraciones
        int valorNumero = 0; //Variable que almacena el valor ingresador por teclado
        int[] arreglo = new int[10];//Definimo arreglo de 10 dimensiones.
        //Leemos dato introducido por teclado mediante JOptionPane Que es una clase
        // que nos permite que provee una serie de ventanas de dialogo predefinidos

        valorNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor (0-> Fin)"));

        //Mientras que valorNumero sea distinto de Cero y menos que 10
        while (valorNumero != 0 && contador < 10) {
            //Asignamos el valorNumero en arreglo[contador] y luego incrementado el valor de contador
            arreglo[contador++] = valorNumero;
            //Leemos el siguiente valor
            valorNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor (0-> Fin)"));
        }
        //Reccorido del Array Almacenando su contenido en una variable
        for (int i = 0; i < contador; i++) {
            //Alamacenamos en una variable los datos almacenados en el arreglo
            str = str + "Arreglo [" + i + "]  [" + arreglo[i] + "]\n";

        }
        //Mostramos los datos almacenados
        JOptionPane.showMessageDialog(null, str);
    }

}
