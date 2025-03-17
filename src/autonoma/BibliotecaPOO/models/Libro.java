
package autonoma.BibliotecaPOO.models;

/**
 *Modelo que representa un libro
 * @author alejandro
 * since 20250315
 * version 1.0
 */
public class Libro {
    /////// Atributos
    
    /**
     * id
     */
    private long id;
    
    /**
     * titulo del libro
     */
    private String titulo;
    

    
    ////// Metodo Constructor 
    public Libro( long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    ///// Metodos de Acceso
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
  
}