/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;

import java.util.Scanner;

/**
 *
 * @author Nixon
 */
public class problema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        double num;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("Ingrese el valor que se guardara en la "
                        + "posicion: [%s] [%s]\n", i, j);
                num = entrada.nextDouble();
                datos[i][j] = num;
            }
        }
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("El valor %s esta en la posicion; [%s][%s]"
                        + "\n", datos[i][j], i, j);
            }
        }
    }
}
