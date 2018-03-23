/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdouble.r.clinic;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import view.JFMainMenu;


/**
 *
 * @author dhadotid
 */
public class DoubleRClinic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
                    UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(new JFMainMenu());
                }catch(Exception e){
                    
                }
                new JFMainMenu().setVisible(true);
    }
    
}
