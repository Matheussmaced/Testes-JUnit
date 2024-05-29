/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class AppTest {
    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Matheus", LocalDate.of(2001, 3, 10));
        assertEquals(2, pessoa.getIdade());

    }

}
