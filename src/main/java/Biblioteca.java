import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca con una colección de libros.
 */

public class Biblioteca {

    /**
     * Lista de libros en la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor que inicializa una biblioteca vacía.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor que inicializa la biblioteca con una lista de libros.
     *
     * @param libros Lista de libros con los que se inicializa la biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro Libro a agregar.
     * @return {@code true} si el libro se agregó correctamente, {@code false} en caso contrario.
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Elimina un libro de la biblioteca.
     *
     * @param libro Libro a eliminar.
     * @return {@code true} si el libro se eliminó correctamente, {@code false} en caso contrario.
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de libros de la biblioteca.
     *
     * @return Lista de libros en la biblioteca.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro por su título en la biblioteca.
     *
     * @param titulo Título del libro a buscar.
     * @return El libro si se encuentra, {@code null} en caso contrario.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @param autor Nombre del autor.
     * @return Un libro del autor si se encuentra, {@code null} en caso contrario.
     * @deprecated Este método está obsoleto. Usar {@link #encuentraLibrosPorAutor(String)} en su lugar.
     * <p>
     * Busca un libro por el nombre del autor en la biblioteca.
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca todos los libros de un autor en la biblioteca.
     * Disponible desde la versión 2.0.
     *
     * @param autor Nombre del autor cuyos libros se desean encontrar.
     * @return Lista de libros del autor. Si el autor no tiene libros en la biblioteca, devuelve una lista vacía.
     */

    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
