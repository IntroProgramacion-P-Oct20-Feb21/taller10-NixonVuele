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
public class problema5 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"}, {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};
        String inicial;
        String cadenaFinal = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                inicial = estudiantes[i][j].substring(0, 1);
                if (inicial.equals("S") || (inicial.equals("P"))
                        || (inicial.equals("T"))) {
                    cadenaFinal = String.format("%s%s\n", cadenaFinal,
                            estudiantes[i][j]);
                }
            }
        }
        System.out.printf("Los estudiantes con la inicial S,P O T son:\n%s",
                cadenaFinal);
    }
}
