/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;

/**
 *
 * @author Nixon
 */
public class problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables y se llena el arreglo estudiantes y la matriz
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        double[] promedio = new double[notas.length];
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double suma;
        System.out.println("");
        for (int i = 0; i < notas.length; i++) {
            suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma = suma + notas[i][j];
            }
            promedio[i] = suma / notas[i].length;
            System.out.printf("Estudiante: %s tiene un promedio de: %.2f \n",
                    estudiantes[i], promedio[i]);
        }
    }
}
