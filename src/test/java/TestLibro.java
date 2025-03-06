import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Libro.
 *
 * @author Juan Moreno Garoz
 */
public class TestLibro {

    private Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("El Alquimista", "Paulo Coelho", 1988);
    }

    /**
     * Test para verificar que el constructor inicializa correctamente los atributos.
     */
    @Test
    void testConstructor() {
        assertEquals("El Alquimista", libro.getTitulo());
        assertEquals("Paulo Coelho", libro.getAutor());
        assertEquals(1988, libro.getAnioPublicacion());
    }
}
