import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Prueba para verificar que se pueden encontrar libros de un autor existente.
 *
 * @author Juan Moreno Garoz
 */
public class TestListaLibrosAutorExistente {

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("El Alquimista", "Paulo Coelho");
        libro2 = new Libro("Maktub", "Paulo Coelho");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
    }

    @Test
    void TestListaLibrosAutorExistente() {
        List<Libro> librosCoelho = biblioteca.encuentraLibrosPorAutor("Paulo Coelho");
        assertNotNull(librosCoelho);
        assertEquals(2, librosCoelho.size());
        assertTrue(librosCoelho.contains(libro1));
        assertTrue(librosCoelho.contains(libro2));
    }
}
