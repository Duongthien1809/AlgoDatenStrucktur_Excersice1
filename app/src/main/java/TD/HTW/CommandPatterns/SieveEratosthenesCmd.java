package TD.HTW.CommandPatterns;

import TD.HTW.Algorithmus.SieveEratosthenesAlgorithm;
import TD.HTW.App.IConsole;

public class SieveEratosthenesCmd implements ICommand {
    private IConsole mConsole;

    public SieveEratosthenesCmd(IConsole mConsole) {
        super();
        this.mConsole =  mConsole;
    }


    @Override
    public void execute() {
        int number = mConsole.readInteger(IConsole.sInputText+ ": ");

        var gcd = new SieveEratosthenesAlgorithm();
        mConsole.write("Sieve Eratosthenens: " + gcd.primes(number) + "");
    }
    @Override
    public String toString() {
        return " Sieve of Eratosthenes.";
    }
}
