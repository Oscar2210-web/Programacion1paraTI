/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author Oscar
 */
public class PruebaPanelDibujo {

    // Crear un objeto JFrame para mostrar un objeto PanelDibujo.
    import javax.swing.JFrame ;

    public class PruebaPanelDibujo {

        public static void main(String[] args) {
            // crea un panel que contiene nuestro dibujo
            PanelDibujo panel = new PanelDibujo();

            // crea un nuevo marco para contener el panel
            JFrame aplicacion = new JFrame();

            // establece el marco para salir cuando se cierre
            aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            aplicacion.add(panel); // agrega el panel al marco
            aplicacion.setSize(250, 250); // establece el tamaño del marco
            aplicacion.setVisible(true); // hace que el marco sea visible
        }
    } // fin de la clase PruebaPanelDibujo
