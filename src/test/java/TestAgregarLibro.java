import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar que se puede agregar un libro.
 *
 * @author Juan Moreno Garoz
 */

public class TestAgregarLibro {
    private Biblioteca biblioteca;
    private Libro libro1;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("El Alquimista", "Paulo Coelho");
    }

    /**
     * Test para verificar que un libro se agrega correctamente.
     */

    @Test
    void testAgregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro1));
        assertTrue(biblioteca.getLibros().contains(libro1));
    }
}
