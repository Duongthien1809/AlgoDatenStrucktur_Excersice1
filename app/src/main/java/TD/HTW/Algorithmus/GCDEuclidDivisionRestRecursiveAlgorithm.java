package TD.HTW.Algorithmus;

public class GCDEuclidDivisionRestRecursiveAlgorithm{
    public int calc(int x, int y) throws IllegalArgumentException{
        if (y <0 || x < 0){
            throw new IllegalArgumentException("x oder y darft nicht negativ sein");
        }
        if (y == 0) {
            return x;
        }
        return calc(y, x % y);
    }
}
