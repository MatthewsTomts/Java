/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetoragrvai;

import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author learn
 */
public class VetorAgrVai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3, 2, 8, 7, 5, 4}; //ou int[] n = new int[6];
        for (int c = 0; c < n.length; c++) {
            System.out.println("Na posição "+ c + ", temos o valor " + n[c]+ " ");
        }
        
        Calendar ano = Calendar.getInstance();
        int anoA = ano.get(Calendar.YEAR);
        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
            "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] tot = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int c = 0; c < mes.length; c++) {
            if (anoA % 4 == 0 && anoA % 100 != 0 || anoA % 400 == 0) {
                tot[1] = 29;
            }
            System.out.println("O Mês de " + mes[c] + " tem "
                    + tot[c] + " Dias ao todo.");
        }
        
        double num[] = {3.5, 2.75, 9, -4.5};        
        Arrays.sort(num); //Organiza os números no vetor num                              
        for (double valor: num) { 
            /*valor recebe os valores de num de acordo com a ordem
            e quando chega no final do num ele para
            Funciona apenas em coleções/vetores*/
            System.out.print(valor + ", ");
        }
        
        System.out.println("");
        int pos = Arrays.binarySearch(num, 9); //Procura pela posição do 9 no vetor num
        System.out.println("Encontrei o 9 na posição " + pos + " do vetor num");
        
        int test[] = new int[20];
        Arrays.fill(test, 0); //Preenche o vetor Test com zeros 
        for (int valor: test) {
            System.out.print(valor + " ");
        }
    }
    
}
