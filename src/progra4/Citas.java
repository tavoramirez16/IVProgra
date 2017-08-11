    /* 
    HBenavides 10/08/2017
    Clase Citas, encargada calendarizar las citas de los pacientes
    */
package progra4;

import progra4.Conexiondb;

/**
 *
 * @author jmanu
 */
public class Citas {
    Conexiondb conect = new Conexiondb();
    
    Citas() {
    }
    
    private String tabla = "Citas";
    public boolean agregar(String datos){
        boolean agregado = false;
        if(conect.agregar(tabla,datos)){
            agregado = true;
        }
        return agregado;
    }
    /* 
    HBenavides 10/08/2017
    Procedimiento de edición de datos
    */    
    public boolean editar(String datos, String condicion){
        boolean editado = false;
        if(conect.editar(tabla,datos,condicion)){
            editado = true;
        }
        return editado;
    }
    /* 
    HBenavides 10/08/2017
    Procedimiento de eliminicación de datos.
    */    
    public boolean eliminar(String condicion){
        boolean eliminado = false;
        if(conect.eliminar(tabla,condicion)){
            eliminado = true;
        }
        return eliminado;
    }
    /* 
    HBenavides 10/08/2017
    Procedimiento de impresión de los datos.
    */
    
    public String [][] imprimir(String datos, String condicion, String order){
        String [][] resultado = conect.imprimir(tabla,datos,condicion,order);
        for (int x=0; x < resultado.length; x++) {
            for (int y=0; y < resultado[x].length; y++) {
              System.out.println (resultado[x][y]);
            }
        }
        return resultado;
    }
}
