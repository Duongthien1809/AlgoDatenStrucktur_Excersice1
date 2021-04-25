package TD.HTW.Algorithmus;

public class GCDEuclidDivRestItAlgorithm {
    public int calc(int x, int y) {
        while (y != 0) {
            int h = x % y;
            x = y;
            y = h;
            if (h == 0) {
                break;
            }
        }
        return x;
    }

}
