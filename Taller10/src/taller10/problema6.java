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
public class problema6 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"}, {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};
        int caracteres;
        String cadenaFinal = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                caracteres = estudiantes[i][j].length();
                if (caracteres == 11) {
                    cadenaFinal = String.format("%s%s\n", cadenaFinal,
                            estudiantes[i][j]);
                }
            }
        }
        System.out.printf("Los estudiantes que tienen 11 caracteres"
                + "(contando el espacio en blanco como 1 caracter)son:\n%s",
                cadenaFinal);
    }
}
