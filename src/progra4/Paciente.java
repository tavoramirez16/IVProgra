    /* 
    HBenavides 10/08/2017
    Clase Paciente Catalogo de pacientes del sistema.
    */

package progra4;
public class Paciente {
/**
 *
 * @author hbenavides
 */    
    Conexiondb conect = new Conexiondb();//inicio de conexión de base de datos.
    
    public Paciente() {
    }
    
    private String tabla = "Pacientes";//tabla de pacientes en base de datos.
    
    public boolean agregar(String datos){
        boolean agregado = false;//bandera para controlar la inserción de datos
        System.out.println(datos);
        agregado = conect.agregar(tabla,datos);
        return agregado;//bandera para controlar la inserción de datos
    }
    
    public boolean editar(String datos, String condicion){
        boolean editado = false;//bandera para controlar la modificación de datos
        editado = conect.editar(tabla,datos,condicion);
        return editado;//bandera para controlar la modificación de datos
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
        return resultado;
    }
    

}
