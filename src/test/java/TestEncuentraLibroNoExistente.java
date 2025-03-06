
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Prueba para verificar que buscar un libro por un título inexistente devuelve null.
 *
 * @author Juan Moreno Garoz
 */
public class TestEncuentraLibroNoExistente {

    private Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    void TestEncuentraLibroNoExistente() {
        assertNull(biblioteca.encuentraLibroPorTitulo("Libro no encontrado"));
    }
}
