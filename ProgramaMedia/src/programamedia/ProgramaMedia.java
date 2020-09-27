/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Tokyo
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nt1 = tec.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nt2 = tec.nextFloat();
        float m = (nt1 + nt2) / 2;
        System.out.println("Sua média foi " + m);
        if (m > 9) {
            System.out.println("Parabéns");
        }
    }
    
}
