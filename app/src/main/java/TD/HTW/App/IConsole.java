package TD.HTW.App;

public interface IConsole {
    static final String sInputText = "Please, insert a number";

    public int readInteger(String text);

    public String readString(String text);

    public void write(String s);
}
