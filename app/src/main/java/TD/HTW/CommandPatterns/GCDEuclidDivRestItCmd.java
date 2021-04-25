package TD.HTW.CommandPatterns;

import TD.HTW.Algorithmus.GCDEuclidDivRestItAlgorithm;
import TD.HTW.App.IConsole;

public class GCDEuclidDivRestItCmd implements ICommand {
    private IConsole mConsole;

    public GCDEuclidDivRestItCmd(IConsole mConsole) {
        super();
        this.mConsole = mConsole;
    }

    @Override
    public void execute() {
        int x = mConsole.readInteger(IConsole.sInputText +" x: ");
        int y = mConsole.readInteger(IConsole.sInputText+" y: ");

        var gcd = new GCDEuclidDivRestItAlgorithm();
        mConsole.write("GCD(" + x + "," + y + "): " + gcd.calc(x, y)+"");
    }

    @Override
    public String toString() {
        return " Greatest Common Divisor (GCD) - (Interative) Euclid' s algorithm division rest.";
    }
}
