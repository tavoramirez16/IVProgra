    /* 
    HBenavides 10/08/2017
    Clase Especialidades, Catalogo de especialidades del sistema.
    */
package progra4;

import progra4.Conexiondb;

/**
 *
 * @author jmanu
 */
public class Especialidades {
    Conexiondb conect = new Conexiondb();//inicio de conexión de base datos.
    
    public Especialidades() {
    }
    
    private String tabla = "Especialidades";//tabla en la base de datos 
    public boolean agregar(String datos){
        boolean agregado = false;//bandera para controlar la inserción de data
        if(conect.agregar(tabla,datos)){
            agregado = true;//bandera para controlar la inserción de base de data
        }
        return agregado;
    }
    
    public boolean editar(String datos, String condicion){
        boolean editado = false;//bandera para controlar la actualización de datos
        if(conect.editar(tabla,datos,condicion)){
            editado = true;//bandera para controlar la actualización de datos
        }
        return editado;
    }
    
    public boolean eliminar(String condicion){
        boolean eliminado = false;//bandera para controlar la eliminación de datos
        if(conect.eliminar(tabla,condicion)){
            eliminado = true;//bandera para controlar la eliminación de datos
        }
        return eliminado;
    }
    
    public String [][] imprimir(String datos, String condicion, String order){
        //conexión para enviar la data a imprimir.
        String [][] resultado = conect.imprimir(tabla,datos,condicion,order);
        for (int x=0; x < resultado.length; x++) {
            for (int y=0; y < resultado[x].length; y++) {
              System.out.println (resultado[x][y]);
            }
        }
        return resultado;
    }
}
