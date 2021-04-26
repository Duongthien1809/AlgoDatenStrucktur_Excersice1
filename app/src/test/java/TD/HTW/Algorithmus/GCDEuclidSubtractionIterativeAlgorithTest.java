package TD.HTW.Algorithmus;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GCDEuclidSubtractionIterativeAlgorithTest {
    GCDEuclidDivisionRestRecursiveAlgorithm t;

    @Before
    public void ProjektErzeug() {
        t = new GCDEuclidDivisionRestRecursiveAlgorithm();
    }
    @Test
    public void ErgebniswieErwarten() throws IllegalArgumentException {
        assertEquals(4, t.calc(8, 4));
        assertEquals(6,t.calc(12,6));
    }

    @Test
    public void NegativEingabe() {
        assertThrows(IllegalArgumentException.class, () -> t.calc(-1, -2));
    }
}