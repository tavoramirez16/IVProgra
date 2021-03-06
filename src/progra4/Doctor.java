    /* 
    Yoorda 10/08/2017
    Clase Doctor, Catalogo de doctores que están registrados en el sistema.
    */
package progra4;
/**
 *
 * @author yoorda
 */
public class Doctor {
    /*Declaración de variables*/
    private int idDoctor;//Identificación entera del doctor
    private int idEspecialidad;//Id entero de la especicalidad del doctor
    private String nombre;//Nombre del doctor
    private String telefono;//Número de telefono del doctor
    private String correo;//Correo electronico del doctor
    Conexiondb conect = new Conexiondb();
    String tabla = "Doctor";
   // String tabla = "Doctores";

    //metodo constructor
    public Doctor(){}

    /* 
    Yoorda 10/08/2017
    */
    /*Get y Set de los datos*/
    //metodo que devuelve entero la identificación del doctorentero
    public int getIdDoctor() {
        return idDoctor;
    }//fin metodo getIdDoctor
    //metodo void que almacena la identificación del doctor
    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }//fin metodo setIdDoctor
    //metodo que devuelve en entero la identificación de la especialidad el doctor
    public int getIdEspecialidad() {
        return idEspecialidad;
    }//fin metodo getIdEspecialidad
    //metodo void que almacena la identificación de la especialidad del doctor
    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }//fin metodo setIdEspecialidad
    //metodo que devuelve en caracter el nombre del doctor
    public String getNombre() {
        return nombre;
    }//fin metodo getNombre
    //metodo void que almacena el nombre del doctor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//fin metodo setNombre
    //metodo que devuelve en caracter  el número de telefono del doctor
    public String getTelefono() {
        return telefono;
    }//fin metodo getTelefono
    //metodo void que almacena el telefono del doctor
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }//fin metodo setTelefono
    //metodo que devuelve en caracter el correo del doctor
    public String getCorreo() {
        return correo;
    }//fin metodo getCorreo
    //metodo void que almacena el correo del doctor
    public void setCorreo(String correo) {
        this.correo = correo;
    }//fin metodo setCorreo   
   
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
   
}//fin clase Doctor
