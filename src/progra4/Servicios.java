    /* 
    HBenavides 10/08/2017
    Clase Servicios, Catalogo de servicios a ofrecer en el sistema
    */
package progra4;

import progra4.Conexiondb;

/**
 *
 * @author jmanu
 */
public class Servicios {
    Conexiondb conect = new Conexiondb();//conexión de base de datos.
    
    public Servicios() {
    }
    
    private String tabla = "Servicios";//tabla de base de datos.
    public boolean agregar(String datos){
        boolean agregado = false;//bandera para controlar la inserción de datos
        if(conect.agregar(tabla,datos)){
            agregado = true;//bandera para controlar la inserción de datos
        }
        return agregado;
    }
    
    public boolean editar(String datos, String condicion){
        boolean editado = false;//bandera para controlar la modificación de datos
        if(conect.editar(tabla,datos,condicion)){
            editado = true;//bandera para controlar la modificación de datos
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
        //conexión de base de datos para mostrar la data.
        String [][] resultado = conect.imprimir(tabla,datos,condicion,order);
        for (int x=0; x < resultado.length; x++) {
            for (int y=0; y < resultado[x].length; y++) {
              System.out.println (resultado[x][y]);
            }
        }
        return resultado;
    }
}

