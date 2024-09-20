import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class VetorExemploTest {
    private VetorExemplo vetorExemplo;

    @Before
    public void setUp() {
        vetorExemplo = new VetorExemplo(); // Inicializa o vetor antes de cada teste
    }

    @Test
    public void testNumeroEncontrado() {
        assertTrue(vetorExemplo.pesquisar(5)); // Testa se o número 5 está no vetor
    }

    @Test
    public void testNumeroNaoEncontrado() {
        assertFalse(vetorExemplo.pesquisar(11)); // Testa se o número 11 não está no vetor
    }
}
