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
    
    Conexiondb conect = new Conexiondb();//Conexión de base de datos.
    
    Permisos() {
    }
    
    private String tabla = "Permisos";//tabla en la base de datos.
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
    
    public boolean permisouser(int tipo_usuario, int Pantalla){
        boolean permiso = false;//bandera para controlar los permisos de los usuarios
        String datos = "Bloqueo";//variable para indicar los bloqueos
        String condicion = "Pantalla->"+Pantalla;//condición para verificar los permisos del usuario conectado.
        String order = null;//variable de control para el orden de verificación de datos.
        String [][] resultado = conect.imprimir(tabla,datos,condicion,order);//extracción de datos.
        if(resultado[0][0] == Integer.toString(tipo_usuario)){
            permiso = true;//bandera para controlar los permisos del usuario.
        }
        return permiso;
    }
}
