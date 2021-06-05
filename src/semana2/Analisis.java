/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Analisis {

    public static void main(String[] args) {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        // inicialización de las variables en declaraciones
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;

        // procesa 10 estudiantes, usando ciclo controlado por contador
        while (contadorEstudiantes <= 10) {
            // pide al usuario la entrada y obtiene el valor
            System.out.print("Escriba el resultado(1 = aprobado, 2 = reprobado): ");
            int resultado = entrada.nextInt();

            // if...else anidado en la instrucción while
            if (resultado == 1) {
                aprobados = aprobados + 1;
            } else 
                reprobados = 1 + reprobados 
            // incrementa contadorEstudiantes, para que el ciclo termie en un momento dado
            contadorEstudiantes = contadorEstudiantes + 1;
        }

        // fase de terminación; prepara y muestra los resultados
        System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);

        // determina si más de 8 estudiantes aprobaron
        if (aprobados > 8) {
            System.out.println("Bono para el instructor!" );
        
        }
        
} //fin de la clase Analisis