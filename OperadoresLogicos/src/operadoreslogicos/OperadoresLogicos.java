/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Tokyo
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 4, y = 7, z =12;
        boolean r = (x<y && y==z)?true:false, resp = (x<y || y==z),
                re = (x<y ^ y<z), res = !(x>y); //condicional desnecessário nesse caso
        System.out.println(r + " " + resp + " " + re + " " + res);
    }
    
}
