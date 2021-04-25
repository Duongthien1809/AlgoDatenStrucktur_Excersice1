package TD.HTW.CommandPatterns;

import TD.HTW.Algorithmus.GCDEuclidSubtractionRecursiveAlgorith;
import TD.HTW.App.IConsole;

public class GCDEuclidSubtractionRecursiveCmd implements ICommand {
    private IConsole mConsole;

    public GCDEuclidSubtractionRecursiveCmd(IConsole mConsole) {
        this.mConsole = mConsole;
    }

    @Override
    public void execute() {
        int x = mConsole.readInteger(IConsole.sInputText + " x: ");
        int y = mConsole.readInteger(IConsole.sInputText + " y: ");

        var gcd = new GCDEuclidSubtractionRecursiveAlgorith();
        mConsole.write("GCD(" + x + "," + y + "): " + gcd.calc(x, y) + "");
    }
    @Override
    public String toString() {
        return " Greatest Common Divisor (GCD) - (Recursive) Euclid' s algorithm subtraction.";
    }
}
