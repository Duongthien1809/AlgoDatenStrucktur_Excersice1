package TD.HTW.CommandPatterns;

import TD.HTW.App.IConsole;

import java.util.LinkedList;

public class CommandFactory {
    IConsole mConsole;
    public CommandFactory(IConsole console) {
        super();
        this.mConsole = console;
    }

    public LinkedList<ICommand> returnsCommands() {
        LinkedList<ICommand> list = new LinkedList<ICommand>();
        list.add(new ExitCommand());
        list.add(new GCDEuclidSubtractionRecursiveCmd(mConsole));
        list.add(new GCDEuclidSubtractionIterativeCmd(mConsole));
        list.add(new GCDEuclidDivisionRestRecursiveCmd(mConsole));
        list.add(new GCDEuclidDivRestItCmd(mConsole));
        list.add(new SieveEratosthenesCmd(mConsole));
        list.add(new ReadPropertiesCmd(mConsole));
        return list;
    }
}


