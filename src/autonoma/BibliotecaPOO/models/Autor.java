package autonoma.BibliotecaPOO.models;

/**
 *Modelo que representa un autor
 * @author Gilary
 * @since 20250312
 * @version 1.0
 */
public class Autor extends Persona {
    //Atributos 
    /**
    * Editorial del autor
    */
    String editorial;
    /**
    * Profesion del autor
    */
    String profesion;
    
    /**
     * Inicializa los atributos de la clase Autor
     *
     * @param     nombre    
     * @param     documentoDeIdentidad
     * @param     correoElectronico
     * @param     editorial
     * @param     profesion
    */
    public Autor(String nombre, String documentoDeIdentidad, String correoElectronico, String editorial, String profesion){
        super (nombre, documentoDeIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }
    
    /**
     * Retorna la editorial del autor
     * @param     editorial
     * @return    editorial del autor
    */
    public String getEditorial() {
        return editorial;
    }
    
    /**
     * Modificar el editorial del autor
     * @param     editorial
    */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    /**
     * Retorna la profesion del autor
     * @param     profesion
     * @return    profesion del autor
    */
    public String getProfesion() {
        return profesion;
    }
    
    /**
     * Modificar la profesion del autor
     * @param     profesion
    */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    } 
}
