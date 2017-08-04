/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra4;

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
        Doctor doctor = new Doctor();
        GuiPantalla pantalla = new GuiPantalla();
        GuiPaciente paciente = new GuiPaciente();
        if(conect.connect()){
           // doctor.agregar();
            //doctor.editar();
            //doctor.imprimir();
           // doctor.eliminar();
           paciente.setVisible(true);
           //pantalla.setVisible(true);
        }else{
        }
    }
    
}
