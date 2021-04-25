package TD.HTW.CommandPatterns;

import TD.HTW.Algorithmus.ReadProperties;
import TD.HTW.App.IConsole;

public class ReadPropertiesCmd implements ICommand {
    private IConsole mConsole;

    public ReadPropertiesCmd(IConsole mConsole) {
        super();
        this.mConsole = mConsole;
    }

    @Override
    public void execute() {
        var cmds = new ReadProperties();
        String preName = mConsole.readString("Enter your first Name: ");
        String surName = mConsole.readString("Enter your last Name: ");
        int x = mConsole.readInteger(IConsole.sInputText+" x: ");
        int y =  mConsole.readInteger(IConsole.sInputText + " y: ");

        mConsole.write("your Name is: "+cmds.print(preName)+" "+cmds.print(surName)+" x: "+x+" y: "+y);
    }
    @Override
    public String toString() {
        return " Read properties like surname and prename, x and y";
    }
}
