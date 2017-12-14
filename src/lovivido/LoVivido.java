/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 * Este programa calculara los meses, dias y horas que ha vivido una persona que 
 * se introduce por pantalla.
 * @author ldizbarros
 */

public class LoVivido {
/**
 * Funcion main del programa
 * @param args argumentos del metodo main
 */
    public static void main(String[] args) {
        /**
         * Creamos las variables nombre y edad que guardaran dichos datos 
         * de la persona que pedimos por pantalla
         */
        String nombre,edad;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");
        
        /**
         * Instanciamos un objeto de la clase Claculos para calcular lo que ha 
         * vivido la persona.
         */
        Calculos primerCalculo = new Calculos();
        
        /**
         * Llamamos a la funcion calcularLoVivido y le pasamos el nombre y la edad
         * de la persona
         */
        primerCalculo.calcularLoVivido(nombre, edad);
    }

}