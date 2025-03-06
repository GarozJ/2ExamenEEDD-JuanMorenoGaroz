import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para verificar que se puede encontrar un libro existente por su título.
 *
 * @author Juan Moreno Garoz
 */
public class TestEncuentraLibroExistente {

    private Biblioteca biblioteca;
    private Libro libro1;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("El Alquimista", "Paulo Coelho");
        biblioteca.agregarLibro(libro1);
    }

    @Test
    void testEncuentraLibroExistente() {
        assertEquals(libro1, biblioteca.encuentraLibroPorTitulo("El Alquimista"));
    }
}
