/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codejavasolutions;

/**
 *
 * @author hemant
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
        
        // TODO code application logic here
    }

}
