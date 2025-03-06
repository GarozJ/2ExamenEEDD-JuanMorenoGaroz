import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Prueba para verificar que buscar libros de un autor inexistente devuelve una lista vacía.
 *
 * @author Juan Moreno Garoz
 */
public class TestListaLibrosAutorNoExistente {

    private Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    void TestListaLibrosAutorNoExistente() {
        List<Libro> libros = biblioteca.encuentraLibrosPorAutor("Autor no encontrado");
        assertNotNull(libros);
        assertTrue(libros.isEmpty());
    }
}
