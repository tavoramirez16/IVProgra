    /* 
    HBenavides 10/08/2017
    Clase Expediente, Catalogo de expedientes del sistema.
    */
package progra4;

import progra4.Conexiondb;
import progra4.Conexiondb;
import progra4.ui.GuiExpediente;
/**
 *
 * @author hbenavides
 */

public class Expediente {
    //inicio de conexión de base datos
    Conexiondb conect = new Conexiondb();

    public Expediente() {
    }

    private String tabla = "Expediente";//tabla en la base datos

    public boolean agregar(String datos) {
        boolean agregado = false;//bandera para controlar la inserción de datos
        System.out.println(datos);
        agregado = conect.agregar(tabla, datos);
        return agregado;//bandera para controlar la inserción de datos
    }

    public boolean editar(String datos, String condicion) {
        boolean editado = false;//bandera para controlar la modificación de datos
        editado = conect.editar(tabla, datos, condicion);
        return editado;//bandera para controlar la modificación de datos
    }

    public boolean eliminar(String condicion) {
        boolean eliminado = false;//bandera para controlar la borrado de datos
        if (conect.eliminar(tabla, condicion)) {
            eliminado = true;//bandera para controlar la borrado de datos
        }
        return eliminado;
    }

    public String[][] imprimir(String datos, String condicion, String order) {
        //conexión a base de datos para mostrar la data.
        String[][] resultado = conect.imprimir(tabla, datos, condicion, order);
        return resultado;
    }
}
