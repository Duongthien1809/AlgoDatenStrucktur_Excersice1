package TD.HTW.Algorithmus;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SieveEratosthenesAlgorithmTest {
    SieveEratosthenesAlgorithm sie = new SieveEratosthenesAlgorithm();

    @Test
    public void NormalFall(){
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(2);
        arrL.add(3);
        arrL.add(5);
        arrL.add(7);
        arrL.add(11);
        assertEquals(arrL,sie.primes(11));
    }
    @Test
    public void Negativezahl(){
        assertThrows(IllegalArgumentException.class, ()->sie.primes(-10));
    }


}