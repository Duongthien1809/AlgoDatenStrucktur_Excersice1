package TD.HTW.CommandPatterns;

public class ExitCommand implements ICommand {

    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public String toString() {
        return "Exit."; // IntelliJ ALT + EINFÜGEN
    }

}