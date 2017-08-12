    /* 
    HBenavides 10/08/2017
    Clase CatalogoUsuario, Registro de los usuarios que iteractuan con el sistema.
    */
package progra4;

/**
 *
 * @author yoorda
 */
public class CatalogoUsuario {
    /*Declaración de variables*/
    private int idUsuario;//Id del usuario tipo entero
    private int codigoUsuario;//Codigo del usuario tipo entero
    private String usuario;//Usuario tipo cadena de carecteres
    private String passwordUser;//Contraseña del usuario tipo cararter
    Conexiondb conect = new Conexiondb();
    
    //metodo constructor
    public CatalogoUsuario(){}
   
    /*Get y Set de los datos*/
    //metodo que devuelve un entero del id del usuario
    public int getIdUsuario() {
        return idUsuario;
    }//fin metodo getIdUsuario
    //metodo void que almacena en entero el id del usuario
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }//fin metodo setIdUsuario
    //metodo que devuelve un entero del codigo del usuario
    public int getCodigoUsuario() {
        return codigoUsuario;
    }//fin metodo getCodigoUsuario
    //metodo void que almacena en entero el codigo del usuario
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }//fin metodo setCodigoUsuario
    //metodo que devuelve un caracter del usuario
    public String getUsuario() {
        return usuario;
    }//fin metodo getUsuario
    //metodo void que almacena en caracter el usuario
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }//fin metodo setUsuario
    //metodo que devuelve un caracter de la contraseña del usuario
    public String getPasswordUser() {
        return passwordUser;
    }//fin metodo getPasswordUser
    //metodo void que almacena en caracter la contraseña del usuario
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }//fin metodo setPasswordUser
    
String tabla = "Usuarios";
    
   /*metodo para agregar un doctor*/
     public boolean agregar(String datos){
        boolean agregado = false;
        if(conect.agregar(tabla,datos)){
            agregado = true;
        }//fin del if
        return agregado;
    }//fin metodo agregar
    /*metodo para editar algun dato de un doctor*/
    public boolean editar(String datos, String condicion){
        boolean editado = false;
        if(conect.editar(tabla,datos,condicion)){
            editado = true;
        }//fin del if
        return editado;
    }//fin metodo editar   
    /*metodo para eliminar un doctor*/
    public boolean eliminar(String condicion){
        boolean eliminado = false;
        if(conect.eliminar(tabla,condicion)){
            eliminado = true;
        }//fin del if
        return eliminado;
    }//fin metodo eliminar   
    /*metodo para imprimir todos los doctores*/
    public String [][] imprimir(String datos, String condicion, String order){
        String [][] resultado = conect.imprimir(tabla,datos,condicion, order);
        return resultado;
    }//fin metodo imprimir

}//fin clase CatalogoUsuario
