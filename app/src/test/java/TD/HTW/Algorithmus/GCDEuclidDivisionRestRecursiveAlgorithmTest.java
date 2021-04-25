package TD.HTW.Algorithmus;

import org.junit.Test;

import static org.junit.Assert.*;

public class GCDEuclidDivisionRestRecursiveAlgorithmTest {
    @Test
    public void NegativeEingabe() {
        GCDEuclidDivisionRestRecursiveAlgorithm t = new GCDEuclidDivisionRestRecursiveAlgorithm();
        assertEquals(4, t.calc(8, 4));
    }

}