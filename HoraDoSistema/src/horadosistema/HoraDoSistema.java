/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

/**
 *
 * @author Tokyo
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date data = new Date();
        System.out.println("A hora do sistema é: " + data.toString());
        Locale idio = Locale.getDefault();
        System.out.println("O idioma do sistem é: " + idio.getDisplayLanguage());
        Dimension reso = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) reso.getWidth();
        int com = (int) reso.getHeight();
        System.out.println("A resolução da tela é: " + lar + " x " + com);
    }   
}
