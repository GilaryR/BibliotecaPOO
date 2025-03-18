
package autonoma.BibliotecaPOO.models;

/**
 *Modelo que representa un libro
 * @author alejandro
 * since 20250315
 * version 1.0
 */
public class Libro {
    /////// Atributos
    
    private static int contadorLibros = 0;
    
    /**
     * id
     */
    private long id;
    
    /**
     * titulo del libro
     */
    private String titulo;
    
    private Autor autor;
    

    
    ////// Metodo Constructor 
    public Libro(String titulo, Autor autor) {
        Libro.contadorLibros ++;
        this.id = Libro.contadorLibros;
        this.titulo = titulo;
        this.autor = new Autor(autor.getNombre(), autor.getCorreoElectronico(), autor.getProfesion(), autor.getEditorial(), autor.getDocumentoIdentidad());    }

    ///// Metodos de Acceso
    public long getId() {
        return id;
    }
    
    public Autor getAutor(){
        return autor;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
  
}