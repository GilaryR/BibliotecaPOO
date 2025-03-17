
package autonoma.BibliotecaPOO.models;

import java.util.ArrayList;

/**
 *Modelo que representa una biblioteca
 * @author alejandro
 * since 20250315
 * version 1.0
 */
public class Biblioteca {
    //////////////////////////////////////////////////////////////
    /// Atributos
    
    /**
     * Arreglo de libros 
     */
    
    private ArrayList <Libro> libros;
    
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodo Constructor
    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodos acceso
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    
   public boolean agregarLibro(Libro libro) {
    for (int i = 0; i < libros.size(); i++) {
        if (libros.get(i).getId() == libro.getId()) {
            return false; // Ya existe un libro con ese ID
        }
    }
    return libros.add(libro);
}
    
    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "no hay libros en la biblioteca";
        }

    String resultado = "libros: ";
    for (int i = 0; i < libros.size(); i++) {
        resultado += "id: " + libros.get(i).getId() + ", titulo: " + libros.get(i).getTitulo();
    }
    return resultado;
}
    
    public boolean eliminarLibro(Libro libro, long id){
        for (int i = 0; i < libros.size(); i++){
            if (libros.get(i).getId() == (libro.getId())){ 
                libros.remove(i);  
                return true; 
            } 
        }
        return false; 
    }
    
    public Libro buscarLibro(long id){
        
        for(int i=0; i<libros.size(); i++){
            if(libros.get(i).getId() == id ){
                return libros.get(i);
            }
        }
        
        return null;
    }
    
   public boolean actualizarLibro(Libro libro, long id) {
    for (int i = 0; i < libros.size(); i++) {
        if (libros.get(i).getId() == id) {
            libros.get(i).setTitulo(libro.getTitulo());   
            return true; 
        }
    }
    return false; 
}
    
       public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
        for (int i = 0; i < librosOrdenados.size() - 1; i++) {
            for (int j = i + 1; j < librosOrdenados.size(); j++) {
                if (librosOrdenados.get(i).getTitulo().compareTo(librosOrdenados.get(j).getTitulo()) > 0) {
                    Libro temp = librosOrdenados.get(i);
                    librosOrdenados.set(i, librosOrdenados.get(j));
                    librosOrdenados.set(j, temp);
                }
            }
        }
        return librosOrdenados;
   }
}