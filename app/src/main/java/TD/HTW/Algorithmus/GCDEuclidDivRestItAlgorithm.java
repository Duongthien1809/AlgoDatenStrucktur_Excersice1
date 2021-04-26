package TD.HTW.Algorithmus;

public class GCDEuclidDivRestItAlgorithm {
    public int calc(int x, int y) throws IllegalArgumentException {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("x oder y darft nicht negativ sein");
        }
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
