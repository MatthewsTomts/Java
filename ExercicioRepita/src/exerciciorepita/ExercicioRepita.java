/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author learn
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Olá, Mundo!!", 
                "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        
        int n, s = 0, c = 0, p = 0, ip = 0, ab = 0, med = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe um número: \n(Digite '0' para parar)"));
            s += n;
            c++;
            if (n % 2 == 0) {
                p++;
            } else {
                ip++;
            }
            if (n > 100) {
                ab++;
            }            
        } while (n != 0);
        med = s / c;
        JOptionPane.showMessageDialog(null, "<html>Resultado final<br><hr>" +
                "A Soma desses Número é: " + s + 
                "<br>Total de Valores: " + c +
                "<br>Total de Pares: " + p +
                "<br>Total de Ímpares: " + ip +
                "<br> Acima de 100: " + ab +
                "<br>Média dos valores: " + med + "</html>");
    }
    
}
