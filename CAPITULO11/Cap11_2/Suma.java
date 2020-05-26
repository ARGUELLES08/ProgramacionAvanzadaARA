package CAPITULO11.Cap11_2;
//Programa de suma que utiliza a JOptionPane para entrada y salida.
import javax.swing.JOptionPane; //el programa usa JOptionPane

public class Suma
{
    public static void main (String args[])
    {
        //obtiene la entrada del usuario de los dialogos de entrada de JOptionPane
        String primerNumero =
            JOptionPane.showInputDialog ("Introduzca el primer entero");
        String segundoNumero = 
            JOptionPane.showInputDialog ("Introduzca el segundo entero");
        
        //convierte las entradas String en valores int para usarlos en un cálculo
        int numero1 = Integer.parseInt (primerNumero);
        int numero2 = Integer.parseInt( segundoNumero);

        int suma = numero1 + numero2; //suma de numeros
        //muestra los resultados en un dialogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog( null, "La suma es " + suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);


    } //fin del método main
} //fin de la clase suma