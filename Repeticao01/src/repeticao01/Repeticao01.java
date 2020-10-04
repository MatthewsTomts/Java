/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao01;

import java.util.Scanner;

/**
 *
 * @author learn
 */
public class Repeticao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 0;
        do {
            System.out.println("Cambalhota " + c);
            c++;
        } while (c <= 4);
        
        int n, s = 0;
        Scanner tec = new Scanner(System.in);
        String resp = "";
        do {
            System.out.print("Digite um número: ");
            n = tec.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N]: ");
            resp = tec.next();
        } while (resp.equals("S") || resp.equals("s"));
        System.out.println("A soma desse(s) número(s) é: " + s);
    }
    
}
