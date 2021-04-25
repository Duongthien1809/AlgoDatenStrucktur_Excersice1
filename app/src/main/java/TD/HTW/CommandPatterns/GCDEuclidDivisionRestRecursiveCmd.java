package TD.HTW.CommandPatterns;

import TD.HTW.Algorithmus.GCDEuclidDivisionRestRecursiveAlgorithm;
import TD.HTW.App.IConsole;

public class GCDEuclidDivisionRestRecursiveCmd implements ICommand {
    private IConsole mConsole;

    public GCDEuclidDivisionRestRecursiveCmd(IConsole mConsole) {
        super();
        this.mConsole = mConsole;
    }


    @Override
    public void execute() {
        int x = mConsole.readInteger(IConsole.sInputText +" x: ");
        int y = mConsole.readInteger(IConsole.sInputText+" y: ");

        var gcd = new GCDEuclidDivisionRestRecursiveAlgorithm();
        mConsole.write("GCD(" + x + "," + y + "): " + gcd.calc(x, y)+"");
    }
    @Override
    public String toString() {
        return " Greatest Common Divisor (GCD) - (Recursive) Euclid' s algorithm division rest.";
    }
}
