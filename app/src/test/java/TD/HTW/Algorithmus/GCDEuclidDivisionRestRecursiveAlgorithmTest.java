package TD.HTW.Algorithmus;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GCDEuclidDivisionRestRecursiveAlgorithmTest {
    GCDEuclidDivisionRestRecursiveAlgorithm t;

    @Before
    public void ProjektErzeug() {
        t = new GCDEuclidDivisionRestRecursiveAlgorithm();
    }

    @Test
    public void ErgebniswieErwarten() throws IllegalArgumentException {
        assertEquals(4, t.calc(8, 4));
    }

    @Test
    public void NegativEingabe() {
        assertThrows(IllegalArgumentException.class, () -> t.calc(-1, -2));
    }

}