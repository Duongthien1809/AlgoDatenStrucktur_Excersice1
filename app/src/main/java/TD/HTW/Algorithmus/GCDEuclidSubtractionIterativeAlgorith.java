package TD.HTW.Algorithmus;

public class GCDEuclidSubtractionIterativeAlgorith {
    public int calc(int x, int y) {
        if (x == 0) {
            return y;
        } else {
            while (y != 0) {
                if (x > y) {
                    x -= y;
                } else {
                    y -= x;
                }
            }
        }
        return x;
    }
}
