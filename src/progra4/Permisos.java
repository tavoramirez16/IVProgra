    /* 
    HBenavides 10/08/2017
    Clase Permisos, Administración de los permisos de los usuarios que iteractuan
    en el sistema.
    Patron utilizado Proxy
    */
package progra4;

/**
 *
 * @author jmanu
 */
public class Permisos {
    
    Conexiondb conect = new Conexiondb();
    
    Permisos() {
    }
    
    private String tabla = "Permisos";
    public boolean agregar(String datos){
        boolean agregado = false;
        if(conect.agregar(tabla,datos)){
            agregado = true;
        }
        return agregado;
    }
    
    public boolean editar(String datos, String condicion){
        boolean editado = false;
        if(conect.editar(tabla,datos,condicion)){
            editado = true;
        }
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
        for (int x=0; x < resultado.length; x++) {
            for (int y=0; y < resultado[x].length; y++) {
              System.out.println (resultado[x][y]);
            }
        }
        return resultado;
    }
    
    public boolean permisouser(int tipo_usuario, int Pantalla){
        boolean permiso = false;
        String datos = "Bloqueo";
        String condicion = "Pantalla->"+Pantalla;
        String order = null;
        String [][] resultado = conect.imprimir(tabla,datos,condicion,order);
        if(resultado[0][0] == Integer.toString(tipo_usuario)){
            permiso = true;
        }
        return permiso;
    }
}
