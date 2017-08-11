    /* 
    HBenavides 10/08/2017
    Clase Agenda, encargada del insumo de las citas de los pacientes relacionado 
    con los doctores  -- Patron
    */
package progra4;

/**
 *
 * @author jmanu
 */
public class Agendas {
    /* 
    HBenavides 10/08/2017
    Conexión de base de datos
    */
    
    Conexiondb conect = new Conexiondb();
    
    Agendas() {
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
    Edición de los datos
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
    Eliminación de datos
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
    Procedimiento para imprimir la información de agendas
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
