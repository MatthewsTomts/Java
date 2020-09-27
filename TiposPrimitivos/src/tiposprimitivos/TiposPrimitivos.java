/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Tokyo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nt = 8.5f; //float nt = (float) 8.5
        Scanner nome = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nom = nome.nextLine();
        System.out.print("Digite a sua nota: ");
        float nota = nome.nextFloat();
        System.out.println("A nota é: " + nt);
        System.out.printf("A nota de %s é: %.2f \n ", nom, nt);
        System.out.format("A nota de %s é: %.2f \n", nom, nota);
    }
    
}
