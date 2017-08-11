    /* 
    HBenavides 10/08/2017
    Clase Progra4, administración del login
    */
package progra4;

import progra4.ui.GuiExpediente;
import progra4.ui.GuiLogin;
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
        Conexiondb conect = new Conexiondb(); //conexión de base datos
        GuiMenu menu = new GuiMenu();//invocación al menú principal
        GuiLogin login = new GuiLogin();//proceso de login al sistema.
        if (conect.connect()) {
            menu.setVisible(true);//pantalla principal del sistema
        } else {
        }
    }

}
