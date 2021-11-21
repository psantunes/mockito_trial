/**
 * VVS by Rodrigo Prestes Machado
 *
 * VVS is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
*/

package dev.vvs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AppTest {

    // 2 - Cria um objeto mock da classe/interface DataBase
    @Mock
    DataBase base;

    @Test
    void create() {
        // 3 - define o comportamento do método createUser
        when(base.createUser("Rodrigo")).thenReturn("Rodrigo");

        assertEquals("Rodrigo", base.createUser("Rodrigo"));

    }


    @Test
    void read() {
        when(base.readUser(1L)).thenReturn("Rodrigo");

        assertEquals("Rodrigo", base.readUser(1L));
    }

    @Test
    void update() {
        when(base.updateUser(1L, "Rodrigo Machado")).thenReturn(true);

        assertEquals(true, base.updateUser(1L, "Rodrigo Machado"));
    }

    @Test
    void delete() {
        when(base.deleteUser(1L)).thenReturn(true);

        assertEquals(true, base.deleteUser(1L));
    }

    @Test
    void deleteProblem() {
        // 4 - define que o método deleteUser irá lançar uma exceção se receber um valor
        // negativo
        when(base.deleteUser(-1L)).thenThrow(new IllegalArgumentException());

        // TODO ... código do método de teste

        // 5 - verifica se a exceção lançada é igual a esperada
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            base.deleteUser(-1L);
        });
    }
}
