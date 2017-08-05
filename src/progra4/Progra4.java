/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra4;

import progra4.ui.GuiExpediente;
import progra4.ui.GuiMenu;
import progra4.ui.GuiPantalla;
import progra4.ui.GuiPaciente;


/**
 *
 * @author jmanu
 */
public class Progra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexiondb conect = new Conexiondb();
        GuiMenu menu = new GuiMenu();
        if(conect.connect()){
           menu.setVisible(true);
        }else{
        }
    }
    
}
