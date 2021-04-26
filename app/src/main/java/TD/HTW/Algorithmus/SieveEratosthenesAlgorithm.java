package TD.HTW.Algorithmus;

import java.util.ArrayList;

public class SieveEratosthenesAlgorithm {
    public ArrayList<Integer> primes(int number) throws IllegalArgumentException{
        if (number < 0) {
            throw new NumberFormatException("Primzahl darf nicht negativ sein");
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //Verfahren Sieb des Eratosthenes
        boolean[] pPrimzahl = new boolean[number + 1];
        //setzen alle zahlen als potentiale Primzahl
        for (int i = 2; i <= number; i++) {
            pPrimzahl[i] = true;
        }
        for (int i = 2; i <= number; i++) {
            // wählt erste Zahl als Primzahl
            if (pPrimzahl[i] == true) {
                //add zahl ist list
                arr.add(i);
                //alle Vielfachen von primzahl ist kein Primzahl.
                //setzt auf false
                for (int j = i * i; j <= number; j += i) {
                    pPrimzahl[j] = false;
                    if (pPrimzahl[j] == true) {

                    }
                }
            }
        }
        return arr;
    }
}
