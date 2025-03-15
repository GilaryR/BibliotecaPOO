package autonoma.BibliotecaPOO.models;

/**
 *Modelo que representa un autor
 * @author Gilary
 * @since 20250312
 * @version 1.0
 */
public class Autor {
    /////// Atributos
    
    /**
     * Editorial 
     */
    private String editorial;
    
    /**
     * Profesion
     */
    private String profesion;
    
    ////// Metodo Constructor 
    public Autor (String editorial, String profesion){
        this.editorial = editorial;
        this.profesion = profesion;
    }
    ///// Metodo de Acceso
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}
