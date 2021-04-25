package TD.HTW.Algorithmus;

public class GCDEuclidDivisionRestRecursiveAlgorithm {
    public int calc(int x, int y) {
        if (y == 0) {
            return x;
        }
        return calc(y, x % y);
    }
}
