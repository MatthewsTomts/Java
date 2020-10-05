/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author learn
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s); 
        //recebe o valor do metodo principal e envia uma saída
    }
    
    static int soa(int a, int b) {
        int som = a + b;
        return som;
        //recebe o valor do método principal e retorna um valor para ser usado
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        soma(5, 2);
        //Envia um valor para o método soma
        
        int sm = soa(5, 2); 
        //pega o valor retornado do método soa e coloca na variavel sm
        System.out.println("A soma é " + sm);
        
        System.out.print("Vai começar a contagem: ");
        System.out.println(Operaccoes.contador(1, 5));
    }
    
}
