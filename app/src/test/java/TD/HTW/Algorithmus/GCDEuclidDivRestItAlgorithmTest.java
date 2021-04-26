package TD.HTW.Algorithmus;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GCDEuclidDivRestItAlgorithmTest {
    GCDEuclidDivRestItAlgorithm te;
    @Before
    public void ojektErzeugung(){
        te =  new GCDEuclidDivRestItAlgorithm();
    }
    @Test
    public void ErgebniswieErwarten() throws IllegalArgumentException {
        assertEquals(4, te.calc(8, 4));
        assertEquals(6,te.calc(12,6));
    }

    @Test
    public void NegativEingabe() {
        assertThrows(IllegalArgumentException.class, () -> te.calc(-1, -2));
    }

}