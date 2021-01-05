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
public class problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vendedores = {"Jessica cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        int dia;
        double ingresos;
        double suma = 0;
        for (int i = 0; i < ventas.length; i++) {
            dia = 0;
            for (int j = 0; j < 5; j++) {
                dia = dia + 1;
                System.out.printf("Ingrese las ventas de: %s del dia"
                        + " %d\n", vendedores[i], dia);
                ingresos = entrada.nextDouble();
                ventas[i][j] = ingresos;
                suma = suma + ventas[i][j];
            }
        }
        System.out.printf("Vendedor(a) %s\nVendedor(a) %s\nHa realizado un "
                + "total de %.2f en ventas.\n",
                vendedores[0], vendedores[1], suma);
    }
}
