package TD.HTW.Algorithmus;

public class GCDEuclidSubtractionRecursiveAlgorith {
    public int calc(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            if (x == 0) {
                return y;
            }
            if (x > y) {
                return calc(x - y, y);
            }
        }
        return calc(x, y - x);
    }
}
