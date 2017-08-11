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
    Conexiondb conect = new Conexiondb();
    
    public Paciente() {
    }
    
    private String tabla = "Pacientes";
    
    public boolean agregar(String datos){
        boolean agregado = false;
        System.out.println(datos);
        agregado = conect.agregar(tabla,datos);
        return agregado;
    }
    
    public boolean editar(String datos, String condicion){
        boolean editado = false;
        editado = conect.editar(tabla,datos,condicion);
        return editado;
    }
    
    public boolean eliminar(String condicion){
        boolean eliminado = false;
        if(conect.eliminar(tabla,condicion)){
            eliminado = true;
        }
        return eliminado;
    }
    
    public String [][] imprimir(String datos, String condicion, String order){
        String [][] resultado = conect.imprimir(tabla,datos,condicion,order);
        return resultado;
    }
    

}
