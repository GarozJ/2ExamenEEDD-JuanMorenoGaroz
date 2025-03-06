import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar que se puede eliminar un libro.
 *
 * @author Juan Moreno Garoz
 */

public class TestEliminarLibro {

    private Biblioteca biblioteca;
    private Libro libro1;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("El Alquimista", "Paulo Coelho");
        biblioteca.agregarLibro(libro1);
    }

    @Test
    void testEliminarLibro() {
        assertTrue(biblioteca.eliminarLibro(libro1));
        assertFalse(biblioteca.getLibros().contains(libro1));
    }
}
