    /* 
    Yoorda 10/08/2017
    Clase Asistentes de doctores, encargada del catalogo de los asistentes por doctores
    en la clinica
    */
package progra4;

/**
 *
 * @author yoorda
 */
public class AsistenteDoctor {
    /*Declaración de variables*/
    private int idAsistente;//Identificación del asistente del doctor tipo entero
    private String nombre;//Nombre del asistente del doctor tipo caracter
    private String telefono;//Telefono del asistente del doctor tipo caracter
    Conexiondb conect = new Conexiondb();
    
    //metodo constructor
    AsistenteDoctor(){}
    
    /*Get y Set de los datos*/
    //metodo que devuelve un entero de la identificación del asistente del doctor
    public int getIdAsistente() {
        return idAsistente;
    }//fin metodo getIdAsistente
    //metodo void que almacena la identificación del asistente del doctor
    public void setIdAsistente(int idAsistente) {
        this.idAsistente = idAsistente;
    }//fin metodo setIdAsistente
    //metodo que devuelve en caracter el nombre del asistente del doctor
    public String getNombre() {
        return nombre;
    }//fin metodo getNombre
    //metodo void que almacena el nombre del asistente del doctor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//fin metodo setNombre
    //metodo que devuelve en caracter el telefono del asistente del doctor
    public String getTelefono() {
        return telefono;
    }//fin metodo getTelefono
    //metodo void que almacena el telefono del asistente del doctor
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }//fin metodo setTelefono

    /*Mejora de codigo*/
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
}//fin clase AsistenteDoctor
