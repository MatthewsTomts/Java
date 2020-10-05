/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao;

import java.util.Scanner;

/**
 *
 * @author learn
 */
public class funcao {
    
    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        System.out.print("Digite um número: ");
        Scanner tec = new Scanner(System.in);
        f.setValor(tec.nextInt());
        System.out.println(f.getForm() + f.getFat());
    }
    
}
