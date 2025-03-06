/**
 * Esta clase representa un libro en una biblioteca.
 */
public class Libro {
    /**
     * Atributos a identificar del libro.
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    /**
     * Constructor de la clase Libro.
     *
     * @param titulo          Título del libro.
     * @param autor           Autor del libro.
     * @param anioPublicacion Año de publicación del libro.
     */

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene y establece el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene y establece el año de publicación del libro.
     *
     * @return El año de publicación del libro.
     */

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
