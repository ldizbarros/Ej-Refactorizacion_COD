
package lovivido;

import javax.swing.JOptionPane;
/**
 * Clase que contiene funciones donde se realizan diversos calculos
 * @author ldizbarros
 */
public class Calculos {
    /**
     * En esta funcion se calculan los meses, dias y horas que vive una persona
     * cuyo nombre y edad pasamos por parametro
     * @param nombre nombre de la persona de la que calcularemos lo vivido
     * @param edad edad de la persona introducida
     */
    public void calcularLoVivido(String nombre, String edad){
        int meses,dias,horas,años;
        
        años = Integer.parseInt(edad);
        
        meses = (años * 12);
        dias = (años * 365);
        horas = (dias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}

