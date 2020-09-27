/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Tokyo
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3, n2 = 8, r;
        r = (n1 > n2) ? n1 + n2 : n1 - n2;
        System.out.println(r);
        
        String nm1 = "Matthews", resp, resp2;
        String nm3 = new String("Matthews");
        resp = (nm1 == nm3) ? "É igual" : "É diferente";        //compara conteúdo e tipo
        resp2 = (nm1.equals(nm3)) ? "É igual" : "É diferente";  //compara o conteúdo
        System.out.println(resp + "\n" + resp2);
    }
    
}
