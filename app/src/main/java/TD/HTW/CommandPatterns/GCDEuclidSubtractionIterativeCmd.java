package TD.HTW.CommandPatterns;

import TD.HTW.Algorithmus.GCDEuclidSubtractionIterativeAlgorith;
import TD.HTW.App.IConsole;

public class GCDEuclidSubtractionIterativeCmd implements ICommand {
    private IConsole mConsole;

    public GCDEuclidSubtractionIterativeCmd(IConsole mConsole) {
        super(); // weiß nicht warum hier Super Methode stand.
        this.mConsole =  mConsole;
    }

    @Override
    public void execute() {
        int x = mConsole.readInteger(IConsole.sInputText + " x: ");
        int y = mConsole.readInteger(IConsole.sInputText + " y: ");

        var gcd = new GCDEuclidSubtractionIterativeAlgorith();
        mConsole.write("GCD(" + x + "," + y + "): " + gcd.calc(x, y) + "");
    }
    @Override
    public String toString() {
        return " Greatest Common Divisor (GCD) - (Interative) Euclid' s algorithm subtraction.";
    }
}
